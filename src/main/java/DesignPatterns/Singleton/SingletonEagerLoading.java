package DesignPatterns.Singleton;

public class SingletonEagerLoading {

    /// Eager loading
    /// This object is created at start of program
    /// Slow down application startup
    /// What if we do not need the object : High memory cost since we already have the object created
    /// Not possible to pass parameters to constructor
    private static final SingletonEagerLoading instance = new SingletonEagerLoading();

    private SingletonEagerLoading() {
        // Constructor , do your DB / File / logs read operation here
    }

    public static SingletonEagerLoading getInstance() {
        return instance;
    }

}
