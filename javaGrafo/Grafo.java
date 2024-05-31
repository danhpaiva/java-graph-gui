import java.util.*;

class Grafo<T> {

  // Usamos HashMap para armazenar as arestas no grafo
  private Map<T, List<T>> map = new HashMap<>();

  // Esta função adiciona um novo vértice ao grafo
  public void addVertice(T s) {
    map.put(s, new LinkedList<T>());
  }

  // Esta função adiciona a aresta
  // entre a origem e o destino
  public void addAresta(T origem, T destino,
      boolean bidirectional) {

    if (!map.containsKey(origem))
      addVertice(origem);

    if (!map.containsKey(destino))
      addVertice(destino);

    map.get(origem).add(destino);
    if (bidirectional == true) {
      map.get(destino).add(origem);
    }
  }

  // Esta função fornece a contagem de vértices
  public void getVertexCount() {
    System.out.println("O grafo tem "
        + map.keySet().size()
        + " vertices");
  }

  // Esta função fornece a contagem de arestas
  public void getEdgesCount(boolean bidirection) {
    int count = 0;
    for (T v : map.keySet()) {
      count += map.get(v).size();
    }
    if (bidirection == true) {
      count = count / 2;
    }
    System.out.println("O grafo tem " + count
        + " arestas.");
  }

  // Esta função verifica se um vértice está presente ou não.
  public void hasVertex(T s) {
    if (map.containsKey(s)) {
      System.out.println("O grafo contém " + s
          + " como um vértice.");
    } else {
      System.out.println("O grafo não contém "
          + s + " como um vértice.");
    }
  }

  // Esta função verifica se uma aresta está presente ou não.
  public void hasEdge(T s, T d) {
    if (map.get(s).contains(d)) {
      System.out.println(
          "O grafo tem uma aresta entre " + s
              + " e " + d + ".");
    } else {
      System.out.println(
          "O grafo não tem uma aresta entre " + s
              + " e " + d + ".");
    }
  }

  public void neighbours(T s) {
    if (!map.containsKey(s))
      return;
    System.out.println("Os vizinhos de " + s + " são:");
    for (T w : map.get(s))
      System.out.print(w + ",");
  }

  // Imprime a lista de adjacência de cada vértice.
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();

    for (T v : map.keySet()) {
      builder.append(v.toString() + ": ");
      for (T w : map.get(v)) {
        builder.append(w.toString() + " ");
      }
      builder.append("\n");
    }

    return (builder.toString());
  }
}