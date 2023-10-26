package eci.escuelaing.edu.co;

import java.util.ArrayList;
import java.util.List;

public class SecuenciaLucas {
    private static SecuenciaLucas instance;

    public static SecuenciaLucas getInstance() {
        if(instance==null){
            instance = new SecuenciaLucas();
        }
        return instance;
    }
    private static int funcionNumLucas(int num){
        if(num == 0){
            return 2;
        } else if (num == 1) {
            return 1;
        } else {
            return funcionNumLucas(num-1) + funcionNumLucas(num-2);
        }

    }

    public static List<Integer> enterNumber(String num){
        int cast = Integer.parseInt(num);
        List<Integer> secuence = new ArrayList<>();
        while (cast >= 0){
            int elemento = funcionNumLucas(cast);
            secuence.add(elemento);
            cast -= 1;
        }
        return secuence;
    }
}