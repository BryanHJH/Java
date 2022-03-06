import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene2Controller {
    
    @FXML
    Label greeting;


    public void displayName(String username) {
        greeting.setText("Hello, " + username);
    }
}
