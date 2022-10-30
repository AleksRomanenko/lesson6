package ru.geekbrains;

public class Lesson6 {

    public static void main(String[] args) {

        Cat cat01 = new Cat("Маруся");
        Cat cat02 = new Cat("Васька");
        Cat cat03 = new Cat("Беляк");
        Dog dog01 = new Dog("Кима");
        Dog dog02 = new Dog("Марта");
        cat01.run(100);
        cat02.run(230);
        cat01.swim(10);
        cat03.swim(5);
        dog01.run(350);
        dog02.run(600);
        dog01.swim(5);
        dog02.swim(20);

        System.out.println("Всего созданных животных: " + Animals.getAnimalCount());
        System.out.println("Всего созданных котов: " + Cat.getCatCount());
        System.out.println("Всего созданных собак: " + Dog.getDogCount());
    }
}
