package Set01;
class a {

    public void n(int [] arr )
    {
        
       for (int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }
    }
}



public class abc {
    public static void main(String[] args) {
       a obj = new a();
       int [] arr = {1,2,3,5};
       obj.n(arr);
    }

}
