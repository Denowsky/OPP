package People;
public interface CanShout {
    
    default String shout(String arg) {
        return "Крикнул";
    }
}
