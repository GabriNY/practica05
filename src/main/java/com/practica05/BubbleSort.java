package com.practica05;
import java.util.List;

public class BubbleSort {
    public void bubbleSort(List<Integer> vet) {
        int n = vet.size();
        int aux;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (vet.get(j) > vet.get(j + 1)) {
                    aux = vet.get(j);
                    vet.set(j, vet.get(j + 1));
                    vet.set(j + 1, aux);
                }
            }
        }
    }
}