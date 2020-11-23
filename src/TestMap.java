import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
                Map<String, Integer> map =new HashMap<>();
                map.put("Hoang" ,20);
                map.put("Vui", 21 );
                map.put("Code" ,22);
                map.put("Gym" ,23);
                System.out.println("Phần tử trong HashMap là :" + map);

                Map<String, Integer>map1=new TreeMap<>(map);
                System.out.println(" Phần tử trong TreeMap là: "+ map1);


                Map<String ,Integer> map2= new LinkedHashMap<>(15 ,07f,true);
                map2.put("Hoang" ,20);
                map2.put("Vui", 21 );
                map2.put("Code" ,22);
                map2.put("Gym" ,23);
                System.out.println("Tuổi của Code là:  " + map2.get("Code"));


    }
}
