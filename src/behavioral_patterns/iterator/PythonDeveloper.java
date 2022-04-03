package behavioral_patterns.iterator;

import behavioral_patterns.iterator.iter.Iterator;
import behavioral_patterns.iterator.iter.PythonDeveloperIterator;

import java.util.List;

public class PythonDeveloper {

    private final String name;
    private final List<Skill> skills;

    public PythonDeveloper(String name, List<Skill> skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public Iterator createIterator() {
        return new PythonDeveloperIterator(skills);
    }
}
