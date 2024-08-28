package com.edu.java;

public class Contatto {

    String nome;
    String telefono;

    public Contatto(String nome, String num){
        this.telefono = num;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefono() {
        return telefono;
    }

    public String toString(){
        String str = "";
        return str + "Nome: " + getNome() + " - Telefono: " + getTelefono() + "\n";
    }
}
