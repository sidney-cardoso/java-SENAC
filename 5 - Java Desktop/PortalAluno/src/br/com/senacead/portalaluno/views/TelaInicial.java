package br.com.senacead.portalaluno.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.senacead.portalaluno.model.ListaAluno;

import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setTitle("Tela inicial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		Panel panel = new Panel();
		panel.setForeground(new Color(119, 118, 123));
		panel.setFont(new Font("Ubuntu", Font.BOLD, 12));
		panel.setBounds(0, 0, 390, 270);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblWelcome = new JLabel("Bem vindo!");
		lblWelcome.setBounds(130, 5, 129, 28);
		lblWelcome.setFont(new Font("Ubuntu", Font.BOLD, 24));
		panel.add(lblWelcome);

		JLabel lblDescription = new JLabel("Selecione uma opção para navegar no Portal do Aluno.");
		lblDescription.setBounds(46, 38, 297, 15);
		lblDescription.setFont(new Font("Ubuntu", Font.PLAIN, 12));
		panel.add(lblDescription);

		JButton btnListagemDeAlunos = new JButton("Listagem de alunos");
		btnListagemDeAlunos.setBounds(43, 58, 151, 27);
		panel.add(btnListagemDeAlunos);

		btnListagemDeAlunos.addActionListener(new ActionListener() {
			/*
			 * @Override
			 * public void actionPerformed(ActionEvent evt) {
			 * Listagem telaListagem = new Listagem();
			 * telaListagem.setVisible(true);
			 * }
			 */
			@Override
			public void actionPerformed(ActionEvent evt) {
				ListaAluno.Listar();
			}
		});

		JButton btnCadastroDeAlunos = new JButton("Cadastro de alunos");
		btnCadastroDeAlunos.setBounds(199, 58, 148, 27);
		panel.add(btnCadastroDeAlunos);

		btnCadastroDeAlunos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				Cadastro telaCadastro = new Cadastro();
				telaCadastro.setVisible(true);
			}
		});

		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(165, 213, 57, 27);
		panel.add(btnSair);

		btnSair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				System.exit(0);
			}
		});
	}
}
