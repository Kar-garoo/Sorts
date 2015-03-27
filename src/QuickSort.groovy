/**
 * Created by sergioalejandrodiazpinilla on 24/03/15.
 */
class QuickSort extends SortMethod {

    QuickSort(){
        super()
        this.sortName = "Quick Sort Groovy"


    }
    def sortM(list){
        report.instanceSize = list.size()
        qs(list)

    }

    def qs(list){
        if(list.size()< 2) return list
        def pivot = list[0]
        def items = list.groupBy{ it <=> pivot}.withDefault{[]}
        report.addComparisons(items[0].size()+items[1].size())
        qs(items[-1])+items[0]+qs(items[1])
    }
}
