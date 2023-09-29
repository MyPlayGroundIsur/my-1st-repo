public class DemoTask_d {
    public static void main(String[] args) {
        final String COLOR1= "\033[33;1m";
        final String COLOR2= "\033[32;1m";
        final String COLOR3= "\033[30;1m";
        final String COLOR4= "\033[35;1m";
        final String COLOR5= "\033[36;1m";
        final String RESET = "\033[30;0m";

        System.out.printf("%s+-------------+------------+-----------+%s\n",COLOR1,RESET);
        System.out.printf("%s| %sITEM%s        | %sQUANTITY%s   |  %sPRICE%s    |\n",COLOR1, COLOR3,COLOR1, COLOR3, COLOR1, COLOR3, COLOR1,RESET);
        System.out.printf("%s+%s-------------%s+------------+%s-----------%s+%s\n",COLOR1,COLOR2,COLOR1,COLOR2,COLOR1,RESET);
        System.out.printf("%s| %sApples%s      |          %s5%s |   %s$%s0.99%s   |\n",COLOR1, COLOR3,COLOR1, COLOR5, COLOR1,COLOR2, COLOR4, COLOR1,RESET);
        System.out.printf("%s| %sOranges%s     |         %s10%s |   %s$%s1.49%s   |\n",COLOR1, COLOR3,COLOR1, COLOR5, COLOR1,COLOR2, COLOR4, COLOR1,RESET);
        System.out.printf("%s+%s-------------%s+------------+%s-----------%s+%s\n",COLOR1,COLOR2,COLOR1,COLOR2,COLOR1,RESET);
    }
}
