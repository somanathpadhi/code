package programs.design_patterns._1_creational_5_._1_singleton;

public class _1_EagerSingleton {

    //Eager way of creating singleton object, as it is a static variable , it will
    //get instantiated at the time of class loading, so hence before using only eagerly
    //got instantiated
    private static _1_EagerSingleton eagerSingleton = new _1_EagerSingleton();

    private _1_EagerSingleton(){}

    public static _1_EagerSingleton getInstance(){
        return eagerSingleton;
    }
}
