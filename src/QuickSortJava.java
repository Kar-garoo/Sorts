import java.util.ArrayList;

public class QuickSortJava extends  SortMethod{

    public QuickSortJava(){
        Report r = new Report();
        r.setComparasons(0);
        this.setReport(r);
        this.setSortName("QuickSort Java");
    }

    public Object sortM(Object list){
        ArrayList<Integer>s = (ArrayList<Integer>)list;
        Integer [] A = s.toArray(new Integer[s.size()]);
        this.getReport().setInstanceSize(A.length);
        int izq = 0;
        int der = A.length-1;

        quicksort(A, izq, der);

        return null;
    }

    public  void quicksort(Integer A[], int izq, int der) {

        int pivote=A[izq];
        int i=izq;
        int j=der;
        int aux;

        while(i<j){
            while(A[i]<=pivote && i<j) i++;
            while(A[j]>pivote) j--;
            if (i<j) {
                aux= A[i];
                A[i]=A[j];
                A[j]=aux;
                this.getReport().addComparisons(1);
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
