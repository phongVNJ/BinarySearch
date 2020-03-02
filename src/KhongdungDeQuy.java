public class KhongdungDeQuy {
    static int [] list = {2,4,6,8,10,11,12,14,16,18,21};
    static int binarySearch(int[]list,int key){
        int low = 0;
        int high = list.length-1;
        while (high >= low){
            int mid = (low+high)/2;
            if (key<list[mid])
                high = mid-1;
            else if (key ==list[mid])
                return mid;
            else
                low =mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,2));
        System.out.println(binarySearch(list, 10));
        System.out.println(binarySearch(list, 11));
        System.out.println(binarySearch(list, 12));
        System.out.println(binarySearch(list, 18));
        System.out.println(binarySearch(list, 21));
    }
}
