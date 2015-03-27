/**
 * Created by sergioalejandrodiazpinilla on 26/03/15.
 */
class SortMethodTest extends GroovyTestCase{
    def sortList
    def descendList
    def voidList
    def unitList
    def simpleList
    def repetitiveList

    void setUp(){
        sortList = [1,2,3,4,5]
        descendList = [5,4,3,2,1]
        voidList = []
        unitList = [1]
        simpleList = [2,3,5,1,4]
        repetitiveList = [1,2,1,2,1,2]



    }

    void aux (sortMethod){
        assertEquals("The list must be sorted",[1,2,3,4,5],sortMethod.sortM(sortList))
        assertEquals("The list must be sorted",[1,2,3,4,5],sortMethod.sortM(descendList))
        assertEquals("The list must be sorted",[],sortMethod.sortM(voidList))
        assertEquals("The list must be sorted",[1],sortMethod.sortM(unitList))
        assertEquals("The list must be sorted",[1,2,3,4,5],sortMethod.sortM(simpleList))
        assertEquals("The list must be sorted",[1,1,1,2,2,2],sortMethod.sortM(repetitiveList))
    }

    void testBubbleSort(){
        def bs = new BubbleSort()
        aux(bs)
    }
    void testQuickSort(){
        def qs = new QuickSort()
        aux(qs)
    }
    /*
    void testQuickSortJava(){
        def qsj = new QuickSortJava()
        aux(qsj)
    }
    */
    void testMergeSort(){
        def hs = new HeapSort()
        aux(hs)
    }
    void testMergeSortJava(){
        def hs = new HeapSort()
        aux(hs)
    }
    void testHeapSort(){
        def hs = new HeapSort()
        aux(hs)
    }
}
