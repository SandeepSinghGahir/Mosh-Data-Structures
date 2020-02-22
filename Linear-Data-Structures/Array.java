package linear_data_structures;

public class Array {

    private int size;
    private int arr[];
    private int filled;

    public Array (int size){
        this.size = size;
        this.filled = -1;
        arr = new int[size];
    }

    public void insert(int number){
        if(filled==size-1) {
            int[] newArr = new int[2 * size];
            for (int i = 0; i < arr.length; i++)
                newArr[i] = arr[i];
            arr = newArr;
            this.size = 2 * size;
        }
        arr[++filled] = number;
    }

    public void removeAt(int index){
        if(index<0 || index>filled)
            throw new IllegalArgumentException();
        else{
            for(int i=index;i<filled;i++)
                arr[i] = arr[i+1];
            filled--;
        }
    }

    public int indexOf(int num){
        for(int i=0;i<size;i++){
            if (arr[i] == num)
                return i;
        }
        return -1;
    }

    public void print(){
        for(int i=0;i<=filled;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
