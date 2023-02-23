package com.github.kittinunf.fuel.core;
/* compiled from: Response.kt */
/* renamed from: com.github.kittinunf.fuel.core.v */
/* loaded from: classes2.dex */
public final class C2503v {
    /* renamed from: a */
    public static final boolean m32718a(C2500u c2500u) {
        kotlin.e0.d.l.g(c2500u, "$this$isClientError");
        return c2500u.m32722d() / 100 == 4;
    }

    /* renamed from: b */
    public static final boolean m32717b(C2500u c2500u) {
        kotlin.e0.d.l.g(c2500u, "$this$isServerError");
        return c2500u.m32722d() / 100 == 5;
    }

    /* renamed from: c */
    public static final boolean m32716c(C2500u c2500u) {
        kotlin.e0.d.l.g(c2500u, "$this$isStatusRedirection");
        return c2500u.m32722d() / 100 == 3;
    }
}
