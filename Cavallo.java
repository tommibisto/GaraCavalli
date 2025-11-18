public class Cavallo {
    private String nome;
    private int distanzaPercorsa;
    private boolean azzoppato;

    public Cavallo(String nome) {
        this.nome = nome;
        this.distanzaPercorsa = 0;
        this.azzoppato = false;
    }

    public void corri(int passo) {
        if (!azzoppato) distanzaPercorsa += passo;
    }

    public String getNome() {
        return nome;
    }
    /**
    *return restituisce il nome
    */

    public int getDistanzaPercorsa() {
        return distanzaPercorsa;
    }
    /**
    *return restituisce la distanza percorsa dal cavallo
    */

    public boolean isAzzoppato() {
        return azzoppato;
    }
    /**
    *return restituisce se il cavallo si è azzoppato
    */

    public void setAzzoppato(boolean azzoppato) {
        this.azzoppato = azzoppato;
    }
}

