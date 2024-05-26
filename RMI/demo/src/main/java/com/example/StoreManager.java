package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StoreManager extends UnicastRemoteObject implements Store {

    protected StoreManager() throws RemoteException {
        super();
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
					price = Float.parseFloat(line); // Convert the price to float
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