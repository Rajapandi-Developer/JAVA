// String Manipulation

class Result {

    /*
     * Complete the 'dnaComplement' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String dnaComplement(String s) {
    char arr[]=new char[s.length()];
    
    for (int i=0;i<s.length();i++){
        arr[i]=s.charAt(i);
    }
    char []arr2=new char[arr.length];
    int n=0;
    for(int j=(arr.length-1);j>=0;j--){
        arr2[n]=arr[j];
        n++;
    }
    for(char d:arr2)
     System.out.print(d);
    for(int i=0;i<arr2.length;i++){
        if(arr2[i]=='A'){
            arr2[i]='T';
        }
        else if(arr2[i]=='T'){
            arr2[i]='A';
        }
        else if(arr2[i]=='C'){
            arr2[i]='G';
        }
        else if(arr2[i]=='G'){
            arr2[i]='C';
        }
    }
    
        String values=new String(arr2);
        return values;
    }

    }



public class Manipulate_String {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.dnaComplement(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
