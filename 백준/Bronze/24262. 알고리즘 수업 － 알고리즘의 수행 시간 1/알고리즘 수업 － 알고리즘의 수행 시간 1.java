import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        bw.write("1");
        bw.newLine();
        bw.write("0");
        
        br.close();
        bw.close();
        
    }
}