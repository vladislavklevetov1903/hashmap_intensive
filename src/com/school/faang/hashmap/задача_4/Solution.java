package com.school.faang.hashmap.задача_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

        List<String> songs = new ArrayList<>();

        songs.add("Bohemian Rhapsody - Rock");
        songs.add("Smells Like Teen Spirit - Rock");
        songs.add("Shape of You - Pop");
        songs.add("Blinding Lights - Pop");
        songs.add("Lose Yourself - Hip-Hop");

        Solution solution = new Solution();

        System.out.println(solution.addMap(songs));
    }

    public Map<String, List<String>> addMap(List<String> list){
        Map<String, List<String>> resultMap = new HashMap<>();

        for (String song : list) {
            String[] arr = song.split(" - ");
            if (resultMap.containsKey(arr[1])) {
                List<String> songsInList = resultMap.get(arr[1]);
                songsInList.add(arr[0]);
            } else {
                List<String> list1 = new ArrayList<>();
                list1.add(arr[0]);
                resultMap.put(arr[1], list1);
            }
        }

        return resultMap;
    }
}
