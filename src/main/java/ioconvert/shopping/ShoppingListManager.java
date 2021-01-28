package ioconvert.shopping;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListManager {
    public void saveShoppingList(OutputStream os, List<String> shoppingList) {
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os))) {
            for(String s : shoppingList) {
                bw.write(s);
                bw.newLine();
            }
        }
        catch (IOException e) {
            throw new IllegalStateException("Can't write file!", e);
        }
    }
    public List<String> loadShoppingList(InputStream is) {
        List<String> result = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while((line=br.readLine()) != null) {
                result.add(line);
            }
        }
        catch (IOException e) {
            throw new IllegalStateException("Can't read file!",e);
        }
        return result;
    }
    
}
