import groovy.json.JsonSlurper

class cw2 {

    static void main(String[] args) {

        def euro = (new JsonSlurper()).parse(new URL('http://api.nbp.pl/api/exchangerates/rates/A/EUR?format=json'))["rates"][0]["mid"]
        def plnToEuro = 1 / euro

        def menuSourceFile = new File("MenuPl.txt")
        def menuOutputFile = new File("MenuEur.txt")
        menuOutputFile.text = ""

        menuSourceFile.each {
            def courseRaw = it.split(" ")
            def eurPrice = String.format("%.2f", (courseRaw[1] as BigDecimal) * plnToEuro)
            menuOutputFile.text += courseRaw[0] + " " + eurPrice + "\n"
        }
    }
}
