package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);



        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println("________________________________________________________________________________");
        System.out.println("");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Descrição BootCamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLaisa = new Dev();
        devLaisa.setNome("Laisa");
        devLaisa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devLaisa.getConteudosInscritos());
        devLaisa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos: " + devLaisa.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devLaisa.getConteudosConcluidos());
        System.out.println("Xp: " + devLaisa.calcularTotalXp());
        System.out.println("_________________________________________________________________________________");

        Dev devFernando = new Dev();
        devFernando.setNome("Fernando");
        devFernando.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devFernando.getConteudosInscritos());
        devFernando.progredir();
        devFernando.progredir();
        devFernando.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos: " + devFernando.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devFernando.getConteudosConcluidos());
        System.out.println("Xp: " + devFernando.calcularTotalXp());



    }
}
