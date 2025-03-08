public class lab1 {
    public static void main(String[] args){
        int[] arr = {1,2,4,5,6};
        int index = 3;
        int target = 3;
        int [] newarr = new int[arr.length + 1];
        for (int i = 0; i < index - 1; i++) {
            newarr[i]=arr[i];
        }
        newarr[index-1]=target;
        for (int i = index; i < newarr.length ; i++) {
            newarr[i] = arr[i-1];
        }
        System.out.println("insertion");
        for (int i = 0; i < newarr.length ; i++) {
            System.out.println(newarr[i]);
        }
        for (int i = 0; i < index - 1; i++) {
            arr[i] = newarr[i];
        }
        for (int i = index-1; i < arr.length ; i++) {
            arr[i] = newarr[i+1];
        }

        System.out.println("deletion");
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
