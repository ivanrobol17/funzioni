public class Frazione {
    private int n;
    private int d;

    public Frazione() {

    }

    public String inserimento(int n, int d) {
        String s = "";
        if (n == 0) {
            if (d == 0) {
                s += "";
            } else {
                s += "";
            }
        } else if (d == 0) {
            s += "";
        } else {
            this.n = n;
            this.d = d;
        }
        return s;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    }

    public int mcm(int a, int b) {
        return (a * b) / mcd(a, b);
    }

    public String tipo() {
        String s = "";
        if (n > d) {
            s += "propria";
        } else if (n % d == 0) {
            s += "apparente";
        } else {
            s += "inpropria";
        }
        return s;
    }

    public Frazione somma(int n, int d) {
        int dCom = d*this.d;
        int nfin = n*this.d+this.n*d;
        Frazione ris = new Frazione();
        ris.inserimento(nfin, dCom);
        return ris;
    }

    public Frazione sottrazione(int n, int d) {
        int dCom = d*this.d;
        int nfin = n*this.d-this.n*d;
        Frazione ris = new Frazione();
        ris.inserimento(nfin, dCom);
        return ris;
    }

    public Frazione moltiplica(int n, int d) {
        int nFin = n * this.n;
        int dFin = d * this.d;
        Frazione ris = new Frazione();
        ris.inserimento(nFin, dFin);
        return ris;
    }

    public Frazione dividi(int n, int d) {
        int nFin = d * this.n;
        int dFin = n * this.d;
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
        String s = n + "/" + d;
        return super.toString();
    }

}
