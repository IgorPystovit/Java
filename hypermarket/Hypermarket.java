package com.epam.hypermarket;

import com.epam.hypermarket.washstands.Washstand;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Hypermarket {
    private static List<Object> cart = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);
    private static Washstand washstands = new Washstand();
    public static List<Object> products = new ArrayList<>(Washstand.list()); //!!!!!!!!!!!!!!

    public void addToCart(String productName){
        Iterator<Object> productIterator = products.iterator();
        while (productIterator.hasNext()){
            Object tempProduct = productIterator.next();
            if (tempProduct.getClass().getSimpleName().equals(productName)){
                cart.add(tempProduct);
                return;
            }
        }
    }

    public void removeFromCart(String productName){
        Iterator<Object> productIterator = products.iterator();
        while (productIterator.hasNext()){
            Object tempProduct = productIterator.next();
            if (tempProduct.getClass().getSimpleName().equals(productName)){
                cart.remove(tempProduct);
                return;
            }
        }
    }

    public static void printCartItems(){
        if (cart.size() == 0){
            System.out.println("Cart is empty");
        }else{
            for (Object iTempItem : cart){
                System.out.println(iTempItem);
            }
        }
    }
//    private static List<Washstand> washstandList = Washstand.getWashstandsList();

    public void requestExecutor(String request){
        if (request.equals("Show products")){
            for (Object iTempProduct : products){
                System.out.print(iTempProduct);
            }
            return;
        }else if (request.equals("Recommendation list")) {
            System.out.println("Choose the product type you are interested in");
            System.out.println("Available product types:" +
                    "\n - Washstands;" +
                    "\n - Carpets;" +
                    "\n - WoodenFurniture;");
            String productType = scan.next();
            if (productType.equals("Wastands")) {
                washstands.formRecommendationList();
                return;
            }
        }else if (request.substring(0,3).equals("Add")){
            String productName = request.substring(4);
            addToCart(productName);
        }else if (request.substring(0,6).equals("Remove")){
            String productName = request.substring(7);
            removeFromCart(productName);
        }
    }

    public void productSelection(){
        System.out.println("Welcome");
        System.out.println("Please, type your request." +
                "\n Available reuqests:" +
                "\n - Show all products: Show products ;" +
                "\n - Form recommendation list: Recommendation list ;" +
                "\n - Add to cart: Add NameOfProduct ; " +
                "\n - Remove from cart: Remove NameOfProduct ;" +
                "\n - Buy all products stored in cart: Buy ;" +
                "\n - Buy single product : Buy NameOfProduct ;");
        String requestListener = scan.next();
        Integer selector = 0;
        System.out.println("Choose the product type you are interested in");
        System.out.println("Press: 1 - to select washstands, 2 - to select carpets, 3 - to select wooden furniture");

        selector = scan.nextInt();
        switch (selector){
            case 1:
                System.out.println("You have chosen washstands");
                washstands.washstandsSelection();
                break;
            case 2:
                System.out.println("You have chosen carpets");
//                production = null;
                break;
            default:
                System.out.println("You have chosen wooden furniture");
//                production = null;
        }

    }

    public static void main(String[] args) {
        System.out.println(products.size());
        for (Object temp : products){
            System.out.println(temp.getClass().getSimpleName());
        }
    }

}
