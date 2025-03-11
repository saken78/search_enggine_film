public class main.java {
    public static void main(String[] args) {
        FileReader fileinp;
        BufferedReader bufferInputt;

        try {
           fileinp = new FileReader("imdb.csv");
           bufferInputt = new BufferedReader(fileinp);
           String data = bufferInputt.readLine();
            StringTokenizer stringtoken = new StringTokenizer(data, ",");
            System.out.println("| Star Rating |\t\t\ttitle content\t\t\t|\tContent rating |\tGenre\t| Duration |\t\t\t\t\t\tactors list\t\t\t\t\t\t|");
            System.out.printf("|\t %2s\t  ", stringtoken.nextToken());
            System.out.printf("|\t %s\t\t", stringtoken.nextToken());
            System.out.printf("|\t\t   %s\t   ", stringtoken.nextToken());
            System.out.printf("|\t%s\t", stringtoken.nextToken());
            System.out.printf("|\t%s\t   ", stringtoken.nextToken());
            System.out.printf("| %s", stringtoken.nextToken());
            System.out.printf("| %s", stringtoken.nextToken());
            System.out.printf("| %s", stringtoken.nextToken());







        } catch (Exception e) {
            System.err.println("database tidak ada");
        }

    }
}
