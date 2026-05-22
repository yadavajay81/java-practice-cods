package java8certification;

public class ThrowExample {
	public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(17);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
