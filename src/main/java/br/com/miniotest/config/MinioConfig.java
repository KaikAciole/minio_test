package br.com.miniotest.config;

import io.minio.MinioClient;

public class MinioConfig {

    private static final String URL = "http://localhost:9000";
    private static final String ACCESS_KEY = "minioadmin";
    private static final String SECRET_KEY = "minioadmin";

    public static MinioClient criarCliente() {
        return MinioClient.builder()
                .endpoint(URL)
                .credentials(ACCESS_KEY, SECRET_KEY)
                .build();
    }
}
