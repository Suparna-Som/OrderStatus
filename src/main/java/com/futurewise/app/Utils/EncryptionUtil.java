package com.futurewise.app.Utils;

import java.util.Base64;

public class EncryptionUtil {
    public static String base64Decode(String data) {
        return new String(Base64.getDecoder().decode(data));
    }
}
