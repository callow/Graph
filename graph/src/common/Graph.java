package common;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/**
 *  
 * ͼ�� �ܶ�� + �ܶ��
 */
public class Graph {
	public Map<Integer, Node> nodes; // �� 
	public Set<Edge> edges; // ��
	
	public Graph() {
		nodes = new HashMap<>();
		edges = new HashSet<>();
	}
}
