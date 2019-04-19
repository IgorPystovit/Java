package growepam.preciousstones;

public class Gemstone {
    private double price;
    private Clarity clarity;
    private Valuation valuation;
    private String stoneName;

    public Gemstone(){}
    public Gemstone(String stoneName, Valuation valuation, Clarity clarity, double price){
        this.stoneName = stoneName;
        this.valuation = valuation;
        this.clarity = clarity;
        this.price = price;
    }

    public String getName() {
        return stoneName;
    }

    public Valuation getValuation() {
        return valuation;
    }

    public Clarity getClarity() {
        return clarity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Gemstone name: ").append(stoneName).append(";\n");
        sb.append("Clarity: ").append(clarity.toString().toLowerCase()).append(";\n");
        sb.append("Valuation: ").append(valuation.toString().toLowerCase()).append(";\n");
        sb.append("Price: ").append(price).append(" $ per carat;\n");
        return sb.toString();
    }
}
