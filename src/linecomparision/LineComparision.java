package linecomparision;
import java.util.Scanner;

public class LineComparision {
    public static double length(float x1,float y1,float x2,float y2){
        return Math.sqrt(Math.pow((x1-x2),2)+(Math.pow((y2-y1),2)));
    }
    public static void main(String[] args){
        System.out.println("Welcome to Line Comparison Computation");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter coordinate X1: ");
        float x1=sc.nextFloat();
        System.out.println("Enter coordinate Y1: ");
        float y1=sc.nextFloat();
        System.out.println("Enter coordinate X2: ");
        float x2=sc.nextFloat();
        System.out.println("Enter coordinate Y2: ");
        float y2=sc.nextFloat();
        double length=length(x1,y1,x2,y2);
        System.out.println("Length of the line ("+x1+","+y1+") and ("+x2+","+y2+") is: "+length);
    }
}
