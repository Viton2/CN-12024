# Etapa de build com JDK 17
FROM gradle:jdk17 as builder
WORKDIR /workspace/app

# Copia os arquivos de configuração do Gradle
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
# Dá permissão de execução ao Gradle Wrapper
RUN chmod +x ./gradlew
# Baixa as dependências
RUN ./gradlew --version
RUN ./gradlew dependencies

# Copia o código fonte
COPY src src
# Executa o build do projeto sem executar os testes
RUN ./gradlew build -x test

# Etapa de execução com JDK 17
FROM openjdk:17
WORKDIR /app
COPY --from=builder /workspace/app/build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
