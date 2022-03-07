import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.TextAlignment;

public class Controller {
    
    @FXML
    private Label myLabel;
    
    @FXML
    private TextField myTextField;
    
    @FXML
    private Button myButton;
    
    int age;

    public void submit(ActionEvent e) {
        myLabel.setMaxWidth(750);
        myLabel.setMaxHeight(250);
        myLabel.setWrapText(true);
        myLabel.setTextAlignment(TextAlignment.CENTER);

        try {

            age = Integer.parseInt(myTextField.getText());
            
            if (age >= 18) {

                myLabel.setText("You are now signed up for the program!");

            } else {

                myLabel.setText("You are not old enough, you need to be at least 18 years old.");
            
            }

        } catch (NumberFormatException err) {

            myLabel.setText("Please enter numbers only.");

        } catch (Exception err) {

            myLabel.setText("Error");

        }

    }
    
}
