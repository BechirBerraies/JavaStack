package org.example;

import java.rmi.RemoteException;

public class StoreManager implements Store{

    @Override
    public float getPrice(String ingredient) throws RemoteException {
        return 0;
    }
}
