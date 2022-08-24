import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List<Map<String,String>> animalList = new ArrayList<>();
        Map<String,List<String>> animalMap = new HashMap<>();
        Map<String,String> map1= new HashMap<>();
        map1.put("name","shark");
        map1.put("habitat","ocean");
        animalList.add(map1);
        Map<String,String> map2= new HashMap<>();
        map2.put("name","bear");
        map2.put("habitat","land");
        animalList.add(map2);
        Map<String,String> map3= new HashMap<>();
        map3.put("name","moose");
        map3.put("habitat","land");
        animalList.add(map3);
        Map<String,String> map4= new HashMap<>();
        map4.put("name","frog");
        map4.put("habitat","swamp");
        animalList.add(map4);
        Map<String,String> map5= new HashMap<>();
        map5.put("name","jelly fish");
        map5.put("habitat","ocean");
        animalList.add(map5);
        Map<String,String> map6= new HashMap<>();
        map6.put("name","heron");
        map6.put("habitat","swamp");
        animalList.add(map6);
        Map<String,String> map7= new HashMap<>();
        map7.put("name","whale");
        map7.put("habitat","ocean");
        animalList.add(map7);
        //System.out.println(animalList);

        List<String> habitat=new ArrayList<>();
        for (Map<String,String> map:animalList){
            habitat.add(map.get("habitat"));
        }
        List<String> allHabitat=habitat.stream()
                .distinct()
                .collect(Collectors.toList());
        //System.out.println(allHabitat); //all habitats name

        for (String h1:allHabitat){//輪流過濾每種habitat
            List<String> animal =new ArrayList<>();//初始化List
            for (Map<String,String> m:animalList){
                if (h1.equals(m.get("habitat"))){
                    animal.add(m.get("name"));//符合要求的動物加入List
                }
            }
            animalMap.put(h1,animal);//將含有動物之List加入對應的Map
        }
        System.out.println("第一題：");
        animalMap.keySet()
                .forEach(m -> {
                    System.out.println(m + ": " + String.join(" , ", animalMap.get(m)));
                });
//---------------------------------------------------------------------------
        Map <String, String> capitalMap = new HashMap<>();
        capitalMap.put("USA","Washington");
        capitalMap.put("Japan","Tokyo");
        capitalMap.put("Thailand","Bangkok");
        capitalMap.put("UK","London");
        capitalMap.put("Australia","Canberra");
        capitalMap.put("Denmark","Copenhagen");
        capitalMap.put("Egypt","Cairo");
        capitalMap.put("Vietnam","Hanoi");
        capitalMap.put("Italy","Rome");
        capitalMap.put("Brazil","Brasilia");

        System.out.println("第二題：");
        for(Map.Entry<String,String> e : capitalMap.entrySet()){
            System.out.println(e.getKey()+" : "+ e.getValue());//第二題
        }



    }
}
