package learnJava.Variables;

public class Variables {
    int  num = 10; // non-static(instance) variable
    static int statNum = 5; // static variable

    public static void main(String[] args){
        int num = 1; // local variable
        System.out.println("Local variable: "+num);
        System.out.println("Static variable: "+statNum);
        Variables variablesObj = new Variables();
        System.out.println("Instance variable: "+variablesObj.num);
    }
}
