package programs.design_patterns._1_creational_5_._1_singleton;

public class _2_LazySingleton {

     private static _2_LazySingleton lazySingleton;
     private _2_LazySingleton(){
     }

     //lazy way of creating singleton object, when ever the object is
     //required then only the object will be created
     @SuppressWarnings("InstantiationOfUtilityClass")
     public static  _2_LazySingleton getInstance(){
          if (lazySingleton == null){
               lazySingleton = new _2_LazySingleton();
          }
          return lazySingleton;
     }
}



