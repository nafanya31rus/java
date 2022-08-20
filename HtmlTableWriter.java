package myclass39;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HtmlTableWriter implements TableWriter{

    @Override
    public void writeTable(Row[] table) {
        try {
            FileWriter fileWriter = new FileWriter("table.html");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("<table border=1><b><tr><td>");
            Row header = table[0];
            bufferedWriter.write(header.left);
            bufferedWriter.write("</td><td>");
            bufferedWriter.write(header.right);
            bufferedWriter.write("</td></tr></b>");
            for(int i= 0; i < table.length; i++) {
                Row current = table[i];
                if(current==null)
                    continue;
                bufferedWriter.write("<tr><td>" + current.left + "</td><td>" + current.right + "</td></tr>");
            }
            bufferedWriter.write("</table>");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getOutputPlace() {
        return "html file: table.html";
    }
}
