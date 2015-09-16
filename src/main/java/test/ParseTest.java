package test;

import java.io.File;
import java.util.concurrent.Executors;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import my.app.parser.Model;

import org.w3c.dom.Document;

import com.google.common.eventbus.AsyncEventBus;

public class ParseTest {

    public static void main(String[] args) throws Exception {
        new ParseTest().dmain(args);
    }

    private void dmain(String[] args) throws Exception {
        
        final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        final DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        final XPathFactory xPathFactory = XPathFactory.newInstance();
        final XPath xpath = xPathFactory.newXPath();
        
        final Document sdf = documentBuilder.parse(new File(args[0]));
        
        AsyncEventBus eventBus = new AsyncEventBus(Executors.newSingleThreadExecutor());
        Model model = new Model(eventBus);
        model.loadFromSDF(sdf, xpath);
        
        
    }

}
