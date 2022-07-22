package com.example.api;

import com.example.greeter.Greeter;
import com.example.greeter.GreeterImp;

import io.javalin.Javalin;

public class App {

    public static void main(String[] args) {
        Javalin app = Javalin.create();

        Greeter greeter = new GreeterImp();

        app.get("/", ctx -> {
            ctx.result(greeter.generalGreeting());
            ctx.status(200);
        });

        app.get("/{name}", ctx -> {
            String name = ctx.pathParam("name");
            ctx.result(greeter.uniqueGreeting(name));
            ctx.status(200);
        });

        app.start();
    }
    
}
