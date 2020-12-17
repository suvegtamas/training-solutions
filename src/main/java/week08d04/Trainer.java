package week08d04;

public class Trainer {
    private CanMark trainer;

    public Trainer(CanMark trainer) {
        this.trainer = trainer;
    }

    public int giveMark() {
        return trainer.giveMark();
    }

    public static void main(String[] args) {
        Trainer trainer1 = new Trainer(new BadMood());
        Trainer trainer2 = new Trainer(new GoodMood());
        int mark1 = trainer1.giveMark();
        int mark2 = trainer2.giveMark();
        System.out.println("I got Bad Mood, you got this ->:" + mark1);
        System.out.println("I got Good Mood, you got this ->:" + mark2);
    }
}
