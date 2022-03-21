
package mypackage;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für historyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="historyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="historyInfo" type="{}historyInfoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "historyType", propOrder = {
    "historyInfo"
})
public class HistoryType {

    @XmlElement(required = true)
    protected HistoryInfoType historyInfo;

    /**
     * Ruft den Wert der historyInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HistoryInfoType }
     *     
     */
    public HistoryInfoType getHistoryInfo() {
        return historyInfo;
    }

    /**
     * Legt den Wert der historyInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryInfoType }
     *     
     */
    public void setHistoryInfo(HistoryInfoType value) {
        this.historyInfo = value;
    }

}
