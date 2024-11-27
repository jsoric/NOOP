package com.josipsoric.zadatak_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestGens_1 {

    private static CompareTwo compareTwo;

    public static void main(String[] args) {
        ArrayList<User> users = popListUsers(3);
        System.out.println("Original list:");
        System.out.println(users);

        shuffleListElements(users);
        System.out.println("Shuffled list:");
        System.out.println(users);

        List<int[]> combinations = getCombinations(users);
        for (int[] pair : combinations) {
            compareTwo = new CompareTwo<>(pair[0], pair[1]);
            System.out.println("\n-------------------------------------------------------\n");
            User user1 = findUserById(users, pair[0]);
            User user2 = findUserById(users, pair[1]);
            System.out.println("Pair: " + user1 + " and " + user2);
            compareTwo.compareAndPerform();
        }
    }


    private static ArrayList<User> popListUsers(int n){
        ArrayList<User> userList = new ArrayList<>();
        for(int i=0; i<=n; i++){
            userList.add(new User());
        }
        return  userList;
    }

    private static <T> void shuffleListElements(ArrayList<T> list){
        Collections.shuffle(list);
    }

    private static List<int[]> getCombinations(List<User> users) {
        List<int[]> combinations = new ArrayList<>();
        generateCombinations(combinations, users, 0, 1);
        return combinations;
    }

    private static void generateCombinations(List<int[]> combinations, List<User> users, int i, int j) {
        if (i >= users.size() - 1) {
            return;
        }
        if (j >= users.size()) {
            generateCombinations(combinations, users, i + 1, i + 2);
            return;
        }
        combinations.add(new int[]{users.get(i).getID(), users.get(j).getID()});
        generateCombinations(combinations, users, i, j + 1);
    }

    private static User findUserById(List<User> users, int id) {
        for (User user : users) {
            if (user.getID() == id) {
                return user;
            }
        }
        return null;
    }
}