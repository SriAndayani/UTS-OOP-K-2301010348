/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sri Andayani
 */
public class Task {
    private int id;
    private String title;
    private String description;

    // Constructor Overloading
    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.description = "";
    }

    public Task(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    // Getter
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Metode Overriding
    @Override
    public String toString() {
        return "\nNo. " + id + "\nNama Pelanggan: " + title + "\nList Menu : \n" + description;
    }
}
