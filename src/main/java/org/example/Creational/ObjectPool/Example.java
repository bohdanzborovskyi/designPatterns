package org.example.Creational.ObjectPool;

public class Example {

    public static void main(String[] args) {

        ObjectPool pool = new ObjectPool();

        PooledObject pooledObject0 = pool.acquire();
        PooledObject pooledObject1 = pool.acquire();

        System.out.println("Pool Object 0: " + pooledObject0.getData());
        System.out.println("Pool Object 1: " + pooledObject1.getData());

        pool.release(pooledObject1);
        pool.release(pooledObject0);

        PooledObject pooledObject2 = pool.acquire();
        System.out.println("Pool Object 2: " + pooledObject2.getData());

    }
}
