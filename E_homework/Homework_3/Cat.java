package hello.demo;

public final class Cat extends Animal {
    public Cat(String name, boolean gender, int age) {
        super(name, gender, age);
    }

    void eat(){
        System.out.println("cat eating");
    }

    void sleep(){
        System.out.println("cat sleeping");
    }
}
