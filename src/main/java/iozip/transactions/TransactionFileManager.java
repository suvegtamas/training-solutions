package iozip.transactions;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class TransactionFileManager {
    public void saveTransactions(Path file, List<Transaction> transactions) {
        try (ZipOutputStream zos = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(file)))){
            for(Transaction t : transactions) {
                zos.putNextEntry(new ZipEntry(Long.toString(t.getId())));
                String outputString = t.getTime().toString() + "\n" + t.getAccount() + "\n" + Double.toString(t.getAmount());
                zos.write(outputString.getBytes());
                zos.closeEntry();
            }
        } catch (IOException e) {
            throw new IllegalStateException("Something went wrong!", e);
        }
    }
}
/* saveTransactions() metódusa a paraméterként kapott Path-ra elmenti a Transaction listában kapott tranzakciókat tömörítve.
Minden tranzakció külön szöveges fájlba kerüljön! A fájl neve a tranzakció azonosítója legyen! Tartalma sortöréssel (\n) elválasztva az időpont,
a bankszámlaszám és az összeg.*/
