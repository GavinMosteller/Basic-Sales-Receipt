public class Item
{
    private String name;
    private double price;
    private int quantitySold;
    public Item(String name, double price, int quantitySold) {
        this.name = name;
        this.price = price;
        this.quantitySold = quantitySold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public double totalCalc() {
        return price * quantitySold;
    }

    public void printDetails()
    {
        System.out.println(name + " $" + price + "         " + quantitySold + "            $" + totalCalc());
    }
}
