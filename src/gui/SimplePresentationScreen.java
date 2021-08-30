package gui;



import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.time.LocalDateTime;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png"))); 
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 250));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 211);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		tabInformation.setLayout(null);
		lblNewLabel = new JLabel("LU");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 27, 68, 14);
		tabInformation.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 52, 57, 14);
		tabInformation.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 77, 57, 14);
		tabInformation.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("E-mail");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 102, 46, 14);
		tabInformation.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Github URL");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 135, 68, 14);
		tabInformation.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(88, 24, 305, 20);
		tabInformation.add(textField);
		textField.setColumns(10);
		textField.setText(""+studentData.getId());
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(88, 49, 305, 20);
		tabInformation.add(textField_1);
		textField_1.setText(studentData.getLastName());

		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(88, 74, 305, 20);
		tabInformation.add(textField_2);
		textField_2.setText(studentData.getFirstName());

		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(88, 99, 305, 20);
		tabInformation.add(textField_3);
		textField_3.setText(studentData.getMail());

		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(88, 132, 305, 20);
		tabInformation.add(textField_4);
		contentPane.add(tabbedPane);
		textField_4.setText(studentData.getGithubURL());
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(21, 158, 383, 14);
		tabInformation.add(lblNewLabel_5);
		
		lblNewLabel_5.setText("Esta ventana fue generada el " + LocalDateTime.now().getDayOfMonth()+"/"+
		LocalDateTime.now().getMonth().getValue()+"/"+LocalDateTime.now().getYear() + " a las " + LocalDateTime.now().getHour()+ 
		":"+ LocalDateTime.now().getMinute()+ ":"+ LocalDateTime.now().getSecond());
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource(studentData.getPathPhoto())));
		lblNewLabel_6.setBounds(450, 35, 139, 170);
		contentPane.add(lblNewLabel_6);
		
	}
}
