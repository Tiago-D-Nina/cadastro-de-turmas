import java.util.ArrayList;



public class Turma {
    // lista alunos
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    private Professor professor; 

    
    public Turma() {
    }

    // adicionar um aluno na turma
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    // adicionar o professor naturma
    public void adicionarProfessor(Professor professor) {
        this.professor = professor;
    }

    public void visualizarTurma() {
        
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Salário: " + professor.getSalario());

        System.out.println("Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome() + " (Nota: " + aluno.getNota() + ")");
        }
    }
}
