package algorithmsmax;

import java.util.List;

public class MaxAgeCalculator {
    public Trainer trainerWithMaxAge(List<Trainer> trainerList) {
        Trainer withMaxAge = null;
        for (Trainer trainer : trainerList) {
            if (withMaxAge == null || trainer.getAge() > 0 && trainer.getAge() > withMaxAge.getAge()) {
                withMaxAge = trainer;
            }
        }
        return withMaxAge;
    }
}
