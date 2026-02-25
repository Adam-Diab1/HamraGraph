
import java.util.*;

public class HamraGraph {

    static final int MAX = 200;
    static ConnectionPoint[] V = new ConnectionPoint[MAX];
    static double[][] E = new double[MAX][MAX];
    static int vertexCount = 0;
    static final double SCALE = 50.0;

    public static class ConnectionPoint {
        public String name;
        public String kind;
        public double x, y;
        public ConnectionPoint(String name, String kind, double x, double y) {
            this.name = name;
            this.kind = kind;
            this.x = x;
            this.y = y;
        }
        @Override
        public String toString() {
            return name + " (" + x + ", " + y + ") - " + kind;
        }
    }

    public static void addVertex(String name, String kind, double x, double y) {
        if (vertexCount + 1 < MAX) V[++vertexCount] = new ConnectionPoint(name, kind, x, y);
    }

    public static void addEdge(int i, int j) {
        if (i <= 0 || j <= 0 || i > vertexCount || j > vertexCount) return;
        if (V[i] == null || V[j] == null) return;
        double dx = V[i].x - V[j].x;
        double dy = V[i].y - V[j].y;
        double dist = (Math.abs(dx) + Math.abs(dy)) * SCALE;
        E[i][j] = E[j][i] = dist;
    }

    public static void addAllVertices() {
        addVertex("Intersection1", "Intersection", -8, 4.5);
        addVertex("Intersection2", "Intersection", -6, 5.0);
        addVertex("Intersection3", "Intersection", -4, 5.3);
        addVertex("Intersection4", "Intersection", -1.2, 6.1);
        addVertex("Intersection5", "Intersection", 2.9, 5.2);
        addVertex("Intersection6", "Intersection", 4.1, 5.2);
        addVertex("Intersection7", "Intersection", -8.0, 3.0);
        addVertex("Intersection8", "Intersection", -6.6, 3.1);
        addVertex("Intersection9", "Intersection", -4.4, 3.2);
        addVertex("Eyedeas Smart Optics", "Optics Company", -1.4, 4.4);
        addVertex("Intersection11", "Intersection", 3.0, 4.0);
        addVertex("Intersection12", "Intersection", 8.0, 4.0);
        addVertex("AUBMC", "Hospital", 5.2, 3.0);
        addVertex("Intersection14", "Intersection", 7.5, 2.4);
        addVertex("Intersection15", "Intersection", -1.6, 2.8);
        addVertex("Intersection16", "Intersection", 0.0, 2.0);
        addVertex("Intersection17", "Intersection", 2.5, 1.5);
        addVertex("Intersection18", "Intersection", 4.6, 0.6);
        addVertex("Intersection19", "Intersection", 6.7, 0.2);
        addVertex("Intersection20", "Intersection", 8.9, -0.3);
        addVertex("Intersection21", "Intersection", -8.2, 1.0);
        addVertex("Intersection22", "Intersection", -6.8, 0.9);
        addVertex("Sushi Bell", "Restaurant", -5.1, 0.7);
        addVertex("Intersection24", "Intersection", -2.0, 0.2);
        addVertex("Hamra", "Street", 0.0, 0.0);
        addVertex("Intersection26", "Intersection", 2.2, -0.4);
        addVertex("Intersection27", "Intersection", 4.2, -0.8);
        addVertex("Intersection28", "Intersection", 6.4, -1.0);
        addVertex("Intersection29", "Intersection", -8.2, -0.5);
        addVertex("Intersection30", "Intersection", -6.6, -0.5);
        addVertex("Intersection31", "Intersection", -4.0, -1.0);
        addVertex("Intersection32", "Intersection", -2.3, -1.3);
        addVertex("Intersection33", "Intersection", -0.3, -1.5);
        addVertex("Intersection34", "Intersection", 1.7, -1.7);
        addVertex("Intersection35", "Intersection", 4.0, -2.1);
        addVertex("Intersection36", "Intersection", 6.3, -2.3);
        addVertex("Intersection37", "Intersection", 8.2, -2.3);
        addVertex("BHive cafe", "Coffee Shop", -7.1, -2.1);
        addVertex("Intersection39", "Intersection", -5.9, -2.3);
        addVertex("Intersection40", "Intersection", -8.4, -3.1);
        addVertex("Intersection41", "Intersection", -4.0, -3.4);
        addVertex("Intersection42", "Intersection", -2.5, -3.5);
        addVertex("Intersection43", "Intersection", -0.7, -3.6);
        addVertex("Barbar Hamra", "Restaurant", 1.3, -3.7);
        addVertex("Intersection45", "Intersection", -8.5, -4.6);
        addVertex("Intersection46", "Intersection", -7.3, -4.7);
        addVertex("Intersection47", "Intersection", -6.2, -4.8);
        addVertex("Intersection48", "Intersection", -4.1, -4.8);
        addVertex("Intersection49", "Intersection", -2.6, -4.9);
        addVertex("Intersection50", "Intersection", -0.7, -5.0);
        addVertex("Intersection51", "Intersection", 3.3, -4.7);
        addVertex("Multiverse", "Board Games Lounge", 4.6, -4.6);
        addVertex("Intersection53", "Intersection", 8.2, -4.3);
    }

