package com.company;

import java.awt.*;
import java.io.*;

public class CatalogUtil {


    public static void save(Catalog catalog)
        throws IOException {
    try (ObjectOutputStream oos = new ObjectOutputStream(
            new FileOutputStream(catalog.getPath()))) {
        oos.writeObject(catalog);
        oos.flush();
    }
}



    public static Catalog load(String path)
            throws InvalidCatalogException, IOException, ClassNotFoundException
    {
        Catalog catalog = new Catalog("New Catalog", path);
        try {
            FileInputStream file = new FileInputStream(path);
            ObjectInputStream out = new ObjectInputStream(file);
            catalog = (Catalog) out.readObject();
        }
        catch (IOException io){
            io.printStackTrace();
        }catch(ClassNotFoundException cn){
            cn.printStackTrace();
        }
        return catalog;
    }

    /*verific daca Desktop este suportat de platforma
    * apoi verific daca fisierul exista si in caz afirmativ il deschid pe Desktop */
    public static void view(Document doc) {
        Desktop desktop = Desktop.getDesktop();

        try
        {
            File file = new File(doc.getLocation());
            if(!Desktop.isDesktopSupported())
            {
                System.out.println("not supported");
                return;
            }
            if(file.exists() )
                desktop.open(file);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }


}