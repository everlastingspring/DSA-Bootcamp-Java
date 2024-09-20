package code.src.com.kunal.designpatterns.creational.singleton;
// this is lazy loading as instance is created when needed
public class SingletonBest {
// volatile object so that it is shared to multi threads
// to look up in main memory than local cache
    private static volatile SingletonBest instance;

    private SingletonBest() {
//  can not initialise via constructor
    }
/*The volatile keyword ensures that the instance's value is visible to all threads.
Without volatile, threads may cache the variable locally and read a stale value.
Double-checked locking minimizes synchronization overhead by
only synchronizing the first time the instance is accessed.
The inner if (instance == null) ensures that multiple threads
do not create separate instances after passing the first null check.*/
    public static SingletonBest getInstance() {
        if (instance == null) { // First check (no synchronization)
            synchronized (SingletonBest.class) { // Lock on Singleton.class
                if (instance == null) { // Second check (after acquiring the lock)
                    instance = new SingletonBest();
                }
            }
        }
        return instance;
    }
}
