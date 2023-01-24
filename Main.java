import java.util.Scanner;

public class Main {
    public static void main(String[] orgs) {
        int n1,n2,sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz :");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz :");
        n2 = input.nextInt();
        System.out.print("Yapılacak İşlemi Giriniz :");
        String islem = input.next();

        switch (islem) {
            case "+":
                sonuc = n1 + n2;
                System.out.print(n1 + "+" + n2 + "=" + sonuc);
                break;
            case "-":
                sonuc = n1 - n2;
                System.out.print(n1 + "-" + n2 + "=" + sonuc);
                break;
            case "*":
                sonuc = n1 * n2;
                System.out.print(n1 + "*" + n2 + "=" + sonuc);
                break;
            case "/":
                sonuc = n1 / n2;
                System.out.print(n1 + "/" + n2 + "=" + sonuc);
              break;
            default:
                System.out.println("hatalı giriş yaptınız !");
        }


        }
    }

















