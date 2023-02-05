import java.util.*;

class Main {
  public static void main(String[] args) {
    Frazioni f = new Frazioni();
    Scanner sc = new Scanner(System.in);
    boolean controllo = true;
    int scelta, in, pr, se, n, d;
    String prima="inserire la posizione della prima (tra 0 e " ;
    String seconda= "inserire la posizione della seconda (tra 0 e " ;
    String indice= "inserire l'indice (tra 0 e ", s;
    System.out.println("Prima di iniziare inserire la prima frazione \ninserire il numeratore");
          n = sc.nextInt();
          System.out.println("inserire il denominatore");
          d = sc.nextInt();
          System.out.print(f.addFrazione(n, d));
    do {
      System.out.println(
          "cosa vuoi fare? premi \n1 per inserire un nuovo, \n2 per la somma, \n3 per la sottrazione, \n4 per la moltiplicazione, \n5 per la divisione, \n6 per stamparne uno, \n7 per la reciproca, \n8 per l'inverti, \n9 per dire il tipo della frazione, \n10 stampa tutte, \nse vuoi uscire digita qualsiasi altro numero");
      scelta = sc.nextInt();
      switch (scelta) {
        case 1:
          System.out.println("inserire il numeratore");
          n = sc.nextInt();
          System.out.println("inserire il denominatore");
          d = sc.nextInt();
          System.out.print(f.addFrazione(n, d));
          break;
        case 2:
          System.out.println(prima+ (f.dimensione()-1) + ")");
          pr = sc.nextInt();
          System.out.println(seconda+ (f.dimensione()-1) + ")");
          se = sc.nextInt();
          System.out.print( f.addFrazione(f.getFrazione(pr).somma(f.getFrazione(se))));
          System.out.println("la somma fra " + f.getFrazione(pr).getN() + " / " + f.getFrazione(pr).getD() + " + " + f.getFrazione(se).getN()
              + " / " + f.getFrazione(se).getD() + " = " +f.getFrazione(f.dimensione()-1));
          break;
        case 3:
          System.out.println(prima+ (f.dimensione()-1) + ")");
          pr = sc.nextInt();
          System.out.println(seconda+ (f.dimensione()-1) + ")");
          se = sc.nextInt();
          s=f.addFrazione(f.getFrazione(pr).sottrazione(f.getFrazione(se)));
          if(s.length()==0){
          System.out.println("la sottrazione fra " + f.getFrazione(pr).getN() + " / " + f.getFrazione(pr).getD() + " - " + f.getFrazione(se).getN()
              + " / " + f.getFrazione(se).getD() + " = " +f.getFrazione(f.dimensione()-1));
          }else{
            System.out.println("il risultato è"+s);
          }
          break;
        case 4:
          System.out.println(prima+ (f.dimensione()-1) + ")");
          pr = sc.nextInt();
          System.out.println(seconda+ (f.dimensione()-1) + ")");
          se = sc.nextInt();
          System.out.print(f.addFrazione(f.getFrazione(pr).moltiplica(f.getFrazione(se))));
          System.out.println("la moltiplicazione fra " + f.getFrazione(pr).getN() + " / " + f.getFrazione(pr).getD() + " * " + f.getFrazione(se).getN()
              + " / " + f.getFrazione(se).getD() + " = " +f.getFrazione(f.dimensione()-1));
          break;
        case 5:
          System.out.println(prima+ (f.dimensione()-1) + ")");
          pr = sc.nextInt();
          System.out.println(seconda+ (f.dimensione()-1) + ")");
          se = sc.nextInt();
          System.out.print(f.addFrazione(f.getFrazione(pr).dividi(f.getFrazione(se))));
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
        System.out.print(f.addFrazione(f.getFrazione(in).reciproca()));
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
        break;
        default:
          controllo = false;
          break;
      }
    } while (controllo);

    sc.close();
  }
}