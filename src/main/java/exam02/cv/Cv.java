package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {
    private String name;
    private int level;
    private List<Skill> skills = new ArrayList<>();


    public Cv(String name) {

        this.name = name;
    }

    public void addSkills(String... skill) {
       
    }

    public int findSkillLevelByName(String name) {
        int skillLevel = 0;
        for (Skill skill : skills) {
            if (skill.getName().equals(name)) {
                skillLevel = skill.getLevel();
            }
        }
        return skillLevel;
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }
}
