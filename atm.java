package atm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.border.BevelBorder;
import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.Font;
import java.awt.TextField;

public class atm_sys {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					atm_sys window = new atm_sys();
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
	public atm_sys() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1400, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(479, 5, 10, 10);
		panel.add(panel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(494, 5, 10, 10);
		panel.add(panel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(37, 5, 97, 120);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		Button button_1_2_2 = new Button(">>>");
		button_1_2_2.setFont(new Font("Dialog", Font.BOLD, 15));
		button_1_2_2.setBounds(17, 10, 70, 36);
		panel_3.add(button_1_2_2);
		
		Button button_1_1_2_1 = new Button(">>>");
		button_1_1_2_1.setFont(new Font("Dialog", Font.BOLD, 14));
		button_1_1_2_1.setBounds(17, 74, 70, 36);
		panel_3.add(button_1_1_2_1);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(128, 255, 128));
		panel_3_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_1.setBounds(144, 5, 238, 120);
		panel.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		Label label = new Label("Balance");
		label.setFont(new Font("Dialog", Font.BOLD, 13));
		label.setBounds(21, 20, 82, 22);
		panel_3_1.add(label);
		
		Label label_1 = new Label("Loan");
		label_1.setFont(new Font("Dialog", Font.BOLD, 13));
		label_1.setBounds(135, 20, 82, 22);
		panel_3_1.add(label_1);
		
		Label label_2 = new Label("Withdrawal");
		label_2.setFont(new Font("Dialog", Font.BOLD, 13));
		label_2.setBounds(21, 76, 82, 22);
		panel_3_1.add(label_2);
		
		Label label_3 = new Label("Deposit");
		label_3.setFont(new Font("Dialog", Font.BOLD, 13));
		label_3.setBounds(135, 76, 82, 22);
		panel_3_1.add(label_3);
		
		TextField textField = new TextField();
		textField.setBackground(new Color(128, 255, 128));
		textField.setFont(new Font("Dialog", Font.BOLD, 14));
		textField.setBounds(10, 48, 218, 22);
		panel_3_1.add(textField);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_3.setBounds(37, 136, 452, 290);
		panel.add(panel_3_3);
		panel_3_3.setLayout(null);
		
		Button button = new Button("1");
		button.setFont(new Font("Dialog", Font.BOLD, 13));
		button.setBounds(29, 38, 70, 36);
		panel_3_3.add(button);
		
		Button button_1 = new Button("2  ABC");
		button_1.setFont(new Font("Dialog", Font.BOLD, 13));
		button_1.setBounds(122, 38, 70, 36);
		panel_3_3.add(button_1);
		
		Button button_1_1 = new Button("3 DEF");
		button_1_1.setFont(new Font("Dialog", Font.BOLD, 13));
		button_1_1.setBounds(223, 38, 70, 36);
		panel_3_3.add(button_1_1);
		
		Button button_1_3 = new Button("4 GHI");
		button_1_3.setFont(new Font("Dialog", Font.BOLD, 13));
		button_1_3.setBounds(29, 94, 70, 36);
		panel_3_3.add(button_1_3);
		
		Button button_1_4 = new Button("5  JKL");
		button_1_4.setFont(new Font("Dialog", Font.BOLD, 13));
		button_1_4.setBounds(122, 94, 70, 36);
		panel_3_3.add(button_1_4);
		
		Button button_1_5 = new Button("6 MNO");
		button_1_5.setFont(new Font("Dialog", Font.BOLD, 13));
		button_1_5.setBounds(223, 94, 70, 36);
		panel_3_3.add(button_1_5);
		
		Button button_1_6 = new Button("Clear");
		button_1_6.setBackground(new Color(255, 255, 0));
		button_1_6.setFont(new Font("Dialog", Font.BOLD, 13));
		button_1_6.setBounds(313, 94, 70, 36);
		panel_3_3.add(button_1_6);
		
		Button button_1_3_1 = new Button("");
		button_1_3_1.setBounds(29, 216, 70, 36);
		panel_3_3.add(button_1_3_1);
		
		Button button_2 = new Button("7 QPRS");
		button_2.setFont(new Font("Dialog", Font.BOLD, 13));
		button_2.setBounds(29, 160, 70, 36);
		panel_3_3.add(button_2);
		
		Button button_1_7 = new Button("8 TUV");
		button_1_7.setFont(new Font("Dialog", Font.BOLD, 13));
		button_1_7.setBounds(122, 160, 70, 36);
		panel_3_3.add(button_1_7);
		
		Button button_1_4_1 = new Button("0");
		button_1_4_1.setFont(new Font("Dialog", Font.BOLD, 13));
		button_1_4_1.setBounds(122, 216, 70, 36);
		panel_3_3.add(button_1_4_1);
		
		Button button_1_5_1 = new Button("");
		button_1_5_1.setBounds(223, 216, 70, 36);
		panel_3_3.add(button_1_5_1);
		
		Button button_1_2_1 = new Button("Enter");
		button_1_2_1.setBackground(new Color(0, 255, 64));
		button_1_2_1.setFont(new Font("Dialog", Font.BOLD, 13));
		button_1_2_1.setBounds(313, 160, 70, 36);
		panel_3_3.add(button_1_2_1);
		
		Button button_1_6_1 = new Button("");
		button_1_6_1.setBounds(313, 216, 70, 36);
		panel_3_3.add(button_1_6_1);
		
		Button button_1_1_1 = new Button("9 WXYZ");
		button_1_1_1.setFont(new Font("Dialog", Font.BOLD, 13));
		button_1_1_1.setBounds(223, 160, 70, 36);
		panel_3_3.add(button_1_1_1);
		
		Button button_1_1_3 = new Button("Cancel");
		button_1_1_3.setBackground(new Color(255, 0, 0));
		button_1_1_3.setFont(new Font("Dialog", Font.BOLD, 13));
		button_1_1_3.setBounds(313, 38, 70, 36);
		panel_3_3.add(button_1_1_3);
		
		JPanel panel_3_4 = new JPanel();
		panel_3_4.setLayout(null);
		panel_3_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_4.setBounds(392, 5, 97, 120);
		panel.add(panel_3_4);
		
		Button button_1_2_2_1 = new Button("<<<");
		button_1_2_2_1.setFont(new Font("Dialog", Font.BOLD, 14));
		button_1_2_2_1.setBounds(17, 10, 70, 36);
		panel_3_4.add(button_1_2_2_1);
		
		Button button_1_1_2_1_1 = new Button("<<<");
		button_1_1_2_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		button_1_1_2_1_1.setBounds(17, 74, 70, 36);
		panel_3_4.add(button_1_1_2_1_1);
		
		JPanel panel_3_4_1 = new JPanel();
		panel_3_4_1.setLayout(null);
		panel_3_4_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_4_1.setBounds(514, 11, 601, 378);
		panel.add(panel_3_4_1);
	}
}
