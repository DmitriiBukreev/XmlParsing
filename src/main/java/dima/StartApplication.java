package dima;


import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import mypackage.TextTablesType;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class StartApplication {
    private final String url = "jdbc:postgresql://localhost:5432/german_db";
    private final String user = "postgres";
    private final String password = "98a2c94d";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }


    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        JAXBContext jaxbContext = JAXBContext.newInstance(TextTablesType.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();


        InputStream inStream = new FileInputStream("german.xml");
        TextTablesType textTablesType = (TextTablesType) jaxbUnmarshaller.unmarshal(inStream);
        textTablesType.getTextTable().getText();
        StartApplication startApplication =new StartApplication();
        startApplication.connect();

    }
}