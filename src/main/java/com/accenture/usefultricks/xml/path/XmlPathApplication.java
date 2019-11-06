package com.accenture.usefultricks.xml.path;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class XmlPathApplication {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {
        FileInputStream fileIS = new FileInputStream(new File("src/main/resources/xml/house.xml"));
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        Document xmlDoc = builder.parse(fileIS);
        XPath xPath = XPathFactory.newInstance().newXPath();

        // получаем один объект
        Object result = xPath.compile("/person/employee/name")
                .evaluate(xmlDoc, XPathConstants.STRING);

        System.out.println(result);


        // получаем несколько объектов
        NodeList nodeList = (NodeList) xPath.compile("/person/employee/home").evaluate(xmlDoc, XPathConstants.NODESET);

        for (int i = 0; i < nodeList.getLength(); i++) {
            System.out.println(nodeList.item(i).getTextContent().replaceAll(" ", ""));
        }
    }
}
