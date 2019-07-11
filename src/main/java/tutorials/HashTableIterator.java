package tutorials;

import java.awt.dnd.InvalidDnDOperationException;
import java.util.Iterator;

public class HashTableIterator<K, V> implements Iterator<DoubleNode<K, V>> {

    private int index;
    private DoubleNode<K, V>[] array;
    private DoubleNode<K, V> cursor;

    public HashTableIterator(HashTable<K, V> hash) {
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
            index++;
            cursor = array[index];
        }
        return cursor != null;
    }

    @Override
    public DoubleNode<K, V> next() {
        if(cursor != null) {
            return cursor;
        }
        throw new InvalidDnDOperationException();
    }
    
}