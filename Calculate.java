import com.engeto.PocetniOperace;

public class Calculate {

    public static void main(String[] args) {
        int x = 10;
        int y = 2;

        PocetniOperace calcul = PocetniOperace.DELENI;

        if(calcul == calcul.SCITANI){
            int vysledek = x+y;
            System.out.println("Soucet: " + x +" + "+ y +" = "+vysledek);
        } else if(calcul == calcul.ODCITANI){
            int vysledek = x-y;
            System.out.println("Odecet: " + x +" - "+ y +" = "+vysledek);
        } else if(calcul == calcul.NASOBENI){
            int vysledek = x*y;
            System.out.println("Nasobeni: " + x +" * "+ y +" = "+vysledek);
        } else if(calcul == calcul.DELENI){
            int vysledek = x/y;
            System.out.println("Deleni: " + x +" / "+ y +" = "+vysledek);
        }


    }

}


