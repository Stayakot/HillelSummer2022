package Lesson9;

public class CustomCollectionImpl implements CustomCollection {

    private Node head;
    private Node rail;
    private int size = 0;
    private static class Node {
        String element;
        Node next;
        Node previous;

        public Node(String element) {
            this.element = element;
        }
    }

    //добавляет значение.
    @Override
    public boolean add(String str) {
        Node newNode = new Node(str);
        if (head == null) {
            newNode.next = null;
            newNode.previous = null;
            head = newNode;
            rail = newNode;
        } else {
            rail.next = newNode;
            newNode.previous = rail;
            rail = newNode;
        }
        size++;
        return true;
    }

    @Override
    // добавляет все значения из другой коллекции.
    public boolean addAll(CustomCollectionImpl strColl) {
        if (strColl == null || strColl.size() == 0) {
            return false;
        }
        for (int i = 0; i < strColl.size; i++) {
            add(strColl.get(i));
        }
        return true;
    }

    @Override
    //Удаляет значение по индексу.
    public boolean delete(int index) {
        if (head == null) {
            return false;
        }
        if (index < 0 || index > size()) {
            return false;
        }
        Node p = head, p1 = null;
        int i = -1;
        while (p != null) {
            i++;
            if (i == index) {
                if (p1 == null) {
                    head = head.next;
                } else {
                    p1.next = p.next;
                }
            }
            p1 = p;
            p = p.next;
        }
        size--;
        return true;
    }

    @Override
    //удаляет значение по значению.
    public boolean delete(String str) {
        Node element = head;
        int index = 0;
        while (!element.element.equals(str)) {
            index++;
            element = element.next;
        }
        delete(index);

        return true;
    }

    @Override
    //получает значение по индексу.
    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node result = head;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }

        return result.element;
    }

    @Override
    //проверяет коллекцию на содержание какого-либо обьекта.
    public boolean contains(String str) {
        for (int i = 0; i < size; i++) {
            if (get(i).equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override
    //удаляет все значения в коллекции;
    public boolean clear() {
        head = null;
        rail = null;
        size = 0;
        return true;
    }

    @Override
    //получает размер коллекции
    public int size() {
        return size;
    }

    @Override
    public boolean trim() {
        return true;
    }
}