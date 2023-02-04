public class Util {
    

    public static <P extends Pair> boolean compare(P p1 , P p2){

        if(p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue()))
        return true; 
        return false; 
    }

     // public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
    //     return p1.getKey().equals(p2.getKey()) &&
    //            p1.getValue().equals(p2.getValue());
    // }

    public static <K,V> boolean compare(K p1Key, V p1Value, K p2Key, V p2Value){
        if(p1Key.equals(p2Key) && p1Value.equals(p2Value))
        return true; 
        return false; 
    }

   


    public static <T extends Comparable<T>> int  countGreaterThan(T[] array, T elemnt){
        int count=0; 
        for(T item: array){
            if(item.compareTo(elemnt)> 0)
            count++;
        }

        return count; 
    }


    public static void main(String[] args) {
        OrderedPair<String , Integer> p1 = new OrderedPair<String,Integer>("Key", 1234);
        OrderedPair<String , Integer> p2 = new OrderedPair<String,Integer>("Key", 1234);

        OrderedPair<String , String> p3 = new OrderedPair<String,String>("Key", "97987");
        OrderedPair<String , String> p4 = new OrderedPair<String,String>("Key", "97987");

        System.out.println(compare(p1.key,p1.value,  p2.key, p2.value));
        System.out.println( compar(p1, p3));

        Integer[] ints   = {1, 8, 5, 6, 7, 0};
		Double[] doubles = {1.1, 8.8, 5.5, 6.6, 7.7, 0.0};
		String[] strings = {"apple", "kiwi", "Mango", "orange", "banana"};

		System.out.println(countGreaterThan(ints,5));
		System.out.println(countGreaterThan(doubles,5.0));
		System.out.println(countGreaterThan(strings,"grappes"));





    }


}
