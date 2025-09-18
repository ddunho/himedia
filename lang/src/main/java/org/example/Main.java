package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Integer integerValue1 = Integer.valueOf(100);
        int intValue1 = 200;

        int result = integerValue1 + intValue1;
        //integer > int로 변환 : 언박싱
        int result2 = integerValue1 + intValue1;
        //int > integer로 변환 : autoboxing
        //integer가 int를 포괄(포장)하고있는 개념
        //integer와 int는 자동으로 반환됨
    }
}