/**
 * Created by Kar-garoo:

 *Jose Daniel Salazar Mora
 *Sergio Alejandro Diaz Pinilla
 *Julian Camilo Mendez Corredor
 *Miguel Andres Torres Chavarro
 */

class BubbleSort extends SortMethod {


    BubbleSort( ){
        super()
        this.sortName = "BubbleSort Groovy"
    }

    def sortM(a) {
        report.instanceSize = a.size()
        if(a.size()<= 1) {
            return a
        }
        for(out in (a.size()-2)..0)
        {
            0.upto(out) { index ->
                if(a[index] > a[index+1]){

                    def temp = a[index]
                    a[index] = a[index + 1]
                    a[index + 1] = temp

                }
                report.addComparisons(1)
            }
        }
        return a
    }

}