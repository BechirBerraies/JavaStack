package com.example;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.util.Scanner;

public class rmicuisinier {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Sélectionner le numéro de l’ingrédient, puis appuyez sur « Entrée » :");
        System.out.println("[1] cornichons");
        System.out.println("[2] safran");
        System.out.println("[3] sel");
        System.out.println("[4] poivre");

        int choix = scan.nextInt();
        String ingredient = "";

        switch (choix) {
            case 1:
                ingredient = "cornichons";
                break;
            case 2:
                ingredient = "safran";
                break;
            case 3:
                ingredient = "sel";
                break;
            case 4:
                ingredient = "poivre";
                break;
            default:
                System.out.println("Choix invalide.");
                return;
        }

        float minPrice = Float.MAX_VALUE;
        String minStore = "";

        for (int i = 1; i <= 3; i++) {
            String storeName = "rmi://localhost:1099/Mag" + i;
			System.out.println("loop check "+ i);
			System.out.println(minPrice);
			System.out.println(storeName);
            try {
                Store obj = (Store) Naming.lookup(storeName);
                float price = obj.getPrice(ingredient);

				System.out.println(price);
                if (price < minPrice) {
                    minPrice = price;
                    minStore = "Mag" + i;
                }
            } catch (NotBoundException | MalformedURLException | RemoteException e) {
                // Le magasin n'est pas lié au registre, ignorer et passer au suivant
                continue;
            }
        }

        System.out.println("Le magasin " + minStore + " propose " + ingredient + " au prix de " + minPrice);
    }
}