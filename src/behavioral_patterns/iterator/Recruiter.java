package behavioral_patterns.iterator;

import behavioral_patterns.iterator.iter.Iterator;

public class Recruiter {

    private final JavaDeveloper javaDeveloper;
    private final PythonDeveloper pythonDeveloper;

    public Recruiter(JavaDeveloper javaDeveloper, PythonDeveloper pythonDeveloper) {
        this.javaDeveloper = javaDeveloper;
        this.pythonDeveloper = pythonDeveloper;
    }

    public void printAllDevelopers() {
        Iterator javaDeveloperIterator = this.javaDeveloper.createIterator();
        Iterator pythonDeveloperIterator = this.pythonDeveloper.createIterator();
        System.out.println("Java developer " + javaDeveloper.getName());
        System.out.println("Список навыков:");
        printSkills(javaDeveloperIterator);
        System.out.println();
        System.out.println("Python developer " + pythonDeveloper.getName());
        System.out.println("Список навыков:");
        printSkills(pythonDeveloperIterator);
    }

    private void printSkills(Iterator iterator) {
        while (iterator.hasNext()) {
            Skill skill = (Skill) iterator.next();
            System.out.println("Название навыка: " + skill.getName());
            System.out.println("Опыт: " + skill.getExperience());
        }
    }
}
