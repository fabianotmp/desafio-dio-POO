import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de JAVA");
        curso1.setDescricao("Descrição de JAVA");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JS");
        curso2.setDescricao("Descrição de JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de JAVA");
        mentoria1.setDescricao("Descricao de JAVA");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de JS");
        mentoria2.setDescricao("Descricao de JS");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp de Java");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp 2");
        bootcamp2.setDescricao("Descrição Bootcamp 2");
        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(mentoria2);


        Dev dev1 = new Dev();
        dev1.setNome("Fabiano");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Inscrições de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conclusão de " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("Inscrições de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());



        Dev dev2 = new Dev();
        dev2.setNome("Lethicia");
        dev2.inscreverBootcamp(bootcamp2);


    }
}
