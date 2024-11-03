# Projeto de Demonstração de Coleções em Java

Este projeto em Java 17 exemplifica as coleções `List`, `Map`, `Set` e `Queue` com suas 
implementações mais comuns. Ele inclui definições, explicações e exemplos práticos de uso.

## Estrutura do Projeto

O projeto está dividido em pacotes para cada tipo de coleção:
- `list`: Contém exemplos de `ArrayList`, `LinkedList` e `Vector`.
- `map`: Contém exemplos de `HashMap`, `TreeMap` e `LinkedHashMap`.
- `set`: Contém exemplos de `HashSet`, `LinkedHashSet` e `TreeSet`.
- `queue`: Contém exemplos de `LinkedList`, `PriorityQueue`.

## Explicação das Coleções

### List
- **ArrayList**: Implementação de lista baseada em array, boa para acesso aleatório rápido.
- **LinkedList**: Lista encadeada, boa para inserções e remoções rápidas nas extremidades.
- **Vector**: Similar ao `ArrayList`, mas é sincronizado, adequado para cenários de concorrência.

### Map
- **HashMap**: Mapa baseado em hash, rápido para buscas e inserções.
- **LinkedHashMap**: Mantém a ordem de inserção dos elementos.
- **TreeMap**: Ordena os elementos conforme a chave, implementado como uma árvore de busca binária.

### Set
- **HashSet**: Conjunto baseado em hash, rápido e sem ordem garantida.
- **LinkedHashSet**: Mantém a ordem de inserção dos elementos.
- **TreeSet**: Ordena os elementos conforme a ordem natural ou um comparador específico.

### Queue
- **LinkedList**: Implementa fila, boa para inserções e remoções.
- **PriorityQueue**: Mantém os elementos ordenados com base na prioridade.

