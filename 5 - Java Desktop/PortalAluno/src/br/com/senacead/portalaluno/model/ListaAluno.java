package br.com.senacead.portalaluno.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.senacead.portalaluno.views.TelaInicial;

public class ListaAluno {
    private static final List<Aluno> lista = new ArrayList<Aluno>();
    private static TelaInicial telaInicial;

    public static void Listar() {
        for (Aluno aluno : lista) {
            JOptionPane.showMessageDialog(telaInicial, aluno.toString(), "Alunos", 1);
        }
    }

    public static void Adicionar(Aluno aluno) {
        lista.add(aluno);
    }
}
