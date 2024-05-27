
public class MUNDO_IMAGINARIO {
    public static void main(String[] args) {
        System.out.println("FUERZAS FRACCION A\n");

        int fraccionA = 1500, fraccionB = 1300;
        int FuerzasCombateA = 0, FuerzasCombateB = 0;
        int MuertosF1 = 30, HeridosdeGravedadF1 = 60, DesertoresF1 = 90;
        int MuertosF2 = 10, HeridosdeGravedadF2 = 60, DesertoresF2 = 30;
        int MuertosF3 = 2, HeridosdeGravedadF3 = 3, DesertoresF3 = 0;
        int BajasInfanteria = 0, BajasCabelleria = 0, BajasCaballeriaPesada = 0;

        BajasInfanteria = (MuertosF1 + HeridosdeGravedadF1 + DesertoresF1);// BAJAS DE INFANTERIA FRACCION A

        BajasCabelleria = (MuertosF2 + HeridosdeGravedadF2 + DesertoresF2);// BAJAS DE CABALLERIA FRACCION A

        BajasCaballeriaPesada = (MuertosF3 + HeridosdeGravedadF3 + DesertoresF3); // BAJAS DE CABALLERIA PESADA FRACCION
                                                                                  // A

        System.out.println("BAJAS EN LA FILA DE INFANTERIA : " + BajasInfanteria);
        System.out.println("BAJAS EN LA FILA DE CABALLERIA : " + BajasCabelleria);
        System.out.println("BAJAS EN LA FILA DE CABALLERIA PESADA : " + BajasCaballeriaPesada);
        int BajasFraccionA = BajasInfanteria + BajasCabelleria + BajasCaballeriaPesada;
        System.out.println("BAJAS FRACCION A: " + BajasFraccionA);
        FuerzasCombateA = fraccionA - BajasFraccionA;
        System.out.println("FUERZAS EN COMBATE FRACCION A : " + FuerzasCombateA);

        System.out.println("\nFUERZAS FRACCION B\n");

        int MuertosF1B = 50, HeridosdeGravedadF1B = 90, DesertoresF1B = 10;
        int MuertosF2B = 200, HeridosdeGravedadF2B = 180, DesertoresF2B = 20;
        int MuertosF3B = 10, HeridosdeGravedadF3B = 5, DesertoresF3B = 75;
        int BajasInfanteriaB = 0, BajasCabelleriaB = 0, BajasCaballeriaPesadaB = 0;

        BajasInfanteriaB = (MuertosF1B + HeridosdeGravedadF1B + DesertoresF1B);// BAJAS DE INFANTERIA FRACCION B

        BajasCabelleriaB = (MuertosF2B + HeridosdeGravedadF2B + DesertoresF2B);// BAJAS DE CABALLERIA FRACCION B

        BajasCaballeriaPesadaB = (MuertosF3B + HeridosdeGravedadF3B + DesertoresF3B); // BAJAS DE CABALLERIA PESADA
                                                                                      // FRACCION B

        System.out.println("BAJAS EN LA FILA DE INFANTERIA : " + BajasInfanteriaB);
        System.out.println("BAJAS EN LA FILA DE CABALLERIA : " + BajasCabelleriaB);
        System.out.println("BAJAS EN LA FILA DE CABALLERIA PESADA : " + BajasCaballeriaPesadaB);
        int BajasFraccionB = BajasInfanteriaB + BajasCabelleriaB + BajasCaballeriaPesadaB;
        System.out.println("BAJAS FRACCION B: " + BajasFraccionB);
        FuerzasCombateB = fraccionB - BajasFraccionB;
        System.out.println("FUERZAS EN COMBATE FRACCION B : " + FuerzasCombateB);
    }
}
