package com.google.gson.internal.bind;

import com.google.gson.AbstractC6909s;
import com.google.gson.C6784f;
import com.google.gson.InterfaceC6915t;
import com.google.gson.internal.C6796b;
import com.google.gson.internal.C6858c;
import com.google.gson.internal.InterfaceC6884h;
import com.google.gson.p184v.C6916a;
import com.google.gson.stream.C6911a;
import com.google.gson.stream.C6914c;
import com.google.gson.stream.EnumC6913b;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
/* loaded from: classes2.dex */
public final class CollectionTypeAdapterFactory implements InterfaceC6915t {

    /* renamed from: c */
    private final C6858c f16371c;

    /* renamed from: com.google.gson.internal.bind.CollectionTypeAdapterFactory$a */
    /* loaded from: classes2.dex */
    private static final class C6801a<E> extends AbstractC6909s<Collection<E>> {

        /* renamed from: a */
        private final AbstractC6909s<E> f16372a;

        /* renamed from: b */
        private final InterfaceC6884h<? extends Collection<E>> f16373b;

        public C6801a(C6784f c6784f, Type type, AbstractC6909s<E> abstractC6909s, InterfaceC6884h<? extends Collection<E>> interfaceC6884h) {
            this.f16372a = new C6856c(c6784f, abstractC6909s, type);
            this.f16373b = interfaceC6884h;
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: e */
        public Collection<E> mo20528b(C6911a c6911a) throws IOException {
            if (c6911a.mo20525C0() == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            Collection<E> mo20568a = this.f16373b.mo20568a();
            c6911a.mo20504c();
            while (c6911a.mo20509V()) {
                mo20568a.add(this.f16372a.mo20528b(c6911a));
            }
            c6911a.mo20518J();
            return mo20568a;
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: f */
        public void mo20527d(C6914c c6914c, Collection<E> collection) throws IOException {
            if (collection == null) {
                c6914c.mo20474f0();
                return;
            }
            c6914c.mo20469m();
            for (E e : collection) {
                this.f16372a.mo20527d(c6914c, e);
            }
            c6914c.mo20483J();
        }
    }

    public CollectionTypeAdapterFactory(C6858c c6858c) {
        this.f16371c = c6858c;
    }

    @Override // com.google.gson.InterfaceC6915t
    /* renamed from: a */
    public <T> AbstractC6909s<T> mo20463a(C6784f c6784f, C6916a<T> c6916a) {
        Type type = c6916a.getType();
        Class<? super T> rawType = c6916a.getRawType();
        if (Collection.class.isAssignableFrom(rawType)) {
            Type m20708h = C6796b.m20708h(type, rawType);
            return new C6801a(c6784f, m20708h, c6784f.m20758n(C6916a.get(m20708h)), this.f16371c.m20593a(c6916a));
        }
        return null;
    }
}
