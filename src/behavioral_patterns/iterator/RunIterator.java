package behavioral_patterns.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunIterator {

    public static void main(String[] args) {
        List<Skill> javaSkill = new ArrayList<>(
                Arrays.asList(
                        new Skill("Java core", 2.0),
                        new Skill("Spring Boot", 1.5),
                        new Skill("Spring MVC", 0.5),
                        new Skill("Hibernate", 1.5),
                        new Skill("JUnit", 1.5)
                )
        );

        List<Skill> pythonSkill = new ArrayList<>(
                Arrays.asList(
                        new Skill("Skill 1", 1.1),
                        new Skill("Skill 2", 0.6),
                        new Skill("Skill 3", 1.5),
                        new Skill("Skill 4", 1.0)
                )
        );

        JavaDeveloper javaDeveloper = new JavaDeveloper("Андрей", javaSkill.toArray(javaSkill.toArray(new Skill[0])));
        PythonDeveloper pythonDeveloper = new PythonDeveloper("Фёдор", pythonSkill);

        Recruiter recruiter = new Recruiter(javaDeveloper, pythonDeveloper);
        recruiter.printAllDevelopers();

    }
}
