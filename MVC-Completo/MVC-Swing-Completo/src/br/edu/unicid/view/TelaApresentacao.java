package br.edu.unicid.view;

import br.edu.unicid.bean.*;
import br.edu.unicid.dao.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaApresentacao extends JFrame {

	private JPanel contentPane;
	private JLabel lblCaAluno;
	private JLabel lblNomeAluno;
	private JLabel lblEmailAluno;
	private JLabel lblDataDeNascimento;
	private JLabel lblEndereoAluno;
	private JLabel lblIdadeAluno;
	private JButton btnNovo;
	private JButton btnSalvar;
	private JTextField txtCaAluno;
	private JTextField txtNomeAluno;
	private JTextField txtEmailAluno;
	private JTextField txtDtaNasc;
	private JTextField txtEndAluno;
	private JTextField txtIdadeAluno;
	private JButton btnConsultar;
	private JButton btnExcluso;
	private JButton btnAlterar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaApresentacao frame = new TelaApresentacao();
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
	public TelaApresentacao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblCaAluno = new JLabel("CA Aluno");
		lblCaAluno.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCaAluno.setBounds(29, 34, 122, 30);
		contentPane.add(lblCaAluno);

		lblNomeAluno = new JLabel("Nome Aluno");
		lblNomeAluno.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNomeAluno.setBounds(29, 95, 122, 30);
		contentPane.add(lblNomeAluno);

		lblEmailAluno = new JLabel("Email Aluno");
		lblEmailAluno.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblEmailAluno.setBounds(29, 152, 122, 30);
		contentPane.add(lblEmailAluno);

		lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblDataDeNascimento.setBounds(29, 214, 203, 30);
		contentPane.add(lblDataDeNascimento);

		lblEndereoAluno = new JLabel("Endereço Aluno");
		lblEndereoAluno.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblEndereoAluno.setBounds(29, 272, 203, 30);
		contentPane.add(lblEndereoAluno);

		lblIdadeAluno = new JLabel("Idade Aluno");
		lblIdadeAluno.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblIdadeAluno.setBounds(29, 332, 122, 30);
		contentPane.add(lblIdadeAluno);

		btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// ==================
				txtCaAluno.setText(null);
				txtNomeAluno.setText(null);
				txtEmailAluno.setText(null);
				txtDtaNasc.setText(null);
				txtIdadeAluno.setText(null);
				txtEndAluno.setText(null);
				// ==================
			}
		});
		btnNovo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNovo.setBounds(29, 372, 175, 51);
		contentPane.add(btnNovo);

		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// ====================
				Aluno aluno = new Aluno();
				// populei o objeto aluno
				aluno.setCaAluno(Integer.parseInt(txtCaAluno.getText()));
				aluno.setIdadeAluno(Integer.parseInt(txtIdadeAluno.getText()));
				aluno.setNomeAluno(txtNomeAluno.getText());
				aluno.setEmailAluno(txtEmailAluno.getText());
				aluno.setDtaNasc(txtDtaNasc.getText());
				aluno.setEndAluno(txtEndAluno.getText());
				try {
					// chamar a classe AlunoDAO
					AlunoDAO dao = new AlunoDAO();
					dao.salvar(aluno);
					JOptionPane.showMessageDialog(null, "Salvo com sucesso");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}

				// ====================
			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSalvar.setBounds(214, 373, 163, 48);
		contentPane.add(btnSalvar);

		txtCaAluno = new JTextField();
		txtCaAluno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCaAluno.setBounds(281, 34, 264, 30);
		contentPane.add(txtCaAluno);
		txtCaAluno.setColumns(10);

		txtNomeAluno = new JTextField();
		txtNomeAluno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNomeAluno.setColumns(10);
		txtNomeAluno.setBounds(281, 95, 264, 30);
		contentPane.add(txtNomeAluno);

		txtEmailAluno = new JTextField();
		txtEmailAluno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtEmailAluno.setColumns(10);
		txtEmailAluno.setBounds(281, 152, 264, 30);
		contentPane.add(txtEmailAluno);

		txtDtaNasc = new JTextField();
		txtDtaNasc.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDtaNasc.setColumns(10);
		txtDtaNasc.setBounds(281, 214, 264, 30);
		contentPane.add(txtDtaNasc);

		txtEndAluno = new JTextField();
		txtEndAluno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtEndAluno.setColumns(10);
		txtEndAluno.setBounds(281, 272, 264, 30);
		contentPane.add(txtEndAluno);

		txtIdadeAluno = new JTextField();
		txtIdadeAluno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtIdadeAluno.setColumns(10);
		txtIdadeAluno.setBounds(281, 332, 264, 30);
		contentPane.add(txtIdadeAluno);

		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// =======================
				try {
					Aluno aluno;
					AlunoDAO dao = new AlunoDAO();
					int ca = Integer.parseInt(txtCaAluno.getText());
					aluno = dao.procurarAluno(ca);
					// mostrar dados
					txtNomeAluno.setText(aluno.getNomeAluno());
					txtEmailAluno.setText(aluno.getEmailAluno());
					txtDtaNasc.setText(aluno.getDtaNasc());
					txtEndAluno.setText(aluno.getEndAluno());
					txtIdadeAluno.setText(String.valueOf(aluno.getIdadeAluno()));

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Erro de Consulta");
				}

				// =======================
			}
		});
		btnConsultar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConsultar.setBounds(387, 372, 143, 51);
		contentPane.add(btnConsultar);

		btnExcluso = new JButton("Exclusão");
		btnExcluso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// =======================
				try {
					AlunoDAO dao = new AlunoDAO();
					int ca = Integer.parseInt(txtCaAluno.getText());
					dao.excluir(ca);
					JOptionPane.showMessageDialog(null, "Excluido");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}

				// =======================

			}
		});
		btnExcluso.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnExcluso.setBounds(541, 372, 122, 51);
		contentPane.add(btnExcluso);

		btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// ====================
				Aluno aluno = new Aluno();
				// populei o objeto aluno
				aluno.setCaAluno(Integer.parseInt(txtCaAluno.getText()));
				aluno.setIdadeAluno(Integer.parseInt(txtIdadeAluno.getText()));
				aluno.setNomeAluno(txtNomeAluno.getText());
				aluno.setEmailAluno(txtEmailAluno.getText());
				aluno.setDtaNasc(txtDtaNasc.getText());
				aluno.setEndAluno(txtEndAluno.getText());
				try {
					// chamar a classe AlunoDAO
					AlunoDAO dao = new AlunoDAO();
					dao.atualizar(aluno);
					JOptionPane.showMessageDialog(null, "Alterado com sucesso");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}

				// ====================

			}
		});
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAlterar.setBounds(561, 263, 115, 50);
		contentPane.add(btnAlterar);
	}
}
