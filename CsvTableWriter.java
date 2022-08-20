package myclass39;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CsvTableWriter implements TableWriter{

    @Override
    public void writeTable(Row[] table) {
        try {
            FileWriter fileWriter = new FileWriter("table.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for(int i= 0; i < table.length; i++) {

                Row current = table[i];
                if(current==null)
                    continue;
                bufferedWriter.write(current.left + ";" + current.right);
            }

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getOutputPlace() {
        return "csv file: table.csv";
    }
}
