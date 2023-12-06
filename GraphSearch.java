import java.util.*; // Import the Java utilities library which contains classes like LinkedList, Queue, etc.

public class GraphSearch {
    // 'adj' will hold the adjacency list representation of the graph
    private LinkedList<Integer>[] adj;

    // Constructor for the GraphSearch class
    public GraphSearch(int vertices) {
        adj = new LinkedList[vertices]; // Initialize the adjacency list for the number of vertices
        for (int i = 0; i < vertices; i++) {
            adj[i] = new LinkedList<>(); // Initialize the linked list for each vertex
        }
    }

    // Function to add an edge from a source vertex to a destination vertex
    public void addEdge(int source, int destination) {
        adj[source].add(destination); // Add the destination vertex to the linked list of the source vertex
    }

    // Method to perform Breadth First Search starting from a given vertex
    public void BFS(int startVertex) {
        boolean[] visited = new boolean[adj.length]; // Array to keep track of visited vertices
        Queue<Integer> queue = new LinkedList<>(); // Queue to hold the vertices for BFS

        visited[startVertex] = true; // Mark the start vertex as visited
        queue.add(startVertex); // Enqueue the start vertex

        while (!queue.isEmpty()) { // Continue until the queue is empty
            int vertex = queue.poll(); // Dequeue a vertex from the queue
            System.out.print(vertex + " "); // Print the visited vertex

            // Iterate over all the adjacent vertices of the dequeued vertex
            for (int adjVertex : adj[vertex]) {
                if (!visited[adjVertex]) { // If an adjacent vertex has not been visited
                    visited[adjVertex] = true; // Mark it as visited
                    queue.add(adjVertex); // Enqueue the adjacent vertex
                }
            }
        }
    }

    // Method to perform Depth First Search starting from a given vertex
    public void DFS(int startVertex) {
        boolean[] visited = new boolean[adj.length]; // Array to keep track of visited vertices
        DFSUtil(startVertex, visited); // Call the recursive helper function to perform DFS
    }

    // Recursive helper function for DFS
    private void DFSUtil(int vertex, boolean[] visited) {
        visited[vertex] = true; // Mark the current vertex as visited
        System.out.print(vertex + " "); // Print the visited vertex

        // Recur for all the vertices adjacent to this vertex
        for (int adjVertex : adj[vertex]) {
            if (!visited[adjVertex]) { // If an adjacent vertex has not been visited
                DFSUtil(adjVertex, visited); // Recur for that adjacent vertex
            }
        }
    }

    // Main method to run the graph search
    public static void main(String[] args) {
        GraphSearch graph = new GraphSearch(4); // Create a graph with 4 vertices

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        // Perform BFS starting from vertex 2
        System.out.println("Breadth First Traversal starting from vertex 2:");
        graph.BFS(2);

        // Perform DFS starting from vertex 2
        System.out.println("\nDepth First Traversal starting from vertex 2:");
        graph.DFS(2);
    }
}
