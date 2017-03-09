TreeMap<Integer, String> treeMap = new TreeMap<>(
    new Comparator<Integer> () {
        public int compare(Integer key1, Integer key2) {
            return -1 * key1.compareTo(key2);
        }
    });

TreeMap<Integer, String> treeMap = new TreeMap<>(
	(key1, key2) -> -1 * key1.compareTo(key2));