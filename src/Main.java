import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        int year = sc.nextInt();
       if (year%4==0 && year%400==0){
           System.out.println(year+" Bir artık yıldır!");
       } else {
           System.out.println(year+" Bir artık yıl değildir!!");

       }
    }
}