# Spring Boot Gradle REST API

Production-ready Java backend application built using Spring Boot, Gradle, and REST API architecture.

---

## 🚀 Tech Stack

- Java 17
- Spring Boot 3
- Gradle
- REST API
- JUnit 5
- Docker
- GitHub Actions
- Jenkins
- SonarQube
- H2 Database

---

## 📁 Project Structure

springboot-gradle-project/
│
├── .github/
│   └── workflows/
│       └── gradle.yml
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   │
│   └── test/
│
├── build.gradle
├── settings.gradle
├── gradlew
├── gradlew.bat
├── Dockerfile
├── Jenkinsfile
└── README.md

---

## ⚙️ Features

RESTful API development
Layered architecture
Gradle build automation
JUnit testing support
Docker containerization
GitHub Actions CI/CD pipeline
Jenkins integration with GitHub Webhooks
SonarQube code quality analysis
DockerHub image push automation
Production-ready project structure

---

🔄 CI/CD Workflow

This project includes a complete CI/CD pipeline using:

GitHub Actions
Jenkins
SonarQube
Docker Hub

Pipeline Flow: 

Code Push → GitHub Actions → Gradle Build → SonarQube Analysis → Docker Build → DockerHub Push

---

🔗 GitHub Webhook Integration with Jenkins

GitHub Webhooks are configured with Jenkins for automatic CI/CD triggering.

Workflow
Developer Pushes Code
        ↓
GitHub Webhook Trigger
        ↓
Jenkins Pipeline Starts
        ↓
Build + Test + SonarQube Scan
        ↓
Docker Image Build
        ↓
Deployment

---

## 🛠️ Build Project
./gradlew clean build

---

## ▶️ Run Application
./gradlew bootRun

---

## Application runs on:
http://localhost:8082

---

## 🧪 Run Tests
./gradlew test

---

## 📦 Generate Executable JAR
./gradlew bootJar

---

## Generated JAR location:
build/libs/

---

## 🐳 Docker Setup

Build Docker Image
docker build -t springboot-gradle-app .
Run Docker Container
docker run -p 8082:8080 springboot-gradle-app

---

## 📌 API Endpoint
Home API
Request: GET /
Response: Spring Boot Gradle Project Running Successfully

---

🔐 GitHub Secrets Used

The CI/CD pipeline uses the following GitHub repository secrets:

SONAR_TOKEN
SONAR_HOST_URL
DOCKER_USERNAME
DOCKER_PASSWORD

---

📊 Code Quality & Automation

Integrated tools:

SonarQube Static Code Analysis
GitHub Actions Automation
Docker Image Automation
Jenkins Pipeline Automation
Dependency Submission for Dependabot Alerts

---

## 🔧 Future Enhancements

PostgreSQL/MySQL integration
Spring Security + JWT Authentication
Kubernetes deployment
Terraform Infrastructure as Code
Prometheus & Grafana monitoring
Swagger/OpenAPI documentation
Slack & Email Notifications
Helm Charts for Kubernetes
AWS EC2/EKS Deployment

---

## 📚 Learning Goals

This project demonstrates:

Enterprise Java backend structure
Spring Boot REST API development
Gradle build management
Docker containerization
GitHub Actions CI/CD
Jenkins automation
SonarQube integration
DevOps pipeline implementation
Production-ready deployment workflow

---

👨‍💻 Author
Gurkiran Singh
GitHub: https://github.com/gurkiran333

📄 License
This project is licensed under the MIT License.
