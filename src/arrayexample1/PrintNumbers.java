package arrayexample1;

public class PrintNumbers {
    int a;
    public void display(int num) {
        for (int i = 0; i<num; i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        PrintNumbers anjana = new PrintNumbers();
       anjana.display(4);


    }
}
