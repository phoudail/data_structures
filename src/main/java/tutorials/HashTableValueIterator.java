package tutorials;

import java.awt.dnd.InvalidDnDOperationException;
import java.util.Iterator;

public class HashTableValueIterator<K, V> implements Iterator<V> {

    private int index;
    private DoubleNode<K, V>[] array;
    private DoubleNode<K, V> cursor;

    public HashTableValueIterator(HashTable<K, V> hash) {
        this.array = hash.getArray();
        this.index = -1;
        this.cursor = null;
    }

    @Override
    public boolean hasNext() {
        if(cursor != null) {
            cursor = cursor.next;
            if(cursor != null) {
                return true;
            }
        } 
        while(cursor == null && index < array.length-1) {
            cursor = array[index];
            index++;
        }
        return cursor != null;
    }

    @Override
    public V next() {
        if(cursor != null) {
            return cursor.value;
        }
        throw new InvalidDnDOperationException();
    }
    
}