import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    ArrayList<Frazione> f = new ArrayList<Frazione>();
    Frazione tmp = new Frazione();
    String s;
    Scanner sc = new Scanner(System.in);
    boolean controllo = true;
    int scelta, in, pr, se;
    do {
      System.out.println(
          "cosa vuoi fare? premi 1 per inserire un nuovo, 2 per la somma, 3 per la sottrazione, 4 per la moltiplicazione, 5 per la divisione, 6 per stamparne uno, 7 per la reciproca, 8 per l'inverti, 9 per dire il tipo della frazione");
      scelta = sc.nextInt();
      switch (scelta) {
        case 1:
        tmp = new Frazione();
          System.out.println("inserire il numeratore");
          int n = sc.nextInt();
          System.out.println("inserire il denominatore");
          int d = sc.nextInt();
          s = tmp.inserimento(n, d);
          if (s.length() == 0) {
            f.add(tmp);
          } else {
            System.out.println(s);
          }
          break;
        case 2:
          System.out.println("inserire la posizione della prima (tra 0 e " + (f.size()-1) + ")");
          pr = sc.nextInt();
          System.out.println("inserire la posizione della seconda (tra 0 e " + (f.size()-1) + ")");
          se = sc.nextInt();
          f.add(f.get(pr).somma(f.get(se)));
          System.out.println("la somma fra " + f.get(pr).getN() + " / " + f.get(pr).getD() + " + " + f.get(se).getN()
              + " / " + f.get(se).getD() + " = " +f.get(f.size()-1));
          break;
        case 3:
          System.out.println("inserire la posizione della prima (tra 0 e " + (f.size()-1) + ")");
          pr = sc.nextInt();
          System.out.println("inserire la posizione della seconda (tra 0 e " + (f.size()-1) + ")");
          se = sc.nextInt();
          f.add(f.get(pr).sottrazione(f.get(se)));
          System.out.println("la sottrazione fra " + f.get(pr).getN() + " / " + f.get(pr).getD() + " - " + f.get(se).getN()
              + " / " + f.get(se).getD() + " = " +f.get(f.size()-1));
          break;
        case 4:
          System.out.println("inserire la posizione della prima (tra 0 e " + (f.size()-1) + ")");
          pr = sc.nextInt();
          System.out.println("inserire la posizione della seconda (tra 0 e " + (f.size()-1) + ")");
          se = sc.nextInt();
          f.add(f.get(pr).moltiplica(f.get(se)));
          System.out.println("la moltiplicazione fra " + f.get(pr).getN() + " / " + f.get(pr).getD() + " * " + f.get(se).getN()
              + " / " + f.get(se).getD() + " = " +f.get(f.size()-1));
          break;
        case 5:
          System.out.println("inserire la posizione della prima (tra 0 e " + (f.size()-1) + ")");
          pr = sc.nextInt();
          System.out.println("inserire la posizione della seconda (tra 0 e " + (f.size()-1) + ")");
          se = sc.nextInt();
          f.add(f.get(pr).dividi(f.get(se)));
          System.out.println("la divisione fra " + f.get(pr).getN() + " / " + f.get(pr).getD() + " / " + f.get(se).getN()
              + " / " + f.get(se).getD() + " = " +f.get(f.size()-1));
          break;
        case 6:
          System.out.println("inserire l'indice (tra 0 e " + (f.size()-1) + ")");
          in = sc.nextInt();
          System.out.println(f.get(in).toString());
          break;
        case 7:
        System.out.println("inserire l'indice (tra 0 e " + (f.size()-1) + ")");
        in = sc.nextInt();
        f.add(f.get(in).reciproca());
        System.out.println(f.get(f.size()-1).toString());
        break;
        case 8:
        System.out.println("inserire l'indice (tra 0 e " + (f.size()-1) + ")");
        in = sc.nextInt();
        f.get(in).inverti();
        System.out.println(f.get(in).toString());
        break;
        case 9:
        System.out.println("inserire l'indice (tra 0 e " + (f.size()-1) + ")");
        in = sc.nextInt();
        System.out.println("La frazione n°"+in+" è "+f.get(in).tipo());
        break;
        default:
          controllo = false;
          break;
      }
    } while (controllo);

    sc.close();

    /*
     * Frazione f2 = new Frazione();
     * System.out.println("Seconda frazione\ninserire il numeratore");
     * int n1 = sc.nextInt();
     * System.out.println("inserire il denominatore");
     * int d1 = sc.nextInt();
     * System.out.println(f2.inserimento(n1, d1));
     * System.out.println("la somma fra "+f.getN()+" / "+f.getD()+" + "+f2.getN()
     * +" / "+f2.getD()+" = "+f.somma(f2).toString());
     * System.out.println("la sottrazione fra "+f.getN()+" / "+f.getD()+" - "+f2.
     * getN()+" / "+f2.getD()+" = "+f.sottrazione(f2).toString());
     * System.out.println("la moltiplicazione fra "+f.getN()+" / "+f.getD()+" * "+f2
     * .getN()+" / "+f2.getD()+" = "+f.moltiplica(f2).toString());
     * System.out.println("la divisione fra "+f.getN()+" / "+f.getD()+" / "+f2.getN(
     * )+" / "+f2.getD()+" = "+f.dividi(f2).toString());
     * System.out.println("La frazione f è "+f.tipo());
     * System.out.println("La frazione f2 è "+f2.tipo());
     * boolean controllo=true;
     */
  }
}