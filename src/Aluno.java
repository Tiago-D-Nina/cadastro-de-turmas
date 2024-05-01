public class Aluno extends Pessoa {
    private double nota;

    // construtor nome, idade e nota
    public Aluno(String nome, int idade, double nota) {
        // clase pessoa + nota
        super(nome, idade); 
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
