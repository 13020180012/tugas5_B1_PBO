import java.util.*;

 

class Coba{

  public static void main(String args[]){

    Vector v = new Vector();

    v.addElement("satu");

    v.addElement("dua");

    v.addElement("tiga");

    v.insertElementAt("nol",0);

    v.insertElementAt("three",3);

    v.insertElementAt("empat",5);

   

    Enumeration en = v.elements(); //lanjut

   

    while (en.hasMoreElements())//lanjut

      System.out.print(en.nextElement()+" ");

    System.out.println();

   

    v.removeElement("three");

    for(int i = 0; i < v.size(); ++i)

      System.out.print(v.elementAt(i) + " ");

    System.out.println();

   

    System.out.println(v.contains("tiga")?

      "nada":"ntidak ada");

    System.out.println(v.toString());

    v.clear();

    System.out.println(v.isEmpty()?

      "kosong":"berisi");

  }

}


