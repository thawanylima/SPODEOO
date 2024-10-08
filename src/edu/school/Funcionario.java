package edu.school;

public class Funcionario {
    //Atributos
    public String nome;
    public int idade;
    public String cargo;
    public String setor;
    public double salario;

    //Métodos
    public void realizarTarefa(){
        System.out.println(nome + " está executando as tarefas do seu cargo de "+ cargo);
    }

    public void registrarPonto(){
        String horario = "08:00";
        System.out.println(nome + " registrou o ponto às: " + horario);
    }
}
