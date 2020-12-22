package ua.khpi.oop.lab6;
import java.io.*;
public class Serialization {


    public Container deserialization()
    {
        File f = new File("D:/Cont.txt");

        ObjectInputStream ois = null;

        Container cont = null;

        try
        {
            FileInputStream is = new FileInputStream(f);
            if(is != null)
            {
                ois = new ObjectInputStream(is);
                cont = (Container)ois.readObject();
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                ois.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        return cont;
    }
    public boolean serialization(Container cont)
    {

        boolean flag = false;

        File f = new File("D:/Cont.txt");

        ObjectOutputStream oos = null;

        try
        {
            FileOutputStream os = new FileOutputStream(f);
            if(os != null)
            {
                oos = new ObjectOutputStream(os);
                oos.writeObject(cont);
                flag = true;
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if(oos != null)
            {
                try
                {
                    oos.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }

        return flag;
    }

}
