public class DemoTask_a {
    public static void main(String[] args) {
        final String color1 = "\033[41;1m";
        final String color2 = "\033[42;1m0%";
        final String Reset = "\033[41;0m";
        
        System.out.printf("%s[  5%s ]%s \n" ,color1,color2,Reset);
    }
}
