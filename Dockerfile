# Spécifier l'image de base
FROM openjdk:11-jre-slim

# Définir le répertoire de travail
WORKDIR /app

# Copier le fichier jar et les dépendances
COPY target/projet-specialite.jar /app/projet-specialite.jar


# Exposer le port de l'application
EXPOSE 8080

# Démarrer l'application
CMD ["java", "-jar", "/app/projet-specialite.jar"]






