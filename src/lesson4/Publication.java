package lesson4;

public class Publication {
    String autor;
    int pages;
    public String publisher;

    public   Publication (int pages){
        this.pages = pages;
       this.publisher = "Winston";
    }

    public  String getFormatteName(){
        return  autor + " = " + publisher;
    }
}
