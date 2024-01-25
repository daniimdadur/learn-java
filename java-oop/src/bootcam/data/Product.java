package bootcam.data;

import java.util.Objects;

public class Product {

    // field atau property
    public String name;
    public int price;

    public Product(String name,int price){
        this.name = name;
        this.price = price;
    }
    public String toString(){
        return "Product name: " + this.name + ", Price: Rp." + this.price;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        return Objects.equals(name, product.name);
    }
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }
}
