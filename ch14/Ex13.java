package ch14;
//��Ʈ���� ����
//1. ��Ʈ�� �����
//2. �߰� ���� ( n��)
//Stream<T> distinct() : �ߺ��� ����
//
//Stream<T> filter(Predicate<T> predicate) : ���ǿ� �� �´� ��� ����)
//
//Stream<T> limit(long maxSize) : ��Ʈ�� �Ϻθ� �߶󳽴�
//
//Stream<T> skip(long n) : ��Ʈ�� �Ϻθ� �ǳʶڴ�.
//
//Stream<T> peek(Consumer<T> action) : ��Ʈ�� ��ҿ� �۾�����
//
//Stream<T> sorted()
//Stream<T> sorted(Comparator<T> comparator) : ��Ʈ���� ��Ҹ� �����Ѵ�.
//
//Stream<R> map(Funtion<T,R> mapper)
//DoubleStream mapToDouble(ToDoubleFunction<T> mapper)
//IntStream mapToInt(ToIntFunction<T> mapper)
//LongStream mapToLong(ToLongFunction<T> mapper)
//Stream<R> flatMap(Function<T, Stream<R>> mapper)
//DoubleStream flatMapToDouble(Function<T, DoubleStream> m)
//IntStream flatMapToInt(Function<T, IntStream> m)
//LongStream flatMap(Function<T, LongStream> m) : ��Ʈ���� ��Ҹ� ��ȯ�Ѵ�.
//
//3.  ���� ���� (1��)
//void forEach(Consumer<? super T> action)
//void forEachOrdered(Consumer<? super T> action) //�������� : �� ��ҿ� ������ �۾��� ����
//
//long count() : ��Ʈ���� ����� ���� ��ȯ
//
//Optonal<T> max(Comparator<? super T> comparator) : ��Ʈ���� �ִ밪 ��ȯ
//
//Optonal<T> min(Comparator<? super T> comparator) : ��Ʈ���� �ּҰ� ��ȯ
//
//Optional<T> findAny() //�ƹ��ų� �ϳ�
//Optional<T> findFirst() //ù��° ���  : ��Ʈ���� ��Ҹ� ��ȯ
//
//boolean allMatch(Predicate<T> p) //��θ����ϴ���
//boolean anyMatch(Predicate<T> p) //�ϳ��� �����ϴ���
//boolean noneMatch(Predicate<T> p) //��� �����ϴ���
//: �־��� ������ ��� ��Ұ� ������Ű���� �ʴ��� Ȯ��
//
//Object[] toArray()
//A[] toArray(IntFuntion<A[]> generator) : ��Ʈ���� ��� ��Ҹ� �迭�� ��ȯ
//
//Optional<T> reduce(BinaryOperator<T> accumulator)
//T reduce(T identity, BinaryOperator<T> accumulator)
//U reduce(U identity, BiFuntion<U,T,U> accumulator, BinaryOperator<U> combiner) : ��Ʈ���� ��Ҹ� �ϳ��� �ٿ����鼭 ����Ѵ�.
//
//R collect(Collector<T,A,R> collector)
//R collect(Supplier<R> supplier, biConsumer<R,T> accumulator, BiConsumer<R,R> combiner) : ��Ʈ���� ��Ҹ� �����Ѵ�. �ַ� ��Ҹ� �׷�ȭ�ϰų� ������ ����� �÷��ǿ� ���� ��ȯ�ϴµ� ����Ѵ�.

public class Ex13 {

}
