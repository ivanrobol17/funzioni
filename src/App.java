import java.io.*;
import java.util.*;


class Main {
  public static void main(String[] args) {
    Frazione f = new Frazione();
    Scanner sc = new Scanner(System.in);
    System.out.println("Prima frazione\ninserire il numeratore");
    int n = sc.nextInt();
    System.out.println("inserire il denominatore");
    int d = sc.nextInt();
    System.out.println(f.inserimento(n, d));

    Frazione f2 = new Frazione();
    System.out.println("Seconda frazione\ninserire il numeratore");
    int n1 = sc.nextInt();
    System.out.println("inserire il denominatore");
    int d1 = sc.nextInt();
    System.out.println(f2.inserimento(n1, d1));
    System.out.println("la somma fra "+f.getN()+" / "+f.getD()+" + "+f2.getN()+" / "+f2.getD()+" = "+f.somma(f2).toString());
    System.out.println("la sottrazione fra "+f.getN()+" / "+f.getD()+" - "+f2.getN()+" / "+f2.getD()+" = "+f.sottrazione(f2).toString());
    System.out.println("la moltiplicazione fra "+f.getN()+" / "+f.getD()+" * "+f2.getN()+" / "+f2.getD()+" = "+f.moltiplica(f2).toString());
    System.out.println("la divisione fra "+f.getN()+" / "+f.getD()+" / "+f2.getN()+" / "+f2.getD()+" = "+f.dividi(f2).toString());
    System.out.println("La frazione f è "+f.tipo());
    System.out.println("La frazione f2 è "+f2.tipo());
    boolean controllo=true;
  }
}