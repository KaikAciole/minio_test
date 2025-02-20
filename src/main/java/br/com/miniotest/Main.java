package br.com.miniotest;

import br.com.miniotest.service.MinioService;

public class Main {
    public static void main(String[] args) {
        try {
            MinioService minioService = new MinioService();

            String caminhoArquivoLocal = "home/kaik/Documentos/dieta.txt";
            String nomeArquivoNoMinio = "dieta.txt";
            minioService.salvarArquivo(nomeArquivoNoMinio, caminhoArquivoLocal);

            String caminhoDestino = "home/kaik/Documentos/minIO";
            minioService.baixarArquivo(nomeArquivoNoMinio, caminhoDestino);

            minioService.deletarArquivo(nomeArquivoNoMinio);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
