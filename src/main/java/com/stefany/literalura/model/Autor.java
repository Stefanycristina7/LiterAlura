package com.stefany.literalura.model;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    private Integer anoDoNascimento;
    private Integer anoDoFalecimento;

    private List<Livro> livros = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoDoNascimento() {
        return anoDoNascimento;
    }

    public void setAnoDoNascimento(Integer anoDoNascimento) {
        this.anoDoNascimento = anoDoNascimento;
    }

    public Integer getAnoDoFalecimento() {
        return anoDoFalecimento;
    }

    public void setAnoDoFalecimento(Integer anoDoFalecimento) {
        this.anoDoFalecimento = anoDoFalecimento;
    }

    @Override
    public String toString() {
        return "******Autor*******" +
                "Nome: " + nome +"\n"+
                "Ano do Nascimento: " + anoDoNascimento + "\n"+
                "Ano do falecimento=" + anoDoFalecimento + "\n"+
                "Livros=" + livros +
                "\n"+
                "**********************";
    }
}
