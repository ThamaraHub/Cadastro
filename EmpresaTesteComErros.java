package meuPacote;

import meuPacote.ListaPessoa;

public class EmpresaTesteComErros
{
    public static void main(String args[])
    {
        ListaPessoa listaCandidatos = new ListaPessoa();

        listaCandidatos.inserePessoaNaLista("João", "Silva", "1323515", 2000);
        listaCandidatos.inserePessoaNaLista("Maria", "Silva", "1323515", 1990);
        listaCandidatos.inserePessoaNaLista("Thiago", "", "1323515", 1998);
        listaCandidatos.inserePessoaNaLista("Ana", "Silva", "1323515", 2005);

        listaCandidatos.imprimeCandidatosLista();
    }
}

