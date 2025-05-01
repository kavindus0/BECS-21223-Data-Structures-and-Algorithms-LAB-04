package Question02.ArrayBased.Primitive;

public class List {
    private int maxSize;
    private int position; // -1 indicates empty list
    private int[] listEntry;

    // Constructor
    public List(int size) {
        maxSize = size;
        listEntry = new int[maxSize];
        position = -1;
    }

    // IsListEmpty
    boolean isListEmpty() {
        return position == -1;
    }

    // IsListFull
    boolean isListFull() {
        return position == maxSize - 1;
    }

    // ListSize
    int listSize() {
        return position + 1;
    }

    // InsertLast
    void insertLast(int x) {
        if (isListFull())
            System.out.println("Attempt to insert at the end of a full list");
        else
            listEntry[++position] = x;
    }

    // InsertList
    void insertList(int p, int element) {
        if (isListFull())
            System.out.println("Attempt to insert into a full list");
        else if (p < 0 || p > listSize())
            System.out.println("Invalid position for insertion");
        else {
            for (int i = position; i > p; i--)
                listEntry[i] = listEntry[i-1];
            listEntry[p] = element;
            position++;
        }
    }

    // DeleteList
    int deleteList(int p) {
        int element;
        if (isListEmpty()) {
            System.out.println("Attempt to delete from an empty list");
            return 0;
        } else if (p < 0 || p >= listSize()) {
            System.out.println("Invalid position for deletion");
            return 0;
        } else {
            element = listEntry[p];
            for (int i = p; i < position; i++)
                listEntry[i] = listEntry[i+1];
            position--;
            return element;
        }
    }

    // RetrieveList
    int retrieveList(int p) {
        if (isListEmpty()) {
            System.out.println("Attempt to retrieve from an empty list");
            return 0;
        } else if (p < 0 || p >= listSize()) {
            System.out.println("Invalid position for retrieval");
            return 0;
        } else {
            return listEntry[p];
        }
    }

    // ReplaceList
    void replaceList(int p, int x) {
        if (isListEmpty()) {
            System.out.println("Attempt to replace in an empty list");
        } else if (p < 0 || p >= listSize()) {
            System.out.println("Invalid position for replacement");
        } else {
            listEntry[p] = x;
        }
    }

    // TraverseList
    void traverseList() {
        for (int i = 0; i <= position; i++)
            System.out.println(listEntry[i]);
    }
}