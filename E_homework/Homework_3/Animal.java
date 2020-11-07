package hello.demo;

public class Animal {
    private String name;
    private boolean gender;
    private int age;

    void eat() {
        System.out.println("Animal eating");
    }

    void sleep(){
        System.out.println("Animal sleeping");
    }

    public Animal(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
