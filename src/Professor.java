public class Professor extends Pessoa {
    private double salario; // Atributo para o salário do professor

    // construtor nome, idade e salário
    public Professor(String nome, int idade, double salario) {
         // classe Pessoa parent + salario
        super(nome, idade);
        this.salario = salario;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
