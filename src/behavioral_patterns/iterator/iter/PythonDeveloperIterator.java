package behavioral_patterns.iterator.iter;

import behavioral_patterns.iterator.Skill;

import java.util.ArrayList;
import java.util.List;

public class PythonDeveloperIterator implements Iterator {

    private final ArrayList<Skill> skills;
    private final int sizeArrList;
    private int position;

    public PythonDeveloperIterator(List<Skill> skills) {
        this.skills = new ArrayList<>(skills);
        this.sizeArrList = this.skills.size();
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < sizeArrList;
    }

    @Override
    public Skill next() {
        return skills.get(position++);
    }
}
