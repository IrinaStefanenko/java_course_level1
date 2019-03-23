package lesson4;

import java.util.Objects;

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

    @Override
    public  boolean equals(Object object){
        if (this == object) return true;
        //instansof
        // null instaceof class -> false
        if(!(object instanceof  Book)) return  false;
        Book other = (Book) object;
        return  pages == other.pages && Objects.equals(publisher, other.publisher);
    }
    @Override
    public  int hashCode(){
        // return Objects.hash(pages, publisher);
        int result =17;
        result += result *31 + pages;
        result += result* 31 + publisher.hashCode();

        return result;
    }
}
