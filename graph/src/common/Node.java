package common;

import java.util.ArrayList;
import java.util.List;
/**
 *  
 * ��
 */
public class Node {
	public int value;
	public int in; // ��� = ������ָ���Լ�
	public int out; // ���� = �����ߴ��Լ���ȥ
	public List<Node> nexts; // ���Լ�����������Щ�ھӵ�
	public List<Edge> edges; // ���Լ�����������Щ�ھӱ�

	public Node(int value) {
		this.value = value;
		in = 0;
		out = 0;
		nexts = new ArrayList<>();
		edges = new ArrayList<>();
	}
}
