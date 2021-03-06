//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.22 at 07:22:17 PM CST 
//


package navicure.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="originatingIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="submitterIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="submitterPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="submissionId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityHeaderType", propOrder = {
    "originatingIdentifier",
    "submitterIdentifier",
    "submitterPassword",
    "submissionId"
})
@XmlRootElement(name = "SecurityHeaderType", namespace = "http://wsdl.navicure/")
public class SecurityHeaderType {

    @XmlElement(required = true)
    protected String originatingIdentifier;
    @XmlElement(required = true)
    protected String submitterIdentifier;
    @XmlElement(required = true)
    protected String submitterPassword;
    protected long submissionId;

    /**
     * Gets the value of the originatingIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingIdentifier() {
        return originatingIdentifier;
    }

    /**
     * Sets the value of the originatingIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingIdentifier(String value) {
        this.originatingIdentifier = value;
    }

    /**
     * Gets the value of the submitterIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitterIdentifier() {
        return submitterIdentifier;
    }

    /**
     * Sets the value of the submitterIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitterIdentifier(String value) {
        this.submitterIdentifier = value;
    }

    /**
     * Gets the value of the submitterPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitterPassword() {
        return submitterPassword;
    }

    /**
     * Sets the value of the submitterPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitterPassword(String value) {
        this.submitterPassword = value;
    }

    /**
     * Gets the value of the submissionId property.
     * 
     */
    public long getSubmissionId() {
        return submissionId;
    }

    /**
     * Sets the value of the submissionId property.
     * 
     */
    public void setSubmissionId(long value) {
        this.submissionId = value;
    }

}
