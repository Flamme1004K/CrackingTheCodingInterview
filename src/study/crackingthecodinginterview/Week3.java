package study.crackingthecodinginterview;

import java.util.LinkedList;

class HashTable {
    class Node {
        String key;
        String value;
        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
        String value() {
            return value;
        }
        void value(String value) {
            this.value = value;
        }
    }
    LinkedList<Node>[] data;
    HashTable(int size) {
        this.data = new LinkedList[size];
    }
    int getHashCode(String key) {
        int hashCode = 0;
        for(char c: key.toCharArray()) {
            hashCode += c;
        }
        return hashCode;
    }
    int convertToIndex(int hashCode) {
        return hashCode % data.length;
    }
    Node searchKey(LinkedList<Node> list, String key) {
        if(list == null) {return null;}
        for(Node node : list) {
            if(node.key.equals(key)){
                return node;
            }
        }
        return null;
    }
    void put(String key, String value) {
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);
        System.out.println("index = " + index + " hashCode = " + hashCode);
        LinkedList<Node> list = data[index];
        if(list == null) {
            list = new LinkedList<>();
            data[index] = list;
        }
        Node node = searchKey(list, key);
        if(node == null) {
            list.addLast(new Node(key, value));
        } else {
            node.value(value);
        }
    }
    String get(String key) {
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);
        LinkedList<Node> list = data[index];
        Node node = searchKey(list, key);
        return node == null ? "Not Found" : node.value();
    }
}

public class Week3 {
    public static void main(String[] args) {
        HashTable h = new HashTable(3);
        h.put("sung", "she is pretty");
        h.put("jin", "she is model");
        h.put("hee", "she is an angel");
        h.put("min", "she is cute");
        System.out.println("h.get(\"sung\") = " + h.get("sung"));

    }
}
