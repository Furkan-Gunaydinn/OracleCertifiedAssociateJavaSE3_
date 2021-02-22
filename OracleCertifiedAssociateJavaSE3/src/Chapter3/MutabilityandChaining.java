package Chapter3;

public class MutabilityandChaining {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle"); // sb = "start+middle"
        StringBuilder same = sb.append("+end"); // "start+middle+end"

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");


    }


}
