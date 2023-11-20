import java.util.*;

class Main{
    public static void main(String[] args) {
        System.out.println("Первое задание");
        HashMap<Integer,String> ageAndName = new HashMap<>();
        ageAndName.put(18,"Oleg");
        ageAndName.put(16,"Kirill");
        ageAndName.put(20,"Dima");
        System.out.println(ageAndName);

        System.out.println("Второе задание");
        HashMap <String,Integer> newAgeAndName = rearrange(ageAndName);

        System.out.println(newAgeAndName);

        materingOfArrayList();
        materingOfLinckedList();

        System.out.println("Третье задание");
        ArrayList<String> names = new ArrayList<>();

        names.add("Diana");
        names.add("Danil");
        names.add("Sergey");
        names.add("Kirill");
        names.add("Diana");
        System.out.println(names);

        ArrayList<String> uniqueNames = uniqueArryList(names);
        System.out.println(uniqueNames);


    }


    public static HashMap<String,Integer> rearrange(HashMap<Integer,String> hashMap){
        HashMap<String,Integer> newHashMap = new HashMap<>();
        for(Map.Entry<Integer,String>item : hashMap.entrySet()){
            newHashMap.put(item.getValue(), item.getKey());
        }
        return newHashMap;
    }

    public static void materingOfArrayList (){
        ArrayList<Integer> anyList = new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<1000000;i++){
            anyList.add(random.nextInt(-100000,100000));
        }
        long startTime = System.nanoTime();
        for(int i=0;i<1000;i++){
            anyList.get(random.nextInt(1000000));
        }
        long endtime = System.nanoTime();
        long timeOfCompletion = endtime-startTime;
        System.out.println("ArrayList did it for : " +timeOfCompletion);

    }

    public static void materingOfLinckedList(){
        LinkedList<Integer> anyLinckedList = new LinkedList<>();
        Random random = new Random();
        for(int i=0;i<1000000;i++){
            anyLinckedList.add(random.nextInt(-100000,100000));
        }
        long startTime = System.nanoTime();
        for(int i=0;i<1000;i++){
            anyLinckedList.get(random.nextInt(1000000));
        }
        long endtime = System.nanoTime();
        long timeOfCompletion = endtime-startTime;
        System.out.println("LinckedList did it for : " + timeOfCompletion);

    }

    public static ArrayList<String> uniqueArryList(ArrayList<String> anyArraList){
        Set<String> temp = new HashSet<>(anyArraList);
        ArrayList <String> uniqueList = new ArrayList<String>(temp);
        return uniqueList;


    }
}