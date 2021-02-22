package chapter1;

public class LocalVariables {


    public static int main(String[] args) {
     /*   public int notValid(){
            int y =10;
            int x ;
         int reply = x + y; //DOESN'T COMPİLE cause  variable x might not have been initialized */
        int y = 10;
        int x;
        x = 3;
        int reply = x + y;
        return reply;


    }

    public void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch = 1;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
        System.out.println(onlyOneBranch); // DOES NOT COMPILE  if you don't initilazed "onlyonebranch"
    }
}
