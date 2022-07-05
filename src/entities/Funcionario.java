package entities;

public class Funcionario {
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario() {

    }

    public Funcionario(int id, String nome, double salario) {
        //super();
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem) {
        salario += (salario * porcentagem/100);
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "ID" + this.getId() + "\nNome: " + this.getNome() + "\nSalário: R$ " + this.getSalario();
    }
}

