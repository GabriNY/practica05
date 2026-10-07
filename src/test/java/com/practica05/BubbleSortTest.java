package com.practica05;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BubbleSortTest {
    private BubbleSort sorter;
    @BeforeEach
    void setUp() {
        sorter = new BubbleSort();
    }
    @AfterEach
    void tearDown() {
        sorter = null;
    }
    @Test
    void CP1_arregloVacio() {
        List<Integer> vet = new ArrayList<>();
        List<Integer> esperado = new ArrayList<>();
        sorter.bubbleSort(vet);
        assertEquals(esperado, vet);
    }
    @Test
    void CP2_arregloYaOrdenado() {
        List<Integer> vet = new ArrayList<>(List.of(1, 2));
        List<Integer> esperado = List.of(1, 2);
        sorter.bubbleSort(vet);
        assertEquals(esperado, vet);
    }
    @Test
    void CP3_arregloRequiereIntercambio() {
        List<Integer> vet = new ArrayList<>(List.of(2, 1));
        List<Integer> esperado = List.of(1, 2);
        sorter.bubbleSort(vet);
        assertEquals(esperado, vet);
    }
    @Test
    void CP4_variasIteraciones() {
        List<Integer> vet = new ArrayList<>(List.of(3, 1, 2));
        List<Integer> esperado = List.of(1, 2, 3);
        sorter.bubbleSort(vet);
        assertEquals(esperado, vet);
    }
}
