package ru.mirea;

public class ListElement {
    public ListElement next; //следующий в очереди
    public int element;

    public ListElement getNext() {
        return next;
    }

    public int getElement() {
        return element;
    }

    @Override
    public String toString() {
        return "ListElement{" +
                "next=" + next +
                ", element=" + element +
                '}';
    }
}
