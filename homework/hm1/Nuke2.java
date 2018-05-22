import java.io.*;
class Nuke2{
  public static void main(String[] args) throws Exception{
    BufferedReader keyboard;
    String inputLine;
    keyboard = new BufferedReader(new InputStreamReader(System.in));
    inputLine =keyboard.readLine();
    StringBuffer sb = new StringBuffer(inputLine);
    sb.delete(1,2);
    System.out.print(sb);
  }
}
