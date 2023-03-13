package Tree;

public interface CanShout {
    
    default String shout(String arg) {
        return "Крикнул";
    }
}
