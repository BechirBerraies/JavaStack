package com.example;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class rmicuisinier {
    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Sélectionner le numéro de l’ingrédient, puis cliquez sur « Entrée » :");
        System.out.println("[1] cornichons");
        System.out.println("[2] safran");
        System.out.println("[3] sel");
        System.out.println("[4] poivre");

        String[] ingredients = {"cornichons", "safran", "sel", "poivre"};
        int choice = scan.nextInt();
        if (choice < 1 || choice > 4) {
            System.out.println("Choix invalide");
            scan.close();
            return;
        }

        String ingredient = ingredients[choice - 1];
        Store obj = (Store) Naming.lookup("rmi://localhost:1099/StoreManager");

        float priceMag1 = obj.getPrice(ingredient, "Mag1");
        float priceMag2 = obj.getPrice(ingredient, "Mag2");
        float priceMag3 = obj.getPrice(ingredient, "Mag3");

        float minPrice = Math.min(priceMag1, Math.min(priceMag2, priceMag3));
        String cheapestStore = (minPrice == priceMag1) ? "Mag1" : (minPrice == priceMag2) ? "Mag2" : "Mag3";

        System.out.println("Le prix le plus bas pour " + ingredient + " est " + minPrice + " à " + cheapestStore);

        scan.close();
    }
}