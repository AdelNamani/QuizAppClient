
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
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

    private final static QName _GetQuestionAleaResponse_QNAME = new QName("http://webservice/", "getQuestionAleaResponse");
    private final static QName _AddQuestions_QNAME = new QName("http://webservice/", "addQuestions");
    private final static QName _AddQuestionsResponse_QNAME = new QName("http://webservice/", "addQuestionsResponse");
    private final static QName _EvaluateQuestion_QNAME = new QName("http://webservice/", "evaluateQuestion");
    private final static QName _GetQuestionAlea_QNAME = new QName("http://webservice/", "getQuestionAlea");
    private final static QName _Question_QNAME = new QName("http://webservice/", "question");
    private final static QName _EvaluateQuestionResponse_QNAME = new QName("http://webservice/", "evaluateQuestionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetQuestionAleaResponse }
     * 
     */
    public GetQuestionAleaResponse createGetQuestionAleaResponse() {
        return new GetQuestionAleaResponse();
    }

    /**
     * Create an instance of {@link AddQuestions }
     * 
     */
    public AddQuestions createAddQuestions() {
        return new AddQuestions();
    }

    /**
     * Create an instance of {@link AddQuestionsResponse }
     * 
     */
    public AddQuestionsResponse createAddQuestionsResponse() {
        return new AddQuestionsResponse();
    }

    /**
     * Create an instance of {@link EvaluateQuestion }
     * 
     */
    public EvaluateQuestion createEvaluateQuestion() {
        return new EvaluateQuestion();
    }

    /**
     * Create an instance of {@link GetQuestionAlea }
     * 
     */
    public GetQuestionAlea createGetQuestionAlea() {
        return new GetQuestionAlea();
    }

    /**
     * Create an instance of {@link Question }
     * 
     */
    public Question createQuestion() {
        return new Question();
    }

    /**
     * Create an instance of {@link EvaluateQuestionResponse }
     * 
     */
    public EvaluateQuestionResponse createEvaluateQuestionResponse() {
        return new EvaluateQuestionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuestionAleaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getQuestionAleaResponse")
    public JAXBElement<GetQuestionAleaResponse> createGetQuestionAleaResponse(GetQuestionAleaResponse value) {
        return new JAXBElement<GetQuestionAleaResponse>(_GetQuestionAleaResponse_QNAME, GetQuestionAleaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddQuestions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "addQuestions")
    public JAXBElement<AddQuestions> createAddQuestions(AddQuestions value) {
        return new JAXBElement<AddQuestions>(_AddQuestions_QNAME, AddQuestions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddQuestionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "addQuestionsResponse")
    public JAXBElement<AddQuestionsResponse> createAddQuestionsResponse(AddQuestionsResponse value) {
        return new JAXBElement<AddQuestionsResponse>(_AddQuestionsResponse_QNAME, AddQuestionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluateQuestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "evaluateQuestion")
    public JAXBElement<EvaluateQuestion> createEvaluateQuestion(EvaluateQuestion value) {
        return new JAXBElement<EvaluateQuestion>(_EvaluateQuestion_QNAME, EvaluateQuestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuestionAlea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getQuestionAlea")
    public JAXBElement<GetQuestionAlea> createGetQuestionAlea(GetQuestionAlea value) {
        return new JAXBElement<GetQuestionAlea>(_GetQuestionAlea_QNAME, GetQuestionAlea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Question }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "question")
    public JAXBElement<Question> createQuestion(Question value) {
        return new JAXBElement<Question>(_Question_QNAME, Question.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluateQuestionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "evaluateQuestionResponse")
    public JAXBElement<EvaluateQuestionResponse> createEvaluateQuestionResponse(EvaluateQuestionResponse value) {
        return new JAXBElement<EvaluateQuestionResponse>(_EvaluateQuestionResponse_QNAME, EvaluateQuestionResponse.class, null, value);
    }

}
