/**
 * Created by Daniel Salazar
 */

class BubbleSort extends SortMethod {


    BubbleSort( ){
        def repo = new Report()
        repo.comparasons = 0
        this.report = repo
        this.sortName = "BubbleSort Groovy"
    }

    def sortM(a) {
        report.instanceSize = a.size()
        if(a.size()< 2) {
            return a
        }
        for(out in (a.size()-2)..0)
        {
            0.upto(out) { index ->
                if(a[index] > a[index+1]){

                    def temp = a[index]
                    a[index] = a[index + 1]
                    a[index + 1] = temp

                }
                report.addComparisons(1)
            }
        }
        return a
    }

}