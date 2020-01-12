class task1 {

    static void main(String[] args) {
        def listOfnumber = [13, 12, 15, 14, 223, 156, 300, 30, 21, 4, 5];
        def newListOfNumber = listOfnumber.sort();
        println('Sortowanie: ' + newListOfNumber);

        def reverseListOfNumber = listOfnumber.reverse();
        println('Odwrotna kolejnosc: ' + reverseListOfNumber);
    }

}
