package Lesson_4_3;

import java.util.Scanner;

public class Payment {
    private int sumOfPayment;

    public class Product {
        private String name;
        private int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }
    }

    private void productInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of products: ");
        int n = scan.nextInt();
        int i;
        Product[] prodArray = new Product[n];
        for (i = 0; i < n; i++) {
            System.out.println("Enter the name of product: ");
            String name = scan.next();
            System.out.println("Enter the price of product: ");
            int price = scan.nextInt();
            prodArray[i] = new Product(name, price);
            sumOfPayment += price;
        }
        System.out.println("________________________________________");
        System.out.println(" \t \t \t Sales receipt");

        for (i = 0; i < n; i++) {

            System.out.println("Product name: " + prodArray[i].name + ", product price: " + prodArray[i].price);
        }
        System.out.println("________________________________________");
    }

    public void paymentInfo() {
        productInfo();
        System.out.println("Total cost: " + sumOfPayment);
    }
}
class Main {
    public static void main(String[] args) {
        Payment p = new Payment();
        p.paymentInfo();
    }
}