class Power
{
    public static void main(String[] args) {
        int Number = 36;
        
        int MaxInt = Integer.MAX_VALUE;
        for(int i=1;i<MaxInt;i++)
        {
            if(Math.pow(i, 2) == Number)
            {
                System.out.println("True");
                System.out.println("as" + i +"^2 = " + Number);
                break;
            }
            if(Math.pow(i, 2) > Number)
            {
                System.out.println("False");
                break;
            }
        }
        
    }
}