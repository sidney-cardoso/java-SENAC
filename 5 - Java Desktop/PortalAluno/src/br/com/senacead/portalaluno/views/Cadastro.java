package br.com.senacead.portalaluno.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class Cadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFieldNomeAluno;
	private JTextField txtFieldEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
	public Cadastro() {
		setTitle("Tela inicial");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 527, 502);
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextPane txtCadastro = new JTextPane();
		txtCadastro.setBounds(12, 12, 223, 34);
		txtCadastro.setFont(new Font("Ubuntu", Font.BOLD, 24));
		txtCadastro.setBackground(new Color(255, 255, 255));
		txtCadastro.setForeground(new Color(0, 0, 0));
		txtCadastro.setEditable(false);
		txtCadastro.setText("Cadastro de alunos");
		panel.add(txtCadastro);
		
		JLabel lblNomeAluno = new JLabel("Nome do aluno");
		lblNomeAluno.setFont(new Font("Ubuntu", Font.BOLD, 12));
		lblNomeAluno.setBounds(12, 160, 96, 17);
		panel.add(lblNomeAluno);
		
		txtFieldNomeAluno = new JTextField();
		lblNomeAluno.setLabelFor(txtFieldNomeAluno);
		txtFieldNomeAluno.setBounds(12, 175, 503, 21);
		panel.add(txtFieldNomeAluno);
		txtFieldNomeAluno.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Ubuntu", Font.BOLD, 12));
		lblEmail.setLabelFor(lblEmail);
		lblEmail.setBounds(12, 223, 60, 17);
		panel.add(lblEmail);
		
		txtFieldEmail = new JTextField();
		txtFieldEmail.setBounds(12, 239, 175, 21);
		panel.add(txtFieldEmail);
		txtFieldEmail.setColumns(10);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setFont(new Font("Ubuntu", Font.BOLD, 12));
		lblCurso.setBounds(215, 223, 60, 17);
		panel.add(lblCurso);
		
		JComboBox<String> cBoxCurso = new JComboBox<String>();
		lblCurso.setLabelFor(cBoxCurso);
		cBoxCurso.setModel(new DefaultComboBoxModel<String>(new String[] {"Técnico em Desenvolvimento de Sistemas", "Técnico em Informática para ", "Técnico em Informática", "Técnico em Jogos Digitais"}));
		cBoxCurso.setBounds(215, 239, 300, 21);
		panel.add(cBoxCurso);
		
		JButton button = new JButton("< Voltar");
		button.setBounds(79, 358, 105, 27);
		panel.add(button);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(346, 358, 105, 27);
		panel.add(btnSalvar);
	}
}
