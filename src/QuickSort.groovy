/**
 * Created by sergioalejandrodiazpinilla on 24/03/15.
 */
class QuickSort extends SortMethod {



    def sortM(list){
        if(list.size()< 2) return list
        def pivot = list[0]
        def items = list.groupBy{ it <=> pivot}.withDefault{[]}
        sortM(items[-1])+items[0]+sortM(items[1])
    }

    def timeSort(){
        long start = System.currentTimeMillis()
        def l = report.generateList()
        //println (l)
        sortM(l)
        //println(l)
        def end = System.currentTimeMillis()
        return (end - start)/1000

    }

    static main(args){
        def re = new Report()
        re.instanceSize = 100000
        def s = new QuickSort()
        s.sortName = "Quick Sort"
        s.report = re
        println(s.timeSort())
        //println(s.report.time = (double)timeSort())
    }
}
