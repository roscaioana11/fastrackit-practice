package ro.fastrackit.classroom.c10;

import java.util.Objects;

public class CustomerPurchase {

    int id;
    String purchasedProduct;
    String name;
    String category;

    public CustomerPurchase(int id,String purchasedProduct,String name,String category) {
        this.id = id;
        this.purchasedProduct = purchasedProduct;
        this.name = name;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getPurchasedProduct() {
        return purchasedProduct;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerPurchase that = (CustomerPurchase) o;
        return id == that.id &&
                Objects.equals(purchasedProduct,that.purchasedProduct) &&
                Objects.equals(name,that.name) &&
                Objects.equals(category,that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,purchasedProduct,name,category);
    }

    @Override
    public String toString() {
        return "CustomerPurchase{" +
                "id=" + id +
                ", purchasedProduct='" + purchasedProduct + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
