package com.school.faang.hashmap.задача_2;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

        User user1 = new User(1L, "Иван Иванов", "15.05.2020");
        User user2 = new User(2L, "Петр Петров", "20.01.2023");
        User user3 = new User(3L, "Сергей Сергеев", "01.10.2018");

        Solution solution = new Solution();
        solution.add("@Ivan", user1);
        solution.add("@Petr", user2);
        solution.add("@Sergei", user3);

        for (Map.Entry<String, User> entry : map.entrySet()){

            String username = entry.getKey();
            User user = entry.getValue();
            System.out.println("Пользователь " + username + ", полное имя: " + user.getFullName());
        }
    }

    static Map<String, User> map = new HashMap<String, User>();

    public void add(String username, User user) {
        map.put(username, user);
    }
}
