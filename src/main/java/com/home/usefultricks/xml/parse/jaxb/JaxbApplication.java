package com.home.usefultricks.xml.parse.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Пример сериализации и десериализации JAXB
 */
public class JaxbApplication {
    public static void main(String[] args) throws JAXBException {

        Cat cat = new Cat();
        cat.setName("Murka");
        cat.setAge(5);
        cat.setWeight(4);

        // сериализация в XML
        StringWriter writer = new StringWriter();
        JAXBContext context = JAXBContext.newInstance(Cat.class); // создание объекта Marshaller, который выполняет сериализацию
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // FORMATTED_OUTPUT = TRUE - добавляет переносы строк и пробелы
        marshaller.marshal(cat, writer); // сериализация объекта
        String result = writer.toString(); // преобразовываем в строку все записанное в StringWriter
        System.out.println(result);

        // десериализация из XML
        String xmldata = "<cat><name>Matroskin</name><age>6</age><weight>5</weight></cat>";
        StringReader reader = new StringReader(xmldata);
        JAXBContext dContext = JAXBContext.newInstance(Cat.class);
        Unmarshaller unmarshaller = dContext.createUnmarshaller();
        Cat dCat = (Cat) unmarshaller.unmarshal(reader);
        System.out.println(dCat.toString());

    }
}
