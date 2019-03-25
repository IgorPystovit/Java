package eleventhchapter.collectioniterator;

import java.util.*;


//TASKS TO PERFORM: override hashCode(),override equals()
public class CollectionSequence<T> implements Collection<T>{
    private Collection<T> objList;
    private Object[] objArray;

    public CollectionSequence(){
        objArray = new Object[1];
    }
    public CollectionSequence(Collection<T> list){
        objList = list;
        objArray=toArray();
    }

    public boolean equals(Object o){
        boolean equals = false;
        if (o == null){
            equals = false;
        }
        if (o == this){
            equals = true;
        }
        return equals;
    }

    public Iterator iterator(){
        return new Iterator() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < objArray.length;
            }

            @Override
            public Object next(){
                return objArray[index++];
            }

            @Override
            public void remove(){
                objArray[index-1] = null;
            }
        };
    }

    private void incrementSize(){
        Object[] iTempArray = objArray;
        objArray = new Object[objArray.length+1];
        copy(iTempArray);
    }

    private void clearFromNull(){
        int nullCounter = 0;
        Object[] nonNullArray;
        for (Object tempObj : objArray){
            if (tempObj == null){
                nullCounter++;
            }
        }
        nonNullArray = new Object[size()-nullCounter];
        int index = 0;
        for (Object tempObj : objArray){
            if (tempObj != null){
                nonNullArray[index++] = tempObj;
            }
        }
        objArray = nonNullArray;
    }

    private void copy(Object[] array){
        if (array.length > size()){
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < array.length; i++){
            objArray[i] = array[i];
        }
    }

    public static <T> T requireNonNull(T obj) {
        if (obj == null)
            throw new NullPointerException();
        return obj;
    }

    public Object[] toArray(){
        int index = 0;
        Object[] array = new Object[objList.size()];
        for (T object : objList){
            array[index++] = object;
        }
        return array;
    }

    public <T> T[] toArray(T[] a){
        return null;
    }

    public boolean add(T e){
        incrementSize();
        objArray[size()-1] = e;
        return true;
    }

    public boolean remove(Object o){
        boolean removed = false;
        Iterator it = iterator();
        while (it.hasNext()){
            Object iTemp = it.next();
            if (iTemp.equals(o)){
                it.remove();
                removed = true;
            }
        }
        clearFromNull();
        return removed;
    }

    private boolean removeByIndex(int index){
        boolean removed = false;
        int counter = 0;
        Iterator it = iterator();
        if (index > size()){
            throw new IndexOutOfBoundsException();
        }
        while (it.hasNext()){
            it.next();
            if (counter == index){
                it.remove();
                removed = true;
                break;
            }
            counter++;
        }
        return removed;
    }

    public boolean containsAll(Collection<?> c){
        if (c.size() > size()){
            return false;
        }
        Iterator<?> collectionIterator = c.iterator();
        while (collectionIterator.hasNext()){
            if (!contains(collectionIterator.next())){
                return false;
            }
        }
        return true;
    }

    public boolean addAll(Collection<? extends T> c){
        boolean modified = false;
        Iterator<? extends T> collectionIterator = c.iterator();
        while (collectionIterator.hasNext()){
            if (add(collectionIterator.next())){
                modified = true;
            }
        }
        clearFromNull();
        return modified;
    }

    public boolean removeAll(Collection<?> c){
        boolean removed = false;
        for (Object temp : c){
            if (remove(temp)){
                removed = true;
            }
        }
        clearFromNull();
        return removed;
    }

    public boolean retainAll(Collection<?> c){
        boolean removed = false;
        Iterator it = iterator();
        while (it.hasNext()){
            Object iTemp = it.next();
            if (!c.contains(iTemp)){
                remove(iTemp);
                it = iterator();
                removed = true;
            }
        }
        clearFromNull();
        return false;
    }

    public void clear(){
        Iterator it = iterator();
        while (it.hasNext()){
            it.next();
            it.remove();
        }
        clearFromNull();
        return;
    }

//    public boolean equals(Object o){
//        return false;
//    }

    public int hashCode(){
        return 0;
    }


    public boolean contains(Object o){
        boolean contains = false;
        Iterator it = iterator();
        if (o == null){
            while (it.hasNext()){
                if (it.next() == null){
                    contains = true;
                }
            }
        }else{
            while (it.hasNext()){
                Object iTemp = it.next();
                if (iTemp == null){
                    continue;
                }
                if (iTemp.equals(o)){
                    contains = true;
                }
            }
        }
        return contains;
    }

    public int size(){
        return objArray.length;
    }


    public boolean isEmpty(){
        boolean isEmpty = false;
        Iterator it = iterator();
        if (size() == 0){
            isEmpty = true;
        }
        while (it.hasNext()){
            isEmpty = true;
            if (it.next() != null){
                isEmpty = false;
                break;
            }
        }
        return isEmpty;
    }



    public String toString(){
        clearFromNull();
        StringBuilder sb = new StringBuilder();
        Iterator<T> it = iterator();
        if (!it.hasNext()){
            return sb.append("[]").toString();
        }

        sb.append("[");

        for (int i = 0; i < size(); i++){
            if ((i == size()-1)){
                sb.append(objArray[i]);
                break;
            }

            sb.append(objArray[i]);
            sb.append(',').append(' ');
        }
        sb.append("]");
        return sb.toString();
    }



    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        for (int i = 0; i < 10; i++){
            ls.addFirst(i);
        }

        System.out.println(ls);
        ls.removeFirst();
        System.out.println(ls   );
    }
}
