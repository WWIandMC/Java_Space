package hello.demo;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("001", true, 3 );
        d.eat();
        d.sleep();
        d.run(1);
        d.run(1,0);
        Cat c = new Cat("002", false, 4);
        c.eat();
        c.sleep();
    }
}














