package skill.skill2;

public class StringBufferPractise {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");                // 1. append()
        sb.insert(5, ",");                  // 2. insert()
        sb.replace(0, 5, "Hi");             // 3. replace()
        sb.delete(2, 3);                    // 4. delete()
        sb.reverse();                       // 5. reverse()
        int len = sb.length();               // 6. length()

        System.out.println("After append, insert, replace, delete, reverse:");
        System.out.println(sb);
        System.out.println("Length of StringBuffer: " + len);
    }
}
