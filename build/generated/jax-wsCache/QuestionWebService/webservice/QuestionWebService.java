
package webservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "QuestionWebService", targetNamespace = "http://webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface QuestionWebService {


    /**
     * 
     * @return
     *     returns webservice.Question
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getQuestionAlea", targetNamespace = "http://webservice/", className = "webservice.GetQuestionAlea")
    @ResponseWrapper(localName = "getQuestionAleaResponse", targetNamespace = "http://webservice/", className = "webservice.GetQuestionAleaResponse")
    @Action(input = "http://webservice/QuestionWebService/getQuestionAleaRequest", output = "http://webservice/QuestionWebService/getQuestionAleaResponse")
    public Question getQuestionAlea();

    /**
     * 
     * @param idQuestion
     * @param idQReponse
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "evaluateQuestion", targetNamespace = "http://webservice/", className = "webservice.EvaluateQuestion")
    @ResponseWrapper(localName = "evaluateQuestionResponse", targetNamespace = "http://webservice/", className = "webservice.EvaluateQuestionResponse")
    @Action(input = "http://webservice/QuestionWebService/evaluateQuestionRequest", output = "http://webservice/QuestionWebService/evaluateQuestionResponse")
    public int evaluateQuestion(
        @WebParam(name = "idQuestion", targetNamespace = "")
        int idQuestion,
        @WebParam(name = "idQReponse", targetNamespace = "")
        int idQReponse);

    /**
     * 
     * @param idQuestion
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addQuestions", targetNamespace = "http://webservice/", className = "webservice.AddQuestions")
    @ResponseWrapper(localName = "addQuestionsResponse", targetNamespace = "http://webservice/", className = "webservice.AddQuestionsResponse")
    @Action(input = "http://webservice/QuestionWebService/addQuestionsRequest", output = "http://webservice/QuestionWebService/addQuestionsResponse")
    public Boolean addQuestions(
        @WebParam(name = "idQuestion", targetNamespace = "")
        List<Question> idQuestion);

}
