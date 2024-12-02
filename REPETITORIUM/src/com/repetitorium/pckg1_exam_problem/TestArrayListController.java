package com.repetitorium.pckg1_exam_problem;

import java.util.ArrayList;

public class TestArrayListController {
    public static void main(String[] args) {
        User user1 = new User("userName01");
        User user2 = new User("userName02");
        User user3 = new User("userName03");
        User user4 = new User("userName04");
        ArrayList<User> users = new ArrayList<>();

        Car car1 = new Car("Mercedes", "SLK");
        Car car2 = new Car("Tesla", "Model S");
        Car car3 = new Car("BMW", "X5");
        ArrayList<Car> cars = new ArrayList<>();

        ArrayListController alc = new ArrayListController();
        AddNewElementToList<User> add1 = new AddNewElementToList<>(users, user1);
        AddNewElementToList<User> add2 = new AddNewElementToList<>(users, user1);
        AddNewElementToList<User> add3 = new AddNewElementToList<>(users, user2);
        InsertElementAtIndexPosition<User> insert1 = new InsertElementAtIndexPosition<>(users, user3, 1);

        AddNewElementToList<Car> addCar1 = new AddNewElementToList<>(cars, car1);
        AddNewElementToList<Car> addCar2 = new AddNewElementToList<>(cars, car2);

        ClearAllElementsFromList<User> clearAllElements = new ClearAllElementsFromList<>(users);


        alc.setCommand(add1);
        alc.runCommand();
        alc.setCommand(add2);
        alc.runCommand();
        alc.setCommand(add3);
        alc.runCommand();
        alc.setCommand(insert1);
        alc.runCommand();
        alc.setCommand(addCar1);
        alc.runCommand();
        alc.undoCommand();
        alc.undoCommand();
        alc.setCommand(clearAllElements);
        alc.runCommand();

    }

    private static <E> void listElements(ArrayList<E> list) {
        if (list.isEmpty()) {
            System.out.println("List is empty - nothing to list!");
        } else {
            System.out.println("-------------------------- List elements: --------------------------");
            for (E element : list) {
                System.out.println(element);
            }
        }
    }
}
