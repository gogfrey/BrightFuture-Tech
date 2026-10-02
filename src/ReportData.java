/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HLAYISANI MBOWENI
 * Student Number : 25032719
 */




public class ReportData {

    private String productCode;
    private String productName;
    private String productCategory;
    private String productWarranty;
    private double productPrice;
    private int stockLevel;
    private String productSupplier;

    private int totalProductCount;
    private double totalProductValue;
    private double averageProductValue;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductWarranty() {
        return productWarranty;
    }

    public void setProductWarranty(String productWarranty) {
        this.productWarranty = productWarranty;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    public String getProductSupplier() {
        return productSupplier;
    }

    public void setProductSupplier(String productSupplier) {
        this.productSupplier = productSupplier;
    }

    public int getTotalProductCount() {
        return totalProductCount;
    }

    public void setTotalProductCount(int totalProductCount) {
        this.totalProductCount = totalProductCount;
    }

    public double getTotalProductValue() {
        return totalProductValue;
    }

    public void setTotalProductValue(double totalProductValue) {
        this.totalProductValue = totalProductValue;
    }

    public double getAverageProductValue() {
        return averageProductValue;
    }

    public void setAverageProductValue(double averageProductValue) {
        this.averageProductValue = averageProductValue;
    }
}
