package com.home.usfl.xml.schema;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class XmlSchemaApplication {
    public static void main(String[] args) throws SAXException, IOException {

        Source xmlDoc = new StreamSource(new File("usfl/src/main/resources/xml/house.xml"));
        File xmlSchema = new File("usfl/src/main/resources/xml/schema.xsd");

        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = schemaFactory.newSchema(xmlSchema);
        Validator validator = schema.newValidator();
        validator.validate(xmlDoc);
    }
}
