
package mypackage;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java-Klasse für constraintsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="constraintsType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="maxChars" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="maxLines" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="noTranslation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="obd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="obd-key" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "constraintsType", propOrder = {
    "value"
})
public class ConstraintsType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "maxChars")
    protected String maxChars;
    @XmlAttribute(name = "maxLines")
    protected String maxLines;
    @XmlAttribute(name = "noTranslation")
    protected String noTranslation;
    @XmlAttribute(name = "obd")
    protected String obd;
    @XmlAttribute(name = "obd-key")
    protected String obdKey;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der maxChars-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxChars() {
        return maxChars;
    }

    /**
     * Legt den Wert der maxChars-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxChars(String value) {
        this.maxChars = value;
    }

    /**
     * Ruft den Wert der maxLines-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxLines() {
        return maxLines;
    }

    /**
     * Legt den Wert der maxLines-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxLines(String value) {
        this.maxLines = value;
    }

    /**
     * Ruft den Wert der noTranslation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoTranslation() {
        return noTranslation;
    }

    /**
     * Legt den Wert der noTranslation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoTranslation(String value) {
        this.noTranslation = value;
    }

    /**
     * Ruft den Wert der obd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObd() {
        return obd;
    }

    /**
     * Legt den Wert der obd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObd(String value) {
        this.obd = value;
    }

    /**
     * Ruft den Wert der obdKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObdKey() {
        return obdKey;
    }

    /**
     * Legt den Wert der obdKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObdKey(String value) {
        this.obdKey = value;
    }

}
