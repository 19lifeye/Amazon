class KeyPair
{
    public static void main(String[] args) {
        
        //int N = 6;
        int PairSum = 16;
        int[] Arr = {1,4,45,6,10,8};
        int counter = 0;
        for(int i=0;i<Arr.length-1;i++)
        {
            for(int j=i+1;j<Arr.length;j++)
            {
                if(Arr[i] + Arr[j] == PairSum)
                {
                    System.out.println(Arr[i]+ " "+Arr[j]);
                    System.out.println("Yes");
                    counter++;
                }
            }
        }
        if(counter==0)
        {
            System.out.println("No");
        }
    }
}