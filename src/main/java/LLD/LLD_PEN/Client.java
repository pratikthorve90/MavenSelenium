package LLD.LLD_PEN;

public class Client {

    public static void main(String[] args) {

        InkType inkType = new BallPointInk();
        Refill ballPointRefill = new Refill("Black", inkType, 100.00);

        BallPen bpen = new BallPen(ballPointRefill, "BIC");

        System.out.println(bpen.getPenType());   // BIC Ball Pen
        System.out.println(bpen.getInkLevel());  // 100.0
        bpen.write("Hello");
        System.out.println(bpen.getInkLevel());  // 99.5

        InkType inkType2 = new FountainInk();
        Refill gellPenRefill = new Refill("Red", inkType2, 100.00);
        BallPen gellPen = new BallPen(gellPenRefill, "REYNOLDS");

        System.out.println(gellPen.getPenType());  // REYNOLDS Ball Pen
        System.out.println(gellPen.getInkLevel());  // 100.0
        gellPen.write("Hello");
        System.out.println(gellPen.getInkLevel());  // 99.0


    }

}
