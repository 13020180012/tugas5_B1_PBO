import java.util.*;

 

class Cobaa{

  static void cetakArray(int c[]){

    System.out.println();

    for(int i = 0; i < c.length; i++)

      System.out.print(c[i] + "t");

  }

 

  public static void main(String args[]){

    int a[] = {4,1,5,2,3};

    int b[] = {1,2,3,4,5}; 

    Arrays.sort(a);

    cetakArray(a);//lanjut

    if(Arrays.equals(a,b))//lanjut

      System.out.print("narray sama");

    else

      System.out.print("narray tidak sama");

 

    Arrays.fill(a,7);

    cetakArray(a);

 

    Arrays.fill(a,1,4,9);

    cetakArray(a);

 

    String isi = Arrays.toString(a);

    System.out.println("n" + isi);

 

    System.out.println(Arrays.binarySearch(b,3));

  }

}


