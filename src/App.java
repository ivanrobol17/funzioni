import java.io.*;
import java.util.*;


class Main {
  public static void main(String[] args) {
    Frazione f = new Frazione();
    Scanner sc = new Scanner(System.in);
    System.out.println("inserire il numeratore");
    int n = sc.nextInt();
    System.out.println("inserire il denominatore");
    int d = sc.nextInt();
    System.out.println(f.inserimento(n, d));
    System.out.println("La frazione è "+f.tipo());
    boolean controllo=true;
    while(controllo){
        System.out.println();
    }
  }
}