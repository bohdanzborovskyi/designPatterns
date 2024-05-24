package org.example.Creational.ObjectPool;

import java.util.ArrayList;
import java.util.List;

public class ObjectPool {

    private List<PooledObject> available = new ArrayList<>();
    private List<PooledObject> inUse = new ArrayList<>();

    private int counter_ID = 0;

    public PooledObject acquire(){
        if(available.isEmpty()){
            available.add(new PooledObject("New Object" + counter_ID));
            counter_ID++;
        }
        PooledObject obj = available.remove(0);
        inUse.add(obj);
        return obj;
    }

    public void release(PooledObject pooledObject){
        inUse.remove(pooledObject);
        available.add(pooledObject);
    }

}
