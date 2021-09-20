package comcave;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;

public class Window extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

			
			String lookAndFeel1 = "javax.swing.plaf.metal.MetalLookAndFeel";
			String lookAndFeel2 = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
			String lookAndFeel3 = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
			String lookAndFeel4 = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
			String lookAndFeel5 = "com.jtattoo.plaf.smart.SmartLookAndFeel";
			String lookAndFeel6 = "com.jtattoo.plaf.texture.TextureLookAndFeel";
			String lookAndFeel7 = "com.jtattoo.plaf.noire.NoireLookAndFeel";
			String lookAndFeel8 = "com.jtattoo.plaf.acryl.AcrylLookAndFeel";
			String lookAndFeel9 = "com.jtattoo.plaf.mcwin.McWinLookAndFeel";
			
			try {
				UIManager.setLookAndFeel(lookAndFeel9);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedLookAndFeelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Window frame = new Window();
			frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 39, 91, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(111, 36, 128, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(111, 303, 128, 23);
		contentPane.add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(111, 76, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBounds(111, 102, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(111, 128, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(111, 170, 171, 111);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JSlider slider = new JSlider();
		slider.setBounds(330, 39, 200, 26);
		contentPane.add(slider);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(327, 76, 59, 38);
		contentPane.add(spinner);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(330, 128, 17, 153);
		contentPane.add(scrollBar);
		
		
			
		
		
		
	}
}
