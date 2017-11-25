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
 * <p>Java class for SubmitRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="submittedAnsiVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resultAnsiVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="submitterSubmissionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="processingOption" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payload" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitRequestType", propOrder = {
    "timeout",
    "transactionType",
    "submittedAnsiVersion",
    "resultAnsiVersion",
    "submitterSubmissionId",
    "processingOption",
    "payload"
})
@XmlRootElement(name = "SubmitRequestType", namespace = "http://wsdl.navicure/")
public class SubmitRequestType {

    @XmlElement(required = true)
    protected String timeout;
    @XmlElement(required = true)
    protected String transactionType;
    @XmlElement(required = true, nillable = true)
    protected String submittedAnsiVersion;
    @XmlElement(required = true, nillable = true)
    protected String resultAnsiVersion;
    @XmlElement(required = true, nillable = true)
    protected String submitterSubmissionId;
    @XmlElement(required = true)
    protected String processingOption;
    @XmlElement(required = true)
    protected String payload;

    /**
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeout(String value) {
        this.timeout = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the submittedAnsiVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmittedAnsiVersion() {
        return submittedAnsiVersion;
    }

    /**
     * Sets the value of the submittedAnsiVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmittedAnsiVersion(String value) {
        this.submittedAnsiVersion = value;
    }

    /**
     * Gets the value of the resultAnsiVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultAnsiVersion() {
        return resultAnsiVersion;
    }

    /**
     * Sets the value of the resultAnsiVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultAnsiVersion(String value) {
        this.resultAnsiVersion = value;
    }

    /**
     * Gets the value of the submitterSubmissionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitterSubmissionId() {
        return submitterSubmissionId;
    }

    /**
     * Sets the value of the submitterSubmissionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitterSubmissionId(String value) {
        this.submitterSubmissionId = value;
    }

    /**
     * Gets the value of the processingOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingOption() {
        return processingOption;
    }

    /**
     * Sets the value of the processingOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingOption(String value) {
        this.processingOption = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayload(String value) {
        this.payload = value;
    }

}