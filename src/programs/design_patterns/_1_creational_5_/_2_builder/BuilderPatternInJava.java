package programs.design_patterns._1_creational_5_._2_builder;

public class BuilderPatternInJava {

     static void main(String[] args) {
        Person p = new Person.Builder().setId(3).setAge(3).setName("soma").build();
        System.out.println(p);
    }
}

class Person {

    private final int id;
    private final String name;
    private final int age;

    private Person(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "id " + this.id + " age " + this.age + " name " + this.name;
    }

     static class Builder {
        private int id;
        private String name;
        private int age;

        Builder setId(int id){
            this.id = id;
            return this;
        }
        Builder setName(String name){
            this.name = name;
            return this;
        }
        Builder setAge(int age){
            this.age = age;
            return this;
        }

        Person build(){
            return new Person(this);
        }
    }
}
