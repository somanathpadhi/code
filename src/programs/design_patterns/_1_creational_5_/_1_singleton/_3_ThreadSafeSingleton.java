package programs.design_patterns._1_creational_5_._1_singleton;

public class _3_ThreadSafeSingleton {

    private static _3_ThreadSafeSingleton threadSafeSingleton;

    private _3_ThreadSafeSingleton(){}

    //method synchronized, thead safe
    public static synchronized _3_ThreadSafeSingleton getInstance(){
        if (threadSafeSingleton == null){
                threadSafeSingleton = new _3_ThreadSafeSingleton();
        }
        return threadSafeSingleton;
    }
}