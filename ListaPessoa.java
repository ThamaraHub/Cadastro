package meuPacote;

import java.util.ArrayList;

import java.util.ArrayList;

public class ListaPessoa
{
    private ArrayList<Candidato> pessoaList = new ArrayList<>();

    public void inserePessoaNaLista(String nome, String sobrenome, String cpf, int dataNascimento)
    {
        Candidato candidato = new Candidato(nome, sobrenome, cpf, dataNascimento);

        if (validaTodosOsCampos(candidato))
            pessoaList.add(candidato);
    }

    public boolean nomePreenchido(Candidato candidato) {
        if (!candidato.getNome().isEmpty()) {
            System.out.println("O nome foi preenchido, candidato adicionado com sucesso.");
            return true;
        }
        System.err.println("O campo nome é obrigatório. Candidato não foi acidionado a lista.");
        return false;
    }

    public boolean sobrenomePreenchido(Candidato candidato) {
        if (!candidato.getSobrenome().isEmpty()) {
            System.out.println("O sobrenome foi preenchido, candidato adicionado com sucesso.");
            return true;
        }
        System.err.println("O campo sobrenome é obrigatório. Candidato não foi acidionado a lista.");
        return false;
    }

    public boolean cpfPreenchido(Candidato candidato) {
        if (!candidato.getCpf().isEmpty()) {
            System.out.println("O cpf foi preenchido, candidato adicionado com sucesso.");
            return true;
        }
        System.err.println("O campo cpf é obrigatório. Candidato não foi acidionado a lista.");
        return false;
    }

    public boolean dataNascimentoPreenchido(Candidato candidato) {
        if (!(candidato.getDataNascimento() == 0)) {
            System.out.println("A data de nascimento foi preenchida, candidato adicionado com sucesso.");
            return true;
        }
        System.err.println("O campo data de nascimento é obrigatório. Candidato não foi acidionado a lista.");
        return false;
    }

    public boolean validaTodosOsCampos(Candidato candidato) {
        return (nomePreenchido(candidato) && sobrenomePreenchido(candidato) && cpfPreenchido(candidato) && dataNascimentoPreenchido(candidato));
    }

    public boolean ehMaiorDeIdade(Candidato pessoa) {
        if (pessoa.getDataNascimento() >= 18) return true;
        return false;
    }

    public ArrayList<Candidato> getPessoaList() {
        return pessoaList;
    }

    public void imprimeCandidatosLista() {
        for (Candidato candidato : getPessoaList())
            System.out.println("\nNome : " + candidato.getNome() + candidato.getSobrenome()
                    + " || CPF : " + candidato.getCpf()
                    + " || Data de Nascimento : "
                    + candidato.getDataNascimento() + "\n");

    }
}