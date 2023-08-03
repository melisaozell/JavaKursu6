package Gun28._02_Ornek;

public class Book {
    String name;
    int publishYear;
    String author;

    public Book()
    {

    }
    public Book(String name,int publishYear,String author)
    {
        this.name=name;
        this.author=author;
        this.publishYear=publishYear;
    }
    public Book(String name,int publishYear)
    {
        this(name,publishYear,"");
    }

    public String toString()
    {
        return this.name+" "+this.author+" "+this.publishYear;
    }
}
