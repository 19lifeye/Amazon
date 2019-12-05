class RotationArray
{

    void leftRotate(int arr[], int d, int n)
    {
        for(int i=0;i<d;i++)
        {
            leftRotateByOne(arr, n);
        }
    }

    void leftRotateByOne(int arr[], int n)
    {
        int j, tmp = arr[0];
        for(j=0;j<arr.length - 1;j++)
        {
            arr[j] = arr[j+1];
        }
        arr[j] =  tmp;
    }

    void printArray(int arr[], int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args)
    {
        RotationArray array = new RotationArray();
        int arr[] = {1,2,3,4,5,6,7,8,9};
        array.leftRotate(arr, 2, 9);
        array.printArray(arr,9);
    }
}