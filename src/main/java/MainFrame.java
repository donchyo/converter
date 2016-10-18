import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame {

	private JFrame frame;
	private JTextField inputdeg;
	private JTextField outputdeg;
	private JTextField inputrad;
	private JTextField outputrad;
	private JButton btnClose;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		inputdeg = new JTextField();
		inputdeg.setBounds(12, 44, 116, 22);
		frame.getContentPane().add(inputdeg);
		inputdeg.setColumns(10);
		
		JButton degToRadbttn = new JButton("convert");
		degToRadbttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Converter converter = new Converter();
				outputdeg.setText(converter.degToRad(inputdeg.getText()));
				
			}
		});
		degToRadbttn.setBounds(140, 43, 97, 25);
		frame.getContentPane().add(degToRadbttn);
		
		JLabel degToRad = new JLabel("degrees to radians");
		degToRad.setBounds(12, 13, 116, 16);
		frame.getContentPane().add(degToRad);
		
		JLabel lblNewLabel_1 = new JLabel("radians to degrees");
		lblNewLabel_1.setBounds(12, 104, 116, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		outputdeg = new JTextField();
		outputdeg.setBounds(249, 44, 171, 22);
		frame.getContentPane().add(outputdeg);
		outputdeg.setColumns(10);
		
		inputrad = new JTextField();
		inputrad.setColumns(10);
		inputrad.setBounds(12, 133, 116, 22);
		frame.getContentPane().add(inputrad);
		
		outputrad = new JTextField();
		outputrad.setColumns(10);
		outputrad.setBounds(249, 133, 171, 22);
		frame.getContentPane().add(outputrad);
		
		JButton radToDegbttn = new JButton("convert");
		radToDegbttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Converter converter = new Converter();
				outputrad.setText(converter.radToDeg(inputrad.getText()));
			}
		});
		radToDegbttn.setBounds(140, 132, 97, 25);
		frame.getContentPane().add(radToDegbttn);
		
		btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(140, 203, 97, 25);
		frame.getContentPane().add(btnClose);
	}

}
