import java.awt.*;
//import java.awt.Button;
//import java.awt.Checkbox;
//import java.awt.Choice;
//import java.awt.Frame;
//import java.awt.Label;
//import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class AwtComponentsExample {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("AWT Components Example");

        // Create components
        Button button = new Button("Click Me");
        Label label = new Label("This is a label");
        Checkbox checkbox = new Checkbox("Check Me");
        TextField textField = new TextField("Default Text");
        Choice choice = new Choice();
        choice.add("Option 1:student 1");
        choice.add("Option 2:student 2");
        choice.add("Option 3:student 3");

        // Add components to the frame
        frame.add(button);
        frame.add(label);
        frame.add(checkbox);
        frame.add(textField);
        frame.add(choice);

        // Set layout to null for simplicity (absolute positioning)
        frame.setLayout(null);

        // Set bounds for each component
        button.setBounds(50, 50, 80, 30);
        label.setBounds(50, 100, 150, 20);
        checkbox.setBounds(50, 150, 100, 20);
        textField.setBounds(50, 200, 120, 30);
        choice.setBounds(50, 250, 80, 20);

        // Add ActionListener for the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked");
            }
        });

        // Add ItemListener for the checkbox
        checkbox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("Checkbox Checked: " + checkbox.getState());
            }
        });

        // Add ActionListener for the choice
        choice.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("Selected Option: " + choice.getSelectedItem());
            }
        });

        // Set the frame size and make it visible
        frame.setSize(300, 350);
        frame.setVisible(true);

        // Handle window close event
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}


