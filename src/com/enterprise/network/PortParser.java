package com.enterprise.network;

public class PortParser {
    public int parsePort(String portText) {
        try {
            return Integer.parseInt(portText);
        } catch (Exception e) {
            return 8080;
        }
    }

    public static void main(String[] args) {
        PortParser parser = new PortParser();
        System.out.println("Port: " + parser.parsePort("9090"));
    }
}
