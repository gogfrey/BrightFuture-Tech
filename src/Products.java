/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HLAYISANI MBOWENI
 * Student Number : 25032719
 */



import java.util.Scanner;

public class Products {

    private ReportData[] products = new ReportData[10];
    private int productCount = 0;

    private Scanner input = new Scanner(System.in);

    public void startApplication() {

        System.out.println("BRIGHT FUTURE TECHNOLOGIES APPLICATION");
        System.out.println("Enter 1 to launch menu or any other key to exit");

        String choice = input.nextLine();

        if (choice.equals("1")) {
            DisplayMenu();
        } else {
            ExitApplication();
        }
    }

    public void DisplayMenu() {

        System.out.println("Please select 1 of the following menu items");
        System.out.println("1. Capture a new product");
        System.out.println("2. Search a product");
        System.out.println("3. Update a product");
        System.out.println("4. Delete a product");
        System.out.println("5. Print report");
        System.out.println("6. Exit application");

        String choice = input.nextLine();

        if (choice.equals("1")) {
            CaptureProduct();
        } else if (choice.equals("2")) {
            SearchProduct();
        } else if (choice.equals("3")) {
            UpdateProduct();
        } else if (choice.equals("4")) {
            DeleteProduct();
        } else if (choice.equals("5")) {
            PrintReport();
        } else if (choice.equals("6")) {
            ExitApplication();
        } else {
            System.out.println("Invalid menu option");
            DisplayMenu();
        }
    }

    public void CaptureProduct() {

        System.out.println("Capture a new product");

        System.out.print("Enter the product code: ");
        String productCode = input.nextLine();

        System.out.print("Enter the product name: ");
        String productName = input.nextLine();

        String productCategory = "";

        while (productCategory.equals("")) {

            System.out.println("Select the product category:");
            System.out.println("Desktop computer - 1");
            System.out.println("Laptop - 2");
            System.out.println("Tablet - 3");
            System.out.println("Printer - 4");
            System.out.println("Gaming console - 5");

            System.out.print("Product category >> ");
            String categoryChoice = input.nextLine();

            if (categoryChoice.equals("1")) {
                productCategory = "Desktop computer";
            } else if (categoryChoice.equals("2")) {
                productCategory = "Laptop";
            } else if (categoryChoice.equals("3")) {
                productCategory = "Tablet";
            } else if (categoryChoice.equals("4")) {
                productCategory = "Printer";
            } else if (categoryChoice.equals("5")) {
                productCategory = "Gaming console";
            } else {
                System.out.println("Invalid product category");
            }
        }

        System.out.println("Indicate the product warranty");
        System.out.println("Enter (1) for 6 month or any other key for 2 years");

        String warrantyChoice = input.nextLine();

        String productWarranty;

        if (warrantyChoice.equals("1")) {
            productWarranty = "6 months";
        } else {
            productWarranty = "2 years";
        }

        System.out.print("Enter the price for " + productName + " >> ");
        double productPrice = input.nextDouble();
        input.nextLine();

        System.out.print("Enter the stock level for " + productName + " >> ");
        int stockLevel = input.nextInt();
        input.nextLine();

        System.out.print("Enter the supplier for " + productName + " >> ");
        String productSupplier = input.nextLine();

        ReportData product = new ReportData();

        product.setProductCode(productCode);
        product.setProductName(productName);
        product.setProductCategory(productCategory);
        product.setProductWarranty(productWarranty);
        product.setProductPrice(productPrice);
        product.setStockLevel(stockLevel);
        product.setProductSupplier(productSupplier);

        SaveProduct(product);
    }

    public void SaveProduct(ReportData product) {

        products[productCount] = product;
        productCount++;

        System.out.println("Product details has been saved successfully");

        System.out.println("Enter (1) to launch menu or any other key to exit");

        String choice = input.nextLine();

        if (choice.equals("1")) {
            DisplayMenu();
        } else {
            ExitApplication();
        }
    }

