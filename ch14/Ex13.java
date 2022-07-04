package ch14;
//스트림의 연산
//1. 스트림 만들기
//2. 중간 연산 ( n번)
//Stream<T> distinct() : 중복을 제거
//
//Stream<T> filter(Predicate<T> predicate) : 조건에 안 맞는 요소 제외)
//
//Stream<T> limit(long maxSize) : 스트림 일부를 잘라낸다
//
//Stream<T> skip(long n) : 스트림 일부를 건너뛴다.
//
//Stream<T> peek(Consumer<T> action) : 스트림 요소에 작업수행
//
//Stream<T> sorted()
//Stream<T> sorted(Comparator<T> comparator) : 스트림의 요소를 정렬한다.
//
//Stream<R> map(Funtion<T,R> mapper)
//DoubleStream mapToDouble(ToDoubleFunction<T> mapper)
//IntStream mapToInt(ToIntFunction<T> mapper)
//LongStream mapToLong(ToLongFunction<T> mapper)
//Stream<R> flatMap(Function<T, Stream<R>> mapper)
//DoubleStream flatMapToDouble(Function<T, DoubleStream> m)
//IntStream flatMapToInt(Function<T, IntStream> m)
//LongStream flatMap(Function<T, LongStream> m) : 스트림의 요소를 변환한다.
//
//3.  최종 연산 (1번)
//void forEach(Consumer<? super T> action)
//void forEachOrdered(Consumer<? super T> action) //순서유지 : 각 요소에 지정된 작업을 수행
//
//long count() : 스트림의 요소의 개수 반환
//
//Optonal<T> max(Comparator<? super T> comparator) : 스트림의 최대값 반환
//
//Optonal<T> min(Comparator<? super T> comparator) : 스트림의 최소값 반환
//
//Optional<T> findAny() //아무거나 하나
//Optional<T> findFirst() //첫번째 요소  : 스트림의 요소를 반환
//
//boolean allMatch(Predicate<T> p) //모두만족하는지
//boolean anyMatch(Predicate<T> p) //하나라도 만족하는지
//boolean noneMatch(Predicate<T> p) //모두 만족하는지
//: 주어진 조건의 모든 요소가 만족시키는지 않는지 확인
//
//Object[] toArray()
//A[] toArray(IntFuntion<A[]> generator) : 스트림의 모든 요소를 배열로 반환
//
//Optional<T> reduce(BinaryOperator<T> accumulator)
//T reduce(T identity, BinaryOperator<T> accumulator)
//U reduce(U identity, BiFuntion<U,T,U> accumulator, BinaryOperator<U> combiner) : 스트림의 요소를 하나씩 줄여가면서 계산한다.
//
//R collect(Collector<T,A,R> collector)
//R collect(Supplier<R> supplier, biConsumer<R,T> accumulator, BiConsumer<R,R> combiner) : 스트림의 요소를 수집한다. 주로 요소를 그룹화하거나 분할한 결과를 컬렉션에 남아 반환하는데 사용한다.

public class Ex13 {

}
