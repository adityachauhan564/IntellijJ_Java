package GFGContest;

import java.util.ArrayList;

public class ClosestFriends {

        public static ArrayList<Integer> closestFriends(ArrayList<Integer> arr) {
            ArrayList<Integer> result = new ArrayList<>();

            // Iterate through the ArrayList
            for (int i = 0; i < arr.size(); i++) {
                int height = arr.get(i);
                int closestIndex = -1;

                // Find the closest friend to the left whose height is strictly smaller
                for (int j = i - 1; j >= 0; j--) {
                    if (arr.get(j) < height) {
                        closestIndex = j;
                        break;
                    }
                }

                result.add(closestIndex);
            }

            return result;
        }
    }


