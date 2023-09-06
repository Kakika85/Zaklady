package cz.devforce.zaklady;

public class Cykly {
    public static void main(String[] args) {

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        //vypisCiselZMain(10);

        /**
        metoda "vypisCiselZMain" se dá překonfigurovat do metody "vypisCiselZMain2" jelikož obě vykonávají stejnou funkci
        */
        vypisCiselZMain2(1, 10,1);

        vypisCiselZMain2(21, 30, 1);
    }

   /*
   public static void vypisCiselZMain(int maximalniHodnota) {
      for (int i = 1; i <= maximalniHodnota; i++) {
         System.out.println(i);
      }
   }
   */

    public static void vypisCiselZMain2(int pocatecniHodnota, int maximalniHodnota, int posunHodnoty) {
        for (int i = pocatecniHodnota; i <= maximalniHodnota; i = i + posunHodnoty) {
            System.out.println(i);
        }
    }
}
