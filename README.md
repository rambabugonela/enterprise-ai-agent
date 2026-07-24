# 🚀 Enterprise AI Agent Framework

> A production-inspired Enterprise AI Agent Framework built using **Spring Boot 4.x**, **Spring AI 2.x**, and **Google Gemini**, demonstrating LLM Planning, Tool Orchestration, Enterprise Integration, and AI Agent Architecture.

---

# 📖 Overview

This project demonstrates how to build an **Enterprise AI Agent Framework** using **Spring AI**.

Unlike a traditional chatbot, the AI Agent first creates an **Execution Plan** using an LLM, executes multiple enterprise tools, and returns the combined result.

```
                User
                  │
                  ▼
          Enterprise Agent
                  │
                  ▼
             LLM Planner
                  │
                  ▼
          Execution Plan
                  │
                  ▼
           Plan Executor
                  │
      ┌───────────┼────────────┐
      ▼           ▼            ▼
  Time Tool   Calculator   Enterprise AI Assistant
                                  │
                                  ▼
                          Project 1 (RAG Platform)
```

---

# ✨ Features

## 🤖 AI Agent

- LLM-based Planning
- Multi-Step Task Decomposition
- Structured JSON Execution Plan
- Tool Orchestration
- Enterprise Tool Integration

---

## 🧰 Enterprise Tools

- ⏰ Time Tool
- 🧮 Calculator Tool
- 🏢 Enterprise AI Assistant Tool (REST Integration)

---

## 🏗 Enterprise Architecture

- Planner
- Executor
- Tool Layer
- DTO Layer
- Service Layer
- Clean Architecture
- Extensible Framework Design

---

## 🔗 Enterprise Integration

- REST Tool Integration
- JWT Security (Project 1)
- RAG Integration
- Enterprise Knowledge Base
- Dynamic Tool Registration using Spring AI

---

# 🛠 Technology Stack

| Technology | Version |
|------------|----------|
| Java | 21 |
| Spring Boot | 4.x |
| Spring AI | 2.x |
| Google Gemini | 2.5 Flash |
| Gradle | 8.x |
| Docker | ✅ |
| REST API | Spring MVC |
| JWT | ✅ |
| Redis | ✅ |
| PGVector | ✅ |

---

# 🏛 High Level Architecture

```
                +----------------------+
                |       User           |
                +----------+-----------+
                           |
                           ▼
                +----------------------+
                |  Agent Controller    |
                +----------+-----------+
                           |
                           ▼
                +----------------------+
                |    Agent Service     |
                +----------+-----------+
                           |
            +--------------+--------------+
            |                             |
            ▼                             ▼
 +----------------------+      +----------------------+
 |     LLM Planner      |      |    Plan Executor     |
 +----------+-----------+      +----------+-----------+
            |                             |
            | Execution Plan              |
            +-----------------------------+
                           |
                           ▼
                 +-----------------------+
                 |      Tools            |
                 +-----------------------+
                 | Time Tool            |
                 | Calculator Tool      |
                 | Enterprise AI Tool   |
                 +-----------------------+
                           |
                           ▼
      +---------------------------------------------+
      | Enterprise AI Assistant Platform            |
      | (Project 1 - RAG + Routing + Security)      |
      +---------------------------------------------+
```

---

# 🔄 Execution Flow

```
User Question
      │
      ▼
LLM Planner
      │
      ▼
Execution Plan
      │
      ▼
Executor
      │
      ├── Time Tool
      ├── Calculator Tool
      └── Enterprise AI Assistant Tool
      │
      ▼
Combined Response
```

---

# 📦 Sample Request

```json
{
  "message": "Tell me the current time. Multiply 25 and 40. Explain Redis."
}
```

---

# 📋 Sample Execution Plan

```json
{
  "steps": [
    {
      "tool": "TIME",
      "method": "currentTime",
      "input": ""
    },
    {
      "tool": "CALCULATOR",
      "method": "multiply",
      "input": "25,40"
    },
    {
      "tool": "ENTERPRISE_ASSISTANT",
      "method": "ask",
      "input": "Explain Redis"
    }
  ]
}
```

---

# 📁 Project Structure

```
src/main/java
│
├── config
├── controller
├── dto
├── executor
├── planner
├── service
├── tool
├── security
└── exception
```

---

# 🎯 Design Principles

- Single Responsibility Principle
- Dependency Injection
- Clean Architecture
- Enterprise AI Agent Pattern
- Tool Orchestration
- Separation of Planning & Execution
- Extensible Framework Design

---

# 🔥 Enterprise AI Concepts Demonstrated

- AI Agent
- LLM Planning
- Execution Plan
- Tool Calling
- Multi-Step Reasoning
- Dynamic Tool Registration
- REST Tool Integration
- Enterprise AI Architecture
- Spring AI
- Google Gemini

---

# 🔗 Companion Project

This AI Agent integrates with the **Enterprise AI Assistant Platform**.

Project 1 provides:

- Retrieval Augmented Generation (RAG)
- Prompt Routing
- Redis Conversation Memory
- JWT Authentication & Authorization
- Enterprise Security
- Global Exception Handling
- Observability
- Vector Database (PGVector)
- Spring AI Tool Calling

---

# 💼 Skills Demonstrated

- Java 21
- Spring Boot 4.x
- Spring AI 2.x
- Enterprise AI Agent Framework
- LLM Planning
- Tool Calling
- REST Integration
- Retrieval Augmented Generation (RAG)
- JWT Security
- Redis
- PGVector
- Docker
- Clean Architecture

---

# 📜 Version

```
v1.0.0-enterprise-ai-agent-framework
```

---

# 👨‍💻 Author

**Rambabu Gonela**

Senior Java Developer | Spring Boot | Spring AI | Enterprise AI | RAG | AI Agents

---

# 📄 License

MIT License