    public void SearchProduct() {

        System.out.print("Please enter a product code to search: ");
        String searchCode = input.nextLine();

        boolean found = false;

        for (int i = 0; i < productCount; i++) {

            if (products[i].getProductCode().equals(searchCode)) {

                System.out.println("Product search results");
                System.out.println("Product code: " + products[i].getProductCode());
                System.out.println("Product name: " + products[i].getProductName());
                System.out.println("Product warranty: " + products[i].getProductWarranty());
                System.out.println("Product category: " + products[i].getProductCategory());
                System.out.println("Product price: " + products[i].getProductPrice());
                System.out.println("Product stock level: " + products[i].getStockLevel());
                System.out.println("Product supplier: " + products[i].getProductSupplier());

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("The product cannot be located.");
            System.out.println("Invalid product");
        }

        System.out.println("Enter (1) to launch menu or any other key to exit");

        String choice = input.nextLine();

        if (choice.equals("1")) {
            DisplayMenu();
        } else {
            ExitApplication();
        }
    }

    public void UpdateProduct() {

        System.out.print("Please enter a product code to update: ");
        String updateCode = input.nextLine();

        boolean found = false;

        for (int i = 0; i < productCount; i++) {

            if (products[i].getProductCode().equals(updateCode)) {

                found = true;

                System.out.print("Update the warranty: (y) yes, (n) No >> ");
                String updateWarranty = input.nextLine();

                if (updateWarranty.equalsIgnoreCase("y")) {

                    System.out.println("Enter (1) for 6 month or any other key for 2 years");

                    String warrantyChoice = input.nextLine();

                    if (warrantyChoice.equals("1")) {
                        products[i].setProductWarranty("6 months");
                    } else {
                        products[i].setProductWarranty("2 years");
                    }
                }

                System.out.print("Update the product price (y) Yes, (n) No >> ");
                String updatePrice = input.nextLine();

                if (updatePrice.equalsIgnoreCase("y")) {

                    System.out.print("Enter the new price for "
                            + products[i].getProductName() + " >> ");

                    double newPrice = input.nextDouble();
                    input.nextLine();

                    products[i].setProductPrice(newPrice);
                }

                System.out.print("Update the stock level? (y) Yes, (n) No >> ");
                String updateStock = input.nextLine();

                if (updateStock.equalsIgnoreCase("y")) {

                    System.out.print("Enter the new stock level for "
                            + products[i].getProductName() + " >> ");

                    int newStock = input.nextInt();
                    input.nextLine();

                    products[i].setStockLevel(newStock);
                }

                System.out.println("Product details has been updated successfully");
                break;
            }
        }

        if (!found) {
            System.out.println("The product cannot be located.");
            System.out.println("Invalid product");
        }

        System.out.println("Enter (1) to launch menu or any other key to exit");

        String choice = input.nextLine();

        if (choice.equals("1")) {
            DisplayMenu();
        } else {
            ExitApplication();
        }
    }

    public void DeleteProduct() {

        System.out.print("Please enter a product code to delete: ");
        String deleteCode = input.nextLine();

        boolean found = false;

        for (int i = 0; i < productCount; i++) {

            if (products[i].getProductCode().equals(deleteCode)) {

                found = true;

                System.out.print("Are you sure you want to delete this product? (y) yes, (n) no: ");
                String answer = input.nextLine();

                if (answer.equalsIgnoreCase("y")) {

                    for (int j = i; j < productCount - 1; j++) {
                        products[j] = products[j + 1];
                    }

                    products[productCount - 1] = null;
                    productCount--;

                    System.out.println("Product has been deleted successfully");

                } else {
                    System.out.println("Product was not deleted.");
                }

                break;
            }
        }

        if (!found) {
            System.out.println("The product cannot be located.");
            System.out.println("Invalid product");
        }

        System.out.println("Enter (1) to launch menu or any other key to exit");

        String choice = input.nextLine();

        if (choice.equals("1")) {
            DisplayMenu();
        } else {
            ExitApplication();
        }
    }

    public void PrintReport() {

        double totalProductValue = 0;

        System.out.println("Product Report");

        for (int i = 0; i < productCount; i++) {

            System.out.println("Product " + (i + 1));
            System.out.println("Product code >> " + products[i].getProductCode());
            System.out.println("Product name >> " + products[i].getProductName());
            System.out.println("Product category: " + products[i].getProductCategory());
            System.out.println("Product warranty: " + products[i].getProductWarranty());
            System.out.println("Product price >> " + products[i].getProductPrice());
            System.out.println("Product level >> " + products[i].getStockLevel());
            System.out.println("Product supplier >> " + products[i].getProductSupplier());

            totalProductValue =
                    totalProductValue + products[i].getProductPrice();

            System.out.println();
        }

        double averageProductValue = 0;

        if (productCount > 0) {
            averageProductValue =
                    totalProductValue / productCount;
        }

        System.out.println("Total product Count : " + productCount);
        System.out.println("Total product value : R" + totalProductValue);
        System.out.println("Average product value : R" + averageProductValue);

        System.out.println("Enter (1) to launch menu or any other key to exit");

        String choice = input.nextLine();

        if (choice.equals("1")) {
            DisplayMenu();
        } else {
            ExitApplication();
        }
    }

    public void ExitApplication() {

        System.out.println("Application closing...");
    }
}
