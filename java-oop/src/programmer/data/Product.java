package programmer.data;

public class Product {
    /**
     * public dapat diakses class, package, subclass, world
     * protected dapat diakses class, package. tidak dapat diakses diluar package
     * private dapat diakses hanya di class-nya
     */
    public String name;
    public int price;

    // constructor public agar bisa diakses diluar package
    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    /**
     * toString method
     * agar mudah dibaca
     * @return
     */
    public String toString(){
        return "product name: " +name+ "price " +price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }
}
