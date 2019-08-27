package com.daniel.utils.DesignPattern.abstractFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class ReadXML {
    public static Object getObject() {
        try {
            // javax.xml.parsers 包中的DocumentBuilderFactory用于创建DOM模式的解析器对象。
            // DocumentBuilderFactory是一个抽象工厂类,它不能直接实例化。
            // 但该类提供了一个newInstance方法,这个方法会根据本地平台默认安装的解析器，自动创建一个工厂的对象并返回。
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            //调用工厂对象的 newDocumentBuilder方法得到 DOM 解析器对象。
            DocumentBuilder documentBuilder = dFactory.newDocumentBuilder();
            Document doc ;
            //调用 DOM解析器对象的 parse()方法解析XML文档,得到代表整个文档的 Document对象,利用DOM特性对整个XML文档进行操作。
            doc = documentBuilder.parse(new File("src/main/java/com/daniel/utils/DesignPattern/abstractFactory/config1.xml"));
            //get tag value
            NodeList className = doc.getElementsByTagName("className");
            Node firstChild = className.item(0).getFirstChild();
            //get class name
            String cName = "com.daniel.utils.DesignPattern.abstractFactory." + firstChild.getNodeValue();
            //init class and return
            Class<?> c = Class.forName(cName);
            Object o = c.newInstance();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
