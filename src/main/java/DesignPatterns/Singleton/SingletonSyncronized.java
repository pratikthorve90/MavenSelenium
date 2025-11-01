package DesignPatterns.Singleton;

public class SingletonSyncronized {

    // The problem with this is that singleTon breaks when we are Serializing
    private static SingletonSyncronized instance;
    private SingletonSyncronized() {
        // DB read , file read etc
    }

    public static SingletonSyncronized getInstance(){
        if(instance == null){
            synchronized (SingletonSyncronized.class){
                // Check again that the instance is null as there is change that other thread might be at same place
                // Also known as double check locking
                if(instance == null){
                    instance = new SingletonSyncronized();
                }
            }
        }
        return instance;
    }
}
