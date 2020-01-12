class cw3 {
    static void main(String[] args) {
        def htmlDirectory = new File('html')
        def counter = 1
        htmlDirectory.eachFileRecurse {
            if (it.isFile() && it.name.endsWith('.html')) {
                println(counter + " " + it)
                counter++
            }
        }
    }
}
