package Recur;


public class Recur {
    int k,s, numb, sumk, f = 0;
    public Recur(int k, int s) {
        this.k = k;
        this.s = s;

        for(numb = (int) Math.pow(10,k-1); numb < (int) Math.pow(10,k) - 1; numb++) {

            sumk = 0;
            sumcoun(numb);

            if(sumk == s) {
                System.out.println(numb + " = " + sumk);
                f = f+1;
            }
        }
        System.out.println("всего =  " + f);

    }

    public Recur(int k) {
        this.k = k;
        sumcoun(k);
        System.out.println("сумма цифр числа =  " + sumk);
    }

    public Recur(double k){ // номер 6
        int m = (int) k;
        natur(m,1);
        if(f <= 2){
            System.out.println("Yes");
        }
        else{
            System.out.println("NO");
        }
    }

    public Recur(int x, double y){
        for(int i = 1; i < x; i++){
            if(x%i == 0){
                f=0;
                natur(i,1);
                if(f <= 2){
                    System.out.println(i);
                }

            }
        }

    }

    public Recur(String x){ // номер 8
        polindrom( x,0, x.length() - 1);
    }

    public void sumcoun(int numb){
        if(numb != 0) {
            int b = numb;
            sumk = sumk + b % 10;
            b /= 10;
            sumcoun(b);
        }
    }

    public void natur(int n,int m ){

        if (m <= n) {
            if (n % m == 0) {
                f++;
            }
            natur(n, m + 1);
        }
    }

    public void polindrom(String x, int i, int j ){

        char[] slovo = x.toCharArray();
        if(i < j) {
            if (slovo[i] == slovo[j]) {
                polindrom(x, i+1, j-1);
            }
            else {
                System.out.println("NO");
            }
        }
        else{
            System.out.println("Yes");
        }

    }

    public static void main(String[] args){
        Recur obj = new Recur(3,3);
        Recur obj2 = new Recur(18);
        Recur obj3 = new Recur(13.0);
        Recur obj4 = new Recur(14, 1.0);
        Recur obj5 = new Recur("laffal");
    }



}
