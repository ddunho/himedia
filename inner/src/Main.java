//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //ExampleInterface exampleInterface = new ExampleInterface();
       //원래 이렇게 만드는데, interface가 구현이 안되어있음 > 바로 구현 가능(1번만)
        ExampleInterface exampleInterface = new ExampleInterface(){
            @Override
            public void exampleMethod(){
                System.out.println("hello");
            }
        };
    }
}