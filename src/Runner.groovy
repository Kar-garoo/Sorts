/**
 * Created by sergioalejandrodiazpinilla on 24/03/15.
 */
class Runner {

    static main(args){

        def r = new Runner()
        def sorts = []

        def bubbleSort = new BubbleSort()
        sorts << bubbleSort
        def quickSort = new QuickSort()
        sorts << quickSort
        def quickSortJava = new QuickSortJava()
        sorts << quickSortJava
        /*
        def mergeSort = new MergeSort(10)
        sorts << mergeSort
        def mergeSortJava = new MergeSortJava(10)
        sorts << mergeSortJava
        */
        def heapSort = new HeapSort()
        sorts << heapSort

        def all = r.generateList(10)
        def temp
        def bubble = r.generateList(100)
        //println(all)
        def i = 0
        sorts.each {
            temp = all;
            if(it.sortName != "BubbleSort Groovy") {
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
        long start = System.currentTimeMillis()
        l=method.sortM(l)
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
