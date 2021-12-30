package linecomparision;
import java.util.Scanner;

class Line{
    private float x1,x2,y1,y2;
    //constructor
    Line(float x1,float y1,float x2,float y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    //calculate length
    public double length(Line line){
        return Math.sqrt(Math.pow((line.x1-line.x2),2)+(Math.pow((line.y2-line.y1),2)));
    }
    //compare length of line
    public void lineComparison(double l1, double l2){
        String sl1=Double.toString(l1);
        String sl2=Double.toString(l2);
        int compare=sl1.compareTo(sl2);
        if (compare==0){
            System.out.println("Both lines are equal.");
        }
        else if(compare>0) {
            System.out.println("Line 1 is greater than Line 2.");
        }
        else if(compare<0){
            System.out.println("Line 2 is greater than Line 1");
        }
    }
}
public class LineComparision {

    public static void main(String[] args){
        //welcome message
        System.out.println("Welcome to Line Comparison Computation");
        Scanner sc=new Scanner(System.in);
        //input 1st line
        System.out.println("1st Line Points");
        System.out.println("Enter coordinate X1: ");
        float x1=sc.nextFloat();
        System.out.println("Enter coordinate Y1: ");
        float y1=sc.nextFloat();
        System.out.println("Enter coordinate X2: ");
        float x2=sc.nextFloat();
        System.out.println("Enter coordinate Y2: ");
        float y2=sc.nextFloat();
        //creating object
        Line line1=new Line(x1,y1,x2,y2);
        //calling method for length
        double lengthLine1=line1.length(line1);
        //input 2nd line
        System.out.println("Length of the line ("+x1+","+y1+") and ("+x2+","+y2+") is: "+lengthLine1);
        System.out.println("2nd Line Points");
        System.out.println("Enter coordinate X1: ");
        x1=sc.nextFloat();
        System.out.println("Enter coordinate Y1: ");
        y1=sc.nextFloat();
        System.out.println("Enter coordinate X2: ");
        x2=sc.nextFloat();
        System.out.println("Enter coordinate Y2: ");
        y2=sc.nextFloat();
        //creating object
        Line line2=new Line(x1,y1,x2,y2);
        //calling method for length
        double lengthLine2=line2.length(line2);
        System.out.println("Length of the line ("+x1+","+y1+") and ("+x2+","+y2+") is: "+lengthLine2);
        //calling method to compare lines
        line1.lineComparison(lengthLine1,lengthLine2);
    }
}