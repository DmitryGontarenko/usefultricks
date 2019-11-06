package com.accenture.usefultricks.xml.parse.dom;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DomApplication {

    private static ArrayList<Employee> employees = new ArrayList<Employee>();

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("src/main/resources/xml/employees.xml")); // Получаем структуру XML документа

        // получаем список всех элементов employee внутри корневого элемента (getDocumentElement())
        NodeList employeeElements = document.getDocumentElement().getElementsByTagName("employee");

        // перебираем все элементы employee
        for (int i = 0; i < employeeElements.getLength(); i++) {
            Node employee = employeeElements.item(i);
            // получение атрибутов(свойств) каждого элемента employee
            NamedNodeMap attributes = employee.getAttributes();
            // заполняем лист значением полученных атрибутов
            employees.add(new Employee(attributes.getNamedItem("name").getNodeValue(), attributes.getNamedItem("job").getNodeValue()));
        }

        for (Employee employee : employees) {
            System.out.println(String.format("Информация о сотруднике: имя - %s, должность - %s", employee.getName(), employee.getJob()));
        }
    }
}
