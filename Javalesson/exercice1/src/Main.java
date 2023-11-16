import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age;
        Scanner s = new Scanner(System.in);
        System.out.println("veuillez entrer votre age");
        age=s.nextInt();
         if(age>=18){
             System.out.println("Vous êtes majeur");
         }else {
             if (age>=14 && age<18){
                 System.out.println("vous êtes un ado");
             }else {
                 System.out.println("vous êtes mineur");
             }
         }
    }
}