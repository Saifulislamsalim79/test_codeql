package com.google.firebase.inappmessaging.model;

import java.util.Map;
/* compiled from: InAppMessage.java */
/* renamed from: com.google.firebase.inappmessaging.model.i */
/* loaded from: classes2.dex */
public abstract class AbstractC6386i {
    @Deprecated

    /* renamed from: a */
    C6381g f15455a;

    /* renamed from: b */
    MessageType f15456b;

    /* renamed from: c */
    C6377e f15457c;

    public AbstractC6386i(C6377e c6377e, MessageType messageType, Map<String, String> map) {
        this.f15457c = c6377e;
        this.f15456b = messageType;
    }

    /* renamed from: a */
    public C6377e m22152a() {
        return this.f15457c;
    }

    @Deprecated
    /* renamed from: b */
    public C6381g mo22150b() {
        return this.f15455a;
    }

    /* renamed from: c */
    public MessageType m22151c() {
        return this.f15456b;
    }
}
