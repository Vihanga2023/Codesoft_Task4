import java.util.Scanner;

public class Task4
{

    public static double RupeetoEuro(double Rupee) {
        return Rupee * 0.0113 ;
    }

    public static double RupeetoUSD(double Rupee) {
        return Rupee * 0.012 ;
    }

    public static double EurotoRupee(double Euro) {
        return Euro * 89.35 ;
    }

    public static double EurotoUSD(double Euro) {
        return Euro * 1.07;
    }

    public static double  USDtoRupee(double USD) {
        return USD * 83.56 ;
    }

    public static double USDtoEuro(double USD) {
        return USD * 0.93 ;
    }


    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        char again;

        System.out.println("-----------------------------------");
        System.out.println("Welcome To Currency Converter");
        System.out.println("-----------------------------------");
        System.out.println("---------------Menu----------------");
        System.out.println("1. Rupee to Euro");
        System.out.println("2. Rupee to USD");
        System.out.println("3. Euro to Rupee");
        System.out.println("4. Euro to USD");
        System.out.println("5. USD to Rupee");
        System.out.println("6. USD to Euro");
        System.out.println("-----------------------------------");

        do
        {

        System.out.println("Enter your choice : ");
        int choice=sc.nextInt();

        switch(choice)
        {
            case 1:
            System.out.println("Enter the amount in Rupee : ");
            double Rupee =sc.nextDouble();
            double Euro=Math.round (RupeetoEuro(Rupee));
            System.out.println("Rupee to Euro: "+Euro);
            break;

            case 2:
            System.out.println("Enter the amount in Rupee : ");
            Rupee =sc.nextDouble();
            double USD=Math.round(RupeetoUSD(Rupee));
            System.out.println("Rupee to USD: "+USD);
            break;

            case 3:
            System.out.println("Enter the amount in Euro : ");
            Euro =sc.nextDouble();
            Rupee=Math.round(EurotoRupee(Euro));
            System.out.println("Euro  to Rupee: "+Rupee);
            break;

            case 4:
            System.out.println("Enter the amount in Euro : ");
            Euro =sc.nextDouble();
            USD=Math.round(EurotoUSD(Euro));
            System.out.println("Euro to USD: "+USD);
            break;
            
            case 5:
            System.out.println("Enter the amount in USD : ");
            USD =sc.nextDouble();
            Rupee=Math.round(USDtoRupee(USD));
            System.out.println("USD to Rupee: "+Rupee);
            break;

            case 6:
            System.out.println("Enter the amount in USD : ");
            USD =sc.nextDouble();
            Euro=Math.round(USDtoEuro(USD));
            System.out.println("USD to Euro: "+Euro);
            break;

            default:
            System.out.println("Invalid choice. Please enter your choice from the menu.");
         }
         System.out.println("Do you need any other service ?");
         again = sc.next().charAt(0);

    }while(again =='y' || again == 'Y');

    System.out.println("Thank for using Currency Converter. Have a nice Day!!!");

    }
    
}
