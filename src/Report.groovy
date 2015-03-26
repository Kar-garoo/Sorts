/**
 * Created by sergioalejandrodiazpinilla on 24/03/15.
 */
class Report {

    long instanceSize
    long comparasons
    double time



    def addComparisons(long k){
        comparasons = comparasons+k
    }

    def report(){
        def s = " Instance Size: $instanceSize \n Comparasons: $comparasons \n Execution Time: $time"
    }

}
