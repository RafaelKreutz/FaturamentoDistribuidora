package org.google;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

class Faturamento{
    int dia;
    double valor;
}
public class Menu {
    public static void menu() {
        try {
            Scanner sc = new Scanner(System.in);

            Gson gson = new Gson();
            FileReader reader = new FileReader("faturamento.json");
            Type listType = new TypeToken<ArrayList<Faturamento>>() {
            }.getType();
            List<Faturamento> faturamentos = gson.fromJson(reader, listType);


            boolean func = true;
            while (func) {

                System.out.println("Escolha a opção: \n 1 - Faturamento Mais Alto: \n 2 - Faturamento mais baixo: \n 3 - Faturamentos acima da média mensal: \n Qualquer outro número para sair.");
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        System.out.println(Func.highestIncome(faturamentos));
                        break;
                    case 2:
                        System.out.println(Func.lowestIncome(faturamentos));
                        break;
                    case 3:
                        Func.moreThanAverageCount(faturamentos);
                        break;
                    default:
                        func = false;

                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
