public class ExampleClass {
    public void outerExampleMethod(){
        class ExampleLocalInnterClass{
            int exampleValue;
            void exampleMethod(){
                System.out.println("Hello");
            }

        }
        ExampleLocalInnterClass instance1 = new ExampleLocalInnterClass();
        instance1.exampleValue = 100;
        instance1.exampleMethod();
    }
}
