package com.google.gson;

import com.google.gson.internal.bind.C6854b;
import com.google.gson.stream.C6911a;
import com.google.gson.stream.C6914c;
import com.google.gson.stream.EnumC6913b;
import java.io.IOException;
/* compiled from: TypeAdapter.java */
/* renamed from: com.google.gson.s */
/* loaded from: classes2.dex */
public abstract class AbstractC6909s<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypeAdapter.java */
    /* renamed from: com.google.gson.s$a */
    /* loaded from: classes2.dex */
    public class C6910a extends AbstractC6909s<T> {
        C6910a() {
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: b */
        public T mo20528b(C6911a c6911a) throws IOException {
            if (c6911a.mo20525C0() == EnumC6913b.NULL) {
                c6911a.mo20495w0();
                return null;
            }
            return (T) AbstractC6909s.this.mo20528b(c6911a);
        }

        @Override // com.google.gson.AbstractC6909s
        /* renamed from: d */
        public void mo20527d(C6914c c6914c, T t) throws IOException {
            if (t == null) {
                c6914c.mo20474f0();
            } else {
                AbstractC6909s.this.mo20527d(c6914c, t);
            }
        }
    }

    /* renamed from: a */
    public final AbstractC6909s<T> m20530a() {
        return new C6910a();
    }

    /* renamed from: b */
    public abstract T mo20528b(C6911a c6911a) throws IOException;

    /* renamed from: c */
    public final AbstractC6900l m20529c(T t) {
        try {
            C6854b c6854b = new C6854b();
            mo20527d(c6854b, t);
            return c6854b.m20601K0();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    /* renamed from: d */
    public abstract void mo20527d(C6914c c6914c, T t) throws IOException;
}
