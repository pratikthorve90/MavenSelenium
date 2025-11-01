package DesignPatterns.FLyWeight;

public class FlyingBullet {

    private int position;

    private int speed ;

    private Bullet bullet;

    public FlyingBullet(int position, int speed, Bullet bullet) {
        this.position = position;
        this.speed = speed;
        this.bullet = bullet;
    }

}
