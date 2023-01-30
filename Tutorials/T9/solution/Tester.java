public class Tester {
    
    public static void main(String[] args) {
        
        OrderedPair<String , Integer> pair1 = new OrderedPair<String,Integer>("key", 12345);
        OrderedPair<String , Integer> pair2 = new OrderedPair<String,Integer>("key", 12345);

        OrderedPair<Integer , Integer> pair3 = new OrderedPair<Integer,Integer>(12345, 12345);
        OrderedPair<Integer , Integer> pair4 = new OrderedPair<Integer,Integer>(12345, 12345);


        System.out.println(Util.compare(pair1, pair2));
        System.out.println(Util.compare(pair3, pair4));

        System.out.println(Util.compare(pair1, pair3));
        System.out.println(Util.compare(pair2, pair4));

        // exercise 4

        Integer[] ints   = {1, 8, 5, 6, 7, 0};
		Double[] doubles = {1.1, 8.8, 5.5, 6.6, 7.7, 0.0};
		String[] strings = {"apple", "kiwi", "Mango", "orange", "banana"};

		System.out.println(Util.countGreaterThan(ints,5));
		System.out.println(Util.countGreaterThan(doubles,5.0));
		System.out.println(Util.countGreaterThan(strings,"grappes"));

    }
}
