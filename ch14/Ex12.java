package ch14;

public class Ex12 {
	//��Ʈ�� ����� - ���ϰ� �� ��Ʈ��
	//
	//������ �ҽ��� �ϴ� ��Ʈ�� �����ϱ�
	//Stream<Path> Files.list(Path dir) : Path�� ���� �Ǵ� ���丮
	//
	//���ϳ����� ���δ����� �о String���� ����
	//Stream<String> Files.lines(Path path)
	//Stream<String> Files.lines(Path path, Charset cs)
	//Stream<String> lines() //BufferedReaderŬ������ �޼���
	//
	//����ִ� ��Ʈ�� �����ϱ�
	//Stream emptyStream = Stream.empty(); //empty()�� �� ��Ʈ���� �����ؼ� ��ȯ�Ѵ�.
	//
	//long count = emptyStream.count() //count�� ���� 0
}
