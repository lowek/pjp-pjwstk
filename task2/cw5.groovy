class zad5 {
    static void main(String[] args) {
        def list = (1..40)

        eachTuple(list) { e1, e2, e3, e4 ->
            println "$e1 $e2 $e3 $e4"
        }

        def s = 'asia ma kota i psa'

        def out = new StringBuffer()
        eachTuple(s) { a, b ->
            out << b << a
        }
        println out
    }


    static def eachTuple(list, closure) {
        def n = closure.maximumNumberOfParameters
        def batch = []
        list.each {
            batch.push it
            if (batch.size() == n) {
                closure(batch)
                batch.clear()
            }
        }
    }
}
