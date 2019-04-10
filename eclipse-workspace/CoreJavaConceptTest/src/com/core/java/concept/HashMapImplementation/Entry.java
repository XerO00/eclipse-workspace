package com.core.java.concept.HashMapImplementation;

public class Entry<K, V> {
    final K key;
    V value;
    Entry<K, V> next;
    public Entry(K key, V value, Entry<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
    // getters, equals, hashCode and toString

}
/*
public V get(K key) {
    Entry<K, V> bucket = buckets[getHash(key) % getBucketSize()];
    while (bucket != null) {
        if (bucket.key.equals(key)) {
            return bucket.value;
        }
        bucket = bucket.next;
    }
    return null;
    */
