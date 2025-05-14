package Question03;

public class List {
    private int maxSize;
    private int position;
    private Party[] listEntry;

    public List(int size) {
        maxSize = size;
        listEntry = new Party[maxSize];
        position = -1;
    }

    boolean isListEmpty() {
        return position == -1;
    }

    boolean isListFull() {
        return position == maxSize - 1;
    }

    int listSize() {
        return position + 1;
    }

    void insertLast(Party x) {
        if (isListFull())
            System.out.println("Attempt to insert at the end of a full list");
        else
            listEntry[++position] = x;
    }

    void insertList(int p, Party element) {
        if (isListFull())
            System.out.println("Attempt to insert into a full list");
        else if (p < 0 || p > listSize())
            System.out.println("Invalid position for insertion");
        else {
            for (int i = position; i >= p; i--) // Corrected loop condition
                listEntry[i + 1] = listEntry[i];
            listEntry[p] = element;
            position++;
        }
    }

    Party deleteList(int p) {
        Party element;
        if (isListEmpty()) {
            System.out.println("Attempt to delete from an empty list");
            return null;
        } else if (p < 0 || p >= listSize()) {
            System.out.println("Invalid position for deletion");
            return null;
        } else {
            element = listEntry[p];
            for (int i = p; i < position; i++)
                listEntry[i] = listEntry[i + 1];
            position--;
            return element;
        }
    }

    Party retrieveList(int p) {
        if (isListEmpty()) {
            System.out.println("Attempt to retrieve from an empty list");
            return null;
        } else if (p < 0 || p >= listSize()) {
            System.out.println("Invalid position for retrieval");
            return null;
        } else {
            return listEntry[p];
        }
    }

    void replaceList(int p, Party x) {
        if (isListEmpty()) {
            System.out.println("Attempt to replace in an empty list");
        } else if (p < 0 || p >= listSize()) {
            System.out.println("Invalid position for replacement");
        } else {
            listEntry[p] = x;
        }
    }

    void traverseList() {
        for (int i = 0; i <= position; i++)
            System.out.println(listEntry[i].toString());
    }
}