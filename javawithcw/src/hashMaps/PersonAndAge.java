package hashMaps;

import java.util.HashMap;
import java.util.Map;

public class PersonAndAge {
    public static void main(String[] args) {
        //syntax to create Hashmap in java
        Map<String,Integer> mp = new HashMap<>();
        //Adding element
        mp.put("Akash",21);
        mp.put("Yash",16);
        mp.put("Lav",17);
        mp.put("Rishika",19);
        mp.put("Harry",18);
        //Getting Value of a key from the HashMap
        System.out.println(mp.get("Yash")); //16
        System.out.println(mp.get("Rahul")); //null
        //changing or updating the value of key in hashmap
        mp.put("Akash",25); //Akash -> 25
        System.out.println(mp.get("Akash"));
        //Remove the pair form the HashMap
        System.out.println(mp.remove("Akash")); //25
        System.out.println(mp.remove("Riya")); //null
        //checking a key is in hashmap or not
        System.out.println(mp.containsKey("Yash")); //true
        System.out.println(mp.containsValue("Ritika")); //false
        //adding a new entry only if the new key does'nt exist already
        mp.putIfAbsent("Yash",45);
        mp.putIfAbsent("Yashika",20);
        //get all key in the hashmap
        System.out.println(mp.keySet());
        //get all values in the hashmap
        System.out.println(mp.values());
        //get all entry in the hashmap
        System.out.println(mp.entrySet());
        //Traversing all entries of HashMaps - Multiple times
        for(String key : mp.keySet()){
            System.out.printf("Age of %s is %d",key,mp.get(key));
            System.out.println(" ");
        }
        System.out.println(" ");
        for(Map.Entry<String,Integer> entry : mp.entrySet()){
            System.out.printf("Age of %s is %d",entry.getKey(),entry.getValue());
            System.out.println(" ");
        }
        System.out.println(" ");
        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d",e.getKey(),e.getValue());
            System.out.println(" ");
        }



    }

}
