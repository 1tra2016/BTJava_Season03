import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        float max = 0;
        float min = 10;
        float sum = 0;
        do {
            System.out.println("---MENU NHẬP ĐIỂM---");
            System.out.println("1. Nhập điểm học viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Thoát");
            System.out.println("Lựa chọn của bạn:");
            int choise = Integer.parseInt(scan.nextLine());

            switch (choise){
                case 1:
                    System.out.println("Nhập điểm sinh viên(nhập -1 để dừng)");
                    while(true){
                        System.out.print("Nhập điểm:");
                        Float score =  Float.parseFloat(scan.nextLine());
                        if(score == -1)
                            break;
                        else if (score <0 || score > 10)
                            System.err.println("Vui lòng nhập điểm hợp lệ (0-10) hoặc -1 để dừng");
                        else{
                            number ++;
                            if(score < 5) System.out.println("Học lực yếu");
                            else if(score <7) System.out.println("Học lực trung bình");
                            else if(score <8) System.out.println("Học lực khá");
                            else if(score <9) System.out.println("Học lực giỏi");
                            else System.out.println("Học lực xuất sắc");
                            if(score > max) max = score;
                            if(score < min) min = score;
                            sum  += score;
                        }
                    }
                    break;
                case 2:
                    if(number ==0) {
                        System.out.println("Chưa có điểm sinh viên nào được nhập");
                        break;
                    }
                    else{
                        System.out.printf("Số sinh viên đã nhập: %d\n",number);
                        System.out.printf("Điểm trung bình: %.2f\n",sum/number );
                        System.out.printf("Điểm cao nhất: %.2f\n",max );
                        System.out.printf("Điểm thấp nhất: %.2f\n",min );
                        break;
                    }
                case 3: System.exit(0);
                default:
                    System.out.println("Vui lòng nhập số từ 1-3");
            }
        } while (true);

    }
}