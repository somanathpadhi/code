package programs.design_patterns._1_creational_5_._1_singleton;

 class SolutionsToStopBreakingSingleton {
    private static SolutionsToStopBreakingSingleton finalSingleton;

    //approach 1
    //throw exception if trying to call the constructor using the reflexion api
     //to stop breaking singleton pattern
    private SolutionsToStopBreakingSingleton() {
        if (finalSingleton !=null){
            throw new RuntimeException("You are trying to break singleton Pattern!");
        }
    }

    public static SolutionsToStopBreakingSingleton getInstance() {

        if (finalSingleton == null) {
            synchronized (SolutionsToStopBreakingSingleton.class) {
                if (finalSingleton == null) {
                    finalSingleton = new SolutionsToStopBreakingSingleton();
                }
            }
        }
        return finalSingleton;
    }

}

//approach 2
enum EnumSingleton{
     INSTANCE;

    public void test(){
        System.out.println("Test Method!");
    }
}

//serialize deserialize can break singleton

//object clone also break singleton
