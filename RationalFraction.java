package com.fraction;
public class RationalFraction {
    private int m;
    public int getM() {
        return m;
    }
    public void setM(int m) {
        this.m = m;
    }
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
    private int n;
    public RationalFraction(int m, int n){
        this.m = m;
        this.n = n;
    }
    public  void add(RationalFraction b){
       this.m = this.m + b.getM();
       this.n = this.n + b.getN();
    }
    public  void sub(RationalFraction b){
        this.m = this.m + b.getM();
        this.n = this.n + b.getN();
    }

    @Override
    public String toString() {
        return "RationalFraction{" +
                m +
                "\\" + n +
                '}';
    }
}
