package lesson7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordCount {

    public  static  void main(String[] args) {


        String words = "Barracuda porgy lake chub, \"zebra loach; giant danio guppy giant gourami temperate bass, burma danio,\" rocket danio amago trumpetfish elasmobranch pompano dolphinfish Owens pupfish. Long-finned char Sundaland noodlefish European flounder cowfish sardine jewel tetra collared dogfish orangestriped triggerfish duckbill eel basslet basslet tope dartfish sturgeon? Tenuis: basking shark triplespine mola merluccid hake torrent catfish, squawfish tarwhine. Devario sailfin silverside amur pike trunkfish sand knifefish velvetfish codlet, goblin shark medusafish Rainbow trout cookie-cutter shark sixgill ray. Stoneroller minnow tuna collared dogfish, atka mackerel mahi-mahi, \"largemouth bass Black triggerfish.\" Norwegian Atlantic salmon goatfish frogmouth catfish, hussar damselfish halfmoon four-eyed fish sand stargazer tetra cusk-eel?\n" +
                "\n" +
                "Old World knifefish sea toad lefteye flounder electric knifefish shortnose chimaera grenadier yellow weaver rough scad northern clingfish: ghost knifefish. Collared carpetshark Colorado squawfish mudminnow worm eel Atlantic cod; lefteye flounder? Capelin basslet vendace pelagic cod channel bass luderick vimba luminous hake tenpounder capelin swallower.";
        words =words.replace(",","")
                .replace(".", "")
                .replace("!", "")
                .replace("?", "")
                .replace("\"", "")
                .replace("\n", " ");

        String[] allWords = words.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (int i =0; i< allWords.length; i++){
            if (allWords[i] == null|| allWords[i].trim().isEmpty()){
                continue;
            }

           Integer count = map.get(allWords[i]);
            if (count == null){
                map.put(allWords[i],  1);
            }  else {
                map.put(allWords[i],  count + 1);
            }
        }

        Set<String> keys = map.keySet();

        for(String key: keys){
            Integer count  = map.get(key);
            System.out.println(key + " " + count);
        }

        System.out.println(" ");

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry: entries){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        //map.forEach((k,v) -> System.out.println(k + " " + v));
    }
}
