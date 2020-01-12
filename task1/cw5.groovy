//s12809

def scanner = new Scanner(System.in)

print "Podaj liczby:"
def nums = scanner.nextLine()

if (!isNumeric(nums)) {
    println("Wartość nienumeryczna!")
    return
}

displayAsWords(nums)

def isNumeric(String text) {
    return text.toCharArray().every { it.isDigit() }
}

def displayAsWords(String rawNumbers) {
    def numbers = rawNumbers.collect { x -> Integer.parseInt(x) }
    numbers.eachWithIndex{ number, index ->
        display(number, index == 0)
    }
}

def display(int number, boolean isFirst) {
    def word = ""

    switch (number) {
        case 0:
            word = "zero"
            break
        case 1:
            word = "jeden"
            break
        case 2:
            word = "dwa"
            break
        case 3:
            word = "trzy"
            break
        case 4:
            word = "cztery"
            break
        case 5:
            word = "pięć"
            break
        case 6:
            word = "sześć"
            break
        case 7:
            word = "siedem"
            break
        case 8:
            word = "osiem"
            break
        case 9:
            word = "dziewięć"
            break
    }

    if (!isFirst)
        print(" - ")
    print(word)
}