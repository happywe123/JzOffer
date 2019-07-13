package ReadAgain.Offer.Question1_10.Quesiton3;

public class Main {

    public boolean FindNumberInArray(int[][] arr, int target){
        if(arr == null || arr.length == 0)
            return false;

        int row = 0;
        int col = arr[0].length - 1;

        while(row < arr.length && col >= 0)
        {
            if(arr[row][col] == target)
                return true;
            else if(arr[row][col] > target)
                col--;
            else if(arr[row][col] < target)
                row++;
        }
        return false;

    }

    public static void main(String[] args){
        int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        Main demo =new Main();
        System.out.println(demo.FindNumberInArray(array,3));

    }
}
