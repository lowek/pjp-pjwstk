import javax.swing.JOptionPane

class zad2 {
    static def getInts() {
        def numbers = []
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
            if (input.matches("[0-9]*"))
                numbers.push(Integer.parseInt(input))
            else
                err = true
        }

        return numbers
    }
    static void main(String[] args) {

        print getInts()
    }
}
