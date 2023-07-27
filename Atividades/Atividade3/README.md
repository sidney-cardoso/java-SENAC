# Contexto

Considere algumas classes de um sistema orientado a objetos que estão implementando funcionalidades no sistema relacionadas ao setor de RH e à folha de pagamento. Há dois tipos de funcionários na empresa para a qual esse sistema está sendo desenvolvido: funcionários assalariados, que recebem por mês, e funcionários horistas, que recebem por horas trabalhadas.

Para todos os funcionários, são necessárias informações como nome, CPF, endereço, telefone e setor em que trabalham. Para os assalariados, é necessário ainda a informação do salário mensal do trabalhador (o total a receber será “salário”). Para os horistas, é necessária a informação de horas trabalhadas e valor da hora (o total a receber será “horas \* valor da hora”).

Todo funcionário precisa ser capaz de mostrar em tela seus dados; tanto assalariados quanto horistas precisam ser capazes de calcular e fornecer o valor de seu pagamento, de acordo com suas características. Também é necessário que ambos sejam capazes de aplicar aumento (informado em %) em seus rendimentos.

Baseado nisso, monte classe abstrata (com método abstrato para cálculo de salário) para funcionário e derivadas para as demais, aplicando polimorfismo em Java para este cenário.

## Atividade

Crie um projeto Java NetBeans com as classes/interfaces e implemente um código principal que

- permita que o usuário informe dados para até 10 funcionários, questionando o tipo (assalariado/horista) e lendo os dados necessários. Mantenha-os em uma única lista independentemente se são assalariados ou horistas.

- Mostre na tela os dados e o pagamento de cada um dos funcionários.

- Aplique um aumento geral (informado pelo usuário) para todos os funcionários e mostre novamente os pagamentos de cada um deles.

Use encapsulamento nas classes.
