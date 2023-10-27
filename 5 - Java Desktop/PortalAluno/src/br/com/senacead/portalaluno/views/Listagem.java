package br.com.senacead.portalaluno.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Listagem extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tableAlunos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listagem frame = new Listagem();
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
	public Listagem() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(12, 24, 641, 426);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblTitulo = new JLabel("Listagem de alunos");
		lblTitulo.setFont(new Font("Ubuntu", Font.BOLD, 24));
		lblTitulo.setBounds(12, 12, 260, 28);
		panel.add(lblTitulo);

		JButton botaoVoltar = new JButton("< Voltar");
		botaoVoltar.setBounds(12, 388, 105, 27);
		panel.add(botaoVoltar);

		botaoVoltar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				dispose();
			}
		});

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		scrollPane.setBounds(12, 40, 578, 336);
		panel.add(scrollPane);

		tableAlunos = new JTable();
		tableAlunos.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		scrollPane.setViewportView(tableAlunos);
		tableAlunos.setBackground(new Color(0, 0, 0));
		tableAlunos.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Titulo 1", "Titulo 2", "Titulo 3", "Titulo 4"
				}));
	}
}
