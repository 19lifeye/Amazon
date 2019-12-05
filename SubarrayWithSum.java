
class FindSubarray
{
    int[] findArraySum(int n, int Sum, int arr[])
    {
        int Total = 0;
        int arrnew[] = new int[n];
        for(int i=0;i<n-1;i++)
        {
            Total+=i;
            for(int j=i+1;j<n;j++)
            {
                Total+=arr[j];
                if(Total>Sum)
                {
                    Total=0;
                    break;
                }
                arrnew[j]=j;
            }
            if(Total==12)
            {
                return arrnew;               
            }
            
        }
        return arrnew;               
    }
}


class SubarrayWithSum{
    public static void main(String[] args) {
    
        FindSubarray fs = new FindSubarray();
        int arr1[] = {1,2,3,7,5};
        int[] arrlist = fs.findArraySum(5,12,arr1);
 
        for(int i=1;i<arrlist.length-1;i++)
        {
            System.out.println(arrlist[i]);
        }
    }
}