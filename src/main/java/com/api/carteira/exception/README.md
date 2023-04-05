# Folder Exception
O Spring é um framework Java que oferece suporte para criação de aplicativos empresariais, permitindo a criação de aplicativos robustos e escaláveis. Uma parte fundamental da construção de um aplicativo robusto é a manipulação de exceções. No Spring, isso é feito por meio de um mecanismo de exceções e tratamento de erros.
Para adicionar as configurações de exceções no Spring em seu projeto, siga as etapas abaixo:

1 - Crie uma pasta chamada exception na raiz do projeto.

2 -Dentro da pasta exception, adicione classes que extendam as exceções nativas do Spring ou crie suas próprias exceções.

3 - Utilize a anotação @ControllerAdvice nas classes que lidarão com as exceções. Essa anotação faz com que as classes anotadas sejam interceptadoras de exceções.

4 - Utilize a anotação @ExceptionHandler nos métodos que lidarão com exceções específicas.

Exemplo de classe de exceção personalizada:


    public class MinhaExcecao extends RuntimeException {
    
        public MinhaExcecao(String message) {
            super(message);
        }
    }
Exemplo de classe que trata exceções personalizadas:

    @ControllerAdvice
    public class MinhaExcecaoHandler {
    
        @ExceptionHandler(MinhaExcecao.class)
        public ResponseEntity<String> handleMinhaExcecao(MinhaExcecao e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
