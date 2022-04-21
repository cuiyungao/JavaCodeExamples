package src11.Generic;

public class GeneticStaticMethod<K> {
    private K k;
    public GeneticStaticMethod(K k){
        this.k=k;
    }
    public static <K> GeneticStaticMethod<K> fun1(K k){
  //public static GeneticStaticMethod<K> fun1(K k){
        return new GeneticStaticMethod<K>(k);
    }

}
