class Operators
{
    public static void main(String args[])
    {
        int a=12;
        int b=2;
        int sum;
        sum=a+b;
        if(sum>0)
        {
            System.out.println("sum is +ve number");
        }
        else{
            System.out.println("sum id -ve number");
        }

        System.out.println("sum:"+sum);
        if(sum>0&&sum%2==0){
            System.out.println("sum is +ve and even");
        }
        else{
            System.out.println("sum is either not +ve or even");
        }
       System.out.println(++a);//13
       System.out.println(sum+=10);//24
       sum++;
       System.out.println(sum);//25
       System.out.println(a);

    }

}