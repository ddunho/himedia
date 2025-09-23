package org.example;

import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        //Map에는 Iterator 메서드가 없어서, keySet() 메서드를 사용해서
        //Set의 형태로 바꿔주고, Iterator 사용가능

        Iterator<String> iterator = hashMap.keySet().iterator();
        //keySet() : hashMap의 key값을 Set의 형태로 반환해줌
        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println(hashMap.get(key));
            //next로 반환된건 key값이라, value를 뽑아오려면 get메서드를 써야함
        }

    }
}