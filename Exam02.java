package ra;

import java.util.Arrays;
import java.util.Scanner;

public class Exam02 {

    public static void main(String[] args) {
//Khai báo mảng số nguyên hai chiều gồm
//n*m phần tử (n, m nhập từ bàn phím).

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số hàng");
        int row = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập số cột");
        int col = Integer.parseInt(scanner.nextLine());

        int[][] nums = new int[row][col];


//In menu và thực hiên các chức năng theo menu
//sau:
// ************************MENU**************************
//1. Nhập giá trị các phần tử của mảng [03 điểm]
//2. In giá trị các phần tử trong mảng theo ma trận [03 điểm]
//3. Tính số lượng các phần tử chia hết cho 2 và 3 trong mảng [03 điểm]
//4. In các phần tử và tổng các phần tử nằm trên đường biên, đường chéo chính và
//đường chéo phụ [05 điểm]
//5. Sử dụng thuật toán sắp xếp lựa chọn sắp xếp các phần tử tăng dần theo cột của
//mảng [10 điểm]
//6. In ra các phần tử là số nguyên tố trong mảng [05 điểm]
//7. Sử dụng thuật toán chèn (Insertion sort) sắp xếp các phần tử trên đường chéo chính
//của mảng giảm dần [10 điểm]
//8. Nhập giá trị một mảng 1 chiều gồm m phần tử và chỉ số dòng muốn chèn vào mảng,
//thực hiện chèn vào mảng 2 chiều [10 điểm]
//9. Thoát [01 điểm

        int count=0;
do {

    System.out.println("**MENU***");
    System.out.printf("1.Nhập giá trị các phần tử mảng\n" +
            "2..In ra giá trị các phần tử mảng theo ma trận\n" +


            "3.Tính số lượng các phần tử chia hết cho 2 và 3 trong mảng \n" +
            "4.In các phần tử và tổng các phần tử nằm trên đường biên, đường chéo chính và \n" +
            "đường chéo phụ\n" +
            "5.. Sử dụng thuật toán sắp xếp lựa chọn sắp xếp các phần tử tăng dần theo cột của \n" +
            "mảng\n" +
            "6.In ra các phần tử là số nguyên tố trong mảng\n" +
            "7.Sử dụng thuật toán chèn (Insertion sort) sắp xếp các phần tử trên đường chéo chính \n" +
            "của mảng giảm dần\n" +
            "8.. Nhập giá trị một mảng 1 chiều gồm m phần tử và chỉ số dòng muốn chèn vào mảng, \n" +
            "thực hiện chèn vào mảng 2 chiều \n" +
            "9.Thoát\n");

    int choice = Integer.parseInt(scanner.nextLine());


switch (choice) {
    case 1:
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                nums[i][j] = Integer.parseInt(scanner.nextLine());
                if (nums[i][j]%2 == 0 && nums[i][j]% 3==0){
                    count++;
                }
            }
        }

        break;


    case 2:
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d\t", nums[i][j]);
            }
            System.out.printf("\n");
        }
        break;


    case 3:
        System.out.printf(" \n số lượng các phần tử chia hết cho 2 và 3 trong mảng là %d\t",count);
        break;


    case 4:
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                    sum += nums[i][j];
                }
            }
        }
        System.out.printf("tổng đường biên là %d\n", sum);


        int sum1 = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    sum1 += nums[i][j];
                }
            }
        }

        System.out.printf("tổng đường chéo chính là %d\n", sum1);

        break;


    case 5:
int pickCol = 0;

    do {
        int  position =  0 ;
        for (int i = 0; i < row; i++) {
            int  j = i +  1 ;
            int  temp  =   nums[i][pickCol];

            for  (; j <row; j ++) {
                if  ( nums[j][pickCol] <temp) {
                    temp = nums [j][pickCol];
                    position = j;
                }
            }
        }

    }while (count==row);

    
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d\t", nums[i][j]);
            }
            System.out.printf("\n");
        }

        break;



    case 6:
        System.out.printf(" các phần tử là số nguyên tố trong mảng\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                boolean check= true;
                if (nums[i][j] < 2) {
                    check =false;
                }else {
                    int squareRoot = (int) Math.sqrt(nums[i][j]);
                    for (int k = 2; k <= squareRoot; i++) {
                        if (nums[i][j] % i == 0) {
                            check = false;
                        }
                    }
                }

                if (check == true) {
                    System.out.println(nums[i][j]);
                }



            }
        }


        break;



    case 7:
       int [] tempArr = new  int[row];
       int curIndex=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                   tempArr[curIndex]=nums[i][j];
                }
            }
        }

        int  position =  0 ;

        for  ( int  i =  0 ; i <tempArr.length; i ++){
            int  j = i +  1 ;
            position = i;
            int  temp = tempArr [i];
            for  (; j <nums.length; j ++) {
                if (tempArr[j] < temp) {
                    temp = tempArr[j];
                    position = j;
                }
            }
        }
        System.out.printf("\nsắp xếp theo thứ tự tăng dần");
        System.out.println (Arrays.toString (tempArr) +  "selectSort" );
        break;





    case 8:

        int [] insertArr = new  int[col];


        for (int i = 0; i < col; i++) {
            System.out.printf("nhập phần tử thứ %d: ", i + 1);
           insertArr[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println (Arrays.toString (insertArr) +  "mang muon chen" );

        System.out.printf("nhập hàng muốn chèn ");
       int insertRow = Integer.parseInt(scanner.nextLine());
        if (insertRow <= row) {
            for (int i = 0; i < col; i++) {
                nums[insertRow][i]=insertArr[i];

            }

        }else {
            System.out.printf("không the thuc hiện yêu cầu ");
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d\t", nums[i][j]);
            }
            System.out.printf("\n");
        }
        break;




    case 9:
        System.exit(5);
        break;
}
}while (true);






    }

}
