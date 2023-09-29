public class DemoTask_c {
    public static void main(String[] args) {
        final String COLOR1= "\033[33;1m";
        final String COLOR2= "\u001B[31m";
        final String COLOR3= "\033[30;1m";
        final String COLOR4= "\033[35;1m";
        final String RESET = "\033[30;0m";

        System.out.printf("%s+-------------+------------+-----------+%s\n",COLOR1,RESET);
        System.out.printf("%s| %sCITY%s        | %sSTATE%s      | %sPOPULATION%s|\n",COLOR1, COLOR3,COLOR1, COLOR3, COLOR1, COLOR3, COLOR1,RESET);
        System.out.printf("%s+-------------+------------+-----------+%s\n",COLOR1,RESET);
        System.out.printf("%s| %sLos Angeles%s | %sCalifornia%s | %s3,966,936%s |\n",COLOR1, COLOR3,COLOR1, COLOR3, COLOR1, COLOR4, COLOR1,RESET);
        System.out.printf("%s| %sNew%s York%s    | %sNew%s York%s   | %s8,336,817%s |\n",COLOR1, COLOR2,COLOR3, COLOR1, COLOR2, COLOR3, COLOR1,COLOR4,COLOR1,RESET);
        System.out.printf("%s+-------------+------------+-----------+%s\n",COLOR1,RESET);
    }
}
