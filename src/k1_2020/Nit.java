package k1_2020;

public class Nit extends Thread{
    long ms;
    Niz niz;

    public Nit(long ms, Niz niz) {
        this.ms = ms;
        this.niz = niz;
    }

    public void run(){
        while(!niz.vrati()){
            if (Thread.currentThread().getName().equals("BRZA ")){
                niz.uvecaj();
                try {
                    Thread.sleep(ms);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else{
                niz.smanji();
                try {
                    Thread.sleep(ms);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
