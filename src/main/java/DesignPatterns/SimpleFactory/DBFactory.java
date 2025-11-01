package DesignPatterns.SimpleFactory;

public class DBFactory {

    public static Database getConnection(String type){


        switch(type){
                case "oracle":
                return new oracleDB();
                case "mongo":
                return new mongoDB();
        }
        // Never use default case always throw exception
        throw new IllegalArgumentException("Unknown database type");
    }

}
