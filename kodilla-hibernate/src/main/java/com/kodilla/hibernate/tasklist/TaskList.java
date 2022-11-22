package com.kodilla.hibernate.tasklist;
import com.sun.istack.NotNull;
import javax.persistence.*;


@Entity
@Table(name = "TASKLIST")
public final class TaskList {

    private int id;
    private String listName;
    private String description;

    public TaskList( String listName, String description) {
        this.listName = listName;
        this.description = description;
    }
    public TaskList(){
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }
    @NotNull
    @Column(name = "LISTNAME")
    public String getListName() {
        return listName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
