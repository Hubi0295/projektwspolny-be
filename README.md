# 🛒 projektwspolny-be

**projektwspolny-be** to aplikacja backendowa sklepu internetowego zbudowana w architekturze mikroserwisów, przy użyciu **Java**, **Spring Boot**,**Postgres**, **Spring Cloud**, **Lombok**, **Flyway**, **Maven**, oraz **Eureka** jako rejestru usług.

---

## 🧱 Struktura projektu

- **auth** – mikroserwis do autoryzacji i zarządzania użytkownikami
- **product-service** – zarządzanie produktami
- **file-service** – obsługa plików przez serwer FTP
- **gatway** – brama API (gateway) kierująca ruch do usług
- **eureka** – serwer rejestrujący dostępne mikroserwisy
- **order** – serwer zarządzający zamówieniami uzytkownika
- **basket** – serwer zarządzający koszykiem uzytkownika
---

## 💾 Wymagania

- Java 17+
- Maven 3.6+
- Docker (do uruchomienia bazy danych i FTP)

---

## ⚙️ Uruchomienie środowiska

### 1. Baza danych PostgreSQL

```bash
docker run --name sklepdb -p 5432:5432 -e POSTGRES_PASSWORD=postgres -d postgres
```

### 2. Serwer FTP

```bash
docker run -d --name ftp -p 8001:21 -p 21000-21010:21000-21010 -e USERS="sklep|12345678|/home/sklep|10000" delfer/alpine-ftp-server
```

To jest backendowa aplikacja projektu sklep internetowy z integracją z bramką payU. Jest to projekt edukacyjny wykonany podczas kursu na platformie UDEMY
