package io.intercom.com.google.gson.p418t.p419n;

import io.intercom.com.google.gson.AbstractC10927j;
import io.intercom.com.google.gson.AbstractC10936q;
import io.intercom.com.google.gson.C10916e;
import io.intercom.com.google.gson.InterfaceC10925h;
import io.intercom.com.google.gson.InterfaceC10926i;
import io.intercom.com.google.gson.InterfaceC10931n;
import io.intercom.com.google.gson.InterfaceC10932o;
import io.intercom.com.google.gson.InterfaceC10938r;
import io.intercom.com.google.gson.p418t.C10979l;
import io.intercom.com.google.gson.p422u.C11058a;
import io.intercom.com.google.gson.stream.C10939a;
import io.intercom.com.google.gson.stream.C10942c;
import java.io.IOException;
/* compiled from: TreeTypeAdapter.java */
/* renamed from: io.intercom.com.google.gson.t.n.l */
/* loaded from: classes3.dex */
public final class C11011l<T> extends AbstractC10936q<T> {

    /* renamed from: a */
    private final InterfaceC10932o<T> f25051a;

    /* renamed from: b */
    private final InterfaceC10926i<T> f25052b;

    /* renamed from: c */
    final C10916e f25053c;

    /* renamed from: d */
    private final C11058a<T> f25054d;

    /* renamed from: e */
    private final InterfaceC10938r f25055e;

    /* renamed from: f */
    private final C11011l<T>.C11013b f25056f = new C11013b();

    /* renamed from: g */
    private AbstractC10936q<T> f25057g;

    /* compiled from: TreeTypeAdapter.java */
    /* renamed from: io.intercom.com.google.gson.t.n.l$b */
    /* loaded from: classes3.dex */
    private final class C11013b implements InterfaceC10931n, InterfaceC10925h {
        private C11013b(C11011l c11011l) {
        }
    }

    public C11011l(InterfaceC10932o<T> interfaceC10932o, InterfaceC10926i<T> interfaceC10926i, C10916e c10916e, C11058a<T> c11058a, InterfaceC10938r interfaceC10938r) {
        this.f25051a = interfaceC10932o;
        this.f25052b = interfaceC10926i;
        this.f25053c = c10916e;
        this.f25054d = c11058a;
        this.f25055e = interfaceC10938r;
    }

    /* renamed from: e */
    private AbstractC10936q<T> m11739e() {
        AbstractC10936q<T> abstractC10936q = this.f25057g;
        if (abstractC10936q != null) {
            return abstractC10936q;
        }
        AbstractC10936q<T> m11957n = this.f25053c.m11957n(this.f25055e, this.f25054d);
        this.f25057g = m11957n;
        return m11957n;
    }

    @Override // io.intercom.com.google.gson.AbstractC10936q
    /* renamed from: b */
    public T mo11675b(C10939a c10939a) throws IOException {
        if (this.f25052b == null) {
            return m11739e().mo11675b(c10939a);
        }
        AbstractC10927j m11801a = C10979l.m11801a(c10939a);
        if (m11801a.m11927k()) {
            return null;
        }
        return this.f25052b.m11932a(m11801a, this.f25054d.m11657e(), this.f25056f);
    }

    @Override // io.intercom.com.google.gson.AbstractC10936q
    /* renamed from: d */
    public void mo11674d(C10942c c10942c, T t) throws IOException {
        InterfaceC10932o<T> interfaceC10932o = this.f25051a;
        if (interfaceC10932o == null) {
            m11739e().mo11674d(c10942c, t);
        } else if (t == null) {
            c10942c.mo11757f0();
        } else {
            C10979l.m11800b(interfaceC10932o.m11909a(t, this.f25054d.m11657e(), this.f25056f), c10942c);
        }
    }
}
