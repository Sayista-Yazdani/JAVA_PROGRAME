
import java.awt.*;
import javax.swing.*;

public class LayCode extends Frame
{

    LayCode()
    {
       // JFrame f = new JFrame();
        Color c =new Color(255,222,200);
// creating buttons
        JButton b1 = new JButton("NORTH");    // the button will be labeled as NORTH
        JButton b2 = new JButton("SOUTH");    // the button will be labeled as SOUTH
        JButton b3 = new JButton("EAST");     // the button will be labeled as EAST
        JButton b4 = new JButton("WEST");    // the button will be labeled as WEST
        JButton b5 = new JButton("CENTER");    // the button will be labeled as
        b1.setBackground(new Color(56,78,100));
        this.setTitle("frames buttons");
        this.add(b1, BorderLayout.NORTH);    // b1 will be placed in the North Direction
        this.add(b2, BorderLayout.SOUTH);    // b2 will be placed in the South Direction
        this.add(b3, BorderLayout.EAST);    // b2 will be placed in the East Direction
        this.add(b4, BorderLayout.WEST);    // b2 will be placed in the West Direction
        this.add(b5, BorderLayout.CENTER);   // b2 will be placed in the Center
        this.setSize(300, 300);
       // this.setBackground(new Color(0x009270));
        this.setBackground(c);
        this.setVisible(true);

    }
    public static void main(String[] args) {
        new LayCode();
    }
}
