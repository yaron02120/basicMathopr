import java.io.*;

public class basicMath {
    private int x;
    private int y;

    public basicMath(int firstNum,int secondNum){
        x = firstNum;
        y = secondNum;
    }

    public int sumNumbers(){
        if ((Integer.MAX_VALUE - x) < y) {
            System.out.println("cant sum numbers");
            return 0;
        }
        return x + y;
    }

    public int subNumbers(){
        if ((Integer.MAX_VALUE + x) < y) {
            System.out.println("cant substract numbers");
            return 0;
        }
        return y - x;
    }

    public int mulNumbers(){
        return y*x;
    }
    public int divNumbers(){
        if (x == 0) {
            System.out.println("cant substract numbers");
            return 0;
        }
        return y/x;
    }
}
