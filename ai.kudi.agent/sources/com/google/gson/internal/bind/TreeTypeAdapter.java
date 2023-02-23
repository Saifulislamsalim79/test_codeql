package com.google.gson.internal.bind;

import com.google.gson.AbstractC6900l;
import com.google.gson.AbstractC6909s;
import com.google.gson.C6784f;
import com.google.gson.InterfaceC6898j;
import com.google.gson.InterfaceC6899k;
import com.google.gson.InterfaceC6904p;
import com.google.gson.InterfaceC6905q;
import com.google.gson.InterfaceC6915t;
import com.google.gson.internal.C6887k;
import com.google.gson.p184v.C6916a;
import com.google.gson.stream.C6911a;
import com.google.gson.stream.C6914c;
import java.io.IOException;
/* loaded from: classes2.dex */
public final class TreeTypeAdapter<T> extends AbstractC6909s<T> {

    /* renamed from: a */
    private final InterfaceC6905q<T> f16406a;

    /* renamed from: b */
    private final InterfaceC6899k<T> f16407b;

    /* renamed from: c */
    final C6784f f16408c;

    /* renamed from: d */
    private final C6916a<T> f16409d;

    /* renamed from: e */
    private final InterfaceC6915t f16410e;

    /* renamed from: f */
    private final TreeTypeAdapter<T>.C6812b f16411f = new C6812b();

    /* renamed from: g */
    private AbstractC6909s<T> f16412g;

    /* loaded from: classes2.dex */
    private static final class SingleTypeFactory implements InterfaceC6915t {

        /* renamed from: c */
        private final C6916a<?> f16413c;

        /* renamed from: d */
        private final boolean f16414d;

        /* renamed from: e */
        private final Class<?> f16415e;

        /* renamed from: f */
        private final InterfaceC6905q<?> f16416f;

        /* renamed from: w */
        private final InterfaceC6899k<?> f16417w;

        @Override // com.google.gson.InterfaceC6915t
        /* renamed from: a */
        public <T> AbstractC6909s<T> mo20463a(C6784f c6784f, C6916a<T> c6916a) {
            boolean isAssignableFrom;
            C6916a<?> c6916a2 = this.f16413c;
            if (c6916a2 != null) {
                isAssignableFrom = c6916a2.equals(c6916a) || (this.f16414d && this.f16413c.getType() == c6916a.getRawType());
            } else {
                isAssignableFrom = this.f16415e.isAssignableFrom(c6916a.getRawType());
            }
            if (isAssignableFrom) {
                return new TreeTypeAdapter(this.f16416f, this.f16417w, c6784f, c6916a, this);
            }
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.TreeTypeAdapter$b */
    /* loaded from: classes2.dex */
    private final class C6812b implements InterfaceC6904p, InterfaceC6898j {
        private C6812b(TreeTypeAdapter treeTypeAdapter) {
        }
    }

    public TreeTypeAdapter(InterfaceC6905q<T> interfaceC6905q, InterfaceC6899k<T> interfaceC6899k, C6784f c6784f, C6916a<T> c6916a, InterfaceC6915t interfaceC6915t) {
        this.f16406a = interfaceC6905q;
        this.f16407b = interfaceC6899k;
        this.f16408c = c6784f;
        this.f16409d = c6916a;
        this.f16410e = interfaceC6915t;
    }

    /* renamed from: e */
    private AbstractC6909s<T> m20672e() {
        AbstractC6909s<T> abstractC6909s = this.f16412g;
        if (abstractC6909s != null) {
            return abstractC6909s;
        }
        AbstractC6909s<T> m20756p = this.f16408c.m20756p(this.f16410e, this.f16409d);
        this.f16412g = m20756p;
        return m20756p;
    }

    @Override // com.google.gson.AbstractC6909s
    /* renamed from: b */
    public T mo20528b(C6911a c6911a) throws IOException {
        if (this.f16407b == null) {
            return m20672e().mo20528b(c6911a);
        }
        AbstractC6900l m20562a = C6887k.m20562a(c6911a);
        if (m20562a.m20546k()) {
            return null;
        }
        return this.f16407b.m20551a(m20562a, this.f16409d.getType(), this.f16411f);
    }

    @Override // com.google.gson.AbstractC6909s
    /* renamed from: d */
    public void mo20527d(C6914c c6914c, T t) throws IOException {
        InterfaceC6905q<T> interfaceC6905q = this.f16406a;
        if (interfaceC6905q == null) {
            m20672e().mo20527d(c6914c, t);
        } else if (t == null) {
            c6914c.mo20474f0();
        } else {
            C6887k.m20561b(interfaceC6905q.m20531a(t, this.f16409d.getType(), this.f16411f), c6914c);
        }
    }
}
