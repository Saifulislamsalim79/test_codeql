package io.intercom.com.google.gson;

import io.intercom.com.google.gson.p418t.p419n.C10996f;
import io.intercom.com.google.gson.stream.C10939a;
import io.intercom.com.google.gson.stream.C10942c;
import io.intercom.com.google.gson.stream.EnumC10941b;
import java.io.IOException;
/* compiled from: TypeAdapter.java */
/* renamed from: io.intercom.com.google.gson.q */
/* loaded from: classes3.dex */
public abstract class AbstractC10936q<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypeAdapter.java */
    /* renamed from: io.intercom.com.google.gson.q$a */
    /* loaded from: classes3.dex */
    public class C10937a extends AbstractC10936q<T> {
        C10937a() {
        }

        @Override // io.intercom.com.google.gson.AbstractC10936q
        /* renamed from: b */
        public T mo11675b(C10939a c10939a) throws IOException {
            if (c10939a.mo11789C0() == EnumC10941b.NULL) {
                c10939a.mo11771w0();
                return null;
            }
            return (T) AbstractC10936q.this.mo11675b(c10939a);
        }

        @Override // io.intercom.com.google.gson.AbstractC10936q
        /* renamed from: d */
        public void mo11674d(C10942c c10942c, T t) throws IOException {
            if (t == null) {
                c10942c.mo11757f0();
            } else {
                AbstractC10936q.this.mo11674d(c10942c, t);
            }
        }
    }

    /* renamed from: a */
    public final AbstractC10936q<T> m11908a() {
        return new C10937a();
    }

    /* renamed from: b */
    public abstract T mo11675b(C10939a c10939a) throws IOException;

    /* renamed from: c */
    public final AbstractC10927j m11907c(T t) {
        try {
            C10996f c10996f = new C10996f();
            mo11674d(c10996f, t);
            return c10996f.m11762K0();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    /* renamed from: d */
    public abstract void mo11674d(C10942c c10942c, T t) throws IOException;
}
