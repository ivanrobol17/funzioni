public class Frazione {
    private int n;
    private int d;

    public Frazione() {

    }

    public String inserimento(int n) {
        String s = "";
        if (n == 0) {
            s += "LA FRAZIONE E' PARI A 0 e per questo non verrà aggiunta nella memoria";
        } else {
            this.n = n;
            this.d = 1;
            semplifica();
        }
        return s;
    }

    public String inserimento(int n, int d) {
        String s = "";
        if (n == 0) {
            if (d == 0) {
                s += "LA FRAZIONE NON E' CALCOLABILE e per questo non verrà aggiunta nella memoria";
            } else {
                s += "LA FRAZIONE E' PARI A 0 e per questo non verrà aggiunta nella memoria";
            }
        } else if (d == 0) {
            s += "LA FRAZIONE E' I M P O S S I B I L E e per questo non verrà aggiunta nella memoria";
        } else {
            if (d < 0) {
                n *= -1;
                d *= -1;
            }
            this.n = n;
            this.d = d;
            semplifica();
        }
        return s;
    }

    public String inserimento(String data) {
        int pos = data.indexOf("/");
        String[] tmp = data.split(data, pos);
        String s = "";
        int n = Integer.parseInt(tmp[0]);
        int d = Integer.parseInt(tmp[1]);
        if (n == 0) {
            if (d == 0) {
                s += "LA FRAZIONE NON E' CALCOLABILE e per questo non verrà aggiunta nella memoria";
            } else {
                s += "LA FRAZIONE E' PARI A 0 e per questo non verrà aggiunta nella memoria";
            }
        } else if (d == 0) {
            s += "LA FRAZIONE E' I M P O S S I B I L E e per questo non verrà aggiunta nella memoria";
        } else {
            if (d < 0) {
                n *= -1;
                d *= -1;
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
        int dCom = d * f.getD();
        int nfin = n * f.getD() + f.getN() * d;
        Frazione ris = new Frazione();
        ris.inserimento(nfin, dCom);
        return ris;
    }

    public Frazione sottrazione(Frazione f) {
        int dCom = d * f.getD();
        int nfin = n * f.getD() - f.getN() * d;
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

    public Frazione reciproca() {
        Frazione ris = new Frazione();
        ris.inserimento(d, n);
        return ris;
    }

    public void inverti() {
        int tmp = n;
        n = d;
        d = tmp;
    }

    @Override
    public String toString() {
        double ris;
        String s;
        if (d != 1) {
            ris = (double) n / d;
            s = n + "/" + d + " = " + ris;
        } else {
            s = n + "";
        }
        return s;
    }

    public int getN() {
        return n;
    }

    public int getD() {
        return d;
    }

}
