/**
 * This is a implementation of a GUI that represents displays a clicking button that counts the number of clicks.
 * @author Aadhith Kumaresan
 * @version 1.0
 * @since 2022-02-13
 */

import javax.swing.*;   // import the Java Swing library
import java.awt.*;      // import the Abstract Window Toolkit (AWT) library
import java.awt.event.ActionEvent;   // import the ActionEvent class
import java.awt.event.ActionListener; // import the ActionListener interface

// Class definition for our GUI
public class GUI implements ActionListener {
    // Declare class variables
    private int count = 0;      // Keep track of the button click count
    private JLabel label;       // The label to display the click count
    private JFrame frame;       // The main window frame
    private JPanel panel;       // A panel to group the components together

    // Constructor to set up the GUI
    public GUI() {

        // Create a new JFrame
        frame = new JFrame();

        // Create a new JButton with the text "Click me"
        JButton button = new JButton("Click me");

        // Add the current instance of the GUI class as the ActionListener for the button
        button.addActionListener(this);

        // Create a new JLabel with no text
        label = new JLabel();

        // Create a new JPanel
        panel = new JPanel();

        // Set the border for the panel
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));

        // Set the layout for the panel to be a grid layout with one column
        panel.setLayout(new GridLayout(0, 1));

        // Add the button and label to the panel
        panel.add(button);
        panel.add(label);

        // Add the panel to the center of the frame
        frame.add(panel, BorderLayout.CENTER);

        // Set the default close operation for the frame to exit the program when closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the title for the frame
        frame.setTitle("GUI");

        // Pack the components inside the frame
        frame.pack();

        // Make the frame visible
        frame.setVisible(true);

    }

    // Main method to launch the GUI
    public static void main(String[] args) {
        // Create a new instance of the GUI
        new GUI();
    }

    // Override the actionPerformed method from the ActionListener interface
    @Override
    public void actionPerformed(ActionEvent e) {
        // Increment the count
        count++;

        // Update the text on the label to display the new count
        label.setText("Number of clicks: " + count);
    }
}
