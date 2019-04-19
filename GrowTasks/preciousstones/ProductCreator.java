package growepam.preciousstones;

import java.util.*;

public class ProductCreator {
    private static Scanner scan = new Scanner(System.in);
    private Map<Gemstone,Double> productComponents = new HashMap<>();
    private Map<String,Map<Gemstone,Double>> productsList = new HashMap<>();
    private PreciousStoneManager stoneManager = new PreciousStoneManager();

    public void requestListener(){
        String request;
        System.out.println("Welcome to precious stones manager");
        System.out.println("Choose request from list below");
        System.out.println("Available requests:\n" +
                "- Create new productComponents (to choose stones from list for creating productComponents of your own);\n" +
                "- Show all (to print list of stones of all types;\n" +
                "- Show my products (to show all of your created products)\n" +
                "- Exit (to exit the program);\n");
        do{
            System.out.println("Type your request");
            request = scan.nextLine().toUpperCase();
            switch (request){
                case "CREATE NEW PRODUCT":
                    System.out.println("Please, type name of your productComponents:");
                    String productName = scan.nextLine();
                    productComponents = createProduct();
                    productsList.put(productName, productComponents);
                    break;
                case "SHOW ALL":
                    StonesPrinter.printStones(stoneManager.getGemstonesList());
                    break;
                case "SHOW MY PRODUCTS":
                    StonesPrinter.printProducts(productsList);
                case "EXIT":
                    return;
                default:
                    System.out.println("No such request! Please retry");
            }
        }while (true);
    }

    //invokes request handlers
    private Map<Gemstone,Double> createProduct(){
        Map<Gemstone,Double> components = new HashMap<>();
        String request = "";
        System.out.println("Available requests:\n" +
                "- Evaluate (to evaluate weight and price of all choosen stones);\n" +
                "- Sort (to sort precious stones by price in ascending order)\n" +
                "- Select by clarity (to select all of the precious stones that correspond defined clarity parameter)\n"+
                "- Show all (to print list of stones of all types);\n" +
                "- Show added (to print all stones added as components of the product)" +
                "- Add (to add gemstone to component list of your productComponents)\n" +
                "- Remove (to remove gemstone from component list of your productComponents" +
                "- Done (to finish productComponents creating process);\n");

        while (!request.equals("DONE")){
            request = scan.nextLine().toUpperCase();
            switch (request){
                case "ADD":
                    components = process(components,new ListHandler(ListModifier.ADD));
                    break;
                case "REMOVE":
                    break;
            }
        }
        return null;
    }

    private Map<Gemstone,Double> process(Map<Gemstone,Double> components, RequestHandler requestHandler){
        return requestHandler.performRequest(components);
    }


    public static void main(String[] args) {
        new ProductCreator().requestListener();
    }
}
