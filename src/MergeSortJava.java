import java.util.ArrayList;
import java.util.Arrays;


public class MergeSortJava extends SortMethod {

    public MergeSortJava(){
        super();
        this.setSortName("MergeSort Java");
    }

    public Object sortM(Object list){
        ArrayList<Integer> s = (ArrayList<Integer>)list;
        Integer [] A = s.toArray(new Integer[s.size()]);
        this.getReport().setInstanceSize(A.length);
        mergeSort(A);
        s = new ArrayList<Integer>(Arrays.asList(A));

        return s;
    }

    public Integer[] mergeSort(Integer array[])

    {

        if(array.length > 1)
        {

            int elementsInA1 = array.length / 2;
            int elementsInA2 = array.length - elementsInA1;
            Integer arr1[] = new Integer[elementsInA1];
            Integer arr2[] = new Integer[elementsInA2];
            for(int i = 0; i < elementsInA1; i++)
                arr1[i] = array[i];

            for(int i = elementsInA1; i < elementsInA1 + elementsInA2; i++)
                arr2[i - elementsInA1] = array[i];

            arr1 = mergeSort(arr1);
            arr2 = mergeSort(arr2);

            int i = 0, j = 0, k = 0;
            while(arr1.length != j && arr2.length != k)
            {
                this.getReport().addComparisons(1);
                if(arr1[j] < arr2[k])
                {
                    array[i] = arr1[j];
                    i++;
                    j++;
                }

                else
                {
                    array[i] = arr2[k];
                    i++;
                    k++;
                }
            }

            while(arr1.length != j)
            {
                array[i] = arr1[j];
                i++;
                j++;
            }
            while(arr2.length != k)
            {
                array[i] = arr2[k];
                i++;
                k++;
            }
        }
        return array;
    }

}
