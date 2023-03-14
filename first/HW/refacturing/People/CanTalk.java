package People;
public interface CanTalk extends CanShout{

    default String voice(String arg){
        return "Говорит про "+ arg;
    }
}
