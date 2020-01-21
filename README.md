# Encryption-Decryption


### Descrição

Programa com argumentos de linha de comando construido para aplicar conceitos básicos de criptografia.

### Opções do sistema

O programa tem as seguintes opções:

* -_data_
* -_mode_
* -_key_
* -_alg_
* -_in_
* -_out_


### Detalhamento das Opções

**-data**: refere-se a frase ou palavra que você deseja encriptar ou decriptar.

**-mode**: refere-se ao modo que você deseja. Possui duas opções, "enc" ou "dec", que significam respectivamente encriptar ou decriptar.

**-key**: refere-se ao valor do segredo(chave) para executar o algoritmo de criptografia. Varia de 0 à 26. Se você não atribuir um valor a chave será 0.

**-alg**: refere-se ao algortimo que você deseja usar para encriptar ou decriptar. Possui duas opções, "shift" ou "unicode". A opção _shift_ seleciona a Cifra de Cesar. A opção _unicode_ seleciona o embaralhamento das letras a partir da tabela ASCII.

**-in**: indica que a frase ou palavra a ser encriptada ou decriptada é originada de um arquivo de texto. Neste parâmetro você deve informar o caminho absoluto do arquivo.

**-out**: indica a saída da frase ou palavra encriptada ou decriptada. Neste parâmetro você deve informar o caminho absoluto do arquivo que você quer salvar como resultado da operação.
