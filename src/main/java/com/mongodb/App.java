package com.mongodb;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Spark.get(new Route("/"){
            @Override
            public Object handle ( final Request request, final Response response){
                return "Hello World from Spark.";
            }
        });
    }
}
