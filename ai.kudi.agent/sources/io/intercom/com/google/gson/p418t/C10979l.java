package io.intercom.com.google.gson.p418t;

import io.intercom.com.google.gson.AbstractC10927j;
import io.intercom.com.google.gson.C10928k;
import io.intercom.com.google.gson.JsonIOException;
import io.intercom.com.google.gson.JsonParseException;
import io.intercom.com.google.gson.JsonSyntaxException;
import io.intercom.com.google.gson.p418t.p419n.C11015n;
import io.intercom.com.google.gson.stream.C10939a;
import io.intercom.com.google.gson.stream.C10942c;
import io.intercom.com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
/* compiled from: Streams.java */
/* renamed from: io.intercom.com.google.gson.t.l */
/* loaded from: classes3.dex */
public final class C10979l {
    /* renamed from: a */
    public static AbstractC10927j m11801a(C10939a c10939a) throws JsonParseException {
        boolean z;
        try {
            try {
                c10939a.mo11789C0();
                z = false;
            } catch (EOFException e) {
                e = e;
                z = true;
            }
            try {
                return C11015n.f25084X.mo11675b(c10939a);
            } catch (EOFException e2) {
                e = e2;
                if (z) {
                    return C10928k.f24892a;
                }
                throw new JsonSyntaxException(e);
            }
        } catch (MalformedJsonException e3) {
            throw new JsonSyntaxException(e3);
        } catch (IOException e4) {
            throw new JsonIOException(e4);
        } catch (NumberFormatException e5) {
            throw new JsonSyntaxException(e5);
        }
    }

    /* renamed from: b */
    public static void m11800b(AbstractC10927j abstractC10927j, C10942c c10942c) throws IOException {
        C11015n.f25084X.mo11674d(c10942c, abstractC10927j);
    }

    /* renamed from: c */
    public static Writer m11799c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C10980a(appendable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Streams.java */
    /* renamed from: io.intercom.com.google.gson.t.l$a */
    /* loaded from: classes3.dex */
    public static final class C10980a extends Writer {

        /* renamed from: c */
        private final Appendable f24995c;

        /* renamed from: d */
        private final C10981a f24996d = new C10981a();

        /* compiled from: Streams.java */
        /* renamed from: io.intercom.com.google.gson.t.l$a$a */
        /* loaded from: classes3.dex */
        static class C10981a implements CharSequence {

            /* renamed from: c */
            char[] f24997c;

            C10981a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i) {
                return this.f24997c[i];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f24997c.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i, int i2) {
                return new String(this.f24997c, i, i2 - i);
            }
        }

        C10980a(Appendable appendable) {
            this.f24995c = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) throws IOException {
            C10981a c10981a = this.f24996d;
            c10981a.f24997c = cArr;
            this.f24995c.append(c10981a, i, i2 + i);
        }

        @Override // java.io.Writer
        public void write(int i) throws IOException {
            this.f24995c.append((char) i);
        }
    }
}
