package DesignPatterns.SimpleFactory;

public class Main {

    public void sendEmaiOracleUser(){
        String conn = DBFactory.getConnection("oracle").getConnection();
        System.out.println(conn);
        // Code to send email
    }

    public void sendWhatsappMongo(){
        String conn = DBFactory.getConnection("mongo").getConnection();
        System.out.println(conn);
        // Code to send whatsapp
    }

    public static void main(String[] args) {

        Main main = new Main();
        main.sendWhatsappMongo();
        main.sendEmaiOracleUser();



    }
}
