package day02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class NumberPresenceGUI extends JFrame {
	private JButton generateButton;
	private JTextArea textArea;

	public NumberPresenceGUI() {
		super("Number Presence");

		// Create components
		generateButton = new JButton("Generate Number");
		textArea = new JTextArea(10, 30);
		textArea.setEditable(false);

		// Add action listener to generateButton
		generateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				generateNumber();
			}
		});

		// Layout components
		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.add(generateButton, BorderLayout.NORTH);
		mainPanel.add(new JScrollPane(textArea), BorderLayout.CENTER);

		// Add main panel to frame
		add(mainPanel);

		// Set frame properties
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void generateNumber() {
		File persistNumbers = new File("numberrecord1.txt");
		try {
			if (persistNumbers.createNewFile()) {
				// File created
			}

			while (true) {
				Random rand = new Random();
				int randomNumber = rand.nextInt(187) + 1;

				boolean numberPresent = false;
				Scanner myReader = new Scanner(persistNumbers);
				while (myReader.hasNextLine()) {
					String lineData = myReader.nextLine();
					if (Integer.toString(randomNumber).equals(lineData)) {
						textArea.append("Number " + randomNumber + " is already present in the file.\n");
						numberPresent = true;
						break;
					}
				}

				if (numberPresent) {
					continue;
				}

				int response = JOptionPane.showConfirmDialog(null,
						"Is the number " + randomNumber + " present in the class?", "Confirm",
						JOptionPane.YES_NO_OPTION);
				if (response == JOptionPane.YES_OPTION) {
					FileWriter fw = new FileWriter(persistNumbers, true);
					fw.write(Integer.toString(randomNumber) + "\n");
					fw.close();
					textArea.append("The number " + randomNumber + " has been recorded.\n");
					break;
				} else if (response == JOptionPane.NO_OPTION) {
					continue;
				} else {
					JOptionPane.showMessageDialog(null, "Invalid response. Please answer with yes or no.", "Error",
							JOptionPane.ERROR_MESSAGE);
					continue;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new NumberPresenceGUI());
	}
}
