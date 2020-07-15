/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizappclientws;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;
import javax.swing.filechooser.FileNameExtensionFilter;
import webservice.Question;
import webservice.QuestionWebService;
import webservice.QuestionWebService_Service;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class MainController implements Initializable {
    
    QuestionWebService proxy;
    public MainController(){
        proxy = (new QuestionWebService_Service()).getQuestionWebServicePort();
    }
    
    @FXML
    private Button loader;
    
    @FXML
    private Text result;
    
    @FXML
    private void load(){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("CSV files (*.csv)", "*.csv");
        fileChooser.getExtensionFilters().add(extFilter);
        Stage stage = new Stage();
        File file = fileChooser.showOpenDialog(stage);
        
        String line = "";
        String cvsSplitBy = ";";
        
        List<Question> questions = new ArrayList<Question>();
        int i = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                i++;
                String[] question_string = line.split(cvsSplitBy);
                Question question = new Question();
                question.setEnonce(question_string[0]);
                question.setReponse1(question_string[1]);
                question.setReponse2(question_string[2]);
                question.setReponse3(question_string[3]);
                question.setReponse4(question_string[4]);
                question.setIndiceReponceCorrecte(Integer.parseInt(question_string[5]));
                question.setBareme(Integer.parseInt(question_string[6]));
                questions.add(question);
                System.out.println("Question [enonce= " + question_string[0] + " , correct=" + question_string[6] + "]");
            }
            
            boolean success = proxy.addQuestions(questions);
            if (success) result.setText(Integer.toString(i)+" Questions ont été bien ajoutées à la base de données !");
            else result.setText("Erreur ! Vérifier le format du fichier.");
        } catch (Exception e) {
            result.setText("Erreur ! Vérifier le format du fichier.");
        }
    }
    
    @FXML
    private void next() throws IOException{
        Scene scene = this.loader.getScene();
        Window window = scene.getWindow();
        Stage stage = (Stage) window;
        FXMLLoader loader = new FXMLLoader();
        //String fxmlDocPath = "src/quizappclientws/Quiz.fxml";
        //FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
        AnchorPane root =(AnchorPane) loader.load(getClass().getResource("Quiz.fxml"));
        scene = new Scene(root, 636.0,453.0 );
        stage.setScene(scene);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
