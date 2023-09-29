public class DemoTask4 {
    public static void main(String[] args) {
        final String day = "\033[30;1m";
        
        final String month = "\033[31;1m";
        
        final String year = "\033[32;1m";
        
        final String hour = "\033[33;1m";
        
        final String minute = "\033[34;1m";
        
        final String second = "\033[35;1m";
         final String Reset = "\033[35;0m";

        
        System.out.printf("%s12%s/%s12%s/%s2023%s %s23%s:%s59%s:%s59%s \n" ,day, Reset,month,Reset,year,Reset,hour,Reset,minute,Reset,second,Reset);
    }
}
