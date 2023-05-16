# Authentification

Ce projet est une application Spring Boot conçue pour l'authentification. Il est basé sur le framework Spring Boot, Spring sécurity et Jwt qui facilite le développement d'applications Java autonomes.

## Fonctionnalités

- Inscription
- Login

## Prérequis

Avant de commencer, assurez-vous de disposer des éléments suivants correctement installés sur votre système :

- Java Development Kit (JDK) 8 ou supérieur
- Maven

## Installation

Suivez ces étapes pour installer et exécuter le projet sur votre machine locale :

1. Clonez ce référentiel sur votre machine :
  - git clone https://github.com/projet-de-specialite/Authentification.git
2. Accédez au répertoire du projet :
  - cd projet-de-specialite/authentification
3. Construisez l'application à l'aide de Maven :
  - mvn clean install
4. Démarrez l'application :
  -mvn spring-boot:run
  
L'application sera désormais accessible à l'adresse [http://localhost:8080].


## Authentification

L'application utilise un système d'authentification pour sécuriser l'accès aux fonctionnalités. Voici les informations relatives à l'authentification :

- Type d'authentification :  JWT (JSON Web Token)
- Point de terminaison d'inscription : http://localhost:8080/api/auth/signup
- Point de terminaison de connexion : http://localhost:8080/api/auth/signin

Pour accéder aux fonctionnalités sécurisées, vous devrez vous authentifier en utilisant les informations d'identification appropriées.


## Utilisateurs

- Admin : username: admin/ mot de passe: admin
- Utilisateur : username: luc/ mot de passe: luc

## API sur swagger


![api](https://github.com/projet-de-specialite/Authentification/assets/79235023/7588bfea-5cf6-41bb-beaf-e8673b867a22)

