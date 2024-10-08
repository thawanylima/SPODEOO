package edu.school;
public class ClassePrincipal{

    public static void main(String[] args) {
        //Criando instância da classe Aluno
        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";
        aluno1.idade = 18;
        aluno1.matricula = "SP3698764";
        aluno1.curso = "Sistemas de Informação";
        aluno1.media = 7;
        //Chamada dos metodos classe Aluno
        aluno1.estudar();
        aluno1.fazerProva(8.4);

        //Criando instância da classe Professor
        Professor professor1 = new Professor();
        professor1.nome = "Leandro";
        professor1.idade = 45;
        professor1.departamento = "Informática";
        professor1.telefone = "(11)943526758";
        professor1.salario = 8000;
        //Chamada dos metodos classe Professor
        professor1.darAula();
        professor1.corrigirProva(27);
        
        //Criando instância da classe Funcionario
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Silvia";
        funcionario1.idade = 52;
        funcionario1.cargo = "Secretária";
        funcionario1.setor = "Administração";
        funcionario1.salario = 6500;
        //Chamada dos metodos classe Funcionario
        funcionario1.realizarTarefa();
        funcionario1.registrarPonto();
    }
}