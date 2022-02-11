package dio_desafio;

import java.time.LocalDate;

public class Main {

    //classe é a planta da casa
    //objeto é a casa construida

    public static void main (String[] args ){
        Curso curso1 = new Curso();
        curso1.setTitulo("cursoJava");
        curso1.setDescricao("Descricao do curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("cursoJavii");
        curso2.setDescricao("Descricao do java");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("cursoJavii");
        mentoria.setDescricao("Descricao do java");
        mentoria.setData(LocalDate.now());

//
//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Developer");
        bootcamp.setDescricao("desc");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Gabi");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + dev1.getConteudosINscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos inscritos" + dev1.getConteudosINscritos());
        System.out.println("Conteudos concluidos" + dev1.getConteudoConcluidos());
        System.out.println("XP" + dev1.calcularTotalXP());



        Dev dev2 = new Dev();
        dev2.setNome("Leo");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + dev2.getConteudosINscritos());
        dev2.progredir();
        System.out.println("Conteudos inscritos" + dev2.getConteudosINscritos());
        System.out.println("Conteudos concluidos" + dev2.getConteudoConcluidos());
        System.out.println("XP" + dev2.calcularTotalXP());

    }
}
