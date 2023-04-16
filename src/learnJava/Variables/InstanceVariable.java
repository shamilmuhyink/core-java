package learnJava.Variables;

public class InstanceVariable {
    int instVar = 10;
    public static void main(String[] args){
        InstanceVariable instanceVariableObj = new InstanceVariable();
        System.out.println(instanceVariableObj.instVar);
    }
}
