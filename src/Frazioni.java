import java.util.ArrayList;

public class Frazioni {
    private ArrayList<Frazione> f = new ArrayList<Frazione>();
    public Frazioni(){

    }
    public int dimensione(){
        return f.size();
    }
    public Frazione getFrazione(int pos){
        return f.get(pos);
    }
    public String addFrazione(Frazione fra){
        return addFrazione(fra.getN(), fra.getD());
    }
    public String addFrazione(int n, int d){
        Frazione tmp = new Frazione();
        String s=tmp.inserimento(n, d);
        if(s.length()==0){
            f.add(tmp);
        }
        return s;
    }
    @Override
    public String toString() {
        String s="";
        for (int i = 0; i < dimensione(); i++) {
                s+=i+" --> "+f.get(i).toString()+"\n";
        }
        return s;
    }
}
