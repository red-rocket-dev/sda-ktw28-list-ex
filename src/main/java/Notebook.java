import java.util.List;

public class Notebook {
    String name;
    Integer price;

    public Notebook(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Notebook setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getPrice() {
        return price;
    }

    public Notebook setPrice(Integer price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
