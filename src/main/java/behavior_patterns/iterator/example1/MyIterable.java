package behavior_patterns.iterator.example1;

//Let to get an interator on collections
public interface MyIterable <T>{
    MyIterator<T> getIterable(double price);
}
