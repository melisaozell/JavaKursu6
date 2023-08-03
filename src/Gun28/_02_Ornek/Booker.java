package Gun28._02_Ornek;

public class Booker {
    public static void main(String[] args) {
        
        Book book1=new Book();
        
        book1.name="Harry Poter";
        book1.publishYear=2001;
        book1.author="JK Rowling";

        System.out.println("book1 = " + book1);

        Book book2=new Book("yüzükler",1954,"JRR Tolkien");
        Book book3=new Book("üzüm ve çay",2023);

        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
        System.out.println("book3 = " + book3);

    }
}
