package controller;

import model.Aluno;
import model.Disciplina;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AulasController {
    public static void main(String[] args) {
        //perguntar sore deixar os atributos das associações de fora dos construtores.
        Aluno a1= new Aluno(1111L,"nomea1","sobrenomea1");
        Aluno a2= new Aluno(2222L,"nomea2","sobrenomea2");

        List<Aluno> alunosList= new ArrayList<>();
        alunosList.add(a1);
        alunosList.add(a2);

        Disciplina d1= new Disciplina(30L,"nomed1",alunosList);
        Disciplina d2= new Disciplina(40L,"nomed2",alunosList);

       List<Disciplina> disciplinasList= new ArrayList<>();
       disciplinasList.add(d1);
       disciplinasList.add(d2);

        //perguntar sobre isso
        //a1.getDisciplinas().add(d1);
        //a1.getDisciplinas().add(d2);
        //a2.getDisciplinas().add(d1);
       // a2.getDisciplinas().add(d2);

       disciplinasList.sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(disciplinasList);
    }
}
