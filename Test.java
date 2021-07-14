import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: WangYuhao
 * @Date:2021/5/23 15:59
 */
public class Test {

    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> objectObjectConcurrentHashMap = new ConcurrentHashMap<>();
        objectObjectConcurrentHashMap.put("1",1);
        objectObjectConcurrentHashMap.put("1",2);
    }
}
