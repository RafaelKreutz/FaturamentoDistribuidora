package org.google;

import java.util.List;

public class Func {

    public static double lowestIncome(List<Faturamento> income) {
        double low = Double.MAX_VALUE;
        for (int i = 0; i < income.size(); i++) {
            Faturamento f = income.get(i);
            if (f.valor > 0 && f.valor < low) {
                low = f.valor;
            }
        }
        return low;
    }

    public static double highestIncome(List<Faturamento> income) {
        double high = Double.MIN_VALUE;
        for (int i = 0; i < income.size(); i++) {
            Faturamento f = income.get(i);
            if (f.valor > 0 && f.valor > high) {
                high = f.valor;
            }
        }
        return high;
    }

    public static double averageIncome(List<Faturamento> income) {
        double somaValores = 0.0;
        int diasFaturamento = 0;
        for (int i = 0; i < income.size(); i++) {
            Faturamento f = income.get(i);
            if (f.valor > 0) {
                somaValores += f.valor;
                diasFaturamento++;
            }
        }
        return somaValores / diasFaturamento;
    }

    public static void moreThanAverageCount(List<Faturamento> income) {
        int cont = 0;
        for (int i = 0; i < income.size(); i++) {
            Faturamento f = income.get(i);
            if (f.valor > averageIncome(income)) {
                cont++;
            }
        }
        System.out.println("Número de dias que o faturamento foi acima da média: " + cont);
    }
}