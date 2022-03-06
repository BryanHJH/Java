import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame {

    JButton button;
    JLabel label;

    public MyFrame() {
        
        ImageIcon icon = new ImageIcon("./sample.png");

        label = new JLabel();
        label.setBounds(150, 250, 250, 150);
        label.setText("This appears after clicking the button!");
        label.setVisible(false);

        button = new JButton();
        button.setBounds(200, 100, 250, 50);
        button.addActionListener(e -> label.setVisible(true));

        button.setText("I'm a button!");
        button.setFocusable(false);
        // button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.PLAIN, 25));
        button.setForeground(Color.yellow);
        button.setBackground(Color.gray);
        

        this.setSize(500, 500); // Sets HxW of the this
        this.setLayout(null);
        this.setTitle("DEMO PROGRAM (JAVA SWING)"); // Sets the title of the window/this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exits the application on close
        // this.setResizable(false); // Causes the this to be unresizable
        this.setVisible(true);

        this.add(button);
        this.add(label);
    
        // ImageIcon icon = new ImageIcon("./sample.png"); // Creates an image icon
        // this.setIconImage(icon.getImage());
        // this.getContentPane().setBackground(Color.BLACK);
        
    }

}
