package com.training;

interface Sayable{  
    void say();  
}

public class StaticMethRef {
    public static void saySomething(){
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = StaticMethRef::saySomething;  
        // Calling interface method  
        sayable.say();
    }  
}