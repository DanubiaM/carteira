# Folder Repository
A pasta Repository é uma convenção usada em aplicativos Spring para organizar as classes que implementam o padrão Repository. O padrão Repository é usado para gerenciar o acesso a dados em um aplicativo e consiste em uma camada entre o modelo de dados e a camada de apresentação.

Na pasta Repository, devem ser adicionadas as classes que implementam as interfaces do Spring Data. Essas interfaces definem os métodos que permitem que o aplicativo interaja com o banco de dados. Por exemplo, uma interface ClienteRepository pode conter os seguintes métodos:

    public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByNome(String nome);
    List<Cliente> findByEmail(String email);
    }
