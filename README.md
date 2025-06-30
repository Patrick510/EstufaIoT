# 🌱 API - Monitoramento de Estufa (Microsserviço IoT)

Este microsserviço é responsável por registrar dados de monitoramento de uma estufa e enviá-los a outro serviço via RabbitMQ para notificação por e-mail.

## 📦 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- RabbitMQ
- Maven

---

## 🗂️ Funcionalidades

### 🔍 Endpoints disponíveis:

| Método | Rota               | Descrição                                                                                 |
| ------ | ------------------ | ----------------------------------------------------------------------------------------- |
| GET    | `/estufa`          | Retorna todos os registros de monitoramento da estufa                                     |
| GET    | `/estufa/critical` | Retorna registros críticos (Temperatura > 50°C, Umidade < 50% ou Sensação Térmica > 65°C) |
| POST   | `/estufa/transmit` | Registra uma nova leitura da estufa e envia os dados por RabbitMQ                         |

---

## 🧪 Exemplo de Requisição

### `POST /estufa/transmit`

```json
{
  "temperaturaEstufa": 55.0,
  "sensacaoTermicaEstufa": 70.0,
  "umidadeEstufa": 40.0
}
```

---

### 🚀 Passos para execução

## 2. Configure o application.properties

Verifique se os dados de conexão estão corretos (exemplo):

```spring.datasource.url=jdbc:mysql://localhost:3306/estufa?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=1234

spring.rabbitmq.addresses=amqps://<user>:<password>@<host>/<vhost>
spring.rabbitmq.queue=ms.email
```

```bash
# 1. Clone o projeto
git clone https://github.com/Patrick510/email-estufa.git
cd email-estufa

# 2. Configure o application.properties:
# - URL e credenciais do banco de dados MySQL
# - E-mail e senha de app do Gmail
# - Endereço da fila RabbitMQ (ms.email)

# 3. Build do projeto
mvn clean install

# 4. Execute a aplicação
mvn spring-boot:run
```
