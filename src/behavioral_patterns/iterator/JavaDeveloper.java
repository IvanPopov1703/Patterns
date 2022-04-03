package behavioral_patterns.iterator;

import behavioral_patterns.iterator.iter.Iterator;
import behavioral_patterns.iterator.iter.JavaDeveloperIterator;

public class JavaDeveloper {

    private final String name;
    private final Skill[] skills;

    public JavaDeveloper(String name, Skill[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public Iterator createIterator() {
        return new JavaDeveloperIterator(skills);
    }
}
