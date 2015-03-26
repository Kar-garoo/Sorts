/**
 * Created by sergioalejandrodiazpinilla on 24/03/15.
 */
class Runner {

    static main(args){

        def r = new Runner()
        def sorts = []

        def bubbleSort = new BubbleSort(100)
        sorts << bubbleSort
        def quickSort = new QuickSort(100000)
        sorts << quickSort
        def quickSortJava = new QuickSortJava(100000)
        sorts << quickSortJava
        def mergeSort = new MergeSort(100000)
        sorts << mergeSort
        def mergeSortJava = new MergeSortJava(100000)
        sorts << mergeSortJava
        def heapSort = new HeapSort(100000)
        sorts << heapSort

        def all = r.generateList(100000)
        def temp
        def bubble = r.generateList(100)
        //println(all)
        def i = 0
        sorts.each {
            temp = all;
            if(i != 0) {
                r.timeSort(it, temp)
                r.printReport(it)
            }else{
                r.timeSort(it, bubble)
                r.printReport(it)
            }
            i++

        }

    }

    def timeSort(SortMethod method,l){
        //println (l)
        long start = System.currentTimeMillis()

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
        return (Object)randomIntegerList
    }

    def printReport(SortMethod method){
        println(method.sortName)
        println(method.report.report())
    }
}
