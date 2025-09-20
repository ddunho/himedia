package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayList.html
        ArrayList<String> arrayList = new ArrayList<>();
        //add : 지정된 요소를 이 배열의 끝에 추가합니다.
        arrayList.add("first");
        arrayList.add("second");

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //hasNext() : 처음부터 차례대로 확인, 존재하면 true, 없으면 false 반환
        //next() : 뽑아온 요소를 반환해줌
    }
}