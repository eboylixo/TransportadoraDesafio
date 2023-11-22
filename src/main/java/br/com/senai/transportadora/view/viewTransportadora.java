package br.com.senai.transportadora.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.Button;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class viewTransportadora extends JFrame {

	private JPanel contentPane;
	private JTable tableMotorista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewTransportadora frame = new viewTransportadora();
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
	public viewTransportadora() {
		setTitle("Tela Transporta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Logout");
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 44, 414, 109);
		contentPane.add(scrollPane);
		
		tableMotorista = new JTable();
		scrollPane.setViewportView(tableMotorista);
		tableMotorista.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"ID", "Nome Motorista", "CNH", "A\u00E7\u00F5es"
			}
		));
		
		JButton btnCadastraMotorista = new JButton("Cadastrar Motorista");
		btnCadastraMotorista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastraMotorista.setBounds(10, 188, 129, 23);
		contentPane.add(btnCadastraMotorista);
		
		JButton btnVisualizar = new JButton("Visualizar");
		btnVisualizar.setBounds(229, 188, 89, 23);
		contentPane.add(btnVisualizar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(335, 188, 89, 23);
		contentPane.add(btnExcluir);
		
		JLabel lbNomeTransportadora = new JLabel("Nome Transportadora");
		lbNomeTransportadora.setBounds(157, 11, 105, 14);
		contentPane.add(lbNomeTransportadora);
		lbNomeTransportadora.setHorizontalAlignment(SwingConstants.TRAILING);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
