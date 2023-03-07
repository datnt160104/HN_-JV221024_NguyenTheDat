package Exam_B1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int choice;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\n****************HACKATHON-JAVA-BASIC-1-MENU***************");
            System.out.println("1. Nhập số phần tử và giá trị cho các phần tử của mảng từ bàn phím");
            System.out.println("2. In ra giá trị các phần tử trong mảng");
            System.out.println("3. Tính tổng và in ra các phần tử có giá trị lẻ trong mảng");
            System.out.println("4. In ra giá trị lớn nhất và nhỏ nhất trong mảng");
            System.out.println("5. Thống kê số lượng phần tử chia hết cho 2 và 3 trong mảng");
            System.out.println("6. In ra mảng đảo ngược");
            System.out.println("7. In ra các phần tử và tổng số các phần tử là số nguyên tố trong mảng");
            System.out.println("8. Sắp xếp mảng tăng dần");
            System.out.println("9. Thoát");

            System.out.print("Nhập lựa chọn của bạn: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    inputArray(arr, input);
                    break;
                case 2:
                    displayArray(arr);
                    break;
                case 3:
                    sumOdd(arr);
                    break;
                case 4:
                    findMinMax(arr);
                    break;
                case 5:
                    countDivisibleByTwoAndThree(arr);
                    break;
                case 6:
                    reverseArray(arr);
                    break;
                case 7:
                    showPrimeNumbers(arr);
                    break;
                case 8:
                    sortArrayAscending(arr);
                    break;
                case 9:
                    System.out.println("Chương trình kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (choice != 9);
    }

    public static void inputArray(int[] arr, Scanner input) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = input.nextInt();

        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
    }

    public static void displayArray(int[] arr) {
        System.out.print("Các phần tử trong mảng là: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void sumOdd(int[] arr) {
        int sum = 0;
        System.out.println("Các phần tử lẻ trong mảng là:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] != 0) {
                System.out.printf("%d ", arr[i]);
                sum += arr[i];
            }
        }
        System.out.printf("\nTổng các số lẻ là:%d\n", sum);
    }

    public static void findMinMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        }
        System.out.printf("Giá trị lớn nhất trong mảng là: %d\n", max);
        System.out.printf("Giá trị nhỏ nhất trong mảng là: %d\n", min);
    }
    public static void countDivisibleByTwoAndThree(int[] arr) {
        int countTwo = 0;
        int countThree = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (arr[i] % 2 == 0) {
                    countTwo++;
                }
                if (arr[i] % 3 == 0) {
                    countThree++;
                }
            }
        }
        System.out.printf("số chia hết cho 2 là: %d\n", countTwo);
        System.out.printf("số chia hết cho 3 là: %d\n", countThree);
    }

    public static void reverseArray(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                reversedArr[arr.length - i - 1] = arr[i];
            }
        }
        System.out.println("The reversed array is:");
        for (int i = 0; i < reversedArr.length; i++) {
            if (reversedArr[i] != 0) {
                System.out.printf("%d ", reversedArr[i]);
            }
        }
        System.out.println();
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void showPrimeNumbers(int[] arr) {
        int sum = 0;
        System.out.println("The prime numbers in the array are:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && isPrime(arr[i])) {
                System.out.printf("%d ", arr[i]);
                sum++;
            }
        }
        System.out.printf("\nThe total number of prime numbers in the array is: %d\n", sum);
    }

    public static void sortArrayAscending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                break;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == 0) {
                    break;
                }
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
