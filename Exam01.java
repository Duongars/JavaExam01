package ra;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {
//Tạo lớp Exam01 trong package ra. Khai báo mảng số nguyên một chiều gồm
//100 phần tử. In menu và thực hiên các chức năng theo menu sau:
// ************************MENU**************************
//1. Nhập giá trị n phần tử của mảng (n nhập từ bàn phím) [03 điểm]
//2. In giá trị các phần tử trong mảng [03 điểm]
//3. Tính trung bình các phần tử dương (>0) trong mảng [03 điểm]
//4. In ra vị trí (chỉ số) các phần tử có giá trị bằng k trong
//mảng (k nhập từ bàn phím) [05 điểm]
//5. Sử dụng thuật toán sắp xếp nổi bọt sắp xếp mảng giảm dần [05 điểm]
//6. Tính số lượng các phần tử là số nguyên tố trong mảng [10 điểm]
//7. Sắp xếp các phần tử chẵn chia hết cho 3 ở đầu mảng theo thứ tự tăng
//dần, các phần tử lẻ chia hết cho 3 ở cuối mảng theo thứ tự giảm dần,
//các phần tử còn lại ở giữa mảng theo thứ tự tăng dần [10 điểm]
//8. Nhập giá trị m từ bàn phím, chèn giá trị m vào mảng (sắp xếp giảm
//dần) đúng vị trí [10 điểm]
//9. Thoát [01 điểm


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử");
        int num = Integer.parseInt(scanner.nextLine());
        float[] nums = new float[num];

//1. Nhập giá trị n phần tử của mảng (n nhập từ bàn phím) [03 điểm]

        for (int i = 0; i < num; i++) {
            System.out.printf("nhập phần tử thứ %d: ", i + 1);
            nums[i] = Integer.parseInt(scanner.nextLine());
        }

        //2. In giá trị các phần tử trong mảng [03 điểm]

        System.out.println(" \n mảng bạn vừa nhập là");

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%f\t", nums[i]);
        }

//3. Tính trung bình các phần tử dương (>0) trong mảng [03 điểm]

        float sum = 0;
        int amount = 0;
        for (int i = 0; i < num; i++) {

            if (nums[i] > 0) {
                sum += nums[i];
                amount++;
            }
        }
        System.out.println(" \n trung bình các phần tử dương " + sum / amount);


        //4. In ra vị trí (chỉ số) các phần tử có giá trị bằng k trong
//mảng (k nhập từ bàn phím) [05 điểm]

        System.out.println("nhập vị  trí phần tử k");
        int k = Integer.parseInt(scanner.nextLine());

        System.out.printf("vị trí của phần tử %d là : %f", k, nums[k]);
        System.out.printf("\n");

        //5. Sử dụng thuật toán sắp xếp nổi bọt sắp xếp mảng giảm dần [05 điểm]

        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - i - 1; j++)
                if (nums[j] > nums[j + 1]) {
                    // swap arr[j+1] và arr[i]
                    float temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
        }

        System.out.println("mảng sau khi sắp xếp là : " + Arrays.toString(nums));


        //6. Tính số lượng các phần tử là số nguyên tố trong mảng [10 điểm]

//        int primeAmount = 0;
//
//        for (int i = 0; i < num; i++) {
//            boolean check = true;
//            if (nums[i] < 2) {
//                check = false;
//            }
//            // check so nguyen to khi n >= 2
//            int squareRoot = (int) Math.sqrt(nums[i]);
//            for (int j= 2;j <= squareRoot; i++) {
//                if (nums[i] % j == 0) {
//                    check = false;
//                }
//            }
//
//            if (check == true){
//                primeAmount++;
//            }
//
//        }
//
//        System.out.println("số lượng các phần tử là số nguyên tố trong mảng : " + primeAmount);




//7. Sắp xếp các phần tử chẵn chia hết cho 3 ở đầu mảng theo thứ tự tăng


    int divisibleNums = 0;
        float[] floats = new float[num];



        int curIndex = 0;
        for (int i = 0; i <num ; i++) {
            if (nums[i] %3 == 0) {
                divisibleNums++;
                floats[curIndex] = nums[i];
                curIndex++;
            }
        }



        for (int i = 0; i < floats.length - 1; i++) {
            for (int j = 0; j < floats.length - i - 1; j++)
                if (floats[j] > floats[j + 1]) {
                    // swap arr[j+1] và arr[i]
                    float temp = floats[j];
                    floats[j] = floats[j + 1];
                    floats[j + 1] = temp;
                }
        }


        float[] result = new float[divisibleNums];
        int curIndex1=0;
        for (int i = 0; i < num; i++) {

            if (floats[i] != 0)  {
                result[curIndex1]=floats[i];
                curIndex1++;
            }
        }

        System.out.println("mảng chia hết cho 3 sau  khi sắp xếp là : " + Arrays.toString(result));



///8. Nhập giá trị m từ bàn phím, chèn giá trị m vào mảng (sắp xếp giảm
////dần) đúng vị trí [10 điểm]

        System.out.println(" Nhập giá trị cần chèn ");
        int addValue = Integer.parseInt(scanner.nextLine());

        System.out.println(" Nhập chỉ số chèn ");
        int addIndex = Integer.parseInt(scanner.nextLine());

        float[] numsInsert = new float[num + 1];
        int curIndex2 = 0;

        for (int i = 0; i < numsInsert.length; i++) {
            if (i == addIndex) {
                numsInsert[i] = addValue;
            } else {
                numsInsert[i] = nums[curIndex2];
                curIndex2++;
            }
        }
        System.out.println("mảng sau khi chèn là : " + Arrays.toString(numsInsert));






    }

}
