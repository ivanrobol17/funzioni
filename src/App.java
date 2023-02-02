import java.util.*;

class Main {
  public static void main(String[] args) {
    Frazioni f = new Frazioni();
    Frazione tmp = new Frazione();
    String s;
    Scanner sc = new Scanner(System.in);
    boolean controllo = true;
    int scelta, in, pr, se;
    String prima="inserire la posizione della prima (tra 0 e " ;
    String seconda= "inserire la posizione della seconda (tra 0 e " ;
    String indice= "inserire l'indice (tra 0 e ";
    do {
      System.out.println(
          "cosa vuoi fare? premi 1 per inserire un nuovo, 2 per la somma, 3 per la sottrazione, 4 per la moltiplicazione, 5 per la divisione, 6 per stamparne uno, 7 per la reciproca, 8 per l'inverti, 9 per dire il tipo della frazione, 10 stampa tutte");
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
            f.addFrazione(tmp);
          } else {
            System.out.println(s);
          }
          break;
        case 2:
          System.out.println(prima+ (f.dimensione()-1) + ")");
          pr = sc.nextInt();
          System.out.println(seconda+ (f.dimensione()-1) + ")");
          se = sc.nextInt();
          f.addFrazione(f.getFrazione(pr).somma(f.getFrazione(se)));
          System.out.println("la somma fra " + f.getFrazione(pr).getN() + " / " + f.getFrazione(pr).getD() + " + " + f.getFrazione(se).getN()
              + " / " + f.getFrazione(se).getD() + " = " +f.getFrazione(f.dimensione()-1));
          break;
        case 3:
          System.out.println(prima+ (f.dimensione()-1) + ")");
          pr = sc.nextInt();
          System.out.println(seconda+ (f.dimensione()-1) + ")");
          se = sc.nextInt();
          f.addFrazione(f.getFrazione(pr).sottrazione(f.getFrazione(se)));
          System.out.println("la sottrazione fra " + f.getFrazione(pr).getN() + " / " + f.getFrazione(pr).getD() + " - " + f.getFrazione(se).getN()
              + " / " + f.getFrazione(se).getD() + " = " +f.getFrazione(f.dimensione()-1));
          break;
        case 4:
          System.out.println(prima+ (f.dimensione()-1) + ")");
          pr = sc.nextInt();
          System.out.println(seconda+ (f.dimensione()-1) + ")");
          se = sc.nextInt();
          f.addFrazione(f.getFrazione(pr).moltiplica(f.getFrazione(se)));
          System.out.println("la moltiplicazione fra " + f.getFrazione(pr).getN() + " / " + f.getFrazione(pr).getD() + " * " + f.getFrazione(se).getN()
              + " / " + f.getFrazione(se).getD() + " = " +f.getFrazione(f.dimensione()-1));
          break;
        case 5:
          System.out.println(prima+ (f.dimensione()-1) + ")");
          pr = sc.nextInt();
          System.out.println(seconda+ (f.dimensione()-1) + ")");
          se = sc.nextInt();
          f.addFrazione(f.getFrazione(pr).dividi(f.getFrazione(se)));
          System.out.println("la divisione fra " + f.getFrazione(pr).getN() + " / " + f.getFrazione(pr).getD() + " / " + f.getFrazione(se).getN()
              + " / " + f.getFrazione(se).getD() + " = " +f.getFrazione(f.dimensione()-1));
          break;
        case 6:
          System.out.println(indice+ (f.dimensione()-1) + ")");
          in = sc.nextInt();
          System.out.println(f.getFrazione(in).toString());
          break;
        case 7:
        System.out.println(indice+ (f.dimensione()-1) + ")");
        in = sc.nextInt();
        f.addFrazione(f.getFrazione(in).reciproca());
        System.out.println(f.getFrazione(f.dimensione()-1).toString());
        break;
        case 8:
        System.out.println(indice+ (f.dimensione()-1) + ")");
        in = sc.nextInt();
        f.getFrazione(in).inverti();
        System.out.println(f.getFrazione(in).toString());
        break;
        case 9:
        System.out.println(indice+ (f.dimensione()-1) + ")");
        in = sc.nextInt();
        System.out.println("La frazione n°"+in+" è "+f.getFrazione(in).tipo());
        break;
        case 10: 
        System.out.println(f.toString());
        default:
          controllo = false;
          break;
      }
    } while (controllo);

    sc.close();
  }
}