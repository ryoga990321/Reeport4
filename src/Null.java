public class Null {
    public static void main(String[] args){
        try {
            String str = null;
            System.out.println(str.length());
        }catch (Exception e){
            System.out.println("NullPointExceptionが発生");
            System.out.println(e.getMessage());
        }
    }
}
