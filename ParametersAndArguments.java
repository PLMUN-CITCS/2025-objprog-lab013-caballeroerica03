public class ParametersAndArguments {

    // Method to calculate area
    public static int calculateArea(int width, int height) {
        return width * height;
    }

    // Main method
    public static void main(String[] args) {
        int roomWidth = 10;
        int roomHeight = 15;

        // Call calculateArea and store the result in 'area'
        int area = calculateArea(roomWidth, roomHeight);

        // Print the calculated area
        System.out.println("The calculated area is: " + area);
    }
}
