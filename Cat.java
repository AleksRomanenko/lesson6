package ru.geekbrains;

public class Cat extends Animals {

    private static int catCount;

    public static int getCatCount() {
        return catCount;
    }

    public Cat(String name) {
        super(name);
        ++catCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("Кошка " + name + " пробежала дистанцию " + distance + " м.");
        } else {
            System.out.println(distance + " м. слишком много для кошки " + name + ", чтобы пробежать!");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кошка " + name + " не умеет плавать!");
    }
}
