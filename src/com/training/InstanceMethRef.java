package com.training;

interface SayHello {  
    void say();  
}  

public class InstanceMethRef {  
    public void saySomething(){  
        System.out.println("Hello, this is Instances method.");  
    }  
    public static void main(String[] args) {  
    	InstanceMethRef methodReference = new InstanceMethRef(); // Creating object  
    	// Referring non-static method using reference  
    	SayHello sayHello = methodReference::saySomething;  
    	// Calling interface method  
    	sayHello.say();  
    	// Referring non-static method using anonymous object  
    	SayHello sayHello2 = new InstanceMethRef()::saySomething; // You can use anonymous object also  
    	// Calling interface method  
    	sayHello2.say();  
    }  
}  
