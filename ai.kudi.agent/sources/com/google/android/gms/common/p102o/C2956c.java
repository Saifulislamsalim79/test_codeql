package com.google.android.gms.common.p102o;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.o.c */
/* loaded from: classes2.dex */
public class C2956c {

    /* renamed from: b */
    private static C2956c f8132b = new C2956c();

    /* renamed from: a */
    private C2955b f8133a = null;

    /* renamed from: a */
    public static C2955b m31548a(Context context) {
        return f8132b.m31547b(context);
    }

    /* renamed from: b */
    public final synchronized C2955b m31547b(Context context) {
        if (this.f8133a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f8133a = new C2955b(context);
        }
        return this.f8133a;
    }
}
