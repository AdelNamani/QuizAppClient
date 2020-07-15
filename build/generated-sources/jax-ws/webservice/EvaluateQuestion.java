
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for evaluateQuestion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="evaluateQuestion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idQuestion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idQReponse" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "evaluateQuestion", propOrder = {
    "idQuestion",
    "idQReponse"
})
public class EvaluateQuestion {

    protected int idQuestion;
    protected int idQReponse;

    /**
     * Gets the value of the idQuestion property.
     * 
     */
    public int getIdQuestion() {
        return idQuestion;
    }

    /**
     * Sets the value of the idQuestion property.
     * 
     */
    public void setIdQuestion(int value) {
        this.idQuestion = value;
    }

    /**
     * Gets the value of the idQReponse property.
     * 
     */
    public int getIdQReponse() {
        return idQReponse;
    }

    /**
     * Sets the value of the idQReponse property.
     * 
     */
    public void setIdQReponse(int value) {
        this.idQReponse = value;
    }

}
