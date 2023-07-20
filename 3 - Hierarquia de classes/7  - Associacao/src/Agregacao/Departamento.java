package Agregacao;

import java.util.ArrayList;

public class Departamento {
    private String nome;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }
}
