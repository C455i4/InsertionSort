/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miriam
 */
import java.util.Random;

public class InsertionSort {

    public static void main(String args[]) {
        int[] vet = new int[8000];
         geraVetor(vet);
        insertionSort(vet);
        mostraVetor(vet);

    }    


    public static int[] insertionSort(int[] v) {    

        for (int i = 1; i < v.length; i++) {
            
            int a = v[i];
            int j;
            
            for (j = i - 1; j >= 0 && v[j] > a; j--) {
                
                v[j + 1] = v[j];
                
            }
            v[j+1] = a;
            
        }
        return v;
    }

    public static void geraVetor(int vetor[]) {
        Random r = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = r.nextInt(9000);
        }
    }

    public static void mostraVetor(int vet[]) {
        System.out.printf("Vetor\n");
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("%d = %d\n", i + 1, vet[i]);
        }
    }
}
