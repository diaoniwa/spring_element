package demo8.Po;

/**
 * Created by win8 on 2017/3/2.
 */
public class Customer {
    private int CUST_ID;
    private String NAME;
    private int AGE;

    @Override
    public String toString() {
        return "Customer{" +
                "CUST_ID=" + CUST_ID +
                ", NAME='" + NAME + '\'' +
                ", AGE=" + AGE +
                '}';
    }

    public int getCUST_ID() {
        return CUST_ID;
    }

    public void setCUST_ID(int CUST_ID) {
        this.CUST_ID = CUST_ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int getAGE() {
        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }
}
