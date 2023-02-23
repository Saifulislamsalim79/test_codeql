package com.google.firebase.installations;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;
/* compiled from: RandomFidGenerator.java */
/* renamed from: com.google.firebase.installations.l */
/* loaded from: classes2.dex */
public class C6437l {

    /* renamed from: a */
    private static final byte f15543a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    private static final byte f15544b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    private static String m22039b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    private static byte[] m22038c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    /* renamed from: a */
    public String m22040a() {
        byte[] m22038c = m22038c(UUID.randomUUID(), new byte[17]);
        m22038c[16] = m22038c[0];
        m22038c[0] = (byte) ((f15544b & m22038c[0]) | f15543a);
        return m22039b(m22038c);
    }
}
