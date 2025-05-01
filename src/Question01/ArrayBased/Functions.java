package Question01.ArrayBased;

public class Functions {

    List list01 = new List(10);

    public Functions(int[] numberList) {

        for (int i: numberList
             ) {
            list01.insertLast(i);

        }
    }

    int Sum(){
        int sum = 0;
        for(int j=0 ; j<list01.listSize(); j++){
            sum+= list01.retrieveList(j);

        }
        return sum;
    }

    double Avg(){
        return (double) Sum()/list01.listSize();
    }

    int Max(){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <list01.listSize(); i++) {
            if (max<= list01.retrieveList(i))
                max = list01.retrieveList(i);

        }
        return max;
    }

    int Min(){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <list01.listSize(); i++) {
            if (min>= list01.retrieveList(i))
                min = list01.retrieveList(i);

        }
        return min;
    }

    int EvvenCount(){
        int count=0;
        for (int i = 0; i <list01.listSize(); i++) {
            if (list01.retrieveList(i)%2==0)
                count++;

        }
        return count;
    }
}
