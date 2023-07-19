package Empresa;

public class App {
    public static void main(String[] args) {
        Vendedor joao;
        Admnistrativo maria;

        joao = new Vendedor();
        joao.nome = "João Pedro";
        joao.salario = 1000.00f;
        joao.comissao = 10;

        maria = new Admnistrativo();
        maria.nome = "Maria Eduarda";
        maria.salario = 1500.00f;
        maria.cargo = "Contadora";;

        System.out.println("Vendedor> Nome: " + joao.nome + ", salario: " + joao.salario + ", comissão: " + joao.comissao + "%");
        System.out.println("Administrativo > Nome" + maria.nome + ", salario: " + maria.salario + ", cargo: " + maria.cargo);


        joao.aplicaAumento(500.00f);
        maria.aplicaAumento(300.00f);

        System.out.println("Salário de " + joao.nome + " agora é " + joao.salario);        
        System.out.println("Salário de " + maria.nome + " agora é " + maria.salario);

    }
}
