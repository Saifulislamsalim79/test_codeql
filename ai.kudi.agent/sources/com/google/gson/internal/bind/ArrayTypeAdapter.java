package com.google.gson.internal.bind;

import com.google.gson.AbstractC6909s;
import com.google.gson.C6784f;
import com.google.gson.InterfaceC6915t;
import com.google.gson.internal.C6796b;
import com.google.gson.p184v.C6916a;
import com.google.gson.stream.C6911a;
import com.google.gson.stream.C6914c;
import com.google.gson.stream.EnumC6913b;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class ArrayTypeAdapter<E> extends AbstractC6909s<Object> {

    /* renamed from: c */
    public static final InterfaceC6915t f16368c = new InterfaceC6915t() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.InterfaceC6915t
        /* renamed from: a */
        public <T> AbstractC6909s<T> mo20463a(C6784f c6784f, C6916a<T> c6916a) {
            Type type = c6916a.getType();
            if ((type instanceof GenericArrayType) || ((type instanceof Class) && ((Class) type).isArray())) {
                Type m20709g = C6796b.m20709g(type);
                return new ArrayTypeAdapter(c6784f, c6784f.m20758n(C6916a.get(m20709g)), C6796b.m20705k(m20709g));
            }
            return null;
        }
    };

    /* renamed from: a */
    private final Class<E> f16369a;

    /* renamed from: b */
    private final AbstractC6909s<E> f16370b;

    public ArrayTypeAdapter(C6784f c6784f, AbstractC6909s<E> abstractC6909s, Class<E> cls) {
        this.f16370b = new C6856c(c6784f, abstractC6909s, cls);
        this.f16369a = cls;
    }

    @Override // com.google.gson.AbstractC6909s
    /* renamed from: b */
    public Object mo20528b(C6911a c6911a) throws IOException {
        if (c6911a.mo20525C0() == EnumC6913b.NULL) {
            c6911a.mo20495w0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c6911a.mo20504c();
        while (c6911a.mo20509V()) {
            arrayList.add(this.f16370b.mo20528b(c6911a));
        }
        c6911a.mo20518J();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f16369a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.AbstractC6909s
    /* renamed from: d */
    public void mo20527d(C6914c c6914c, Object obj) throws IOException {
        if (obj == null) {
            c6914c.mo20474f0();
            return;
        }
        c6914c.mo20469m();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f16370b.mo20527d(c6914c, Array.get(obj, i));
        }
        c6914c.mo20483J();
    }
}
