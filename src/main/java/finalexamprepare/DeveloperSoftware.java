package finalexamprepare;

public class DeveloperSoftware extends Software{
    public DeveloperSoftware(String name,int price) {
        super(name,price);
    }
    @Override
    public void increasePrice() {
        super.price += price * 10/100;
    }
    
}
