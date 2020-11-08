package attributes.bill;

public class BillMain {
    public static void main(String[] args) {
      Bill bill = new Bill();
      bill.addItem(new Item("Banana", 3, 23.50));
      bill.addItem(new Item("Juice", 4, 22.50));
      bill.addItem(new Item("Ladder", 2, 21.50));
        System.out.println(bill.calculateTotalPrice());
    }
}
