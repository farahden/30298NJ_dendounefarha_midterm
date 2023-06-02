package string_problems;

public class Permutation {

    /** INSTRUCTIONS
     * Create a Java program to compute all permutations of any given string
     *
     * e.g. -  "ABC" = "ABC" "ACB" "BAC" "BCA" "CAB" "CBA"
     */

    public static void main(String[] args) {


    // Implement Here
    String s="ABC";
    int n=s.length();
    Permutation permutation=new Permutation();
permutation.calculate(s,0,n-1);
}

    private void calculate(String str, int left, int right) {
        if(left==right){
            System.out.print(" "+str);
        }
        else{
            for(int i=left;i<=right;i++){
                String swapped=this.swap(str,left,i);
                this.calculate(swapped,left+1,right);
            }
        }
    }
    private String swap(String str,int i,int j){
        char temp;
        char[] charArray=str.toCharArray();
        temp= charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;
        return String.valueOf(charArray);
    }
}
