import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args){
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso java");
    curso1.setDescricao("descrição do curso java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso javascript");
    curso2.setDescricao("descrição do curso javascript");
    curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria em java");
        mentoria.setDescricao("descrição da mentoria em java");
        mentoria.setData(LocalDate.now());


       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriela = new Dev();
        devGabriela.setNome("Gabriela");
        devGabriela.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devGabriela.getConteudosInscritos());

        devGabriela.progredir();
        System.out.println("Conteudos Inscritos" + devGabriela.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devGabriela.getConteudosConcluidos());
        System.out.println("XP" + devGabriela.calcularTotalXP());


        Dev devCarol = new Dev();
        devCarol.setNome("Carol");
        devCarol.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devCarol.getConteudosInscritos());

        devCarol.progredir();
        System.out.println("Conteudos Inscritos" + devCarol.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devCarol.getConteudosConcluidos());
        System.out.println("XP" + devCarol.calcularTotalXP());






    }

}
