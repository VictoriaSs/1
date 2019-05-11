package Task_4;

public class Table {
public static void main (String[] args)
{
    for (int i=2;i<10;i++)
    {
        String s="" ;
        for (int j=2;j<10;j++)
        {
            s+=(Integer.toString(i)+"*"+Integer.toString(j)+"="+Integer.toString(i*j)+"\t");
    }
    System.out.println(s);
}
}
}

