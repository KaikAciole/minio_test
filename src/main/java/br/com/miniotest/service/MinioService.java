package br.com.miniotest.service;

import br.com.miniotest.config.MinioConfig;
import io.minio.*;

public class MinioService {
    private static final String BUCKET = "meus-arquivos";
    private final MinioClient minioClient;

    public MinioService() {
        this.minioClient = MinioConfig.criarCliente();
    }

    public void salvarArquivo(String nomeArquivo, String caminhoArquivo) throws Exception {
        minioClient.uploadObject(
                UploadObjectArgs.builder()
                        .bucket(BUCKET)
                        .object(nomeArquivo)
                        .filename(caminhoArquivo)
                        .build()
        );
        System.out.println("Arquivo salvo com sucesso: " + nomeArquivo);
    }

    public void baixarArquivo(String nomeArquivo, String caminhoDestino) throws Exception {
        minioClient.downloadObject(
                DownloadObjectArgs.builder()
                        .bucket(BUCKET)
                        .object(nomeArquivo)
                        .filename(caminhoDestino)
                        .build()
        );
        System.out.println("Arquivo baixado para: " + caminhoDestino);
    }

    public void deletarArquivo(String nomeArquivo) throws Exception {
        minioClient.removeObject(
                RemoveObjectArgs.builder()
                        .bucket(BUCKET)
                        .object(nomeArquivo)
                        .build()
        );
        System.out.println("Arquivo deletado: " + nomeArquivo);
    }
}
