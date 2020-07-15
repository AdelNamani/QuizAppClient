
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for question complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="question">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bareme" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="enonce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="indiceReponceCorrecte" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reponse1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reponse2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reponse3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reponse4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "question", propOrder = {
    "bareme",
    "enonce",
    "id",
    "indiceReponceCorrecte",
    "reponse1",
    "reponse2",
    "reponse3",
    "reponse4"
})
public class Question {

    protected Integer bareme;
    protected String enonce;
    protected Integer id;
    protected Integer indiceReponceCorrecte;
    protected String reponse1;
    protected String reponse2;
    protected String reponse3;
    protected String reponse4;

    /**
     * Gets the value of the bareme property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBareme() {
        return bareme;
    }

    /**
     * Sets the value of the bareme property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBareme(Integer value) {
        this.bareme = value;
    }

    /**
     * Gets the value of the enonce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnonce() {
        return enonce;
    }

    /**
     * Sets the value of the enonce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnonce(String value) {
        this.enonce = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the indiceReponceCorrecte property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndiceReponceCorrecte() {
        return indiceReponceCorrecte;
    }

    /**
     * Sets the value of the indiceReponceCorrecte property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndiceReponceCorrecte(Integer value) {
        this.indiceReponceCorrecte = value;
    }

    /**
     * Gets the value of the reponse1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReponse1() {
        return reponse1;
    }

    /**
     * Sets the value of the reponse1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReponse1(String value) {
        this.reponse1 = value;
    }

    /**
     * Gets the value of the reponse2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReponse2() {
        return reponse2;
    }

    /**
     * Sets the value of the reponse2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReponse2(String value) {
        this.reponse2 = value;
    }

    /**
     * Gets the value of the reponse3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReponse3() {
        return reponse3;
    }

    /**
     * Sets the value of the reponse3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReponse3(String value) {
        this.reponse3 = value;
    }

    /**
     * Gets the value of the reponse4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReponse4() {
        return reponse4;
    }

    /**
     * Sets the value of the reponse4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReponse4(String value) {
        this.reponse4 = value;
    }

}
