
package mypackage;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TextTables_QNAME = new QName("", "textTables");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TextTablesType }
     * 
     */
    public TextTablesType createTextTablesType() {
        return new TextTablesType();
    }

    /**
     * Create an instance of {@link HistoryInfoType }
     * 
     */
    public HistoryInfoType createHistoryInfoType() {
        return new HistoryInfoType();
    }

    /**
     * Create an instance of {@link HistoryType }
     * 
     */
    public HistoryType createHistoryType() {
        return new HistoryType();
    }

    /**
     * Create an instance of {@link ConstraintsType }
     * 
     */
    public ConstraintsType createConstraintsType() {
        return new ConstraintsType();
    }

    /**
     * Create an instance of {@link TextType }
     * 
     */
    public TextType createTextType() {
        return new TextType();
    }

    /**
     * Create an instance of {@link TextTableType }
     * 
     */
    public TextTableType createTextTableType() {
        return new TextTableType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextTablesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TextTablesType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "textTables")
    public JAXBElement<TextTablesType> createTextTables(TextTablesType value) {
        return new JAXBElement<TextTablesType>(_TextTables_QNAME, TextTablesType.class, null, value);
    }

}
