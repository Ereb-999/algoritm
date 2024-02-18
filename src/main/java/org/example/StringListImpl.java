package org.example;

import com.sun.jdi.InvalidCodeIndexException;

import java.util.Arrays;
import java.util.List;

public class StringListImpl implements StringList {

    private final String[] storoge;
    private int size;

    public StringListImpl() {
        storoge = new  String[10];
    }
    public StringListImpl(int initSize) {
        storoge = new String[initSize];
    }

    @Override
    public String add(String item) {
        valDateItem(item);
        storoge[size++] = item;
        return item;
    }

    @Override
    public String add(int index, String item) {
        valDateSize();
        valDateItem(item);
        valDateIndex(index);
        if(index == size){
            storoge[size++] = item;
            return item;
        }
        System.arraycopy(storoge, index, storoge, index + 1, size - 1);
        storoge[index] = item;
        size++;
        return item;
    }

    @Override
    public String set(int index, String item) {
        valDateIndex(index);
        valDateItem(item);
        storoge[index] = item;
        return item;
    }

    @Override
    public String remove(String item) {
       int index = indexOf(item);

        return remove(index);
    }

    @Override
    public String remove(int index) {
       valDateIndex(index);
        String item = storoge[index];
        if (index != size){
            System.arraycopy(storoge,index + 1, storoge, index, size - index);
        }
        size--;
        return item;
    }

    @Override
    public boolean contains(String item) {
        return indexOf(item) != -1;
    }

    @Override
    public int indexOf(String item) {
        for (int i = size; i > 0; i--){
            String s = storoge[i];

            if (s.equals(item)){
                return  i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        for (int i = 0; i < size; i++){
            String s = storoge[i];

            if (s.equals(item)){
            return  i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        valDateIndex(index);
        return storoge[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        return Arrays.equals(toArray(), otherList.toArray());
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public String[] toArray() {
        return Arrays.copyOf(storoge, size);
    }
    private void valDateItem(String item){
        if(item == null){
            throw new NullitemException();
        }
    }
    private void valDateSize(){
        if(size == storoge.length){
            throw new StorgeIsFullException();
        }
    }
    private void valDateIndex(int index){
        if(index < 0 || index >= size){
            throw new InvalidIndexException();
        }
    }

}
