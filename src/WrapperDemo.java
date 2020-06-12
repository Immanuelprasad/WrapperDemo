public class WrapperDemo
{
    public static void main (String[] args)
    {
        int i = 5;                   // Primitive Datatype

        Integer ii = new Integer(i); // Boxing (or) Wrapping

        int j = ii.intValue();       // Unboxing (or) Unwrapping

        Integer value = i;           // Auto-Boxing (or) Auto-Wrapping

        int k = value;               // Auto-Unboxing (or) Auto-Unwrapping


        String str = "123";
        int n = Integer.parseInt(str);
        System.out.println(n);
    }
}