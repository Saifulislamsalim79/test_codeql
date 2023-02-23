package com.bumptech.glide.load.p070m.p071p;

import android.net.Uri;
/* compiled from: MediaStoreUtil.java */
/* renamed from: com.bumptech.glide.load.m.p.b */
/* loaded from: classes2.dex */
public final class C2152b {
    /* renamed from: a */
    public static boolean m33621a(Uri uri) {
        return m33620b(uri) && !m33617e(uri);
    }

    /* renamed from: b */
    public static boolean m33620b(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: c */
    public static boolean m33619c(Uri uri) {
        return m33620b(uri) && m33617e(uri);
    }

    /* renamed from: d */
    public static boolean m33618d(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: e */
    private static boolean m33617e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
