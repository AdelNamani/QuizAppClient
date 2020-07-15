/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizappclientws;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import webservice.*;
import javafx.stage.FileChooser;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author DELL
 */
public class QuizController implements Initializable {
    QuestionWebService proxy;
    public QuizController(){
        proxy = (new QuestionWebService_Service()).getQuestionWebServicePort();
        
    }
    
    @FXML
    private Label question;
    
    @FXML
    private Label note;
    
    @FXML
    private Label question_id;
    
    @FXML
    private Label r1;
    
    @FXML
    private Label r2;
    
    @FXML
    private Label r3;
    
    @FXML
    private Label r4;
    
    @FXML
    private Button loader;
    
    private int bareme;
    
    @FXML
    private void suivant(){
        Question q = proxy.getQuestionAlea();
        this.question.setText(q.getEnonce());
        this.question_id.setText(Integer.toString(q.getId()));
        this.r1.setText(q.getReponse1());
        this.r2.setText(q.getReponse2());
        this.r3.setText(q.getReponse3());
        this.r4.setText(q.getReponse4());
        this.note.setText("?/"+q.getBareme());
        this.bareme = q.getBareme();
    }
    
    private void answer(int answer_id){
        int id = Integer.parseInt(this.question_id.getText());
        int mark = proxy.evaluateQuestion(id, answer_id);
        this.note.setText(Integer.toString(mark)+"/"+Integer.toString(this.bareme));
    }
    
    @FXML
    private void answerR1(){this.answer(1);}
    
    @FXML
    private void answerR2(){this.answer(2);}
    
    @FXML
    private void answerR3(){this.answer(3);}
    
    @FXML
    private void answerR4(){this.answer(4);}
    
    @FXML
    private void back() throws FileNotFoundException, IOException{
        Scene scene = loader.getScene();
        Window window = scene.getWindow();
        Stage stage = (Stage) window;
        FXMLLoader loader = new FXMLLoader();
        //String fxmlDocPath = "src/quizappclientws/main.fxml";
        //FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
        VBox root =(VBox) loader.load(getClass().getResource("main.fxml"));
        scene = new Scene(root, 636.0,453.0 );
        stage.setScene(scene);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.suivant();
    }    
    
}
