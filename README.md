# minIO_test
Este repositório demonstra como configurar e utilizar o MinIO localmente e integrar com uma aplicação Java.

---
## 🚀 Tecnologias Utilizadas
- [x] Java
- [x] MinIO
---
## 📌 Pré-requisitos
Antes de começar, você precisa ter instalado:
- [Java 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven](https://maven.apache.org/)
- [MinIO](https://min.io/download)

---
## Instalando e Executando o MinIO

### Instalação no Linux/macOS

    wget https://dl.min.io/server/minio/release/linux-amd64/minio
    chmod +x minio

### Instalação no Windows

    Baixe o executável em: https://min.io/download#/windows

### Executando o MinIO

#### No Linux/macOS:

    ./minio server /home/seu-usuario/minio-data

#### No Windows (CMD ou PowerShell):

    minio.exe server C:\minio-data
---

### O MinIO rodará localmente na porta 9000.

    Acessando o Painel Web, abra o navegador e acesse:

    http://localhost:9001

    Login Padrão:

    Usuário: minioadmin
    Senha: minioadmin

 Crie um bucket com o nome que preferir.