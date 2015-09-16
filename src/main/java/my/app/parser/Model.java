package my.app.parser;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

public class Model {
    
    public Link root;
    public Map<String, Link> linksMap = new HashMap<>();
    public Map<String, Joint> jointsMap = new HashMap<>();
    public EventBus eventBus;
    
    public Model(EventBus eventBus) {
        this.eventBus = eventBus;
    }
    
    public void loadFromSDF(Document sdf, XPath xpath) throws Exception {
        
        
        final NodeList linkNodes = (NodeList) xpath.evaluate("//link",sdf, XPathConstants.NODESET);
        for (int i = 0; i < linkNodes.getLength(); i++) {
            final Node linkNode = linkNodes.item(i);
            Link link = new Link();
            link.loadFromSDLNode(linkNode, xpath);
            linksMap.put(link.name, link);
        }
        
        final NodeList jointNodes = (NodeList) xpath.evaluate("//joint",sdf, XPathConstants.NODESET);
        for (int i = 0; i < jointNodes.getLength(); i++) {
            final Node jointNode = jointNodes.item(i);
            Joint joint = new Joint(this.eventBus);
            joint.loadFromSDLNode(jointNode, xpath, linksMap);
            jointsMap.put(joint.name, joint);
            joint.childLink.parentJoint = joint;
            joint.parentLink.childJoints.add(joint);
        }
        
        for (Link link : linksMap.values()) {
            if (link.parentJoint == null) {
                if (this.root == null) {
                    this.root = link;
                } else {
                    throw new RuntimeException(String.format("multiple definitions of root link : was \"%s\", new \"%s\"", this.root.name, link.name));
                }
            }
        }
        if (this.root == null) {
            throw new RuntimeException("root link not found");
        }
    }
}
