public class Ex04 {
    public static void printMovieFromNbr(int nbr){
        String film;
        
        switch(nbr){
            case 3:
                film = "The Three Brothers";
                break;

            case 6:
                film = "The Sixth Sense";
                break;

            case 23:
                film = "The Number 23";
                break;

            case 28:
                film = "28 Days Later";
                break;

            default:
                film = "I don't know.";
                break;
        }
        System.out.println(film);
    }
    public static void main(String[] args){
        printMovieFromNbr(1);
        printMovieFromNbr(3);
        printMovieFromNbr(6);
        printMovieFromNbr(23);
        printMovieFromNbr(28);
    }
}
