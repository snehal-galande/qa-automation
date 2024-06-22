package org.selenium.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertyReader {
    static Map<String,String> configMap = new HashMap<>();

    static {
        try{
            Properties props = new Properties();
            FileReader reader = new FileReader(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties"));
            props.load(reader);

            for(Object obj:props.keySet()){
                //System.out.println(obj);
                configMap.put(String.valueOf(obj),props.getProperty(String.valueOf(obj)));
            }
            //System.out.println(configMap);
//            return configMap;


           // System.out.println(props.getProperty("url"));
        }catch(FileNotFoundException e){
            System.out.println("File not found due to " + e.getMessage());

        } catch (IOException e) {
            System.out.println("Exception occure due to " + e.getMessage());
        }
//          return null;
    }

    public static String readKey(String key){

        return configMap.get(key);
    }



}
