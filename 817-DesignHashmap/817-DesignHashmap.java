// Last updated: 09/07/2026, 09:49:26
class MyHashMap {
    private static final int SIZE = 1000; // number of buckets
    private List<int[]>[] buckets;

    public MyHashMap() {
        buckets = new List[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new ArrayList<>();
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int idx = hash(key);
        for (int[] pair : buckets[idx]) {
            if (pair[0] == key) {
                pair[1] = value; // update existing
                return;
            }
        }
        buckets[idx].add(new int[]{key, value}); // insert new
    }

    public int get(int key) {
        int idx = hash(key);
        for (int[] pair : buckets[idx]) {
            if (pair[0] == key) {
                return pair[1];
            }
        }
        return -1; // not found
    }

    public void remove(int key) {
        int idx = hash(key);
        Iterator<int[]> it = buckets[idx].iterator();
        while (it.hasNext()) {
            int[] pair = it.next();
            if (pair[0] == key) {
                it.remove();
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */