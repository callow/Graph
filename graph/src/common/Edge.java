package common;

/**
 *  
 * 边
 */
public class Edge {
	public int weight; // 权重
	public Node from; // 从哪
	public Node to; // 到哪

	public Edge(int weight, Node from, Node to) {
		this.weight = weight;
		this.from = from;
		this.to = to;
	}

}
