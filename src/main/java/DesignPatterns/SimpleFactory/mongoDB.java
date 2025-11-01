package DesignPatterns.SimpleFactory;

public class mongoDB implements Database{

    @Override
    public String getConnection() {
        return "this is MongoDB connection";
    }
}
