public class Main {
    public static void main(String[] args) {
        
        Turma turma = new Turma();

        // adiciona um professor
        Professor professor = new Professor("Professor João", 40, 5000.0); // Salário como atributo
        turma.adicionarProfessor(professor);

        // criar alunos
        Aluno aluno1 = new Aluno("Aluno 1", 20, 8.5); // Nota como atributo
        Aluno aluno2 = new Aluno("Aluno 2", 21, 7.3);
        Aluno aluno3 = new Aluno("Aluno 3", 22, 6.8);
        Aluno aluno4 = new Aluno("Aluno 4", 22, 6.8);

        // adicionar o alunos na lista

        turma.adicionarAluno(aluno1); 
        turma.adicionarAluno(aluno2); 
        turma.adicionarAluno(aluno3); 
        turma.adicionarAluno(aluno4); 

        
        turma.visualizarTurma();
    }
}
