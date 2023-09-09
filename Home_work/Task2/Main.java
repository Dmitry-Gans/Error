import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        ParsData parsData = new ParsData();
        String newFileName = null;
        WriteFile writeFile = new WriteFile();

        HashMap<String, Object> data = parsData.parsInputData();
        while (data.size() !=6) {
            try{
                throw new DataException();
            } catch (DataException e) {
                data = parsData.parsInputData();
            }
        }

        newFileName = data.get("Фамилия") + ".txt";
        StringBuilder sb = new StringBuilder();
        for (String string : data.keySet()) {
            sb.append(data.get(string));
            sb.append(" ");
        }

        System.out.println(data);
        String filePath = newFileName;
        writeFile.writeData(String.valueOf(sb), filePath);
    }
}