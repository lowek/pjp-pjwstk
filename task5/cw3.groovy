class task3 {

    static void main(String[] args)
    {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        Scanner txtFile = new Scanner(new File("content.txt"));
        while(txtFile.hasNext()) {
            String word = txtFile.next();
            if(map.containsKey(word)) {
                int count = map.get(word) + 1;
                map.put(word, count);
            } else {
                map.put(word, 1);
            }
        }

        txtFile.close();

        for(Map.Entry<String, Integer> entry : map.entrySet().sort()) {
            println(entry);
        }
    }
}
