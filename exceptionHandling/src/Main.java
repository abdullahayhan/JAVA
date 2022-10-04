public class Main {

    public static void main(String[] args) {
	  try { int [] sayilar= {1,2,3};
          System.out.println(sayilar[2]);
	  }catch (StringIndexOutOfBoundsException exception){
	      System.out.println(exception);
      }catch (ArrayIndexOutOfBoundsException exception){
	      System.out.println(exception);
      }
	  catch (Exception exception){
	      System.out.println("Loglandı : "+exception);
      }
	  finally {
	      //hangi blok çalışırsa finally her türlü çalışır.
          System.out.println("Ben her türlü çalışırım.");
      }

    }
}
