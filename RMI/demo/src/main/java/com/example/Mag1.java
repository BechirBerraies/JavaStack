package com.example;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Mag1 {
    public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
        Store obj = new StoreManager();
        Registry registry = LocateRegistry.createRegistry(1099);
        Naming.bind("StoreManager", obj);
        System.out.println("Server ready");
    }
}