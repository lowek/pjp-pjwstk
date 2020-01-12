import java.text.ParseException
import java.text.SimpleDateFormat

class zad3 {
    static void main(String[] args) {

        def text = "2017-07-29 lorem ipsum, 2013-23-20 has been the industry's, 2019-50-10, standard 2000-01-01"

        def porownanie = text =~ /[0-9]{4}-[0-9]{2}-[0-9]{2}/
        def wynik = porownanie.findAll({
            def valid = true

            try {
                def dateFormat = new SimpleDateFormat("yyyy-MM-dd")
                dateFormat.setLenient(false)
                dateFormat.parse(it)
            } catch (ParseException e) {
                valid = false
            }

            return valid
        })

        println wynik
    }
}
