

class zad1 {
    static void main(String[] args) {
            def list1 = [ 'a', 'b', 'c']
            def list2 = [ 1, 8, 23 ]

            print("list1: ")
            list1.each {
                print(it)
                print(" ")
            }

            println()

            print("list2: ")
            list2.each {
                print(it)
                print(" ")
            }

            println()

            def list11 = []
            list1.each {
                list11.push(it + it)
            }
            println(list11)

            def list12 = []
            list2.each {
                list12.push(it + it)
            }
            println(list12)
    }
}
