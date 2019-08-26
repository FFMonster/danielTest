package com.daniel.utils.DesignPattern.factoryMethod;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class ReadXML {
    public static Object getObject() {
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = dFactory.newDocumentBuilder();
            Document doc ;
            doc = documentBuilder.parse(new File("src/main/java/com/daniel/utils/DesignPattern/factoryMethod/config1.xml"));
            NodeList className = doc.getElementsByTagName("className");
            Node firstChild = className.item(0).getFirstChild();
            String cName = "com.daniel.utils.DesignPattern.factoryMethod." + firstChild.getNodeValue();
            Class<?> c = Class.forName(cName);
            Object o = c.newInstance();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
