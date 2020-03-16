package com.company;

import java.awt.*;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;

public class CatalogUtil {

/*
 *Pentru a salva catalogul intr-un fisier extern folosind obiectul serializat "catalog"
 *serializarea se face prin utilizarea instantei ObjectOutputStream
 *astfel se scriu datele in fisierul cu locatia catalog.getPath() folosind medota writeObject
 */
    public static void save(Catalog catalog)
        throws IOException {
    try (ObjectOutputStream oos = new ObjectOutputStream(
            new FileOutputStream(catalog.getPath()))) {
        oos.writeObject(catalog);
        oos.flush();
    }
}

/*
* Pentru a incarca catalogul intr-un fisier extern utilizand instanta FileInputStream care obtine octetii de intrare
* deserializarea obiectului se face cu instanta ObjectInputStream
* astfel cu ajutorul metodei readObject() se citesc datele din ObjectInputStream
* si se returneaza noul catalog*/
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
    * apoi verific daca fisierul exista si in caz afirmativ il deschid pe Desktop
    * daca nu il deschid in browser insemnand ca este un URL */
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
            if(file.exists() ) desktop.open(file);

            else desktop.browse(new URI(doc.getLocation()));

        }
        catch(IOException | URISyntaxException e)
        {
            e.printStackTrace();
        }

    }




}