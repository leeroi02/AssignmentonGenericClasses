package Map;
import java.util.ArrayList;
public class MyMap<Key, Val> {
    private ArrayList<Key> key;
    private ArrayList<Val> val;

    public MyMap(){
        key = new ArrayList<Key>();
        val = new ArrayList<Val>();
    }

    public void put(Key key2, Val val2){
        boolean found = false;
        for(int i=0; i < key.size(); i++){
            if(key.get(i).equals(key2)){
                val.set(i,val2);
                found = true;
                break;
            }
        }
        if(!found){
            key.add(key2);
            val.add(val2);
        }
    }

    public Val get(Key key2){
        for(int i=0; i < key.size(); i++){
            if(key.get(i).equals(key2)){
                return val.get(i);
            }
        }
        return null;
    }

    public Val remove(Key key2){
        for(int i=0; i < key.size(); i++){
            if(key.get(i).equals(key2)){
                key.remove(i);
                return val.remove(i);
            }
        }
        return null;
    }

}
