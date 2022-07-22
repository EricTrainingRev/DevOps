package com.example;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.example.greeter.Greeter;
import com.example.greeter.GreeterImp;

public class GreeterTests {

    public static Greeter greeter;

    @BeforeClass
    public static void setup(){
        greeter = new GreeterImp();
    }

    @Test
    public void getGenericGreetingPositiveTest(){
        String greeting = greeter.generalGreeting();
        Assert.assertEquals("Hello there!", greeting);
    }

    @Test
    public void getUniqueGreetingPositiveTest(){
        String greeting = greeter.uniqueGreeting("Ted");
        Assert.assertEquals("Hello Ted!", greeting);
    }
    
}
