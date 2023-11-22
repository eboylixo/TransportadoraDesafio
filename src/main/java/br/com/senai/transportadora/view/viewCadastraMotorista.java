package br.com.senai.transportadora.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class viewCadastraMotorista extends JFrame {

	private JPanel contentPane;
	private JTextField tfNomeMotorista;
	private JTextField tfCNH;
//aaa
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewCadastraMotorista frame = new viewCadastraMotorista();
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
	public viewCadastraMotorista() {
		setTitle("Cadastro Motoristas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 228, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNomeMotorista = new JLabel("Nome Motorista:");
		lbNomeMotorista.setBounds(41, 45, 92, 14);
		contentPane.add(lbNomeMotorista);
		
		tfNomeMotorista = new JTextField();
		tfNomeMotorista.setBounds(41, 70, 123, 20);
		contentPane.add(tfNomeMotorista);
		tfNomeMotorista.setColumns(10);
		
		tfCNH = new JTextField();
		tfCNH.setBounds(41, 160, 123, 20);
		contentPane.add(tfCNH);
		tfCNH.setColumns(10);
		
		JLabel lbCNH = new JLabel("CNH:");
		lbCNH.setBounds(41, 135, 46, 14);
		contentPane.add(lbCNH);
		
		JButton btnCadastrarMotorista = new JButton("Cadastrar");
		btnCadastrarMotorista.setBounds(41, 208, 89, 23);
		contentPane.add(btnCadastrarMotorista);
	}
}
