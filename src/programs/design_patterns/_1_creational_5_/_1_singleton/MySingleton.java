package programs.design_patterns._1_creational_5_._1_singleton;

public class MySingleton {
    private static MySingleton singleton = null;
    private MySingleton(){

    }
    public static MySingleton getInstance(){
        if (singleton == null){
            synchronized (MySingleton.class){
                if (singleton == null){
                    singleton = new MySingleton();
                }
            }
        }
        return singleton;
    }
}
