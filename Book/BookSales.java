package Book;

public class BookSales {
    private String sailorName;
    private int numberOfSales;
    private String sailorId;

    public BookSales(String sailorName, int numberOfSales, String sailorId) {
        this.sailorName = sailorName;
        this.numberOfSales = numberOfSales;
        this.sailorId = sailorId;
    }

    public void display() {
        System.out.println("Sailor Name: " + sailorName);
        System.out.println("Number of Sales: " + numberOfSales);
        System.out.println("Sailor ID: " + sailorId);
    }

    public static void main(String[] args) {
        BookSales sales = new BookSales("Amit", 120, "S123");
        sales.display();
    }
}