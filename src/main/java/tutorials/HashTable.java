package tutorials;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class HashTable<K, V> {

    private DoubleNode<K, V>[] array;
    private int[] loadArray;
    private double loadFactor;
    
    final static int DEFAULT_CAPACITY = 10;
    final static double  DEFAULT_LOAD_FACTOR = .5;

    public HashTable() {
        this(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR);
    }

    public HashTable(int capacity) {
        this(capacity, DEFAULT_LOAD_FACTOR);

    }

    public HashTable(double loadFactor) {
        this(DEFAULT_CAPACITY, loadFactor);
    }

    public HashTable(int capacity, double loadFactor) {
        this.array = new DoubleNode[capacity];
        this.loadArray = new int[capacity];
        this.loadFactor = loadFactor;

    }

    private int getIndex(K key) {
        int hashCode = Math.abs(key.hashCode());
        return hashCode%array.length;
    }

    public boolean contains(K key) {
        int index = getIndex(key);
        DoubleNode<K, V> cursor = array[index]];
        while(cursor != null) {
            if(cursor.key.equals(key)) { return true; }
            cursor = cursor.next;
        }
        return false;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        DoubleNode<K, V> cursor = array[index];
        while(cursor != null && !cursor.key.equals(key)) {
            cursor = cursor.next;
        }
        if(cursor == null) {
            DoubleNode<K, V> toAdd = new DoubleNode<K, V>(key, value, array[index]);
            array[index] = toAdd;
            loadArray[index]++;
        } else {
            cursor.value = value;
        }
        if( ((double) loadArray[index])/array.length > loadFactor) {
            this.rehash();
        }
    }

    public void remove(K key) {
        int index = getIndex(key);
        DoubleNode<K, V> cursor = array[index];
        if(cursor != null) {
            DoubleNode<K, V> previous = array[index];
            cursor = cursor.next;
            while(cursor != null && !cursor.key.equals(key)) {
                previous = previous.next;
                cursor = cursor.next;
            }
            if(cursor != null) {
                previous.next = cursor.next;
                loadArray[index]--;
            }
        }
    }

    public V get(K key) {
        int index = getIndex(key);
        DoubleNode<K, V> cursor = array[index];
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