package MainServer;

public class Products {

    private String ProductName;
    private String ProductDescription;
    private String ProductPrice;
    private int ProductStockLevel;
    private String ProductImage;

    public Products(String ProductName, String ProductDescription, String ProductPrice, int ProductStockLevel, String ProductImage) {
        this.ProductName = ProductName;
        this.ProductDescription = ProductDescription;
        this.ProductPrice = ProductPrice;
        this.ProductStockLevel = ProductStockLevel;
        this.ProductImage = ProductImage;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public void setProductDescription(String ProductDescription) {
        this.ProductDescription = ProductDescription;
    }

    public void setProductPrice(String ProductPrice) {
        this.ProductPrice = ProductPrice;
    }

    public void setProductStockLevel(int ProductStockLevel) {
        this.ProductStockLevel = ProductStockLevel;
    }

    public void setProductImage(String ProductImage) {
        this.ProductImage = ProductImage;
    }

    public String getProductName() {
        return ProductName;
    }

    public String getProductDescription() {
        return ProductDescription;
    }

    public String getProductPrice() {
        return ProductPrice;
    }

    public int getProductStockLevel() {
        return ProductStockLevel;
    }

    public String getProductImage() {
        return ProductImage;
    }
}
