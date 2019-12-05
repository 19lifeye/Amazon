class MissingNumber{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9,10};

        int totalSumOfArray = (arr.length + 1) * (arr.length + 2) / 2;
        for(int i=0;i<arr.length;i++)
        {
            totalSumOfArray -= arr[i];
        }
        System.out.println("MissingNumber is : " + totalSumOfArray);
    }
}