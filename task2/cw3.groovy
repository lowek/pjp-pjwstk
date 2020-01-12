class zad3 {
    static def apply(List l, Closure c) {
        l.collect(c)
    }

    static void main(String[] args) {

        def res

        def l1 = [1, 2, 3, 4]
        res = apply(l1, {
            it * 2
        })
        println res

        def l2 = [2, 3, 4, 5]
        res = apply(l2, {
            it * it
        })
        println res
    }
}
