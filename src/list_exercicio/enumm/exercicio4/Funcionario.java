package list_exercicio.enumm.exercicio4;


public class Funcionario {
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String matricula;
    private String dataNascimento;
    private Sexo sexo;
    private Setor setor;
    private double salario;
    private String telefone;
    private String email;
    private Endereco endereco;

    public Funcionario(int id, String nome, String cpf, String rg, String matricula, String dataNascimento, Sexo sexo,
                       Setor setor, double salario, String telefone, String email, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.salario = salario;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Funcionario: " +
                "\n Id = " + id +
                "\n Nome = " + nome +
                "\n CPF = " + cpf +
                "\n RG = " + rg +
                "\n Matricula = " + matricula +
                "\n DataNascimento = " + dataNascimento +
                "\n Sexo = " + sexo.getTexto() +
                "\n Setor = " + setor.getNome() +
                "\n Salario = " + salario +
                "\n Telefone = " + telefone +
                "\n Email = " + email +
                "\n" + endereco +
                "";
    }
}
