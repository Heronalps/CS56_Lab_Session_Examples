PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(
	new Comparator<Integer> () {
		public int compare(Integer a, Integer b) {
			return -1 * a.compareTo(b);
		}
	});

PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(
	(a, b) -> -1 * a.compareTo(b));