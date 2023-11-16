import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declaration et initialisation des arguments
        String Nomcomplet;
        double math,algo, prog,bd,gestpr, Moyenne;
        //demande des notes avec leure récupération
        Scanner s= new Scanner(System.in);
        System.out.println("Entrez votre nom complet (Nom, Prenom)");
        Nomcomplet=s.nextLine();
        System.out.println("entrez votre note de Mathematiques");
        math=s.nextDouble();
        System.out.println("Entrez votre note en Algorithme");
        algo=s.nextDouble();
        System.out.println("entrez votre note en Programmation");
        prog=s.nextDouble();
        System.out.println("entrez votre note en Base de donnée");
        bd=s.nextDouble();
        System.out.println("entrez votre note en gestion des projets");
        gestpr=s.nextDouble();

        //defintion de la moyenne
        Moyenne=(math+algo+prog+bd+gestpr)/5;
        if ( Moyenne <= 2) {
            System.out.println("Chers "+ Nomcomplet+" Après délibération vous eu une mention 'Mauvaise' avec une moyenne de "+ Moyenne);
        } else if (Moyenne >= 3 && Moyenne <= 5) {
            System.out.println("Chers "+ Nomcomplet+" Après délibération vous eu une mention 'Médiocre' avec une moyenne de "+ Moyenne);
        } else if ( Moyenne >= 6 && Moyenne < 10) {
            System.out.println("Chers "+ Nomcomplet+" Après délibération vous eu une mention 'Insuffisant' avec une moyenne de "+ Moyenne);
        } else if ( Moyenne >= 10 && Moyenne <= 12) {
            System.out.println("Chers "+ Nomcomplet+" Après délibération vous eu une mention 'Passable' avec une moyenne de "+ Moyenne);
        } else if (Moyenne >= 13 && Moyenne <= 14) {
            System.out.println("Chers "+ Nomcomplet+" Après délibération vous eu une mention 'Assez-bien' avec un moyenne de "+ Moyenne);
        } else if (Moyenne >= 15 && Moyenne <= 16) {
            System.out.println("Chers "+ Nomcomplet+" Après délibération vous eu une mention 'Bien' avec un moyenne de "+ Moyenne);
        } else if (Moyenne >= 17 && Moyenne <= 18) {
            System.out.println("Chers "+ Nomcomplet+" Après délibération vous eu une mention 'Très-Bien' avec un moyenne de "+ Moyenne);
        } else {
            System.out.println("Chers "+ Nomcomplet+" Après délibération vous eu une mention 'Excellent' avec un moyenne de "+ Moyenne);
        }
    }
}