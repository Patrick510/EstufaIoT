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

## 📊 Modelo de Dados (JSON)

```json
{
  "temperaturaEstufa": 55.0,
  "sensacaoTermicaEstufa": 70.0,
  "umidadeEstufa": 40.0
}
```
