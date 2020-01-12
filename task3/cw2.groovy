class zad2 {
    static void main(String[] args) {
        def pmap = [Groovy: ['Asia', 'Jan'],
                    Grails: ['Asia', 'Jan', 'Stefan', 'Mirek'],
                    Java  : ['Asia', 'Stefan', 'Mirek'],
                    JEE   : ['Slawek', 'Stefan', 'Janusz']
        ]

        def keys = pmap.keySet()
        keys.each { key ->
            def count = pmap.get(key).size()
            println "$key: $count"
        }

        def moreThan2 = pmap.findAll {
            it.value.size() > 2
        }
        println moreThan2

        def names = []
        println pmap.values().each({
            names = (names + it).unique()
        })
        names.each { name ->
            def projects = pmap.findAll({ it.value.contains(name) }).collect { el -> el.key }
            println "$name: $projects"
        }
    }
}
