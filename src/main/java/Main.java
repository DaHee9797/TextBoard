import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Article> art_arr = new ArrayList<Article>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String manu = "";

        while (!manu.equals("exit")) {

            System.out.print("명령어 : ");
            manu = sc.nextLine();

            if (manu.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String title = sc.nextLine();
                System.out.print("게시물 내용을 입력해주세요 : ");
                String content = sc.nextLine();
                art_arr.add(new Article(art_arr.size() + 1, title, content));
            }
            else if (manu.equals("list")) {
                for (int i = 0; i < art_arr.size(); i++) {
                    System.out.println("=======================");
                    System.out.println("제목 : " + art_arr.get(i).getTitle());

                }
                System.out.println("=======================");
            }
            else if (manu.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int num = sc.nextInt();
                sc.nextLine();

                Article findPost = FindID(num);
                if (findPost == null) {
                    continue;
                }

                System.out.print("새로운 제목 : ");
                String new_title = sc.nextLine();

                System.out.print("새로운 내용 : ");
                String new_content = sc.nextLine();

                findPost.setTitle(new_title);
                findPost.setContent(new_content);

                System.out.println(findPost.getID() + "번 게시물이 수정되었습니다.");
            }
            else if (manu.equals("delete")) {

                System.out.println("삭제할 게시물 번호 : ");
                int num = sc.nextInt();
                sc.nextLine();

                Article findPost = FindID(num);
                if (findPost == null) {
                    continue;
                }

                art_arr.remove(num - 1);

                System.out.println(num + "번 게시물이 삭제되었습니다.");
            }


            else if (manu.equals("detail")) {
                System.out.println("상세보기 항 게시물 번호 : ");
                int num = sc.nextInt();
                sc.nextLine();

                Article findPost = FindID(num);
                if (findPost == null) {
                    continue;
                }
                System.out.println("번호 : " + findPost.getID());
                System.out.println("제목 : " + findPost.getTitle());
                System.out.println("내용 : " + findPost.getContent());
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }

    public static Article FindID(int id) {
        for (int i = 0; i < art_arr.size(); i++) {
            if (art_arr.get(i).getID() == id) {
                return art_arr.get(i);
            }
        }
        System.out.println("존재하지 않는 게시물 번호입니다.");
        return null;
    }

}


