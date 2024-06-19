# Sobre o projeto

A pasta contém dois exercicios de fixação do tema "Componentes de injeção de dependências".
Primeira pasta "aula" é um exemplo de utilização de Container de injeção de dependência com Spring.
Segunda pasta "salary-java" um exemplo de utilização do **Construtor** para injetar dependência.

# Exemplo do exercício 
Fazer um programa ler os dados de um funcionário (nome, salário bruto) e depois mostrar o 
salário líquido, que consiste no valor bruto descontado impostos e previdência.
REGRAS:
1) Imposto é 20%
2) Previdência é 10%
   
Ex:
Nome: Maria
Salário bruto: 4000.00
Salario liquido = 2800.00

# Solução "rápida"
```
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);
System.out.print("Nome: ");
String name = sc.nextLine();
System.out.print("Salario bruto: ");
double grossSalary = sc.nextDouble();
double netSalary = grossSalary * 0.7;
System.out.printf("Salario liquido = %.2f%n", netSalary);

```
# Tecnologias utilizadas
- Java
- Spring Boot

# Como executar o projeto

# clonar repositório
git clone https://github.com/MateusNespoli/Componentes-de-injecao-de-dependencia

# executar o projeto
- Botão direito do mouse na aplicação
- Selecionar "Run Java"
  
# Autor
Mateus Nespoli

https://www.linkedin.com/in/mateus-nespoli-74b577224/
