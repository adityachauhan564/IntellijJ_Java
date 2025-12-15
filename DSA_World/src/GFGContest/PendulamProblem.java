package GFGContest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PendulamProblem {

        public static ArrayList<Integer> thePendulum(ArrayList<Integer> arr) {
            Collections.sort(arr); // Sort the ArrayList in ascending order

            ArrayList<Integer> pendulum = new ArrayList<>();

            // Alternate between adding elements to the left and right of the pendulum
            boolean addToLeft = true;
            for (int num : arr) {
                if (addToLeft) {
                    pendulum.add(0, num); // Add to the left
                } else {
                    pendulum.add(num); // Add to the right
                }
                addToLeft = !addToLeft; // Toggle between left and right
            }

            return pendulum;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int T = scanner.nextInt(); // Number of test cases

            for (int t = 0; t < T; t++) {
                int n = scanner.nextInt(); // Size of arr

                ArrayList<Integer> arr = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    arr.add(scanner.nextInt()); // Input elements of arr
                }

                // Get the pendulum arrangement of elements and print it
                ArrayList<Integer> pendulum = thePendulum(arr);
                for (int num : pendulum) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }

