<div align="center">

# 🛒 API REST - Gestión de Productos

![Java](https://img.shields.io/badge/Java-17-red)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-blue)
![Estado](https://img.shields.io/badge/Estado-Terminado-brightgreen)
![Render](https://img.shields.io/badge/Deploy-Render-purple)

**API REST completa para gestión de productos y usuarios desarrollada con Spring Boot y PostgreSQL**

</div>

---

## 📖 Descripción
API REST desarrollada con **Spring Boot 3.x** para la gestión de productos y usuarios.  
Implementa operaciones CRUD (Create, Read, Update, Delete) con persistencia en **PostgreSQL**, usando Spring Data JPA y arquitectura en capas.  

Este es un **proyecto personal de práctica**, que forma parte de un sistema fullstack donde un **frontend en React** consume esta API. 

🔗 Frontend: [Proyecto-GestionProductos-API-frontend](https://github.com/joacomendiola/Proyecto-GestionProductos-API-frontend)

---

## ✨ Características

- **RESTful API** → Endpoints semánticos con HTTP estándar  
- **Spring Data JPA** → Persistencia con Hibernate  
- **Arquitectura en capas** → Controller, Repository, Model, Config  
- **Manejo de excepciones** → RuntimeException en casos de no encontrado  
- **CORS configurado** → Para comunicación con frontend en React  
- **Persistencia en PostgreSQL** → Deploy en Render  

---

## 🏗️ Stack Tecnológico

- ☕ **Java 17** → Lenguaje de programación  
- 🍃 **Spring Boot 3.x** → Framework principal  
- 🗄️ **Spring Data JPA / Hibernate** → ORM y persistencia  
- 🐘 **PostgreSQL** → Base de datos relacional (Render)  
- 📦 **Maven** → Gestión de dependencias y build  

---

## 📂 Arquitectura del Proyecto

```text
src/main/java/com/example/proyecto/
├── config/
│   └── CorsConfig.java
│
├── controller/
│   ├── HelloController.java
│   ├── ProductoController.java
│   └── UsuarioController.java
│
├── model/
│   ├── Producto.java
│   └── Usuario.java
│
├── repository/
│   ├── ProductoRepository.java
│   └── UsuarioRepository.java
│
└── ProyectoApplication.java
```

---

## 📦 Modelos de Datos

### Producto
- `id` → Identificador único  
- `nombre` → Nombre del producto  
- `precio` → Precio del producto  
- `imagenUrl` → URL de imagen asociada  

### Usuario
- `id` → Identificador único  
- `nombre` → Nombre del usuario  
- `correo` → Correo electrónico  

---

## 🔗 Endpoints de la API

### Productos (`/productos`)
| Método | Endpoint         | Descripción                     |
|--------|------------------|---------------------------------|
| GET    | `/productos`     | Listar todos los productos      |
| GET    | `/productos/{id}`| Obtener producto por ID         |
| POST   | `/productos`     | Crear nuevo producto            |
| PUT    | `/productos/{id}`| Actualizar producto existente   |
| DELETE | `/productos/{id}`| Eliminar producto               |

### Usuarios (`/usuarios`)
| Método | Endpoint        | Descripción                     |
|--------|-----------------|---------------------------------|
| GET    | `/usuarios`     | Listar todos los usuarios       |
| GET    | `/usuarios/{id}`| Obtener usuario por ID          |
| POST   | `/usuarios`     | Crear nuevo usuario             |
| PUT    | `/usuarios/{id}`| Actualizar usuario existente    |
| DELETE | `/usuarios/{id}`| Eliminar usuario                |

### Hello (`/hello`)
| Método | Endpoint  | Descripción                 |
|--------|-----------|-----------------------------|
| GET    | `/hello`  | Endpoint de prueba (health) |

---

## ⚙️ Configuración y Despliegue

### Prerrequisitos
- Java 17 o superior  
- PostgreSQL  
- Maven 3.6+  

### Despliegue
El proyecto está desplegado en **Render** como servicio backend, conectado a una base de datos PostgreSQL en la nube.  

### Configuración de Base de Datos
En `src/main/resources/application.properties`:

```properties
spring.datasource.url=${SPRING_DATASOURCE_URL}
spring.datasource.username=${SPRING_DATASOURCE_USERNAME}
spring.datasource.password=${SPRING_DATASOURCE_PASSWORD}
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

# Actuator (para health check de Render)
management.endpoints.web.exposure.include=*
management.endpoint.health.show-details=always
```
---

## 💻 Ejemplos de Uso

### Crear producto
```http
POST /productos
Content-Type: application/json

{
  "nombre": "Laptop Gaming",
  "precio": 1500.00,
  "imagenUrl": "http://ejemplo.com/laptop.jpg"
}
```

### Obtener todos los productos
```http
GET /productos
```

### Crear usuario
```http
POST /usuarios
Content-Type: application/json

{
  "nombre": "Juan Pérez",
  "correo": "juanperez@example.com"
}
```

---

## 📊 Funcionalidades

- CRUD de productos  
- CRUD de usuarios  
- Persistencia en PostgreSQL  
- Configuración de CORS para frontend React  
- Arquitectura en capas con Spring Boot  
- Endpoint de prueba `/hello` para ver estado del servidor  

---

## 👨‍💻 Autor
Desarrollado por **Joaquín Mendiola**  
🌐 GitHub: [joacomendiola](https://github.com/joacomendiola)

