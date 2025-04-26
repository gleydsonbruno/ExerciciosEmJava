package org.estudo.poo.model;

import java.util.ArrayList;

public class Empresa {
    // tem vários departamentos

    ArrayList<Departamento> departamentos;
    Departamento dep;


    //agregação vinculo fraco //public Empresa() {
    //agregação vinculo fraco//    departamentos = new ArrayList<>();
    //agregação vinculo fraco //}

    public Empresa() {
        Departamento dep_programacao = new Departamento();

    }

    public void addDepartamento(Departamento dep) {
        departamentos.add(dep);
    }
}
