import java.util.Scanner;
class Task8{
    public static void main(String []args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the amount invested by the company($): ");
        int d = obj.nextInt();
        System.out.println("Enter the share price of the company :");
        int s=obj.nextInt();
        float i=d*74.3f;
        float st=(74.3f*s)/40;
        float t=i/10;
        float pf=i-t;
        double dpf=pf/74.3;
        System.out.println("\nInvestment amount after increase in exchange rate:"+i);
        System.out.println("\nThe new price of the stock :"+st);
        System.out.println("\nThe tax to be paid on the total shares at 10% :"+t);
        System.out.println("\nThe total profit in INR :"+pf);
        System.out.println("\nThe total profit converted to dollars :"+dpf);

    }
}