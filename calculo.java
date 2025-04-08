package Calculadora;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculo extends JDialog {

	protected static final long serialVersionUID = 1L;
	protected final JPanel contentPanel = new JPanel();
	protected JTextField textField;
	protected JTextField textField_1;
	protected JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			calculo dialog = new calculo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public calculo() {
		setBounds(100, 100, 254, 392);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(24, 181, 42, 23);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setBounds(76, 181, 42, 23);
		contentPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setBounds(128, 181, 42, 23);
		contentPanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setBounds(24, 215, 42, 23);
		contentPanel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setBounds(76, 216, 42, 23);
		contentPanel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setBounds(128, 215, 42, 23);
		contentPanel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.setBounds(24, 249, 42, 23);
		contentPanel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.setBounds(76, 249, 41, 23);
		contentPanel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.setBounds(128, 249, 42, 23);
		contentPanel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.setBounds(76, 283, 41, 23);
		contentPanel.add(btnNewButton_9);
		
		textField = new JTextField();
		textField.setBounds(26, 61, 192, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Valor 1");
		lblNewLabel.setBounds(86, 46, 242, 14);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("valor 2");
		lblNewLabel_1.setBounds(86, 86, 242, 14);
		contentPanel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(26, 99, 192, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setBounds(80, 130, 60, 14);
		contentPanel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(26, 152, 192, 20);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_10 = new JButton("/");
		btnNewButton_10.setBounds(180, 181, 42, 23);
		contentPanel.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("*");
		btnNewButton_11.setBounds(180, 215, 42, 23);
		contentPanel.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("-");
		btnNewButton_12.setBounds(180, 249, 42, 23);
		contentPanel.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("+");
		btnNewButton_13.setBounds(180, 283, 42, 23);
		contentPanel.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("=");
		btnNewButton_14.setBounds(128, 284, 42, 23);
		contentPanel.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("CE");
		btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_15.setBounds(24, 284, 42, 23);
		contentPanel.add(btnNewButton_15);
		
		JLabel lblNewLabel_3 = new JLabel("Calculadora");
		lblNewLabel_3.setFont(new Font("Calibri", Font.PLAIN, 32));
		lblNewLabel_3.setBounds(31, 8, 170, 32);
		contentPanel.add(lblNewLabel_3);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
