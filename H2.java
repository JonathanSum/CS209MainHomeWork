/**
 * Created by JonathanSum on 4/1/2017.
 */
//Name: Jonathan Che-Yeung Sum
//ID: 881716741
//Class : CS209 JAVA
//Date: 4-1-207
public class H2 {
    public static int d1;
    public static int d2;
    public static int ds;
    public static Result r = new Result();
    public static void main(String args[]) {

        dicing();
        System.out.println("Win with firstRow "+ r.getwFirstRow());
        System.out.println("Lose with firstRow "+r.getlFirstRow());
        System.out.println("Win with points "+ r.getwPoints());
        System.out.println("Lose with points "+r.getlPoints());
        //Testing purposes only System.out.println("Rounds of make with points "+r.getmR());
    }

    public static void dicing() {

        for (int i = 0; i < 100; i++) {
            setD1D2();
            checking(d1+d2);

        }
    }

    public static void checking(int sum) {
        if (sum == 11 || sum == 7) {
            r.setwFirstRow(r .getwFirstRow() + 1);

        } else if (sum == 2 || sum == 3 || sum == 12) {
            r.setlFirstRow(r.getlFirstRow() + 1);
        } else {
            //Testing purposes only r.setmR(r.getmR() + 1);
            int mp = ds;
            setD1D2();
            makePoint(mp);
        }
    }
    public static void setD1D2(){
        r.setD1();
        d1 = r.getD1();
        r.setD2();
        d2 = r.getD2();
        ds = d1+d2;

    }
    public static void makePoint(int mp){

        do{
            setD1D2();
            if (mp==ds){
                r.setwPoints(r.getwPoints() + mp);
            }else if(ds == 7){
                r.setlPoints(r.getlPoints() + mp);
            }
        }while(ds != 7);
    }
}
 class Result {
    int wFirstRow; //wins in first roll
    int lFirstRow; //lost in first roll
    int wPoints; //wins with points
    int lPoints; //lost with points
    int mR;
    int d1; //dice1
    int d2; //dice2
    public void setD1(){
        d1 = (int) (Math.random() * (6)) + 1;
    }
    public int getD1(){
        return d1;
    }
    public void setD2(){
        d2 = (int) (Math.random() * (6)) + 1;
    }
    public int getD2(){
        return d2;
    }
    public void setwFirstRow(int num) {
        this.wFirstRow = num;
    }
    public int getwFirstRow() {
        return wFirstRow;
    }
    public void setlFirstRow(int num) {
        this.lFirstRow = num;
    }
    public int getlFirstRow() {
        return lFirstRow;
    }
    public void setwPoints(int num) {
        this.wPoints = num;
    }
    public int getwPoints() {
        return wPoints;
    }
    public void setlPoints(int num) {
        this.lPoints = num;
    }
    public int getlPoints() {
        return lPoints;
    }
    public int setmR(int num) {
        return this.mR = num;
    }
    public int getmR() {
        return mR;
    }

}





