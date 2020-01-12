import javax.swing.*

class zad4 {
    static void main(String[] args) {
        println getData(Integer) { it > 0 }
        println getData() { it.size() > 3 }
        println getData()
        println getData(BigDecimal)
    }

    static def getData(arg1 = null, arg2 = null) {
        def values = []
        def err = false
        while (true) {
            def dialogMessage = "Wprowadz liczbę do tablicy, po wprowadzeniu kilku zamknij okno"
            if (err) {
                err = false
                dialogMessage = "Błąd. $dialogMessage"
            }

            def input = JOptionPane.showInputDialog(null, dialogMessage, "")
            if (input == null)
                break

            if (arg1 instanceof Class) {
                try {
                    input = input.asType(arg1)
                    if (arg2 instanceof Closure && !validate(arg2, input)) {
                        err = true
                        continue
                    }
                }
                catch (ex) {
                    err = true
                    continue
                }
            }

            if (arg1 instanceof Closure && !validate(arg1, input)) {
                err = true
                continue
            }

            values.push input
        }

        return values
    }

    def validate(c, value) {
        return c(value)
    }

}
