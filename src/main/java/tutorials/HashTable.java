package tutorials;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class HashTable<K, V> {

    private DoubleNode<K, V>[] array;
    private int[] loadArray;
    private int maxLoad;
    private double loadFactor;

    public HashTable() {
        this.array = new DoubleNode[10];
        this.loadArray = new int[10];
        this.maxLoad = 0;
        this.loadFactor = 0.5;
    }

    public HashTable(double loadFactor) {
        this.array = new DoubleNode[10];
        this.loadArray = new int[10];
        this.maxLoad = 0;
        this.loadFactor = loadFactor;
    }

    public boolean contains(K key) {
        int hashCode = Math.abs(key.hashCode());
        DoubleNode<K, V> cursor = array[hashCode%array.length];
        while(cursor != null) {
            if(cursor.key.equals(key)) { return true; }
            cursor = cursor.next;
        }
        return false;
    }

    public void put(K key, V value) {
        int hashCode = key.hashCode();
        int index = Math.abs(hashCode%array.length);
        DoubleNode<K, V> cursor = array[index];
        boolean done = false;
        if(cursor == null) {
            array[index] = new DoubleNode<K, V>(key, value);
            done = true;
            loadArray[index]++;
        }
        while(!done && cursor.next != null) {
            if(cursor.key.equals(key)) { cursor.value = value; done = true; }
            cursor = cursor.next;
        }
        if(!done) {
            if(cursor.key.equals(key)) {
                cursor.value = value; 
            } else {
                cursor.next = new DoubleNode<K, V>(key, value);
                loadArray[index]++;
            }
        }
        if(loadArray[index] > maxLoad) { maxLoad = loadArray[index]; }
        
        if( ((double) this.maxLoad)/array.length > this.loadFactor) {
            this.rehash();
        }
    }


    public V get(K key) {
        int hashCode = Math.abs(key.hashCode());
        DoubleNode<K, V> cursor = array[hashCode%array.length];
        while(cursor != null) {
            if(cursor.key.equals(key)) { return cursor.value; }
            cursor = cursor.next;
        }
        throw new NoSuchElementException("The specified key " + key + " was not found.");
    }

    private void rehash() {
        int newSize = array.length * 2;
        DoubleNode<K, V>[] transitionArray = Arrays.copyOf(array, array.length);
        this.array = new DoubleNode[newSize];
        this.loadArray = new int[newSize];
        maxLoad = 0;
        for(int i = 0; i > transitionArray.length-1; i++) {
            DoubleNode<K, V> cursor = transitionArray[i];
            while(cursor != null) {
                this.put(cursor.key, cursor.value);
            }
        }
    }

    public int arraySize() {
        return array.length;
    }

}


class DoubleNode<A, B> {

    A key;
    B value;
    DoubleNode<A, B> next;

    public DoubleNode(A key, B value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public DoubleNode(A key, B value, DoubleNode<A, B> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
}