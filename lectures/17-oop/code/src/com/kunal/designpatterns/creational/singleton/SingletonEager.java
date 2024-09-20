package code.src.com.kunal.designpatterns.creational.singleton;

public class SingletonEager {
    private SingletonEager() {
        // can not initialise via constructor
    }
    // Instance is created at class loading time
    private static final SingletonEager SINGLETON_EAGER = new SingletonEager();

    // Global access point for the instance
    public static SingletonEager getInstance() {
        return SINGLETON_EAGER;
    }
}
