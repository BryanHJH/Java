import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class JLabels {
    public static void main(String[] args) {
        
        ImageIcon icon = new ImageIcon("../sample.png"); 
        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);
        
        JLabel myLabel = new JLabel();
        myLabel.setText("How do you do?");
        myLabel.setIcon(icon);
        myLabel.setHorizontalTextPosition(JLabel.CENTER); // set Text LEFT, CENTER or RIGHT of ImageIcon
        myLabel.setVerticalTextPosition(JLabel.TOP); // set Text TOP, CENTER or BOTTOM of ImageIcon
        myLabel.setForeground(Color.BLUE);
        myLabel.setFont(new Font("CaskaydiaCove Nerd Font", Font.PLAIN, 40));
        myLabel.setBorder(border);
        myLabel.setVerticalAlignment(JLabel.CENTER); // set both text and icon position vertically
        myLabel.setHorizontalAlignment(JLabel.CENTER); // set both text and icon position horizontally

        JFrame myFrame = new JFrame();

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(500, 500);
        myFrame.setVisible(true);
        myFrame.add(myLabel);
    }
}
