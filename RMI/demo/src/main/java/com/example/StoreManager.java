package com.example;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class StoreManager extends UnicastRemoteObject implements Store {

    private static final long serialVersionUID = 1L;
    private final Map<String, String> storeFiles;

    protected StoreManager() throws RemoteException {
        super();
		
        storeFiles = new HashMap<>();
        storeFiles.put("Mag1", "C:\\Users\\SBS\\Desktop\\Code\\Java\\RMI\\demo\\src\\main\\java\\com\\example\\Mag1.txt");
        storeFiles.put("Mag2", "C:\\Users\\SBS\\Desktop\\Code\\Java\\RMI\\demo\\src\\main\\java\\com\\example\\Mag2.txt");
        storeFiles.put("Mag3", "C:\\Users\\SBS\\Desktop\\Code\\Java\\RMI\\demo\\src\\main\\java\\com\\example\\Mag3.txt");
    }

    @Override
    public float getPrice(String ingredient, String storeName) throws RemoteException {
        float price = -1;
        String filePath = storeFiles.get(storeName);

        if (filePath == null) {
            throw new RemoteException("Store not found");
        }

        File file = new File(filePath);
        try (FileInputStream fileInputStream = new FileInputStream(file);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.equalsIgnoreCase(ingredient)) {
                    price = Float.parseFloat(bufferedReader.readLine());
                    break;
                }
            }

        } catch (IOException e) {
            throw new RemoteException("Error reading file", e);
        }

        return price;
    }
}