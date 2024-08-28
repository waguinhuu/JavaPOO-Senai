package list_exercicio.enumm.exercicio3;

import java.time.LocalDate;
import java.time.Period;

public class Fisica extends Pessoa {
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;


    public Fisica(String nome, String telefone, String cpf, String rg, LocalDate dataNascimento) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
//        return LocalDate.now().getYear() - this.dataNascimento.getYear();
    }


    @Override
    public String toString() {
        return "Pessoa Fisica" +
                "\n Nome ->" + nome +
                "\n Telefone -> " + telefone +
                "\nCPF -> " + cpf +
                "\n RG -> " + rg +
                "\n Data de Nascimento -> " + dataNascimento +
                "\n Idade -> " + getIdade();

    }
}
