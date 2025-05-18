**Resposta questão 4:**

A)No caso de um array de tipos primitivos como int[] ou double[], os valores são armazenados diretamente na memória. A alocação é contínua, e cada posição do array já contém o valor padrão correspondente ao tipo (por exemplo, 0 para int). Já nos arrays de objetos, como Aluno[] ou Produto[], o array armazena apenas referências. A memória é alocada primeiro para as referências, começando como null, e depois cada objeto precisa ser criado.

B)É importante verificar se o elemento não está null antes de acessar métodos ou atributos, pois isso pode causar um erro chamado NullPointerException. Também é essencial garantir que os objetos foram corretamente inicializados antes do uso.
