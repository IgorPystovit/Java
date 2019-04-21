package growepam.hypermarket.engine;

import growepam.hypermarket.products.Product;
import growepam.hypermarket.products.sanitaryengineering.FlooringTile;
import growepam.hypermarket.products.sanitaryengineering.WashStand;
import growepam.hypermarket.tuningparameters.ProductType;
import growepam.hypermarket.products.woodenfurniture.Bookcase;
import growepam.hypermarket.products.woodenfurniture.Table;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProductSelector {
    private static Scanner scan = new Scanner(System.in);

    public void selectRequest(){
        String request = "";
        System.out.println("Welcome to hypermarket product manager");
        do{
            System.out.println("\n Available reuqests:" +
                    "\n - Show products (to show all products);" +
                    "\n - Form recommendations (to form recommendation list based on your previlleges);" +
                    "\n - Exit (to exit product manager);\n");
            System.out.println("Type your reqest below:");
            request = scan.nextLine().toUpperCase();
            executeRequest(request);
        }while (!request.equals("EXIT"));
    }

    private void executeRequest(String request){
        switch (request){
            case "SHOW PRODUCTS":
                ProductManager.printCollection(ProductManager.getProductSet());
                break;
            case "FORM RECOMMENDATIONS":
                ProductManager.printCollection(listMaker());
            case "EXIT":
                return;
            default:
                System.out.println("No such request! Please retry!");
        }
    }

    private Set<Product> listMaker(){
        Set<Product> recommendations = new HashSet<>();
        ProductType productType;
        System.out.println("Input product type (Required field):");

        productType = Reader.readProductType();
        if (productType == null){
            System.out.println("You have entered no product type!");
            recommendations = Collections.emptySet();
        }

        switch (productType){
            case TILE:
                System.out.println("here");
                recommendations = applySelector(new FlooringTile());
                break;
            case WASHSTAND:
                recommendations = applySelector(new WashStand());
                break;
            case BOOKCASE:
                recommendations = applySelector(new Bookcase());
                break;
            case TABLE:
                recommendations = applySelector(new Table());
                break;
            default:

        }
        return recommendations;
    }

    private Set<Product> applySelector(Product product){
        return product.selector();
    }

}
