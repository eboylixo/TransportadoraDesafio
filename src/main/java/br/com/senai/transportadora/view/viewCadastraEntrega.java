package br.com.senai.transportadora.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class viewCadastraEntrega extends JFrame {

	private JPanel contentPane;
	private JTextField tfDescricao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewCadastraEntrega frame = new viewCadastraEntrega();
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
	public viewCadastraEntrega() {
		setTitle("CadastraEntrega");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 242, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbDescricao = new JLabel("Descrição:");
		lbDescricao.setBounds(78, 64, 58, 14);
		contentPane.add(lbDescricao);
		
		tfDescricao = new JTextField();
		tfDescricao.setBounds(61, 89, 86, 20);
		contentPane.add(tfDescricao);
		tfDescricao.setColumns(10);
		
		JButton btnCadastraDescricao = new JButton("Cadastrar Descricão");
		btnCadastraDescricao.setBounds(49, 158, 129, 23);
		contentPane.add(btnCadastraDescricao);
	}

}
