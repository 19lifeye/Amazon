class NumberOfPath
{
    static int printNumberOfPath(int m, int n)
    {
        if(m == 1 || n == 1)
        {
            return 1;
        }
        return printNumberOfPath(m - 1, n) + printNumberOfPath(m, n-1);
    }
    public static void main(String[] args) {
        int m = 3, n = 3;
        System.out.println(printNumberOfPath(m,n));
    }
}