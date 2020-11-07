package hello.demo;

public class Dog extends Animal {
    public Dog(String name, boolean gender, int age) {
        super(name, gender, age);
    }

    void sleep(){
        System.out.println("dog sleeping");
    }

    boolean run( int type ){
        System.out.println("dog half speed ahead!");
        return true;
    }

    int run( int type, int urgent ){
        System.out.println("dog full speed ahead! ypa!");
        return 0;
    }

}
