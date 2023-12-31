package basis;

import common.Edge;
import common.Graph;
import common.Node;

/**
 * 一种图转化的例子 
 */

public class GraphAdaptor {

	/**
	 * N * 3 矩阵图, 转换程我们的图，[weight, from节点上面的值，to节点上面的值]
	 * [
	 * 	[5,0,7]
	 *  [3,0,1]
	 *  ...
	 * ]
	 * 
	 */
	public static Graph createGraph(int[][] matrix) {
		Graph graph = new Graph();
		for (int i = 0; i < matrix.length; i++) {
			 // 拿到每一条边， matrix[i] 
			int weight = matrix[i][0];
			int from = matrix[i][1];
			int to = matrix[i][2];
			
			// 填充所有nodes
			if (!graph.nodes.containsKey(from)) {
				graph.nodes.put(from, new Node(from));
			}
			if (!graph.nodes.containsKey(to)) {
				graph.nodes.put(to, new Node(to));
			}
			
			//  填充所有邻边和临点
			Node fromNode = graph.nodes.get(from);
			Node toNode = graph.nodes.get(to);
			Edge newEdge = new Edge(weight, fromNode, toNode);
			fromNode.nexts.add(toNode);
			fromNode.out++;
			toNode.in++;
			fromNode.edges.add(newEdge);
			graph.edges.add(newEdge);
		}
		return graph;
	}
}
