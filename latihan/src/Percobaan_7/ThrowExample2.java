package Percobaan_7;

public class ThrowExample2 {
    public static void main(String[] args) {
        try {
            throw new Exception("Here's my Exeption");
        } catch (Exception e) {
            System.out.println("Caught Exception");
            System.out.println("e.getMessage():"+e.getMessage());
            System.out.println("e.toString():"+e.toString());
            System.out.println("e.printStackTrace():");
            e.printStackTrace();
        }
    }
}
