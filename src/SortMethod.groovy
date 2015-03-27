/**
 * Created by sergioalejandrodiazpinilla on 24/03/15.
 */
abstract class SortMethod {

    String sortName
    Report report

    SortMethod(){
        def repo = new Report()
        this.report = repo
        repo.setComparasons(0)
        repo.setInstanceSize(0)
        repo.setTime(0.0)
    }

    abstract sortM(items)
}
