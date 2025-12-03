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
        float sum_bonus =0;
        do {
            System.out.println("---MENU NHẬP LƯƠNG---");
            System.out.println("1. Nhập lương nhân viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Tính tổng tiền thưởng cho nhân viên");
            System.out.println("4. Thoát");
            System.out.println("Lựa chọn của bạn:");
            int choise = Integer.parseInt(scan.nextLine());

            switch (choise){
                case 1:
                    System.out.println("Nhập lương nhân viên(nhập -1 để kết thúc)");
                    while(true){
                        System.out.print("Nhập lương (đơn vị triệu):");
                        Float salary =  Float.parseFloat(scan.nextLine());
                        if(salary == -1)
                            break;
                        else if (salary <0 || salary > 500)
                            System.err.println("Vui lòng nhập số tiền hợp lệ (0-500) triệu hoặc -1 để dừng");
                        else{
                            number ++;
                            if(salary < 5) {
                                sum_bonus +=  salary*5/100;
                                System.out.println("Thu nhập thấp");
                            }
                            else if(salary <15){
                                sum_bonus += salary*10/100;
                                System.out.println("Thu nhập trung bình");
                            }
                            else if(salary <50){
                                sum_bonus += salary*15/100;
                                System.out.println("Thu nhập khá");
                            }
                            else if (salary <100){
                                sum_bonus += salary*20/100;
                                System.out.println("Thu nhập cao");
                            }
                            else {
                                sum_bonus += salary*25/100;
                                System.out.println("Thu nhập cao");
                            }
                            if(salary > max) max = salary;
                            if(salary < min) min = salary;
                            sum  += salary;
                        }
                    }
                    break;
                case 2:
                    if(number ==0) {
                        System.out.println("Chưa có dữ liệu");
                        break;
                    }
                    else{
                        System.out.printf("Số nhân viên đã nhập: %d\n",number);
                        System.out.printf("Lương trung bình: %.2f triệu\n",sum/number );
                        System.out.printf("Lương cao nhất: %.2f triệu\n",max );
                        System.out.printf("Lương thấp nhất: %.2f triệu\n",min );
                        System.out.printf("Tổng tiền lương: %.2f triệu\n",sum );
                        break;
                    }
                case 3:
                    System.out.println("Tính tổng tiền thưởng cho nhân viên");
                    System.out.printf("Tổng tiền thưởng cho nhân viên: %.2f triệu\n",sum_bonus);
                    break;
                case 4: System.exit(0);
                default:
                    System.out.println("Vui lòng nhập số từ 1-4");
            }
        } while (true);

    }
}