package com.github.kittinunf.fuel.core;

import kotlin.TypeCastException;
/* compiled from: Environment.kt */
/* renamed from: com.github.kittinunf.fuel.core.k */
/* loaded from: classes2.dex */
public final class C2447k {
    /* renamed from: a */
    public static final InterfaceC2446j m32873a() {
        try {
            Object newInstance = Class.forName("com.github.kittinunf.fuel.android.util.AndroidEnvironment").newInstance();
            if (newInstance != null) {
                return (InterfaceC2446j) newInstance;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.github.kittinunf.fuel.core.Environment");
        } catch (ClassNotFoundException unused) {
            return new C2429e();
        }
    }
}
