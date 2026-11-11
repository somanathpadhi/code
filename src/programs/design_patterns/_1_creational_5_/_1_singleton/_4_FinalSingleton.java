package programs.design_patterns._1_creational_5_._1_singleton;

public class _4_FinalSingleton {
    private static volatile _4_FinalSingleton finalSingleton;

    private _4_FinalSingleton() {
    }

    public static _4_FinalSingleton getInstance() {

        if (finalSingleton == null) {
            synchronized (_4_FinalSingleton.class) {
                if (finalSingleton == null) {
                    finalSingleton = new _4_FinalSingleton();
                }
            }
        }
        return finalSingleton;
    }

}