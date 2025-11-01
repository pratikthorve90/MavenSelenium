package DesignPatterns.FLyWeight;

public class Client {


    public static void main(String[] args) {
        Bullet smallBullet = BulletFactory.getBullet("smallBullet",10,10,10);
        Bullet bigBullet = BulletFactory.getBullet("bigBullet",20,20,20);

        FlyingBullet handGunAmmo = new FlyingBullet(10,10,smallBullet);
        FlyingBullet rifleAmmo = new FlyingBullet(20,10,bigBullet);
    }





}
