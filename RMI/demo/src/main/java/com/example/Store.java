package com.example;


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Store extends Remote {
    float getPrice(String ingredient, String storeName) throws RemoteException;
}