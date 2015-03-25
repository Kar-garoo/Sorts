/**
 * Created by sergioalejandrodiazpinilla on 24/03/15.
 */
class MergeSort {
    MergeSort(long instanceSize){
        def repo = new Report()
        repo.instanceSize = instanceSize
        this.report = repo
        this.sortName = "Merge Sort Groovy"
    }

    def merge(A, p, q, r){
        i = 0
        j = 0
        L = A[p..q + 1]
        R = A[q+1..r+1]
        for (k in (p..r+1)){
            if (L[i] <= R[j]) {
                A[k] = L[i]
                i++
            }
            else {
                A[k] = R[j]
                j++
            }
        }
    }

    def merge_sort_main(A, p, r){
        def q
        if (p < r){
            q = (p+r)/2
            merge_sort_main(A, p, q)
            merge_sort_main(A, q+1, r)
            merge( A, p, q, r )
        }
    }
    def merge_sort(A){
        println "hola"
        merge_sort_main(A, 0, A.size()-1)
    }


    def static void main(String[] args){
        def B = [10,4,5,6]
        println(B)
        merge_sort(B)
        println(B)
    }

}
