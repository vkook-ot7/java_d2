class Swap
{
    public static void main(String args[])
    {
        //Sapping by temp variable
        int a=2;
        int b=3;
        int temp;
        temp =a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);

        //Swapping by Arthimethic  
        int x=4;
        int y=5;
        x=x+y;//9
        y=x-y;//4
        x=x-y;//9-4=5
        System.out.println(x);//5
        System.out.println(y);//4
    }
}