    public static void addAllEdges() {
    	addEdge(1, 2);
    	addEdge(1, 7);
    	addEdge(2, 1);
    	addEdge(2, 3);
    	addEdge(2, 8);
    	addEdge(3, 2);
    	addEdge(3, 9);
    	addEdge(3, 4);
    	addEdge(4, 3);
    	addEdge(4, 10);
    	addEdge(4, 5);
    	addEdge(5, 4);
    	addEdge(5, 11);
    	addEdge(5, 6);
    	addEdge(6, 5);
    	addEdge(6, 12);
    	addEdge(7, 1);
    	addEdge(7, 8);
    	addEdge(7, 21);
    	addEdge(8, 7);
    	addEdge(8, 9);
    	addEdge(8, 2);
    	addEdge(8, 22);
    	addEdge(9, 8);
    	addEdge(9, 15);
    	addEdge(9, 3);
    	addEdge(9, 23);
    	addEdge(10, 3);
    	addEdge(10, 4);
    	addEdge(10, 15);
    	addEdge(10, 11);
    	addEdge(11, 5);
    	addEdge(11, 17);
    	addEdge(11, 13);
    	addEdge(12, 6);
    	addEdge(12, 14);
    	addEdge(13, 11);
    	addEdge(13, 14);
    	addEdge(13, 18);
    	addEdge(14, 12);
    	addEdge(14, 13);
    	addEdge(14, 19);
    	addEdge(15, 9);
    	addEdge(15, 16);
    	addEdge(15, 10);
    	addEdge(15, 24);
    	addEdge(16, 15);
    	addEdge(16, 17);
    	addEdge(16, 25);
    	addEdge(17, 16);
    	addEdge(17, 18);
    	addEdge(17, 11);
    	addEdge(17, 26);
    	addEdge(18, 17);
    	addEdge(18, 19);
    	addEdge(18, 13);
    	addEdge(18, 27);
    	addEdge(19, 18);
    	addEdge(19, 20);
    	addEdge(19, 14);
    	addEdge(19, 28);
    	addEdge(20, 19);
    	addEdge(20, 37);
    	addEdge(21, 22);
    	addEdge(21, 7);
    	addEdge(21, 29);


    	addEdge(22, 23);
    	addEdge(22, 21);
    	addEdge(22, 30);
    	addEdge(22, 8);
    	addEdge(23, 24);
    	addEdge(23, 22);
    	addEdge(23, 9);
    	addEdge(23, 39);
    	addEdge(24, 25);
    	addEdge(24, 23);
    	addEdge(24, 32);
    	addEdge(24, 15);
    	addEdge(25, 24);
    	addEdge(25, 26);
    	addEdge(25, 16);
    	addEdge(25, 33);
    	addEdge(26, 25);
    	addEdge(26, 27);
    	addEdge(26, 34);
    	addEdge(26, 17);
    	addEdge(27, 26);
    	addEdge(27, 28);
    	addEdge(27, 35);
    	addEdge(27, 18);
    	addEdge(28, 27);
    	addEdge(28, 19);
    	addEdge(28, 36);
    	addEdge(29, 40);
    	addEdge(29, 30);
    	addEdge(29, 21);
    	addEdge(30, 29);
    	addEdge(30, 31);
    	addEdge(30, 38);
    	addEdge(30, 22);
    	addEdge(31, 30);
    	addEdge(31, 32);
    	addEdge(31, 41);
    	addEdge(32, 31);
    	addEdge(32, 24);
    	addEdge(32, 33);
    	addEdge(32, 42);
    	addEdge(33, 32);
    	addEdge(33, 34);
    	addEdge(33, 43);
    	addEdge(33, 25);
    	addEdge(34, 33);
    	addEdge(34, 35);
    	addEdge(34, 26);
    	addEdge(34, 44);
    	addEdge(35, 27);
    	addEdge(35, 51);
    	addEdge(35, 34);
    	addEdge(35, 36);
    	addEdge(36, 28);
    	addEdge(36, 35);
    	addEdge(36, 37);
    	addEdge(37, 36);
    	addEdge(37, 20);
    	addEdge(37, 53);
    	addEdge(38, 30);
    	addEdge(38, 39);
    	addEdge(38, 46);
    	addEdge(39, 38);
    	addEdge(39, 47);
    	addEdge(39, 23);
    	addEdge(40, 41);


    	addEdge(40, 29);
    	addEdge(40, 45);
    	addEdge(41, 40);
    	addEdge(41, 42);
    	addEdge(41, 48);
    	addEdge(41, 31);
    	addEdge(42, 41);
    	addEdge(42, 43);
    	addEdge(42, 49);
    	addEdge(42, 32);
    	addEdge(43, 42);
    	addEdge(43, 44);
    	addEdge(43, 50);
    	addEdge(43, 33);
    	addEdge(44, 43);
    	addEdge(44, 34);
    	addEdge(45, 40);
    	addEdge(45, 46);
    	addEdge(46, 45);
    	addEdge(46, 47);
    	addEdge(46, 38);
    	addEdge(47, 46);
    	addEdge(47, 48);
    	addEdge(47, 39);
    	addEdge(48, 47);
    	addEdge(48, 49);
    	addEdge(48, 41);
    	addEdge(49, 48);
    	addEdge(49, 50);
    	addEdge(49, 42);
    	addEdge(50, 43);
    	addEdge(50, 49);
    	addEdge(50, 51);
    	addEdge(51, 52);
    	addEdge(51, 50);
    	addEdge(52, 51);
    	addEdge(52, 53);
    	addEdge(53, 37);
    	addEdge(53, 52);
    }

