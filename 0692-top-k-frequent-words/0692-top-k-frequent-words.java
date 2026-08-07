class Solution {
    LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

    private int compareString(String a, String b) {
        if (map.get(a).equals(map.get(b))) {
            return b.compareTo(a);
        }
        return map.get(a) - map.get(b);

    }

    public List<String> topKFrequent(String[] words, int k) {
        LinkedHashMap<String, Integer> wordcount = new LinkedHashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        PriorityQueue<String> minheap = new PriorityQueue<>((a, b) -> compareString(a, b));

        for (String word : map.keySet()) {
            if (minheap.size() < k) {
                minheap.add(word);
            } else {
                String top = minheap.peek();
                if (map.get(word) > map.get(top) || map.get(word).equals(map.get(top)) && word.compareTo(top) < 0) {
                    minheap.poll();
                    minheap.add(word);
                }

            }
        }
        ArrayList<String> list = new ArrayList<>();
        while (!minheap.isEmpty()) {
            list.add(minheap.poll());
        }
        Collections.reverse(list);
        return list;
    }
}