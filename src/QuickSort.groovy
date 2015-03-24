/**
 * Created by sergioalejandrodiazpinilla on 24/03/15.
 */
class QuickSort extends SortMethod {

    QuickSort(long instanceSize){
        def repo = new Report()
        repo.instanceSize = instanceSize
        this.report = repo
        this.sortName = "Quick Sort Groovy"


    }
    def sortM(list){
        if(list.size()< 2) return list
        def pivot = list[0]
        def items = list.groupBy{ it <=> pivot}.withDefault{[]}
        sortM(items[-1])+items[0]+sortM(items[1])

    }
}
