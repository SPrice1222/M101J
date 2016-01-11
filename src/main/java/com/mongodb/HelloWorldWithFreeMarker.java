package com.mongodb;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Black Stealth on 1/10/2016.
 */
public class HelloWorldWithFreeMarker {
    public static void main(String[] args){
        Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(
                HelloWorldWithFreeMarker.class, "/");

        try{
            Template helloTemplate = configuration.getTemplate("hello.ftl");
            StringWriter writer = new StringWriter();
            Map<String, Object> helloMap = new HashMap<String, Object>();
            helloMap.put("name", "Freemarker");

            helloTemplate.process(helloMap, writer);
            System.out.println(writer);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
