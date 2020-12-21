package ua.khpi.oop.lab6;
import java.io.*;
public class Serialization {
    public boolean serialization(Container cont)
    {

        boolean flag = false;

        File file = new File("D:/Cont.txt");

        ObjectOutputStream oos = null;

        try
        {
            FileOutputStream fos = new FileOutputStream(file);
            if(fos != null)
            {
                oos = new ObjectOutputStream(fos);
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

    public Container deserialization()
    {
        File file = new File("D:/Cont.txt");

        ObjectInputStream ois = null;

        Container cont = null;

        try
        {
            FileInputStream fis = new FileInputStream(file);
            if(fis != null)
            {
                ois = new ObjectInputStream(fis);
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

}
