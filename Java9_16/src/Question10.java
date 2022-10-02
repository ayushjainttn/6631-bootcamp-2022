public class Question10 {
    public static void main(String[] args) {
        String str = "     This is Ayush Jain.\\nFrom India!    ";
        System.out.println(str.repeat(3));
        System.out.println(str.strip());
        System.out.println(str.isBlank());
        System.out.println(str.indent(4));
        System.out.println(str.stripIndent());
        System.out.println(str.translateEscapes());
        System.out.println("Hello I am %s".formatted("Ayush Jain"));
    }
}
