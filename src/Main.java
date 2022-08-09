import br.com.brunaenaira.challenge.domain.Bootcamp;
import br.com.brunaenaira.challenge.domain.Course;
import br.com.brunaenaira.challenge.domain.Dev;
import br.com.brunaenaira.challenge.domain.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course javaCourse = new Course();
        javaCourse.setTitle("Curso de Java");
        javaCourse.setDescription("Um curso para aprender Java");
        javaCourse.setWorkload(45);

        Course javascriptCourse = new Course();
        javascriptCourse.setTitle("Curso Javascript");
        javascriptCourse.setDescription("Um curso para aprender Javascript");
        javascriptCourse.setWorkload(4);

        Course dartCourse = new Course();
        dartCourse.setTitle("Curso Dart");
        dartCourse.setDescription("Um curso para aprender Dart");
        dartCourse.setWorkload(23);

        Course swiftCourse = new Course();
        swiftCourse.setTitle("Curso Swift");
        swiftCourse.setDescription("Um curso para aprender Swift");
        swiftCourse.setWorkload(4);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Mentoria de dart");
        mentoring.setDescription("Pegando conhecimento de dart");
        mentoring.setMentoringDate(LocalDate.now());

        System.out.println(dartCourse);
        System.out.println(dartCourse);
        System.out.println(mentoring);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp All Languages Developer");
        bootcamp.setDescription("Botcamp para aprender varias linguagens diferentes");
        bootcamp.getContents().add(javaCourse);
        bootcamp.getContents().add(swiftCourse);
        bootcamp.getContents().add(javascriptCourse);
        bootcamp.getContents().add(dartCourse);
        bootcamp.getContents().add(mentoring);

        Dev brunaEnaira = new Dev();
        brunaEnaira.setName("Bruna Ariane Félix da Silva");
        brunaEnaira.toSubscribeBootcamp(bootcamp);
        printSubscribeContents(brunaEnaira);
        brunaEnaira.toAdvance();
        brunaEnaira.toAdvance();
        System.out.println("-");
        printSubscribeContents(brunaEnaira);
        printFinishedContents(brunaEnaira);
        printXp(brunaEnaira);

        System.out.println("*****************************************************************");

        Dev lucasomac = new Dev();
        lucasomac.setName("Lucas de Oliveira Macedo");
        lucasomac.toSubscribeBootcamp(bootcamp);
        printSubscribeContents(lucasomac);
        lucasomac.toAdvance();
        lucasomac.toAdvance();
        lucasomac.toAdvance();
        System.out.println("-");
        printSubscribeContents(lucasomac);
        printFinishedContents(lucasomac);
        printXp(lucasomac);
    }


    private static void printSubscribeContents(Dev dev) {
        System.out.println("Os conteúdos Inscritos de " + dev.getName() + " são: " + dev.getSubscribeContents());
    }

    private static void printFinishedContents(Dev dev) {
        System.out.println("Os conteúdos Finalizados de " + dev.getName() + " são: " + dev.getFinishedContents());
    }

    private static void printXp(Dev dev) {
        System.out.println("O XP atual de " + dev.getName() + " é: " + dev.calculateTotalXp());
    }
}
