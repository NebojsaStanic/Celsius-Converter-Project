package learn;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CelsiusConverterGUI extends JFrame {

	private JPanel contentPane;
	private JTextField tempTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CelsiusConverterGUI frame = new CelsiusConverterGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CelsiusConverterGUI() {
		setBackground(Color.ORANGE);
		setTitle("Celsius Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 260, 145);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tempTextField = new JTextField();
		tempTextField.setBounds(24, 11, 86, 20);
		contentPane.add(tempTextField);
		tempTextField.setColumns(10);
		
		JLabel CelsiusLabel = new JLabel("Celsius");
		CelsiusLabel.setBounds(140, 14, 46, 14);
		contentPane.add(CelsiusLabel);
		
		JLabel fahrenheitLabel = new JLabel("Fahrenheit");
		fahrenheitLabel.setBounds(140, 61, 94, 14);
		contentPane.add(fahrenheitLabel);
		
		JButton convertButton = new JButton("Convert");
		convertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tempFahr = (int)((Double.parseDouble(tempTextField.getText()))* 1.8 + 32);
				fahrenheitLabel.setText(tempFahr + " Fahrenheit");
			}
		});
		convertButton.setBounds(21, 57, 89, 23);
		contentPane.add(convertButton);
		

	}
}
