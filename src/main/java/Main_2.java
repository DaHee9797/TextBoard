import java.util.ArrayList;
import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String manu = "";

        ArrayList<String> title = new ArrayList<String>();
        ArrayList<String> content = new ArrayList<String>();

        while (!manu.equals("exit")) {

            System.out.print("명령어 : ");
            manu = sc.nextLine();

            if (manu.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                title.add(sc.nextLine());
                System.out.print("게시물 내용을 입력해주세요 : ");
                content.add(sc.nextLine());
            }
            else if (manu.equals("list")) {
                for (int i = 0; i < title.size(); i++) {
                    System.out.println("=======================");
                    System.out.println("제목 : " + title.get(i));
                    System.out.println("내용 : " + content.get(i));
                }
            }
            System.out.println("=======================");
        }
        System.out.println("프로그램을 종료합니다.");
    }
}

