package org.example;

public class Person implements Comparable<Person>{

    private int userUid;

    public Person(int userUid){
        this.userUid = userUid;
    }
    public int getUserUid(){
        return userUid;
    }
    @Override
    public int compareTo(Person o){
        return this.userUid - o.userUid;
        //현재 멤버번수가 가지고 있는 것과 외부에서 가져온 것을 비교
    }
}
