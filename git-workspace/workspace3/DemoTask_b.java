public class DemoTask_b {
    public static void main(String[] args) {
        
        final String COLOR1= "\033[33;1m";
        final String COLOR2= "\033[34;1m";
        final String COLOR3= "\033[30;1m";
        final String COLOR4= "\033[35;1m";
        final String RESET = "\033[30;0m";

        System.out.printf("%s+------------+-----+%s\n",COLOR1,RESET);
        System.out.printf("%s| %sNAME%s       | %sAGE%s |\n",COLOR1, COLOR2,COLOR1, COLOR2, COLOR1, COLOR1, RESET);
         System.out.printf("%s+------------+-----+%s\n",COLOR1,RESET);
         System.out.printf("%s| %sAlice%s      | %s24%s  |\n", COLOR1,COLOR3,COLOR1, COLOR4, COLOR1, COLOR4, RESET);
         System.out.printf("%s| %sBob%s        | %s30%s  |\n",COLOR1, COLOR3,COLOR1, COLOR4, COLOR1, COLOR4, RESET);
        System.out.printf("%s+------------+-----+%s\n",COLOR1,RESET);
    }
}
