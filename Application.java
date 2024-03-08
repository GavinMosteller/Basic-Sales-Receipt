public class Application {
    public static void main (String[] args) {

        Item item1 = new Item("Pencil         ", .50, 5);
        Item item2 = new Item("Eraser         ", 1, 5);
        Item item3 = new Item("Notebook       ", 4, 5);


        System.out.println("Item Name       Price       Quantity      Line Item Total");
        item1.printDetails();
        item2.printDetails();
        item3.printDetails();

        double subtotal = item1.totalCalc() + item2.totalCalc() + item3.totalCalc();

        double salesTax = subtotal * .08;

        double total = subtotal + salesTax;

        System.out.println();
        System.out.println();
        System.out.println("Subtotal                                  $" + subtotal);
        System.out.println("Sales Tax                                 $" + salesTax);
        System.out.println("Total                                     $" + total);



    }
}