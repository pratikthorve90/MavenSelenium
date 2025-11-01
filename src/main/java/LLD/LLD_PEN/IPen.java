package LLD.LLD_PEN;

public interface IPen {

    void write(String content);
    void refill();
    double getInkLevel();
    boolean canWrite();
    String getPenType();

}
