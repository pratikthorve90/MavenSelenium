package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

// This is my publisher
public class Channel {

    public List<Observer> mysubscriber = new ArrayList<>();

    public void subscriber(Observer observer) {
        mysubscriber.add(observer);
    }

    public void unSubscriber(Observer observer) {
        mysubscriber.remove(observer);
    }

    public void notifyObservers(String message) {
        for(Observer subscriber : mysubscriber) {
            subscriber.notify(message);
        }
    }

    public void UploadVideo(String message){
        System.out.println("New video uploaded successfully");
        this.notifyObservers(message);
    }

}
