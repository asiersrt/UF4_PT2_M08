

import java.util.List;

public class llibreria {
    public static double calcularMitjana(List<Double> llista) {
        double suma = 0;
        for (double num : llista) {
            suma += num;
        }
        return suma / llista.size();
    }


    static class ResultatMitjana {
        double mitjana;

        public ResultatMitjana(double mitjana) {
            this.mitjana = mitjana;
        }
    }
}

