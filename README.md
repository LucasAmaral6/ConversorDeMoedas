## Descrição

Este projeto foi desenvolvido em Java e faz uso da biblioteca Gson para manipulação de JSON e da API externa do ExchangeRate-API para obter as taxas de câmbio mais recentes. Ele permite aos usuários converter valores de uma moeda para outra, utilizando as taxas de câmbio atualizadas.

## Funcionalidades

-   Conversão de moeda em tempo real: O usuário pode inserir um valor em uma moeda de origem e selecionar uma moeda de destino para converter o valor em tempo real.
-   Atualização automática das taxas de câmbio: O sistema busca automaticamente as taxas de câmbio mais recentes ao realizar uma conversão.

## Instalação

1.  Clone este repositório para o seu ambiente local:

    código: `git clone https://github.com/LucasAmaral6/conversor-de-moeda.git` 

2.  Importe o projeto em sua IDE Java preferida.
    
3.  Certifique-se de que as dependências necessárias (como a biblioteca Gson) estejam configuradas corretamente no seu projeto.
    
4.  Execute o projeto.
    

## Configuração

Antes de executar o projeto, você precisará obter uma chave de API gratuita do ExchangeRate-API e configurá-la no código-fonte. Acesse [ExchangeRate-API](https://www.exchangerate-api.com/) para obter sua chave de API gratuita.

Substitua `"SUA_CHAVE_DE_API"` na classe `conversao.Api` pelo seu próprio token de API:


`this.apiKey = "SUA_CHAVE_DE_API";` 

## Uso

1.  Execute o projeto.
    
2.  Selecione a moeda de origem e a moeda de destino.
    
3.  Insira o valor que você deseja converter.
        
4.  O valor convertido será exibido na tela.
    


## Licença

Este projeto está licenciado sob a Licença MIT.
