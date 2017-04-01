/**
 * Created by JonathanSum on 4/1/2017.
 */
public class Testing2 {
    public static int d1;
    public static int d2;
    public static Result r = new Result();
    public static void main(String args[]){

        r.setlFirstRow(0);
        int a1 = r.wFirstRow;
        a1 += 1;
        //System.out.println(a1);
        setD1D2();
        System.out.println(d1);
    }
    public static void setD1D2(){
        r.setD1();
        d1 = r.getD1();
        r.setD1();
        d2 = r.getD2();

    }
}
