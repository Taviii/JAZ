package pl.pjatk.OktWic;

public class ThisIsTrue {
    private String tf;

    public ThisIsTrue(String tf) {
        this.tf = tf;
        printTf();
    }

    public String getTf() {
        return tf;
    }

    public void setTf(String tf) {
        this.tf = tf;
    }

    public void printTf() {
        System.out.println(tf);
    }
}
