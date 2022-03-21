package dima;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import mypackage.TextTablesType;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class StartApplication {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        JAXBContext jaxbContext   = JAXBContext.newInstance( TextTablesType.class );
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        InputStream inStream = new FileInputStream( "german.xml" );

        TextTablesType textTablesType = (TextTablesType) jaxbUnmarshaller.unmarshal( inStream );

    }
}
