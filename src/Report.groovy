/**
 * Created by sergioalejandrodiazpinilla on 24/03/15.
 */
class Report {

    long instanceSize
    long comparasons
    double time

    def generateList(){
        def rand = new Random()
        def randomIntegerList = []
        (1..instanceSize).each {
            randomIntegerList << rand.nextInt((int)instanceSize+1)
        }
        return randomIntegerList
    }

    def addComparisons(k){

    }

}
