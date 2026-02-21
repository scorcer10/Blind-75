package Matrix;

import java.util.Arrays;

public class ImageRoatation {

    public static int[][] rotate(int[][] image, int degree) {
        int n = image.length;
        int[][] rotated = new int[n][n];

        if (degree == 90) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    rotated[j][n - 1 - i] = image[i][j];
                }
            }
        } else if (degree == 180) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    rotated[n - 1 - i][n - 1 - j] = image[i][j];
                }
            }
        } else if (degree == 270) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    rotated[n - 1 - j][i] = image[i][j];
                }
            }
        }
        return rotated;
    }

    // Method to flip the matrix vertically
    public static void flipVertically(int[][] image) {
        int n = image.length;
        for (int i = 0; i < n / 2; i++) {
            int[] temp = image[i];
            image[i] = image[n - 1 - i];
            image[n - 1 - i] = temp;
        }
    }

    // Method to flip the matrix horizontally
    public static void flipHorizontally(int[][] image) {
        int n = image.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][n - 1 - j];
                image[i][n - 1 - j] = temp;
            }
        }
    }

    // Method to perform the overall transformation based on rotation, vertical and horizontal flip
    public static int[][] transformImage(int[][] image, int rotation, int verticalFlip, int horizontalFlip) {
        image = rotate(image, rotation);

        if (verticalFlip == 1) {
            flipVertically(image);
        }
        if (horizontalFlip == 1) {
            flipHorizontally(image);
        }

        return image;
    }

    public static void main(String[] args) {
        int[][] image = {
                {1, 0, 0},
                {0, 1, 1},
                {0, 0, 1}
        };

        int rotation = 180;
        int verticalFlip = 0;
        int horizontalFlip = 0;

        int[][] transformedImage = transformImage(image, rotation, verticalFlip, horizontalFlip);

        for (int[] row : transformedImage) {
            System.out.println(Arrays.toString(row));
        }
    }
}
