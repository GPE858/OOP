package les2;

class Calc
{
    public static void printLines(String text, int count)
    {
        for (int i = 0; i < count; i++)
            System.out.println(text);
    }

    public static void main(String[] args)
    { String text = "hello";
     int count = 3;
        printLines(text, count);
    }
}