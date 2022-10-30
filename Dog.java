package ru.geekbrains;

public class Dog extends Animals {

    private static int dogCount;

    public static int getDogCount() {
        return dogCount;
    }

    public Dog(String name) {
        super(name);
        ++dogCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("Собака " + name + " пробежала дистанцию " + distance + " м.");
        } else {
            System.out.println(distance + " м. слишком много для собаки " + name + ", чтобы пробежать!");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Собака " + name + " проплыла дистанцию " + distance + " м.");
        } else {
            System.out.println(distance + " м. слишком много для собаки " + name + ", чтобы проплыть!");
        }
    }
}
