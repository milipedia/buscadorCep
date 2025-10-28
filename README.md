# 🏙️ Buscador de CEP com API ViaCEP

Projeto simples em **Java** que realiza a consulta de endereços a partir de um CEP, utilizando a **API ViaCEP**.  
O programa também gera um **arquivo `.json`** com os dados retornados, facilitando o armazenamento das consultas realizadas.

---

## 🚀 Funcionalidades

- Consulta CEPs em tempo real utilizando a API ViaCEP.  
- Exibe os dados formatados diretamente no terminal.  
- Gera um arquivo `.json` com o endereço retornado.  
- Tratamento de exceções para CEPs inválidos ou problemas de conexão.

---

## 🧩 Estrutura do Projeto
```
📦 src
┣ 📜 ConsultaCep.java → Faz a requisição à API ViaCEP
┣ 📜 Endereco.java → Modelo que representa os dados do endereço
┣ 📜 GeradorArquivo.java → Responsável por salvar o JSON gerado
┗ 📜 Main.java → Classe principal que executa o programa
```
---

## ⚙️ Tecnologias Utilizadas

- **Java 17+**
- **Biblioteca GSON** (para manipulação de JSON)
- **API ViaCEP** ([https://viacep.com.br](https://viacep.com.br))

---

## 💻 Como Executar
```
1. Clone este repositório:
 
   git clone https://github.com/seuusuario/BuscadorCEP.git
Abra o projeto em sua IDE (IntelliJ, Eclipse, VSCode, etc.).

Certifique-se de ter a biblioteca GSON adicionada ao classpath.

Execute o arquivo Main.java.

Digite um CEP válido quando solicitado (ex: 01001000).

O programa exibirá as informações do endereço e criará um arquivo .json com os dados.
```
```
📄 Exemplo de Saída

Digite um número de CEP para consulta:
01001000

Endereço encontrado:
Logradouro: Praça da Sé
Bairro: Sé
Localidade: São Paulo
UF: SP

Arquivo JSON gerado com sucesso!
```
🎯 Objetivo Educacional
Este projeto foi desenvolvido como parte da Formação ONE (Oracle Next Education) em parceria com a Alura, com o objetivo de praticar:

Consumo de APIs externas em Java.

Manipulação de JSON com GSON.

Organização de código em múltiplas classes.

Tratamento de exceções e boas práticas de programação.

✨ Autoria
Desenvolvido por Bianca Silva 💙
📚 Projeto integrante da trilha Java + Backend - Programa ONE (Oracle Next Education).
