/**
 * Created by sergioalejandrodiazpinilla on 24/03/15.
 */
class Runner {

    static main(args){

        def r = new Runner()
        def sorts = []

        def bubbleSort = new BubbleSort(10000)
        sorts << bubbleSort
        def quickSort = new QuickSort(100000)
        sorts << quickSort
        //def mergeSort = new MergeSort(100000)
        //sorts << mergeSort
        //def heapSort = new HeapSort(100000)
        //sorts << heapSort

        sorts.each {
            r.timeSort(it)
            r.printReport(it)
        }


    }

    def timeSort(SortMethod method){
        long start = System.currentTimeMillis()
        def l = generateList(method.report.instanceSize)
        //println (l)
        method.sortM(l)
        //println(l)
        def end = System.currentTimeMillis()
        method.report.time = (end - start)/1000

    }

    def generateList(instanceSize){
        def rand = new Random()
        def randomIntegerList = []
        (1..instanceSize).each {
            randomIntegerList << rand.nextInt((int)instanceSize+1)
        }
        return randomIntegerList
    }

    def printReport(SortMethod method){
        println(method.sortName)
        println(method.report.report())
    }
}
