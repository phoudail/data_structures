package tutorials;

public class App {
    public static void main( String[] args ) {

        System.out.println("Range iterator test :");
        RangeIterator test = new RangeIterator(1, 9);
        while(test.hasNext()) {
            System.out.println(test.next());
        }

        System.out.println("Array iterator test :");
        Integer[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayIterator<Integer> testArray = new ArrayIterator<Integer>(array);
        while(testArray.hasNext()) {
            System.out.println(testArray.next());
        }

        System.out.println("Stack iterator test :");
        StackNode<Integer> stack = new StackNode<Integer>();
        for(int i = 0; i <= 9; i++) {
            stack.push(i);
        }
        StackNodeIterator<Integer> testStack = new StackNodeIterator<Integer>(stack);
        while(testStack.hasNext()) {
            System.out.println(testStack.next());
        }

        System.out.println("Queue iterator test :");
        QueueArray<Integer> queue = new QueueArray<Integer>();
        for(int i = 0; i <= 9; i++) {
            queue.add(i);
        }
        QueueArrayIterator<Integer> testQueue = new QueueArrayIterator<Integer>(queue);
        while(testQueue.hasNext()) {
            System.out.println(testQueue.next());
        }

        System.out.println("Hash iterator test :");
        HashTable<String, Integer> hash = new HashTable<String, Integer>();
        for(int i = 0; i <= 9; i++) {
            hash.put("test" + i, i);
        }
        hash.put("test10", 10);
        HashTableIterator<String, Integer> testHash = new HashTableIterator<String, Integer>(hash);
        while(testHash.hasNext()) {
            System.out.println(testHash.next().key + " " + testHash.next().value);
        }
    }
}
