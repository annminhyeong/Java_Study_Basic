package ch14;

public class Ex12 {
	//스트림 만들기 - 파일과 빈 스트림
	//
	//파일을 소스로 하는 스트림 생성하기
	//Stream<Path> Files.list(Path dir) : Path는 파일 또는 디렉토리
	//
	//파일내용을 라인단위로 읽어서 String으로 만듦
	//Stream<String> Files.lines(Path path)
	//Stream<String> Files.lines(Path path, Charset cs)
	//Stream<String> lines() //BufferedReader클래스의 메서드
	//
	//비어있는 스트림 생성하기
	//Stream emptyStream = Stream.empty(); //empty()는 빈 스트림을 생성해서 반환한다.
	//
	//long count = emptyStream.count() //count의 값은 0
}
