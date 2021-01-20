package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class Vet {
    private List<Pet> petsList = new ArrayList<>();

    private boolean areEquals(Pet pet, Pet otherPet) {
       return pet.getRegNumber().equals(otherPet.getRegNumber());
    }

    public void add(Pet pet) {
        for ( Pet item : petsList) {
            if (areEquals(item, pet)) {
                return;
            }
        }
        petsList.add(pet);
    }




    public List<Pet> getPetsList() {
        return petsList;
    }

}

