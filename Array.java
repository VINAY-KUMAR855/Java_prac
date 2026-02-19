class Array {
    public static void main(String[] args){
        int arr[]; // array declaration
        arr = new int[3]; // initialization
        // arr = new int[]{1,2,3};
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        // 2D array

        // int[][] arr1;
        // arr1 = new int[1][1];
        // arr1[0][0] = 20;
        int[][] arr1 = {{20}};
        for(int i=0;i<1;i++){
            for(int j=0;j<1;j++){
                System.out.println(arr1[i][j]);
            }
        }
        //int[][] arr2 = {{1,2},{3,4}};

    }
}
