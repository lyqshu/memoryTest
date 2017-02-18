package yq.test.memory;

/**
 * Created by I030518 on 2017-02-18.
 */
public class LeakNode {
    private long[] content;
    public LeakNode(){
        content = new long[1000];
    }
}
