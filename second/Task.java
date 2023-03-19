package second;


import java.time.LocalDateTime;


public class Task {
    private Integer id;
    private LocalDateTime time;
    private String deadline;
    private String subject;
    private Priority level;
    private Person who;
    private static Integer counter = 0;

    
    public Task(String subject, Priority level, Person who, String deadline) {
        this.id = ++counter;
        this.time = LocalDateTime.now();
        this.deadline = deadline;
        this.subject = subject;
        this.level = level;
        this.who = who;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public LocalDateTime getTime() {
        return time;
    }


    public void setTime(LocalDateTime time) {
        this.time = time;
    }


    public String getDeadline() {
        return deadline;
    }


    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }


    public String getSubject() {
        return subject;
    }


    public void setSubject(String subject) {
        this.subject = subject;
    }


    public Priority getLevel() {
        return level;
    }


    public void setLevel(Priority level) {
        this.level = level;
    }


    public Person getWho() {
        return who;
    }


    public void setWho(Person who) {
        this.who = who;
    }

    
@Override
public String toString() {
    return String.format("id: %s\npriority: %s\ntask: %s\nwhen created: %s\nexecuter: %s\ndeadline: %s", id, level, subject, time, who, deadline);
}
}
