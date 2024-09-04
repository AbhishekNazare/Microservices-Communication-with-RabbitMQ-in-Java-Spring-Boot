package com.example.demo.utils;

import java.util.UUID;

public class CustomIdGenerator {

    public static String generateId(String entityName) {
        String prefix = entityName.substring(0, 3).toUpperCase();
        String uuid = UUID.randomUUID().toString();
        return prefix + "-" + uuid;
    }
}

