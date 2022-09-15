import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        showMyOrder();

        
        scan.close();
       

    }
static void showMyOrder(){
    System.out.println ("This will state your orders");
    System.out.print ("Enter your first order: ");
    String firstOrder = scan.nextLine();
    System.out.print ("Price 1: ");
    Double price1 = scan.nextDouble();
    scan.nextLine();

    System.out.print ("Enter your second order: ");
    String secondOrder = scan.nextLine();
    System.out.print ("Price 2: ");
    Double price2 = scan.nextDouble();
    scan.nextLine();

    System.out.print ("Enter your third order: ");
    String thirdOrder = scan.nextLine();
    System.out.print ("Price 3: ");
    Double price3 = scan.nextDouble();

    Double total = price1 + price2 + price3;

    System.out.println ("Your orders are " + firstOrder + "," + secondOrder + "," + thirdOrder);
    System.out.println ("Your total is " + total);



    
    
}
    
    }
    

        
    
