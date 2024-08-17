package day02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentAttendanceGUI extends JFrame {
    private JLabel nameLabel;
    private JCheckBox[] checkBoxes;

    public StudentAttendanceGUI(String[] studentNames) {
        super("Student Attendance");

        // Create components
        nameLabel = new JLabel("Mark Attendance:");
        checkBoxes = new JCheckBox[studentNames.length];

        // Add student names checkboxes
        for (int i = 0; i < studentNames.length; i++) {
            checkBoxes[i] = new JCheckBox(studentNames[i]);
        }

        // Layout components
        JPanel mainPanel = new JPanel(new GridLayout(studentNames.length + 1, 1));
        mainPanel.add(nameLabel);
        for (int i = 0; i < studentNames.length; i++) {
            mainPanel.add(checkBoxes[i]);
        }

        // Add main panel to frame
        add(mainPanel);

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Sample student names
        String[] students = {"John", "Alice", "Bob", "Carol"};

        // Create GUI
        SwingUtilities.invokeLater(() -> new StudentAttendanceGUI(students));
    }
}
