/**
 * Created by Daniel Salazar
 */

class BubbleSort extends SortMethod {

    def sortM(a) {
        for(out in (a.size()-2)..1)
        {
            0.upto(out) { index ->
                if(a[index] > a[index+1]){
                    def temp = a[index]
                    a[index] = a[index + 1]
                    a[index + 1] = temp
                }

            }
        }
    }

}