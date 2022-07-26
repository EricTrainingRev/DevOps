package com.example.greeter;

public class GreeterImp implements Greeter{

    @Override
    public String generalGreeting() {
        return "Hello there updated by github Actions!";
    }

    @Override
    public String uniqueGreeting(String name) {
        return "Hello " + name + "!";
    }
    
}
