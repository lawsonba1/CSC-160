import sun.dc.pr.Rasterizer;

public class Book {
    String name;
    double price;
    String isbn;

    public Book(String newName,double newPrice,String newIsbn){
        name = newName;
        price =newPrice;
        isbn =newIsbn;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public String getIsbn(){
        return isbn;
    }
}
