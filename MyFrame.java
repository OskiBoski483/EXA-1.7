import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;


public class MyFrame extends JFrame{

   MyFrame(){

           JButton button = new JButton();
           button.setBounds(100, 1000, 100, 50);
           //button.addActionListener(e -> new plobb());
           button.setText("Failed Created Ram Disk");
           button.setFocusable(false);
           //button.setIcon(icon);



           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.setLayout(null);
           this.setSize(1920, 1080);
           this.setVisible(true);
           this.add(button);
           this.setTitle("EXA Created by Oskar Niziol With Passion!");
           this.setResizable(false);





           }




}