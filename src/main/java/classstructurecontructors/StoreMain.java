package classstructurecontructors;

public class StoreMain {
    public static void main(String[] args) {
        Store storeOne = new Store("Shoes");
        storeOne.store(22);
        System.out.println(storeOne.getProduct() + ":" + storeOne.getStock());


        Store storeTwo = new Store("T-shirt");
        storeTwo.store(8);
        System.out.println(storeTwo.getProduct() + ":" + storeTwo.getStock());

        storeOne.dispatch(5);
        storeTwo.dispatch(2);
        storeOne.store(8);
        storeTwo.store(6);

        System.out.println(storeOne.getProduct() + ":" + storeOne.getStock());
        System.out.println(storeTwo.getProduct() + ":" + storeTwo.getStock());
    }

}
