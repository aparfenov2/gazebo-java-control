package test;

import java.io.File;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;

public class Utils {
    
    public static final String LOGGER_NAME = "Gazebo Transport"; 
    public static Logger LOG = Logger.getLogger(LOGGER_NAME);

    public static void setupLogging() throws Exception {
        LogManager.getLogManager().readConfiguration(Utils.class.getResourceAsStream("/logging.properties"));        
    }
    
    public static XPath makeXPath() throws Exception {
        final XPathFactory xPathFactory = XPathFactory.newInstance();
        final XPath xpath = xPathFactory.newXPath();
        return xpath;
    }
    
    public static Document parseXML(File file) throws Exception {
        final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        final DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        final Document xml = documentBuilder.parse(file);
        return xml;
    }
    
}
