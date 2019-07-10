package tutorials;

import java.awt.dnd.InvalidDnDOperationException;
import java.util.Iterator;

public class HashTableKeyIterator<K, V> implements Iterator<K> {

    private int index;
    private DoubleNode<K, V>[] array;
    private DoubleNode<K, V> cursor;

    public HashTableKeyIterator(HashTable<K, V> hash) {
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
    public K next() {
        if(cursor != null) {
            return cursor.key;
        }
        throw new InvalidDnDOperationException();
    }
    
}