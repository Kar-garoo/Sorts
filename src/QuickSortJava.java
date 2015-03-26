import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by sergioalejandrodiazpinilla on 24/03/15.
 */
public class QuickSortJava extends  SortMethod{

    public QuickSortJava(long instanceSize){
        Report r = new Report();
        r.setInstanceSize(instanceSize);
        this.setReport(r);
        this.setSortName("QuickSort Java");
    }

    public Object sortM(Object list){

        ArrayList<Integer>s = (ArrayList<Integer>)list;
        Integer [] A = s.toArray(new Integer[s.size()]);
        int izq = 0;
        int der = A.length-1;

        quicksort(A,izq,der);

        return null;
    }

    public  void quicksort(Integer A[], int izq, int der) {

        int pivote=A[izq]; // tomamos primer elemento como pivote
        int i=izq; // i realiza la búsqueda de izquierda a derecha
        int j=der; // j realiza la búsqueda de derecha a izquierda
        int aux;

        while(i<j){            // mientras no se crucen las búsquedas
            while(A[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
            while(A[j]>pivote) j--;         // busca elemento menor que pivote
            if (i<j) {                      // si no se han cruzado
                aux= A[i];                  // los intercambia
                A[i]=A[j];
                A[j]=aux;
                this.getReport().addComparisons(3);
            }
        }
        A[izq]=A[j]; // se coloca el pivote en su lugar de forma que tendremos
        A[j]=pivote; // los menores a su izquierda y los mayores a su derecha
        if(izq<j-1)
            quicksort(A,izq,j-1); // ordenamos subarray izquierdo
        if(j+1 <der)
            quicksort(A,j+1,der); // ordenamos subarray derecho
    }

}
