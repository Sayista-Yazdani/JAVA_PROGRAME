

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
    public class Checkbox_AWT {
        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                createAndShowGUI();
            });
        }
        private static void createAndShowGUI() {
            // Create a JFrame
            JFrame frame = new JFrame("Checkbox Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);
            // Create a panel to hold the checkboxes
            JPanel panel = new JPanel();
            // Create checkboxes
            JCheckBox checkBox1 = new JCheckBox("Option 1");
            JCheckBox checkBox2 = new JCheckBox("Option 2");
            // Create a label to display selected options
            JLabel label = new JLabel("Selected Options: ");
            // Add checkboxes to the panel
            panel.add(checkBox1);
            panel.add(checkBox2);
            panel.add(label);
            // Add an ActionListener to each checkbox to handle events
            checkBox1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (checkBox1.isSelected()) {
                        label.setText("Selected Options: Option 1");
                    } else {
                        label.setText("Selected Options: ");
                    }
                }
            });

            checkBox2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (checkBox2.isSelected()) {
                        label.setText("Selected Options: Option 2");
                    } else {
                        label.setText("Selected Options: ");
                    }
                }
            });
            // Set the layout manager for the panel
            panel.setLayout(new FlowLayout());
            // Add the panel to the frame
            frame.add(panel);
            // Make the frame visible
            frame.setVisible(true);
        }

    }
