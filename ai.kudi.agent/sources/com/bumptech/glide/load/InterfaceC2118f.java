package com.bumptech.glide.load;

import java.nio.charset.Charset;
import java.security.MessageDigest;
/* compiled from: Key.java */
/* renamed from: com.bumptech.glide.load.f */
/* loaded from: classes2.dex */
public interface InterfaceC2118f {

    /* renamed from: a */
    public static final Charset f6413a = Charset.forName("UTF-8");

    boolean equals(Object obj);

    int hashCode();

    void updateDiskCacheKey(MessageDigest messageDigest);
}
