package com.abhai.abstractFactory.example;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;

public class Main {
    public static void main(String[] args) {
        String xml = "<document><body><stock>AAPL</stock></body></document>";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xml.getBytes());

        try {
            DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder factory = abstractFactory.newDocumentBuilder();
            Document document = factory.parse(byteArrayInputStream);
            document.getDocumentElement().normalize();

            System.out.println("Root element: " + document.getDocumentElement().getNodeName());
            System.out.println(abstractFactory.getClass());
            System.out.println(factory.getClass());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