    public static void displayVertices() {
        for (int i = 1; i <= vertexCount; i++) System.out.println(i + ". " + V[i]);
    }

    public static void displayEdges() {
        for (int i = 1; i <= vertexCount; i++) {
            for (int j = i + 1; j <= vertexCount; j++) {
                if (E[i][j] != 0) System.out.printf("%s ↔ %s : %.2f m%n", V[i].name, V[j].name, E[i][j]);
            }
        }
    }

    public static int resolveVertexIndex(String input, Scanner sc) {
        input = input.trim();
        try {
            int idx = Integer.parseInt(input);
            if (idx >= 1 && idx <= vertexCount) return idx;
            System.out.println("Number out of range.");
            return -1;
        } catch (NumberFormatException e) {
            List<Integer> matches = new ArrayList<>();
            for (int i = 1; i <= vertexCount; i++) {
                if (V[i].name.toLowerCase().contains(input.toLowerCase())) matches.add(i);
            }
            if (matches.size() == 0) {
                System.out.println("No matches found for \"" + input + "\".");
                return -1;
            }
            if (matches.size() == 1) return matches.get(0);
            System.out.println("Multiple matches:");
            for (int m : matches) System.out.println(m + ". " + V[m].name);
            System.out.print("Enter the number of the vertex you mean: ");
            try {
                int choice = sc.nextInt();
                sc.nextLine();
                if (matches.contains(choice)) return choice;
                System.out.println("Choice not in the list.");
                return -1;
            } catch (InputMismatchException ex) {
                sc.nextLine();
                System.out.println("Invalid input.");
                return -1;
            }
        }
    }

    public static void searchByName(String name) {
        boolean found = false;
        for (int i = 1; i <= vertexCount; i++) {
            if (V[i].name.toLowerCase().contains(name.toLowerCase())) {
                System.out.println(i + ". " + V[i]);
                found = true;
            }
        }
        if (!found) System.out.println("No location found with that name.");
    }

    public static void listByType(String type) {
        boolean found = false;
        for (int i = 1; i <= vertexCount; i++) {
            if (V[i].kind.equalsIgnoreCase(type)) {
                System.out.println(i + ". " + V[i]);
                found = true;
            }
        }
        if (!found) System.out.println("No places found of this type.");
    }

