package lesson4;

public class ElectronicBook extends Book {
    @Override
    public String getFormatteName() {
        return  "Ebook: " + autor;
    }
}
