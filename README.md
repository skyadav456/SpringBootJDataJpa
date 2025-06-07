# SpringBootJDataJpa
# 📘 Spring Data JPA – `JpaRepository` CRUD Methods

This README outlines the 12 core CRUD methods provided by Spring Data's `JpaRepository`, complete with method signatures, descriptions, return types, and official references.

---

## 📑 Table of Contents

1. [save(S entity)](#1-saves-entity)  
2. [saveAll(Iterable<S> entities)](#2-savealliterables-entities)  
3. [findById(ID id)](#3-findbyidid-id)  
4. [existsById(ID id)](#4-existsbyidid-id)  
5. [findAll()](#5-findall)  
6. [findAllById(Iterable<ID> ids)](#6-findallbyiditerableid-ids)  
7. [count()](#7-count)  
8. [deleteById(ID id)](#8-deletebyidid-id)  
9. [delete(T entity)](#9-deletet-entity)  
10. [deleteAllById(Iterable<? extends ID> ids)](#10-deleteallbyiditerable-ids)  
11. [deleteAll(Iterable<? extends T> entities)](#11-deletealliterable-entities)  
12. [deleteAll()](#12-deleteall)

---

## 📘 Method Descriptions

### 1. `save(S entity)`
```java
<S extends T> S save(S entity);
```
- **Description**: Persists a new entity or updates an existing one.
- **Returns**: `S` — the saved entity

### 2. `saveAll(Iterable<S> entities)`
```java
<S extends T> List<S> saveAll(Iterable<S> entities);
```
- **Description**: Saves a batch of entities in a single operation.
- **Returns**: `List<S>`

### 3. `findById(ID id)`
```java
Optional<T> findById(ID id);
```
- **Description**: Retrieves an entity by its ID.
- **Returns**: `Optional<T>`

### 4. `existsById(ID id)`
```java
boolean existsById(ID id);
```
- **Description**: Checks if an entity with the given ID exists.
- **Returns**: `boolean`

### 5. `findAll()`
```java
List<T> findAll();
```
- **Description**: Retrieves all entities from the repository.
- **Returns**: `List<T>`

### 6. `findAllById(Iterable<ID> ids)`
```java
List<T> findAllById(Iterable<ID> ids);
```
- **Description**: Fetches all entities matching given IDs.
- **Returns**: `List<T>`

### 7. `count()`
```java
long count();
```
- **Description**: Returns the total number of entities in the repository.
- **Returns**: `long`

### 8. `deleteById(ID id)`
```java
void deleteById(ID id);
```
- **Description**: Deletes the entity identified by the provided ID.
- **Returns**: `void`

### 9. `delete(T entity)`
```java
void delete(T entity);
```
- **Description**: Deletes the specified entity instance.
- **Returns**: `void`

### 10. `deleteAllById(Iterable<? extends ID> ids)`
```java
void deleteAllById(Iterable<? extends ID> ids);
```
- **Description**: Deletes all entities matching the provided IDs.
- **Returns**: `void`

### 11. `deleteAll(Iterable<? extends T> entities)`
```java
void deleteAll(Iterable<? extends T> entities);
```
- **Description**: Deletes all specified entity instances.
- **Returns**: `void`

### 12. `deleteAll()`
```java
void deleteAll();
```
- **Description**: Removes all entries from the repository.
- **Returns**: `void`

---

## ✅ Additional Notes & JPA-specific Methods

- `saveAllAndFlush(Iterable<S> entities)` – batch save + immediate flush  
- `deleteAllInBatch()`, `deleteAllInBatch(Iterable<T> entities)`, `deleteAllByIdInBatch(Iterable<ID> ids)` – batch deletes without cascading or lifecycle events  
- `getOne(ID id)` (deprecated) → `getReferenceById(ID id)` – retrieves a lazy reference proxy  

---

## 📚 Official References

- Spring Data JPA CRUD: https://docs.spring.io/spring-data/data-commons/docs/current/api/org/springframework/data/repository/CrudRepository.html  
- JpaRepository Docs: https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html  
- Spring Data JPA Reference: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
