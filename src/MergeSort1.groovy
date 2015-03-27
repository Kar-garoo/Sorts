/**
 * Created by JuKa on 26/03/2015.
 */
class MergeSort1 extends SortMethod {
    MergeSort1(){
        super()
        this.sortName = "Merge Sort Groovy"
    }

    def sortM(list){
        return sort(list, 0, list.size() - 1)
    }

    def sort(data, start, end) {

        if (end > start) {

            int middle = (int) ((start + end) / 2);

            // Sort the left and right sides separately.
            sort(data, start, middle);
            sort(data, middle + 1, end);

            // Intertwine the data into one sorted list.
            mergeLists(data, start, middle, end);

        }
        return data

    }

    def mergeLists(data, start, middle, end) {

        // Copy the left and right arrays because we'll be overwriting them.
        def left = data[start..(middle)]
        def right = data[(middle+1)..(end)]

        // Now, merge the lists by repeatedly adding the biggest value, from whichever list has it.
        def i = start, l = 0, r = 0; // l and r are indexes in left and right
        while (l < left.size() && r < right.size())
            data[i++] = (left[l] <= right[r]) ? left[l++] : right[r++]

        // Add any leftovers on one side.
        while (l < left.size())
            data[i++] = left[l++];
        while (r < right.size())
            data[i++] = right[r++];
    }



}