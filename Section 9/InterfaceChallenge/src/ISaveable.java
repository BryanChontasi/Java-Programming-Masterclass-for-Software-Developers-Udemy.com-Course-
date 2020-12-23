import java.util.List;

/**
 * @author Bryan Chontasi on 23/12/2020.
 * @project InterfaceChallenge
 */
public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
