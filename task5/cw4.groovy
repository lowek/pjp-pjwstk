import java.util.stream.Collectors
import java.util.stream.Stream

class task4 {
    public static void groupAnagrams(String[] words)
    {
        List<String> list = Arrays.stream(words)
                .map({ s ->
                    Stream.of(s.split(""))
                            .sorted()
                            .collect(Collectors.joining())
                })
                .collect(Collectors.toList());

        Map<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++)
        {
            map.putIfAbsent(list.get(i), new ArrayList<>());
            map.get(list.get(i)).add(i);
        }

        for (Map.Entry<String, List<Integer>> entry: map.entrySet())
        {
            entry.getValue().stream()
                    .forEach({ index -> println(words[index] + " ") });

            System.out.println();
        }
    }

    static void main(String[] args) {
        def txt = new URL('https://www.fuw.edu.pl/~werner/files/englishWords.txt').text;

        groupAnagrams(txt);
    }

}
