package Kexception.runtime.test;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dento do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println("Dento do IndexOutOfBoundsException");
        }
    }
}
