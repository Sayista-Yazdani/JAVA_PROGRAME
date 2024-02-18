import java.awt.*;
import java.awt.event.*;
public class AWTLayoutEx {

        private Frame frame;
        private Button btnNorth, btnEast, btnWest,btnCenter,btnSouth;
        private Panel flowPanel, gridPanel;
        public AWTLayoutEx() {
            frame = new Frame("AWT Layout Example");
// BorderLayout Example
            btnNorth = new Button("North");
            btnSouth = new Button("South");
            btnEast = new Button("East");
            btnWest = new Button("West");
            btnCenter = new Button("Center");
            frame.setLayout(new BorderLayout());
            frame.add(btnNorth, BorderLayout.NORTH);
            frame.add(btnSouth, BorderLayout.SOUTH);
            frame.add(btnEast, BorderLayout.EAST);
            frame.add(btnWest, BorderLayout.WEST);
           frame.add(btnCenter, BorderLayout.CENTER);
// FlowLayout Example
            flowPanel = new Panel();
            flowPanel.setLayout(new FlowLayout());
            Button btnFlow1 = new Button("Button 1");
            Button btnFlow2 = new Button("Button 2");
            Button btnFlow3 = new Button("Button 3");
            flowPanel.add(btnFlow1);
            flowPanel.add(btnFlow2);
            flowPanel.add(btnFlow3);
// GridLayout Example
            gridPanel = new Panel();
            gridPanel.setLayout(new GridLayout(2, 2));
            Button btnGrid1 = new Button("Button 1");
            Button btnGrid2 = new Button("Button 2");
            Button btnGrid3 = new Button("Button 3");
            Button btnGrid4 = new Button("Button 4");
            gridPanel.add(btnGrid1);
            gridPanel.add(btnGrid2);
            gridPanel.add(btnGrid3);
            gridPanel.add(btnGrid4);
// Add the panels to the frame
            frame.add(flowPanel, BorderLayout.SOUTH);
            frame.add(gridPanel, BorderLayout.CENTER);
// Add WindowListener to handle window close event
            frame.addWindowListener(new WindowAdapter()
            { public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
            });
// Set frame size and make it visible
            frame.setSize(500, 300);
            frame.setVisible(true);
        }
        public static void main(String[] args) {
            new AWTLayoutEx();
        }

    }
