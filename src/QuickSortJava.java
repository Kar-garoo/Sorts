/**
 * Created by Kar-garoo:

 *Jose Daniel Salazar Mora
 *Sergio Alejandro Diaz Pinilla
 *Julian Camilo Mendez Corredor
 *Miguel Andres Torres Chavarro
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class QuickSortJava extends  SortMethod{

    public QuickSortJava(){
        super();
        this.setSortName("QuickSort Java");
    }

    public Object sortM(Object list){
        ArrayList<Integer>s = (ArrayList<Integer>)list;
        Integer [] A = s.toArray(new Integer[s.size()]);
        this.getReport().setInstanceSize(A.length);

        if(A.length<2){
            s = new ArrayList<Integer>(Arrays.asList(A));
            return s;
        }else {

            int izq = 0;
            int der = A.length - 1;

            quicksort(A, izq, der);

            s = new ArrayList<Integer>(Arrays.asList(A));

            return s;
        }
    }

    public  void quicksort(Integer A[], int izq, int der) {

        int pivote = A[izq];
        int i=izq;
        int j=der;
        int aux;

        while(i<j){
            while(A[i]<=pivote && i<j) i++;

            this.getReport().addComparisons(1);
            while(A[j]>pivote) j--;
            this.getReport().addComparisons(1);
            if (i<j) {
                aux= A[i];
                A[i]=A[j];
                A[j]=aux;

            }
        }
        A[izq]=A[j];
        A[j]=pivote;
        if(izq<j-1)
            quicksort(A,izq,j-1);
        if(j+1 <der)
            quicksort(A,j+1,der);
    }

}
