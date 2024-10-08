package edu.school;

public class Aluno {
    //Atributos
    public String nome;
    public int idade;
    public String matricula;
    public String curso;
    public double media;

    //Métodos
    public void estudar(){
        System.out.println(nome +" está estudando para o curso de "+ curso);
    }
    public void fazerProva(double nota){
        media = (media + nota) / 2;
        System.out.println(nome + " fez a prova e tirou "+ nota + " . Nova média: " + media);
    }

}
