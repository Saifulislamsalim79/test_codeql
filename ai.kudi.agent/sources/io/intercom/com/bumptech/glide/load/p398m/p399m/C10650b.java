package io.intercom.com.bumptech.glide.load.p398m.p399m;

import android.net.Uri;
/* compiled from: MediaStoreUtil.java */
/* renamed from: io.intercom.com.bumptech.glide.load.m.m.b */
/* loaded from: classes3.dex */
public final class C10650b {
    /* renamed from: a */
    public static boolean m12565a(Uri uri) {
        return m12564b(uri) && !m12561e(uri);
    }

    /* renamed from: b */
    public static boolean m12564b(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: c */
    public static boolean m12563c(Uri uri) {
        return m12564b(uri) && m12561e(uri);
    }

    /* renamed from: d */
    public static boolean m12562d(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: e */
    private static boolean m12561e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
