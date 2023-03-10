public class Frazione {
    private int n;
    private int d;

    public Frazione() {

    }

    public String inserimento(int n, int d) {
        String s = "";
        if (n == 0) {
            if (d == 0) {
                s += "NON CALCOLABILE";
            } else {
                s += "PARI A 0";
            }
        } else if (d == 0) {
            s += "I M P O S S I B I L E";
        } else {
            if(d<0){
                n*=-1;
                d*=-1;
            }
            this.n = n;
            this.d = d;
            semplifica();
        }
        return s;
    }

    private int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    }

    public String tipo() {
        String s = "";
        if (n < d) {
            s += "propria";
        } else if (n % d == 0) {
            s += "apparente";
        } else {
            s += "inpropria";
        }
        return s;
    }

    public Frazione somma(Frazione f) {
        int dCom = d*f.getD();
        int nfin = n*f.getD()+f.getN()*d;
        Frazione ris = new Frazione();
        ris.inserimento(nfin, dCom);
        return ris;
    }

    public Frazione sottrazione(Frazione f) {
        int dCom = d*f.getD();
        int nfin = n*f.getD()-f.getN()*d;
        Frazione ris = new Frazione();
        ris.inserimento(nfin, dCom);
        return ris;
    }

    public Frazione moltiplica(Frazione f) {
        int nFin = n * f.getN();
        int dFin = d * f.getD();
        Frazione ris = new Frazione();
        ris.inserimento(nFin, dFin);
        return ris;
    }

    public Frazione dividi(Frazione f) {
        int nFin = d * f.getN();
        int dFin = n * f.getD();
        Frazione ris = new Frazione();
        ris.inserimento(nFin, dFin);
        return ris;
    }

    public void semplifica() {
        int tmp = mcd(n, d);
        n /= tmp;
        d /= tmp;
    }

    public Frazione reciproca(){
        Frazione ris = new Frazione();
        ris.inserimento(d, n);
        return ris;
    }

    public void inverti(){
        int tmp=n;
        n=d;
        d=tmp;
    }

    @Override
    public String toString() {
        double ris=(double)n/d;
        String s = n + "/" + d+" = "+ris;
        return s;
    }

    public int getN() {
        return n;
    }

    public int getD() {
        return d;
    }

}
