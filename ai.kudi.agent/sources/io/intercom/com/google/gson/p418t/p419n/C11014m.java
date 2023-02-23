package io.intercom.com.google.gson.p418t.p419n;

import io.intercom.com.google.gson.AbstractC10936q;
import io.intercom.com.google.gson.C10916e;
import io.intercom.com.google.gson.p418t.p419n.C11003i;
import io.intercom.com.google.gson.p422u.C11058a;
import io.intercom.com.google.gson.stream.C10939a;
import io.intercom.com.google.gson.stream.C10942c;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TypeAdapterRuntimeTypeWrapper.java */
/* renamed from: io.intercom.com.google.gson.t.n.m */
/* loaded from: classes3.dex */
public final class C11014m<T> extends AbstractC10936q<T> {

    /* renamed from: a */
    private final C10916e f25058a;

    /* renamed from: b */
    private final AbstractC10936q<T> f25059b;

    /* renamed from: c */
    private final Type f25060c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11014m(C10916e c10916e, AbstractC10936q<T> abstractC10936q, Type type) {
        this.f25058a = c10916e;
        this.f25059b = abstractC10936q;
        this.f25060c = type;
    }

    /* renamed from: e */
    private Type m11738e(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // io.intercom.com.google.gson.AbstractC10936q
    /* renamed from: b */
    public T mo11675b(C10939a c10939a) throws IOException {
        return this.f25059b.mo11675b(c10939a);
    }

    @Override // io.intercom.com.google.gson.AbstractC10936q
    /* renamed from: d */
    public void mo11674d(C10942c c10942c, T t) throws IOException {
        AbstractC10936q<T> abstractC10936q = this.f25059b;
        Type m11738e = m11738e(this.f25060c, t);
        if (m11738e != this.f25060c) {
            abstractC10936q = this.f25058a.m11959l(C11058a.m11660b(m11738e));
            if (abstractC10936q instanceof C11003i.C11005b) {
                AbstractC10936q<T> abstractC10936q2 = this.f25059b;
                if (!(abstractC10936q2 instanceof C11003i.C11005b)) {
                    abstractC10936q = abstractC10936q2;
                }
            }
        }
        abstractC10936q.mo11674d(c10942c, t);
    }
}
