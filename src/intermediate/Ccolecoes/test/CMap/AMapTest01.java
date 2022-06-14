package intermediate.Ccolecoes.test.CMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AMapTest01 {
    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
        Map<String, String> map = new LinkedHashMap<>(); /*Para manter a ordem de inserção*/


        /*MAP nao aceita keys com valores duplicados, se vc passar o mesmo key ira substituir por outro*/
        map.put("portuguese", "português");
        map.put("english", "inglês");
        map.put("franch", "francês");
        map.put("japanese", "japones");
        /*Para nao substituir uma chave caso ja exista  usar*/
        map.putIfAbsent("franch", "alemão");
        /*HashMap nao mantem a ordem de inserção, para isso podemos usar a LinkedHashMap*/
        System.out.println(map);

        //PEGAR APENAS O KEY e VALUE DA LISTA
        for(String key: map.keySet()){
            System.out.println("Key: "+key+" ; Value: "+map.get(key));
        }
        System.out.println("----------------------");
        //PEGAR OS VALORES DIRETO SEM A KEY
        for(String value: map.values()){
            System.out.println("Value: "+value);
        }
        System.out.println("----------------------");
        //PEGAR KEY E VALUE JUNTOS
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
