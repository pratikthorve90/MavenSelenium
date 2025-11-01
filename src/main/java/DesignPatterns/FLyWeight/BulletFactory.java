package DesignPatterns.FLyWeight;

import java.util.HashMap;

public class BulletFactory {

    public static HashMap<String, Bullet> bullets = new HashMap<>();

    public static Bullet getBullet(String type , int radius , int image , int weight){

        if(!bullets.containsKey(type)){
            bullets.put(type, new Bullet(radius, image , weight));
        }
        return bullets.get(type);
    }

}
