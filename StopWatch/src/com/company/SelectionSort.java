package com.company;

    public class SelectionSort {
        void sort(int arr[]) {
            int n = arr.length;

            // Duyệt qua từng phần tử của mảng
            for (int i = 0; i < n - 1; i++) {

                // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
                int min_idx = i;
                for (int j = i + 1; j < n; j++)
                    if (arr[j] < arr[min_idx])
                        min_idx = j;

                // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }

        // Xuất mảng
        void printArray(int arr[]) {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

    }
