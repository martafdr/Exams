package by.gomel.testTask.operations;

import java.io.*;
import java.util.ArrayList;

public class ReadFile {
    ArrayList<String> arrayList = new ArrayList<>();
    ArrayList allControlEvents = new ArrayList();
    private String line;
    private BufferedReader br;

    public ReadFile(String file) {
        try {
            br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {
                arrayList.add(line);
            }
        } catch (IOException e) {
            System.out.println("File not found! ");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList getAllControlEvents() {
        for (int j = 0; j < (arrayList.size() - 1); j++) {
            String s = arrayList.get(j);
            ReadLine rl = new ReadLine(s);
            allControlEvents.add(rl.getControlEvent());
        }
        return allControlEvents;
    }
}

