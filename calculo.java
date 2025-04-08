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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

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
		setBounds(100, 100, 264, 392);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBounds(5, 171, 49, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +1);
			}
		});
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Calculadora");
		lblNewLabel_3.setBounds(5, 5, 152, 40);
		lblNewLabel_3.setFont(new Font("Calibri", Font.PLAIN, 32));
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Valor 1");
		lblNewLabel.setBounds(51, 50, 238, 14);
		contentPanel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(51, 68, 86, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(50, 110, 86, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("valor 2");
		lblNewLabel_1.setBounds(51, 94, 238, 14);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setBounds(48, 134, 97, 14);
		contentPanel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(50, 149, 86, 20);
		textField_2.setEditable(false);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +2);
			}
		});
		btnNewButton_1.setBounds(61, 172, 47, 23);
		contentPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +3);
			}
		});
		btnNewButton_2.setBounds(112, 171, 41, 23);
		contentPanel.add(btnNewButton_2);
		
		
		JButton btnNewButton_10 = new JButton("/");
		btnNewButton_10.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        double valor1 = Double.parseDouble(textField.getText());
		        double valor2 = Double.parseDouble(textField_1.getText());
		        double resultado = valor1 / valor2;
		        textField_2.setText(String.valueOf(resultado));
		    }
		});
		
		btnNewButton_10.setBounds(155, 171, 52, 23);
		contentPanel.add(btnNewButton_10);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +4);
			}
		});
		btnNewButton_3.setBounds(5, 199, 49, 23);
		contentPanel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +5);
			}
		});
		btnNewButton_4.setBounds(61, 200, 47, 23);
		contentPanel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +6);
			}
		});
		btnNewButton_5.setBounds(112, 199, 41, 23);
		contentPanel.add(btnNewButton_5);
		
		JButton btnNewButton_11 = new JButton("*");
		btnNewButton_11.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        double valor1 = Double.parseDouble(textField.getText());
		        double valor2 = Double.parseDouble(textField_1.getText());
		        double resultado = valor1 * valor2;
		        textField_2.setText(String.valueOf(resultado));
		    }
		});
		btnNewButton_11.setBounds(158, 199, 49, 23);
		contentPanel.add(btnNewButton_11);
		
		
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +7);
			}
		});
		btnNewButton_6.setBounds(5, 227, 49, 23);
		contentPanel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +8);
			}
		});
		btnNewButton_7.setBounds(61, 228, 47, 23);
		contentPanel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +9);
			}
		});
		btnNewButton_8.setBounds(112, 227, 41, 23);
		contentPanel.add(btnNewButton_8);
		
		JButton btnNewButton_12 = new JButton("-");
		btnNewButton_12.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        double valor1 = Double.parseDouble(textField.getText());
		        double valor2 = Double.parseDouble(textField_1.getText());
		        double resultado = valor1 - valor2;
		        textField_2.setText(String.valueOf(resultado));
		    }
		});
		
		btnNewButton_12.setBounds(158, 227, 49, 23);
		contentPanel.add(btnNewButton_12);
		
		JButton btnNewButton_15 = new JButton("CE");
		btnNewButton_15.setBounds(5, 255, 49, 24);
		btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPanel.add(btnNewButton_15);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +0);
			}
		});
		btnNewButton_9.setBounds(61, 256, 47, 23);
		contentPanel.add(btnNewButton_9);
		
		JButton btnNewButton_14 = new JButton("=");
		btnNewButton_14.setBounds(112, 256, 41, 23);
		contentPanel.add(btnNewButton_14);
		
		JButton btnNewButton_13 = new JButton("+");
		btnNewButton_11.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        double valor1 = Double.parseDouble(textField.getText());
		        double valor2 = Double.parseDouble(textField_1.getText());
		        double resultado = valor1 + valor2;
		        textField_2.setText(String.valueOf(resultado));
		    }
		});
		btnNewButton_13.setBounds(158, 255, 49, 23);
		contentPanel.add(btnNewButton_13);
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
