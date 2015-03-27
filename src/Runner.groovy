/**
 * Created by Kar-garoo
 * Jose Daniel Salazar Mora
 *Sergio Alejandro Diaz Pinilla
 *Julian Camilo Mendez Corredor
 *Miguel Andres Torres Chavarro
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

        def mergeSort = new MergeSort()
        sorts << mergeSort

        def mergeSortJava = new MergeSortJava()
        sorts << mergeSortJava

        def heapSort = new HeapSort()
        sorts << heapSort

        def all = r.generateList(100000)
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
