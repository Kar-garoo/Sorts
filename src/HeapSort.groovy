/**
 * Created by sergioalejandrodiazpinilla on 24/03/15.
 */
class HeapSort extends SortMethod{

    HeapSort( ){
        def repo = new Report()
        this.report = repo
        this.sortName = "HeapSort Groovy"
    }

    def sortM(a) {
        report.instanceSize = a.size()
        def size = a.size()
        if (size < 2) {
            return a
        }
        heapify(a)
        (size - 1 .. 1).each {
            swap(a, 0, it)
            shiftDown(a, 0, it - 1)
        }
        return a
    }

    def heapify(list) {
        def size = list.size()
        def parent = (int)size / 2 - 1

        while (parent >= 0) {
            shiftDown(list, parent--, size - 1)
        }
    }

    def shiftDown(list, first, last) {
        def parent = first

        while (parent * 2 + 1 <= last) {
            def left = parent * 2 + 1
            def right = left + 1
            def max = parent

            if (list[left] > list[max]) {
                max = left
            }

            if (right <= last && list[right] > list[max]) {
                max = right
            }

            if (max != parent) {
                swap(list, parent, max)
                parent = max
            } else {
                break
            }
        }
    }

    def swap(list, i, j) {
        def temp = list[i]
        list[i] = list[j]
        list[j] = temp
    }

}
