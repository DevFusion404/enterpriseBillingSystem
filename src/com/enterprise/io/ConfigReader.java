package com.enterprise.io;

import java.io.*;

public class ConfigReader {
    public String readConfig(String filepath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            return reader.readLine();
        } catch (Exception e) {
            return "";
        }
    }

    public static void main(String[] args) {
        ConfigReader cr = new ConfigReader();
        System.out.println("Config content: " + cr.readConfig("app.properties"));
    }
}
