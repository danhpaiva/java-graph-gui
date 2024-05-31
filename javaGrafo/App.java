public class App {
  public static void main(String[] args) {
    Grafo<Integer> grafo = new Grafo<Integer>();

    // arestas são adicionadas.
    // Como o grafo é bidirecional,
    // o booleano bidirecional é passado como true.
    grafo.addAresta(0, 1, true);
    grafo.addAresta(0, 4, true);
    grafo.addAresta(1, 2, true);
    grafo.addAresta(1, 3, true);
    grafo.addAresta(1, 4, true);
    grafo.addAresta(2, 3, true);
    grafo.addAresta(3, 4, true);

    System.out.println("\nGrafo:\n" + grafo.toString());

    // Retorna o número de vértices no grafo.
    grafo.getVertexCount();

    // Retorna o número de arestas no grafo.
    grafo.getEdgesCount(true);

    // Indica se a aresta está presente ou não.
    grafo.hasEdge(3, 4);

    // Indica se o vértice está presente ou não
    grafo.hasVertex(5);
    grafo.neighbours(1);
  }
}
