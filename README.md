# 📚 Biblioteca Digital

> 👨‍🎓 **Aluno:** Victor Ponciano - https://github.com/VictorPonciano1

> 🏫 **Disciplina:** Estrutura de Dados

> 👩‍🏫 **Professora:** Andréia Machion

## 📖 Descrição do Projeto

Este projeto foi desenvolvido para a disciplina de Estrutura de Dados e tem como objetivo aplicar conceitos de estruturas lineares e não lineares por meio da implementação de um sistema de Biblioteca Digital.

O sistema permite o gerenciamento de livros, usuários, empréstimos e filas de espera, utilizando diferentes estruturas de dados estudadas em aula.

O projeto é uma continuação do Projeto I, que utilizava Vetor Dinâmico e Pilha. Nesta nova etapa são introduzidos conceitos de:

- 🔗 Lista Duplamente Encadeada
- 🚶‍♂️  Fila Genérica
- #️⃣ Tabela Hash
- 🧩 Classes Genéricas em Java

### ⚠ Problema Inicial

Uma biblioteca digital precisa de três mecanismos distintos para funcionar bem: 
- Um acervo navegável: lista dos livros disponíveis que permita inserir e remover do 
início ou do fim, e percorrer nos dois sentidos (por exemplo, avançar e voltar páginas 
em uma interface de catálogo). 
- Uma fila de espera: quando um livro está emprestado, os interessados entram em 
uma fila. O primeiro a solicitar é o primeiro a ser atendido quando o livro for devolvido 
(FIFO). 
- Um catálogo indexado: para que o sistema localize qualquer livro instantaneamente 
pelo seu ISBN, sem precisar percorrer o acervo inteiro.

### 📁 Estrutura do Projeto

O projeto é dividido em três etapas incrementais, cada uma introduzindo uma nova estrutura 
sobre as classes de domínio compartilhadas. 
1. **Etapa 1:** Classes de Domínio e Lista Duplamente Encadeada.
```
[-] 📕 Livro
[-] 👨 Usuario
[-] ➰ NoDuplo
[-] 📄 ListaDupla
```
2. **Etapa 2:** Fila Genérica e Gestão de Empréstimos.
```
[-] ➰ No<T>
[-] 👫 Fila<T>
[-] 💲 GestorEmprestimos
```
3. **Etapa 3:** Tabela Hash e Catálogo Indexado.
```
[-] 🚪 Entrada<K,V>
[-] 📁 NossoHash<K,V>
[-] 📝 Catalogo
```

## 🎯 Objetivos

Desenvolver um sistema capaz de:

- 📚 Cadastrar livros em um acervo
- 🔍 Realizar buscas por ISBN
- 🔄 Navegar pelo acervo nos dois sentidos
- 📝 Gerenciar empréstimos de livros
- 👥 Controlar filas de espera para livros indisponíveis
- ⚡ Realizar buscas rápidas utilizando tabela hash

