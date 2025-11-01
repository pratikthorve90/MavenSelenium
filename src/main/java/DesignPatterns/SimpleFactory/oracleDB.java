package DesignPatterns.SimpleFactory;

public class oracleDB implements Database {

    @Override
    public String getConnection() {
        return "this is oracle connection";
    }
}
