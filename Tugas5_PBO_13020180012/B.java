public class B
{
    public static void main(String[] args) {
        try
        {
            int a = 1/0;  //berpotensi untuk menimbulkan kesalahan yaitu pembagian dengan bilangan 0
            System.out.println("perintah selanjutnya");
        }
        catch(NullPointerException e)
        {
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        }
        catch(Exception e)
        {
        }
    }
}