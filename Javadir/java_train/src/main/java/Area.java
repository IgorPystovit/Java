import java.util.*;
import java.lang.Math;
    public class Area {
    String x;

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String shape=scan.nextLine();

        int shapeAbstract=shape.length();
        switch(shapeAbstract){
            case 6:
                System.out.println("Circle is calculating");
                double r=scan.nextDouble();
                System.out.println("Area is="+Math.PI*r);
                break;
            case 9:
                System.out.println("Rectangle is calculating");
                double a=scan.nextDouble();
                double b=scan.nextDouble();
                System.out.println("Area is="+a*b);
                break;
            case 8:
                System.out.println("Triangle is calculating");
                a=scan.nextDouble();
                b=scan.nextDouble();
                double c=scan.nextDouble();
                System.out.println("Area is="+new Area().heronFormula(a,b,c));
                break;
        }
    }

    public double heronFormula(double a,double b,double c){
        double perimeter=(a+b+c)/2;
        return Math.sqrt(perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c));
    }
}
