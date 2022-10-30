package ru.geekbrains;

public class Animals {

    protected final String name;

    private static int animalCount;

    public static int getAnimalCount() {
        return animalCount;
    }

    public Animals(String name) {
        this.name = name;
        ++animalCount;
    }

    public void run(int distance) {
        System.out.println("Животное может " + distance + " м. пробежать.");
    }

    public void swim(int distance) {
        System.out.println("Животное может " + distance + " м. проплыть.");
    }
}