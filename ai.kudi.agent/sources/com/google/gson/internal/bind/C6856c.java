package com.google.gson.internal.bind;

import com.google.gson.AbstractC6909s;
import com.google.gson.C6784f;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.p184v.C6916a;
import com.google.gson.stream.C6911a;
import com.google.gson.stream.C6914c;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TypeAdapterRuntimeTypeWrapper.java */
/* renamed from: com.google.gson.internal.bind.c */
/* loaded from: classes2.dex */
public final class C6856c<T> extends AbstractC6909s<T> {

    /* renamed from: a */
    private final C6784f f16499a;

    /* renamed from: b */
    private final AbstractC6909s<T> f16500b;

    /* renamed from: c */
    private final Type f16501c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6856c(C6784f c6784f, AbstractC6909s<T> abstractC6909s, Type type) {
        this.f16499a = c6784f;
        this.f16500b = abstractC6909s;
        this.f16501c = type;
    }

    /* renamed from: e */
    private Type m20598e(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // com.google.gson.AbstractC6909s
    /* renamed from: b */
    public T mo20528b(C6911a c6911a) throws IOException {
        return this.f16500b.mo20528b(c6911a);
    }

    @Override // com.google.gson.AbstractC6909s
    /* renamed from: d */
    public void mo20527d(C6914c c6914c, T t) throws IOException {
        AbstractC6909s<T> abstractC6909s = this.f16500b;
        Type m20598e = m20598e(this.f16501c, t);
        if (m20598e != this.f16501c) {
            abstractC6909s = this.f16499a.m20758n(C6916a.get(m20598e));
            if (abstractC6909s instanceof ReflectiveTypeAdapterFactory.C6807b) {
                AbstractC6909s<T> abstractC6909s2 = this.f16500b;
                if (!(abstractC6909s2 instanceof ReflectiveTypeAdapterFactory.C6807b)) {
                    abstractC6909s = abstractC6909s2;
                }
            }
        }
        abstractC6909s.mo20527d(c6914c, t);
    }
}
