class task2 {

    static void main(String[] args) {
        def words = []
        new File( 'words.txt' ).eachLine { line -> words << line}

        println('Lista słów: ');
        words.each {
            println it
        }

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return o1.compareTo(o2);
                }
            }
        });

            println('Posortowana lista: ' + words);
        }
    }
