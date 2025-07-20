package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams101 {
    public static void main(String[] args) {
//     stream101();
//     generateORiterateStream();
//     stream2();
     streams3_collect();
    }

    private static void generateORiterateStream() {

        //generate stream with value "element" 10 times
        Stream<String> streamGenerated =
                Stream.generate(() -> "element").limit(10);
        System.out.println("Generated stream:"+streamGenerated.toList());

        //generate stream with value first element = 40 then upto 20 elements each generated using function given ==> 40,42,44,....
        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
        System.out.println("Iterated stream:"+streamIterated.toList());
    }

    private static void stream101() {
        //STREAM Builder
        Stream<String> streamBuilder =
                Stream.<String>builder().add("abc").add("ancb").add("cxxxx").build();

        Stream<String> streamOut = streamBuilder
                .filter(s->s.startsWith("a")&&s.contains("n")||s.contains("b")); //Intermediate Ops returning Stream ,, LAZY
//                .collect(Collectors.toList()); //Terminal Ops returning Output EAGER closing stream
        System.out.println(streamOut.collect(Collectors.toList()));

    }
    private static void stream2(){
        Stream<Integer> integerStream = Stream.iterate(2,n->n*n).limit(5);
        System.out.println("Generated Stream as List" + integerStream.toList());

        Stream<Integer> integerStreamCopy = Stream.iterate(2,n->n*n).limit(5);
        Integer finalVal = integerStreamCopy.filter(n->n>100)       //256 , 65536
                .map(n->n/2)                  //128, 32768
                .reduce(0,Integer::sum);      //128+32768
        System.out.println(finalVal);            //32896

    }

    private static void streams3_collect(){
        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));

        List<String> productNameList = productList.stream()
                .map(Product::getName)
                .collect(Collectors.toList());

        System.out.println(productNameList);
//        System.out.println(productNameList.getClass());
        //To String
        System.out.println("String:");
        String listToString = productList.stream()
                .map(Product::getName)
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(listToString);
    }
}
class Product{
    private Integer quantity;
    private String name;
    Product(Integer i,String s){
        this.quantity = i;
        this.name=s;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
