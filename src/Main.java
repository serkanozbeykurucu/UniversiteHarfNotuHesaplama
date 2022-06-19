import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        Scanner rd = new Scanner(System.in);

        System.out.println("Vize Notunu Giriniz: ");
        double vize = rd.nextDouble();

        System.out.println("Final Notunu Giriniz: ");
        double finaln = rd.nextDouble();

        double ortalama = ((vize*40)/100)+((finaln*60)/100);

        if (ortalama>=90 && ortalama<=100)
        {
            System.out.println("AA");
        }
        else if (ortalama>=80 && ortalama<=89)
        {
            System.out.println("BA");
        }

        else if (ortalama>=70 && ortalama<=79)
        {
            System.out.println("BB");
        }

        else if (ortalama>=60 && ortalama<=69)
        {
            System.out.println("CB");
        }

        else if (ortalama>=50 && ortalama<=59)
        {
            System.out.println("CC");
        }

        else if (ortalama>=45 && ortalama<=49)
        {
            System.out.println("DC");
        }

        else if (ortalama>=40 && ortalama<=44)
        {
            System.out.println("DD");
        }

        else if (ortalama>=30 && ortalama<=39)
        {
            System.out.println("FD");
        }

        else
        {
            System.out.println("FF");
        }

    }
}