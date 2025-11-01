package DesignPatterns.Prototype;

public class Main {

    public static void main(String[] args){

        Circle c = new Circle(10);
        Circle c1 = (Circle) c.clone();

        Square s = new Square(10);
        Square s1 = (Square) s.clone();

       c.draw();
       c1.draw();

       s.draw();
       s1.draw();

       PrototypeRegistry pr = new PrototypeRegistry();
       pr.add("Big Circle", new Circle(20));
       pr.add("Small Circle", new Circle(10));
       pr.add("Big Square", new Square(20));
       pr.add("Small Square", new Square(10));

       Circle c2 = (Circle) pr.get("Big Circle");
       Square s2 = (Square) pr.get("Small Square");
       // Once you get the object you can add / change the attributes values as per your choice.
        // Then you can return the object back to client
       System.out.println("-------");
       System.out.println(c2.radius);

       c2.draw();
       s2.draw();

    }
}