    public static void findNearest(Scanner sc) {
    	displayVertices();
        System.out.print("Enter vertex number or name: ");
        String in = sc.nextLine();
        int i = resolveVertexIndex(in, sc);
        if (i < 1) return;
        double bestDist = Double.MAX_VALUE;
        int bestIndex = -1;
        for (int j = 1; j <= vertexCount; j++) {
            if (i == j) continue;
            if (E[i][j] != 0 && E[i][j] < bestDist) {
                bestDist = E[i][j];
                bestIndex = j;
            }
        }
        if (bestIndex == -1) System.out.println("No neighbors for this vertex.");
        else System.out.printf("Nearest place to %s is: %s (distance %.2f m)%n", V[i].name, V[bestIndex].name, bestDist);
    }

    public static List<Integer> dijkstraPath(int src, int dest) {
        int n = vertexCount;
        double INF = Double.MAX_VALUE / 4;
        double[] dist = new double[n + 1];
        boolean[] used = new boolean[n + 1];
        int[] prev = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dist[i] = INF;
            used[i] = false;
            prev[i] = -1;
        }
        dist[src] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingDouble(a -> a[1]));
        pq.add(new int[] {src, 0});
        while (!pq.isEmpty()) {
            int u = pq.poll()[0];
            if (used[u]) continue;
            used[u] = true;
            if (u == dest) break;
            for (int v = 1; v <= n; v++) {
                if (E[u][v] != 0) {
                    double alt = dist[u] + E[u][v];
                    if (alt < dist[v]) {
                        dist[v] = alt;
                        prev[v] = u;
                        pq.add(new int[] {v, (int)alt});
                    }
                }
            }
        }
        if (prev[dest] == -1 && src != dest) {
            if (src == dest) return Collections.singletonList(src);
            return Collections.emptyList();
        }
        List<Integer> path = new ArrayList<>();
        for (int at = dest; at != -1; at = prev[at]) path.add(at);
        Collections.reverse(path);
        return path;
    }

    public static void printStepDirections(List<Integer> path) {
        if (path.isEmpty()) {
            System.out.println("No path.");
            return;
        }
        double total = 0;
        System.out.println("Route:");
        for (int i = 0; i < path.size() - 1; i++) {
            int a = path.get(i);
            int b = path.get(i + 1);
            double dx = V[b].x - V[a].x;
            double dy = V[b].y - V[a].y;
            double dist = (Math.abs(dx) + Math.abs(dy)) * SCALE;
            total += dist;
            String dir;
            if (Math.abs(dx) >= Math.abs(dy)) {
                dir = dx > 0 ? "RIGHT" : "LEFT";
            } else {
                dir = dy > 0 ? "UP" : "DOWN";
            }
            System.out.printf("%d) From \"%s\" go %s for %.2f m to \"%s\"%n", i + 1, V[a].name, dir, dist, V[b].name);
        }
        System.out.printf("Total distance: %.2f m%n", total);
    }

    public static void shortestPathInteractive(Scanner sc) {
    	displayVertices();
        System.out.print("Enter source vertex number or name: ");
        String sIn = sc.nextLine();
        int s = resolveVertexIndex(sIn, sc);
        if (s < 1) return;
        System.out.print("Enter destination vertex number or name: ");
        String dIn = sc.nextLine();
        int d = resolveVertexIndex(dIn, sc);
        if (d < 1) return;
        if (s == d) {
            System.out.println("Source and destination are the same: " + V[s].name);
            return;
        }
        List<Integer> path = dijkstraPath(s, d);
        if (path.isEmpty()) {
            System.out.println("No path found from " + V[s].name + " to " + V[d].name);
            return;
        }
        printStepDirections(path);
    }

    public static void main(String[] args) {
        addAllVertices();
        addAllEdges();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("1. Display all vertices");
            System.out.println("2. Display all edges");
            System.out.println("3. Search for a place by name");
            System.out.println("4. List all places of a type");
            System.out.println("5. Find nearest place to a chosen vertex (enter number or name)");
            System.out.println("6. Shortest path (Dijkstra) (enter number or name)");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            String line = sc.nextLine();
            int choice;
            try { choice = Integer.parseInt(line.trim()); } catch (Exception e) { System.out.println("Invalid input."); continue; }
            if (choice == 1) displayVertices();
            else if (choice == 2) displayEdges();
            else if (choice == 3) { System.out.print("Enter name (or substring): "); String name = sc.nextLine(); searchByName(name); }
            else if (choice == 4) { System.out.print("Enter type (e.g. Restaurant): "); String type = sc.nextLine(); listByType(type); }
            else if (choice == 5) findNearest(sc);
            else if (choice == 6) shortestPathInteractive(sc);
            else if (choice == 7) { System.out.println("Goodbye!"); break; }
            else System.out.println("Invalid choice.");
        }
        sc.close();
    }
} 