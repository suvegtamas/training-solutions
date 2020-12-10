package week07d04;

import java.time.LocalDateTime;

public class Lab {
    private String title;
    private boolean completed;
    private LocalDateTime completedAt;

    public Lab(String title) {
        this.title = title;
        completed = false;
    }

    public Lab(String title, LocalDateTime completedAt) {
        this.title = title;
        this.completedAt = completedAt;
        completed = true;
    }
    public void complete(LocalDateTime time) {
        completed = true;
        completedAt = time;
    }
    public void complete() {
        completedAt = LocalDateTime.now();
        completed = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    @Override
    public String toString() {
        return "Lab{" +
                "title='" + title + '\'' +
                ", completed=" + completed +
                ", completedAt=" + completedAt +
                '}';
    }
    //    Hozz létre egy week07d04.Lab nevű osztályt, ami azt tárolja el, hogy melyik feladattal készültél el.
//    Három attribútuma: title ami a tananyag neve, egy completed, hogy elkészültél-e vele, és a completedAt ,
//    ami azt tárolja, hogy mikor. Legyen két konstruktora! Az egyik csak a címet várja, ekkor úgy állítsa be
//    a példányt, hogy még nem készültél el. Legyen egy másik, ami várja a címet és a dátumot. Ekkor azt állítsa
//    be, hogy elvégezted a gyakorlati feladatot. Írj egy complete metódust, ami kap egy dátumot, és beállítja,
//    hogy elvégezted a gyakorlati feladatot. Legyen egy complete metódusa, ami semmit nem vár, ez azt állítja be,
//    hogy MOST végezted el a gyakorlati feladatot. Írd meg a toString metódusát is!
}
