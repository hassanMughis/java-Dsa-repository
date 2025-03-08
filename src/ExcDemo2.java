public class ExcDemo2 {
    public static void main(String[] args) {
        int num[] = {4,8,16,32,64,128,256,512};
        int deno[] = {2,0,4,4,0,8};
        for(int i =0;i<num.length;i++){
            try{
                System.out.println(num[i]+" / "+deno[i]+" is " + num[i]/deno[i]);
            }
            catch(ArithmeticException exc){
                System.out.println("Cant divide by 0");
            }
            catch(ArrayIndexOutOfBoundsException exc){
                System.out.println("No matching element found");
            }
        }
    }
}
