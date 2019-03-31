package lesson5.person;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        Profession qa = new QA();
        Profession developer = new Developer();
        Profession analyst = new Analyst();

        Profession[] professions = {
                qa,
                developer,
                analyst,
        };

        for (int i = 0; i < professions.length; i++) {
            professions[i].job();
        }

        Shiftable shiftable = new Analyst();
        shiftable.isAtWork(5);


//        Profession profession = new Profession();

    }

}
