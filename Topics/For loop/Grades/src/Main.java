import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int d = 0,c = 0 ,b = 0 ,a = 0;
        for(int i=0;i<=n;i++){
            String grade = scanner.nextLine();
            if(grade.equals("D")){
                d += 1;
            }
            if(grade.equals("C")){
                c += 1;
            }
            if(grade.equals("B")){
                b += 1;
            }
            if(grade.equals("A")){
                a += 1;
            }}
        System.out.println(d + " " + c + " " + b + " " + a);

    }
}