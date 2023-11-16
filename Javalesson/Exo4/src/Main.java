import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double nmbre1, nmbre2, nmbre3;
        Scanner s = new Scanner(System.in);
        System.out.println("Veuillez entrer un premier nombre");
        nmbre1 = s.nextDouble();
        System.out.println("Veuillez entrer un second nombre");
        nmbre2 = s.nextDouble();
        System.out.println("Veuillez entrer un troisième nombre");
        nmbre3 = s.nextDouble();

        double max = (nmbre1 > nmbre2) ? ((nmbre1 > nmbre3) ? nmbre1 : nmbre3) : ((nmbre2 > nmbre3) ? nmbre2 : nmbre3);

        // Affichage du résultat
        System.out.println("Le maximum parmi les trois nombres est : " + max);

    }
}