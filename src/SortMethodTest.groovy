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
        unitList = []


    }

    void aux (sortMethod){
        assertEquals("The list must be sorted",[1,2,3,4,5],sortMethod.sortM(sortList))
        assertEquals("The list must be sorted",[1,2,3,4,5],sortMethod.sortM(descendList))
    }

    void testInitialaze(){
        def hs = new HeapSort(1)
        aux(hs)
    }
}
