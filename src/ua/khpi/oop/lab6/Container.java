package ua.khpi.oop.lab6;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.io.Serializable;
public class Container {
    private static final long serialVersionUID = 1L;
    private String[] arr;
    private int len;

    public void Sort()
    {


        for(int i = 0; i < len - 1; i++)
        {
            for(int j = i + 1; j < len; j++)
            {
                if(arr[i].compareTo(arr[j]) > 0)
                {

                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public String toString()
    {
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < len; i++)
        {
            str.append(arr[i] + " | ");
        }

        return str.toString();
    }

    public void add(String string)
    {
        String[] nmas = new String[len + 1];

        for(int i = 0; i < len; i++)
        {
            nmas[i] = arr[i];
        }

        nmas[len] = string;
        len++;
        arr = nmas;
    }

    public void clear()
    {
        for(int i = 0; i < len; i++)
        {
            arr[i] = null;
        }
        len = 0;
    }

    public boolean remove(String string)
    {
        boolean b = false;

        for(int i = 0; i < len; i++)
        {
            if(arr[i].equals(string))
            {
                b = true;
                String[] nmas = new String[len - 1];

                for(int j = 0; j < i; j++)
                {
                    nmas[j] = arr[j];
                }

                for(int j = i; j+1 < len; j++)
                {
                    nmas[j] = arr[j+1];
                }

                arr = nmas;
                len--;

                break;
            }
        }

        return b;
    }

    public Object[] toArray()
    {
        Object[] obj = new Object[len];

        for(int i = 0; i < len; i++)
        {
            obj[i] = arr[i];
        }

        return obj;
    }

    public int size()
    {
        return len;
    }
    public boolean contains(String string)
    {
        boolean con = false;

        for(int i = 0; i < len; i++)
        {
            if(arr[i].equals(string))
            {
                con = true;
                break;
            }
        }
        return con;
    }
    public boolean containsAll(Container container)
    {
        boolean con = false;
        int size = container.size();
        int count = 0;

        for(int i = 0; i < len; i++)
        {
            for(int j = 0; j < size; j++)
            {
                if(arr[i].equals(container.GetEl(j)))
                {
                    count++;
                    break;
                }
            }
        }

        if(count == len)
        {
            con = true;
        }

        return con;
    }
    public String GetEl(int i)
    {
        return arr[i];
    }
    public Container(String... str)
    {
        len = str.length;

        if(len > 0)
        {
            arr = new String[len];

            for(int i = 0; i < len; i++)
            {
                arr[i] = str[i];
            }
        }
    }

    public Iterator<String> iterator()
    {

        return new MyIterator<String>();
    }
    public class MyIterator<String> implements Iterator{
        private int ind = 0;
        boolean check = false;
        @Override public boolean hasNext()
        {
           return ind< len;
        }

        @Override public Object next()
        {
            if(ind == len)
            {
                throw new NoSuchElementException();
            }
            check = true;
            return arr[ind++];
        }

        @Override public void remove()
        {
            if(check){
                Container.this.remove(arr[--ind]);
                check = false;
            }
            else
            {
                throw new IllegalStateException();
            }

        }

    }
}
