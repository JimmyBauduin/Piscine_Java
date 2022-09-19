package jour_01.ex_06;

public class Ex06 {
    public static void sequence(int nbr){
        String current_sequence = "1";
        int i = 0;
        System.out.println(current_sequence);

        if(nbr > 0 ){
            while(i != nbr){
                current_sequence = recursive(current_sequence);
                i++;
            }
        }
    }
    public static String recursive(String strSequence){

        String new_sequence = "";
        
        do{

            String current_character = strSequence.substring(0,1);

            if(strSequence.length() > 2 && current_character.compareTo(strSequence.substring(1,2)) == 0 && current_character.compareTo(strSequence.substring(2,3)) == 0){
                new_sequence = new_sequence + "3" + current_character;
                strSequence = strSequence.substring(3);
            }
            else{
                if(strSequence.length() > 1 && current_character.compareTo(strSequence.substring(1,2)) == 0){
                    new_sequence = new_sequence + "2" + current_character;
                    strSequence = strSequence.substring(2);
                }
                else{
                    new_sequence = new_sequence + "1" + current_character;
                    strSequence = strSequence.substring(1);
                }
            }

        }while(strSequence.length() != 0);
        System.out.println(new_sequence);
        return new_sequence;
    }
    public static void main(String[] args){
        sequence(5);
    }
}
