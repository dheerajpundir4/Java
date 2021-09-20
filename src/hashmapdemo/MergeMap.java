package hashmapdemo;

import java.util.HashMap;

public class MergeMap {
    public static void main(String []args){
        //map 1
        HashMap<Integer, String> map1 = new HashMap<>();

        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        map1.put(5, "E");

//map 2
        HashMap<Integer, String> map2 = new HashMap<>();

        map2.put(1, "G");   //It will replace the value 'A'
        map2.put(2, "B");
        map2.put(3, "C");
        map2.put(4, "D");   //A new pair to be added

//Merge maps
        map1.putAll(map2);

        System.out.println(map1);


        //map 1
        HashMap<Integer, String> map3 = new HashMap<>();

        map3.put(1, "A");
        map3.put(2, "B");
        map3.put(3, "C");
        map3.put(5, "E");

//map 2
        HashMap<Integer, String> map4 = new HashMap<>();

        map4.put(1, "G");   //It will replace the value 'A'
        map4.put(2, "B");
        map4.put(3, "C");
        map4.put(4, "D");   //A new pair to be added

        map4.forEach(
                (key,value)->map3.merge(key,value,(v1,v2) -> v1.equalsIgnoreCase(v2)?v1:v1+","+v2));

        System.out.println(map3);

    }
}
