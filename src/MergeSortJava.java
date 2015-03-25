import java.util.ArrayList;
import java.util.Objects;

public class MergeSortJava extends SortMethod {

    public Object sortM(Object list){
        return null;
    }

    public static void merge(ArrayList A, int p, int q, int r){
        int i = 0, j = 0;
        ArrayList  L = (ArrayList) A.subList(p, q+1);
        ArrayList  R = (ArrayList) A.subList(q+1, q+1);

        for (int k = p; k < r+1 ; k++) {
            if( L.get(i) <= R.get(j) ){
                A.remove(k);
                A.add(k, L.get(i));
                i++;
            }else{
                A.remove(k);
                A.add(k, R.get(j));
                j++;
            }
        }
    }

    public static void merge_sort_main(ArrayList A, int p, int r){
        int q;
        if (p < r){
            q = (p+r)/2;
            merge_sort_main(A, p, q);
            merge_sort_main(A, q+1, r);
            merge( A, p, q, r );
        }

    }
    public static void merge_sort(ArrayList A){
        merge_sort_main(A, 0, A.size()-1);
    }


    public static void main(String[] args) {
        ArrayList B = new ArrayList();
        B.add(0, 2);
        B.add(0, 1);
        B.add(0, 7);
        B.add(0, 6);
        B.add(0, 5);
        B.add(0, 10);
        B.add(0, 9);
        B.add(0, 8);
        B.add(0, 4);
        B.add(0, 3);


        merge_sort(B);
        System.out.println(B);
    }
}
