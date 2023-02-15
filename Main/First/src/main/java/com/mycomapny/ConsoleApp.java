package com.mycomapny;

import com.mycompany.CommonUtility;

public class ConsoleApp {

    public int data(){
        return 1;
    }
    public static void main(String[] args) {
        String appName = CommonUtility.getAppName();
        System.out.println("Welcome to " + appName);
    }
}