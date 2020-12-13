package ro.fastrackit.classroom.c10;

import java.util.Objects;

public class CustomerPurchase {

    public int id;
    public String purchasedProduct;
    public String name;
    public String category;

    public CustomerPurchase(int id,String purchasedProduct,String name,String category) {
        this.id = id;
        this.purchasedProduct = purchasedProduct;
        this.name = name;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPurchasedProduct() {
        return purchasedProduct;
    }

    public void setPurchasedProduct(String purchasedProduct) {
        this.purchasedProduct = purchasedProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
}
