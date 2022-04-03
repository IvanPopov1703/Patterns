package behavioral_patterns.iterator.iter;

import behavioral_patterns.iterator.Skill;

public class JavaDeveloperIterator implements Iterator {

    private int position;
    private final Skill[] skills;
    private final int sizeArrSkills;

    public JavaDeveloperIterator(Skill[] skills) {
        this.skills = skills;
        this.sizeArrSkills = this.skills.length;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < sizeArrSkills;
    }

    @Override
    public Skill next() {
        return skills[position++];
    }
}
