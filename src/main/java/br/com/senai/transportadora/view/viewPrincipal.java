package br.com.senai.transportadora.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class viewPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField tfLogin;
	private JTextField tfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewPrincipal frame = new viewPrincipal();
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
	public viewPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbLogin = new JLabel("Login");
		lbLogin.setBounds(176, 54, 46, 14);
		contentPane.add(lbLogin);
		
		tfLogin = new JTextField();
		tfLogin.setBounds(176, 68, 86, 20);
		contentPane.add(tfLogin);
		tfLogin.setColumns(10);
		
		JLabel lbSenha = new JLabel("Senha");
		lbSenha.setBounds(176, 118, 46, 14);
		contentPane.add(lbSenha);
		
		tfSenha = new JTextField();
		tfSenha.setColumns(10);
		tfSenha.setBounds(176, 133, 86, 20);
		contentPane.add(tfSenha);
		
		JButton btnLogin = new JButton("Entrar");
		btnLogin.setBounds(176, 159, 89, 23);
		contentPane.add(btnLogin);
	}
}
