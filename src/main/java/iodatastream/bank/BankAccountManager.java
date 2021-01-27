package iodatastream.bank;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class BankAccountManager {
public void saveAccount(BankAccount account, Path folder) {
    Path path = folder.resolve(account.getAccountNumber() + ".dat");
    try(DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))) {
            dos.writeUTF(account.getAccountNumber());
            dos.writeUTF(account.getOwner());
            dos.writeDouble(account.getBalance());
    } catch (IOException e) {
        throw new IllegalStateException("Can't write file", e);
    }
}
public BankAccount loadAccount(InputStream is) {
    try(DataInputStream dis = new DataInputStream(new BufferedInputStream(is))) {
        return new BankAccount(dis.readUTF(),dis.readUTF(),dis.readDouble());
    }
    catch (IOException e) {
        throw new IllegalStateException("Something went wrong!",e );
    }

}

}
/* saveAccount() metódus egy BankAccount példány állapotát menti a bankszámla számával megegyező nevű .dat
kiterjesztésű fájlba DataOutputStream segítségével. Paraméterként megkapja a mentési mappát is Path objektumknt.*/
