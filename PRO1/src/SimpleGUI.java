
import java.awt.*;
import java.awt.event.*;

public class SimpleGUI {
    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;
    private TextField textField;
    private Button submitButton;

    public SimpleGUI() {
        prepareGUI();
    }

    public static void main(String[] args) {
        SimpleGUI simpleGUI = new SimpleGUI();
        simpleGUI.showSimpleGUI();
    }

    private void prepareGUI() {
        mainFrame = new Frame("Simple GUI Example");
        mainFrame.setSize(400, 200);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        headerLabel = new Label("Enter Text and Click the Button");
        headerLabel.setAlignment(Label.CENTER);
        statusLabel = new Label("");
        statusLabel.setAlignment(Label.CENTER);

        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);

        textField = new TextField(20);
        submitButton = new Button("Submit");

        controlPanel.add(textField);
        controlPanel.add(submitButton);

        mainFrame.setVisible(true);
    }

    private void showSimpleGUI() {
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                statusLabel.setText("You entered: " + text);
            }
        });
    }
}

