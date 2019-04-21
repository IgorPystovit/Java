package growepam.hypermarket.engine;

public class HypermarketManager {
    private static ProductSelector productSelector = new ProductSelector();
    public static void main(String[] args) {
        productSelector.selectRequest();
    }
}
