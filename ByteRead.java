import java.io.*;
public class ByteRead {
    public static void main(String args[]) throws IOException
    {
        String st = "Your This Content Will Be Saved On Data.txt File";
        FileOutputStream Fos = new FileOutputStream("Data.txt");
        Fos.write(st.getBytes());
        Fos.close();
        System.out.println("Data Saved Successfully");
    }
}
