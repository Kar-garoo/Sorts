import java.util.ArrayList;


public class MergeSortJava extends SortMethod {

    public Object sortM(Object list){
        ArrayList<Integer>s = (ArrayList<Integer>)list;
        System.out.println(s.toString());
        merge_sort(s);
        return null;
    }


    public MergeSortJava(long instanceSize){
        Report r = new Report();
        r.setInstanceSize(instanceSize);
        this.setReport(r);
        this.setSortName("MergeSort Java");
    }

    public static void merge(ArrayList <Integer> A, int p, int q, int r){
        int i = 0, j = 0;
        int inf = Integer.MAX_VALUE;
        ArrayList <Integer> L =  new  ArrayList <Integer> (A.subList(p, q + 1));
        L.add(inf);
        ArrayList <Integer> R =  new  ArrayList <Integer> (A.subList(q + 1, r + 1));
        R.add(inf);
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

    public static void merge_sort_main(ArrayList <Integer> A, int p, int r){
        int q;
        if (p < r){
            q = (p+r)/2;
            merge_sort_main(A, p, q);
            merge_sort_main(A, q+1, r);
            merge( A, p, q, r );

        }

    }
    public static void merge_sort(ArrayList <Integer> A){
        merge_sort_main(A, 0, A.size()-1);
    }


}
