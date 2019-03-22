package lesson4;

public class Book  extends  Publication {
    public Book(){
        super(0);
    }

    public Book(String publisher, int pages){
        super(pages);
        this.publisher = publisher;

    }

    @Override
    public  String getFormatteName(){
        return  publisher + " , " + autor + " , " + pages + " pg";
    }
}
