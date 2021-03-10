public class BookstoreRunner {
    private static Book[] availableBooks = new Book[10];


    public static void main(String[] arg){
        populationAvailableBooks();
        listAvailableBooks();
        determineBookSelection();
    }

    public static void populationAvailableBooks(){
        Book b1 = new Book("Big Foot",5.99,"12345673");
        Book b2 = new Book("The tale of Chicken Butt",300.99,"22113353");
        Book b3 = new Book("The Turtle and the Snail",6.99,"00002211");
        Book b4 = new Book("Revenge of the flushed goldfish",20.99,"0023153");
        Book b5 = new Book("Timmy and his big Red Ball",3.99,"33333353");
        Book b6 = new Book("Roblox for Dummies",0.99,"344561234");
        Book b7 = new Book("Pictures of Ducks",0.02,"00021345");
        Book b8 = new Book("Timmy with no Ball(The Sequal)",42.99,"123567632");
        Book b9 = new Book("Jom and Terry",7000.99,"221231245");
        Book b10 = new Book("How big is the Sun",21.99,"22223125");

        availableBooks[0] = b1;
        availableBooks[1] = b2;
        availableBooks[2] = b3;
        availableBooks[3] = b4;
        availableBooks[4] = b5;
        availableBooks[5] = b6;
        availableBooks[6] = b7;
        availableBooks[7] = b8;
        availableBooks[8] = b9;
        availableBooks[9] = b10;
    }
    public static void listAvailableBooks(){

    }
    public static void determineBookSelection(){

    }
}
