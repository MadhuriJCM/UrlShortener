🌐 URL Shortener with Spring Boot & H2 Database

This is a simple URL Shortener application built using Spring Boot that allows users to shorten long URLs and redirect using the shortened version. It uses an H2 in-memory database to store URL mappings.

---

🚀 Features
Shortens long URLs to a compact form.
Redirects short URLs to their original long URLs.
Uses REST API (POST & GET methods).
Stores data in an in-memory H2 Database (no manual DB setup required).
Easily extendable for production use.

---

🛠 Technologies Used
Java 17+
Spring Boot
Spring Web (REST API)
Spring Data JPA
H2 Database

---

## 🔗 How It Works

| Function             | HTTP Method | Endpoint             | Description                                      |
|----------------------|-------------|----------------------|--------------------------------------------------|
| Shorten a URL        | `POST`      | `/shorten`           | Submit a long URL and receive a shortened URL.   |
| Redirect to Original | `GET`       | `/r/{shortCode}`     | Access short URL and redirect to the full URL.   |

---

📬 Example Usage
1. In Terminal first shorten the original url using POST api/endpoint curl -X POST http://localhost:8080/shorten -H "Content-Type:     
   application/json" -d '{"url":"https://www.example.com"}'
2. It will generate the Shorten URL like http://localhost:8080/abc123
3. Access the Shortened URL in browser (https://b3f63434-68e1-4273-960e-4dd26007fc60-00-1c1yhojzbn7gk.sisko.replit.dev/h2-console)
4. ✅ You’ll be redirected to: 🗄 Database (H2) H2 Console: (https://b3f63434-68e1-4273-960e-4dd26007fc60-00-1c1yhojzbn7gk.sisko.replit.dev/h2-console)

JDBC URL: jdbc:h2:mem:urlshortenerdb

Username: sa

Password: (leave empty) 
then connect 
In the SQL query box, run: 
SELECT * FROM SHORT_URL; 
then Run 
SHORT_ID   ORIGINAL_URL
4e181f     https://www.example.com 
(1 row, 2 ms)

---

🙌 Author 
Madhuri JCM 
🔗 GitHub: github.com/MadhuriJCM

---

📄 License 
This project is open-source and available under the MIT License.
