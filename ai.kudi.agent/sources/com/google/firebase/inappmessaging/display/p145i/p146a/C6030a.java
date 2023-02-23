package com.google.firebase.inappmessaging.display.p145i.p146a;

import java.util.LinkedHashMap;
/* compiled from: DaggerCollections.java */
/* renamed from: com.google.firebase.inappmessaging.display.i.a.a */
/* loaded from: classes2.dex */
public final class C6030a {
    /* renamed from: a */
    private static int m22954a(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static <K, V> LinkedHashMap<K, V> m22953b(int i) {
        return new LinkedHashMap<>(m22954a(i));
    }
}
