package programs.design_patterns._1_creational_5_._1_singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class _5_BreakingSingletonPattern {

    static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        _4_FinalSingleton finalSingleton = _4_FinalSingleton.getInstance();
        System.out.println("finalSingleton " +finalSingleton.hashCode());

        Constructor<?>[] constructors = _4_FinalSingleton.class.getDeclaredConstructors();
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);
        _4_FinalSingleton finalSingleton1 = (_4_FinalSingleton) constructor.newInstance();
        System.out.println("finalSingleton1 with reflexion " + finalSingleton1.hashCode());


        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        System.out.println("enumSingleton " + enumSingleton.hashCode());

        Constructor<?>[] constructors2 = EnumSingleton.class.getDeclaredConstructors();
        Constructor constructor2 = constructors2[0];
        constructor2.setAccessible(true);
        //EnumSingleton enumSingleton1 = (EnumSingleton) constructor2.newInstance();
       // System.out.println("finalSingleton1 with reflexion " + enumSingleton1.hashCode());
    }

}
