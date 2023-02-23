package io.intercom.com.bumptech.glide.load;

import java.nio.charset.Charset;
import java.security.MessageDigest;
/* compiled from: Key.java */
/* renamed from: io.intercom.com.bumptech.glide.load.g */
/* loaded from: classes3.dex */
public interface InterfaceC10622g {

    /* renamed from: a */
    public static final Charset f24418a = Charset.forName("UTF-8");

    boolean equals(Object obj);

    int hashCode();

    void updateDiskCacheKey(MessageDigest messageDigest);
}
