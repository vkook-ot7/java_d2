class Logical
{
    public static void main(String args[])
    {
       int a=12;
       int b=23;
       int c=42;
       System.out.println(a>b&&a>c);//false
       System.out.println(a>b||a>c);//false
       System.out.println(b>a&&c>a);//true
    }
}