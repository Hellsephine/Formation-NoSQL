import java.util.ArrayList;
import java.util.List;

public class text {
    

    private List<Integer> l = new ArrayList<Integer>();
    private List<Integer> s = new ArrayList<Integer>();
    
    public void test(){

        l.add(1);
        l.add(2);
        l.add(3);
        
        for(Integer d :l ){
            s.add(++d);
        }
    }


}

