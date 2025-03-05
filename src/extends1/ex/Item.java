package extends1.ex;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void print(){
        System.out.println("Name: " + this.name + "price: " + this.price);
    }

    public int getPrice() {
        return price;
    }
}
 