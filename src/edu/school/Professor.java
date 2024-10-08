package edu.school;

public class Professor {
    //Atributos
    public String nome;
    public int idade;
    public String departamento;
    public String telefone;
    public double salario;

    //Métodos
    public void darAula(){
        System.out.println("Professor "+ nome + " está dando aula no departamento " + departamento);
    }

    public void corrigirProva(int quantidadeProvas){
        
        System.out.println("Professor "+ nome + " corrigiu "+ quantidadeProvas + " provas.");
    }
}
