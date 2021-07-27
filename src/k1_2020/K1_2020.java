package k1_2020;
public class K1_2020 {
    public static void dekodiraj(String str) {
        String s1 = "";
        for (int i = 1; i <= 5; i++) {
            byte binaryByte = Byte.valueOf(Integer.toString(i));
            for (int j = 0; j < str.getBytes().length; j++) {
                int broj = str.getBytes()[j] ^ binaryByte;
                s1 += String.valueOf((char) (broj));
            }
            System.out.println(s1);
            s1 = "";
        }
    }

    public static void main(String[] args) {
        System.out.println("-> Rec PQF@ML dekodovati XOR maskama: 1,2,3,4 i 5, od novih 5 reci jedna je nasa");
        dekodiraj("PQF@ML");
        System.out.println("-> Koordinate 4 planete su redom: (0,0,0) (1,1,1) (2,2,2) (3,3,3), a 5. planete (4,3,2)");
        Planeta[] parr  = new Planeta[4];
        for(int i=0; i<parr.length; i++){
            parr[i] = new Planeta ("P",i,i,i);
            System.out.println(parr[i]);
        }
        Planeta petaplaneta = new Planeta("PP",4,3,2);
        int indeksnajblize = 0;
        double udaljenostmin = Double.MAX_VALUE;
        for(int i=0; i<parr.length; i++){
            if(petaplaneta.udaljenost(parr[i])<udaljenostmin){
                udaljenostmin=petaplaneta.udaljenost(parr[i]);
                indeksnajblize=i;
            }
        }
        System.out.println("    Petoj planeti je nabliza "+parr[indeksnajblize]);
        System.out.println("-> Brza  NIT dodaje #, dok SPORA nit uklanja # nizu ### (3 znaka #)");
        System.out.println("   Kraj je kada se dosegne ###### (6 znakova #)");
        Niz niz = new Niz();
        Nit dobra_nit = new Nit(200, niz); // 200ms pauze
        dobra_nit.setName("BRZA ");
        Nit losa_nit = new Nit(350, niz);  // 350ms pauze
        losa_nit.setName("SPORA");
        dobra_nit.start();
        losa_nit.start();
    }
}