public class MissingNumInArray {
    public static void main(String[] args){
     int[] distinctArray={0,1,2,3};
     System.out.println("Expected number:" + distinctArray[2]);
     int length=distinctArray.length-1;
     int[] givenArray={0,1,3};
     for (int i=0;i<=length-1;i++){
         if(i!=givenArray[i])
         {
             System.out.print("The missing number in the array is: "+ i);
         }
     }
    }

}
