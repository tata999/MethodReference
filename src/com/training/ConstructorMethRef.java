package com.training;

interface Messageable{  
    Message getMessage(String msg);  
}  
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
}  
public class ConstructorMethRef {  
    public static void main(String[] args) {  
        Messageable hello = Message::new;  
        hello.getMessage("Hello, this is Constructor Reference method");  
    }  
} 

