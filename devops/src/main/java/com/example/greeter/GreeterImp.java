package com.example.greeter;

public class GreeterImp implements Greeter{

    @Override
    public String generalGreeting() {
        return "Hello there!";
    }

    @Override
    public String uniqueGreeting(String name) {
        return "Hello " + name + "!";
    }
    
}
