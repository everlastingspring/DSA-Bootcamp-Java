package code.src.com.kunal;

import java.util.*;

public class Itinerary {
    public static void main(String[] args) {
        Map<String, String> tickets = new HashMap<>();
        tickets.put("Delhi", "Mumbai");
        tickets.put("Ahmadabad", "Delhi");
        tickets.put("Mumbai", "Pune");

        System.out.println("Starting point: "+findStart(tickets));
        System.out.println("Destination point: "+findDestination(tickets));
    }

     static String findDestination(Map<String, String> tickets) {
         String destination = "";
         for (String possibleDestination: tickets.values()){
             if (!tickets.containsKey(possibleDestination)){
                 destination=possibleDestination;
             }
         }
         return destination;
    }

    static String findStart(Map<String, String> tickets) {
        String start = "";
        for (String possibleStart: tickets.keySet()){
            if (!tickets.containsValue(possibleStart)){
                start=possibleStart;
            }
        }
        return start;
    }
}
