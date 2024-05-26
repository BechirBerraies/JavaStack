package com.example;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.Naming;

public class Mag1 extends UnicastRemoteObject implements Store {
    
    protected Mag1() throws RemoteException {
        super();
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
        // create the remote object
        Mag1 obj = new Mag1();
        // create the rmi registry
        Registry registry = LocateRegistry.createRegistry(1099);
        // bind the remote object to the registry
        Naming.bind("Mag1", obj);
        System.out.println("Server ready");
		
    }

    @Override
    public float getPrice(String ingredient) throws RemoteException {
        float price = 0;
        String filePath = "C:\\Users\\SBS\\Desktop\\Code\\Java\\RMI\\demo\\src\\main\\java\\com\\example\\Mag1.txt";
        File file = new File(filePath);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.equals(ingredient)) {
                    line = bufferedReader.readLine(); // move to next line to get the price
                    price = Float.parseFloat(line);
                    break;
                }
            }

            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println("Une erreur s'est produite lors de la lecture du fichier : " + e.getMessage());
            e.printStackTrace();
        }
        return price;
    }
}