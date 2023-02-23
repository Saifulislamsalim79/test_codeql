package com.google.gson.internal;

import com.google.gson.AbstractC6900l;
import com.google.gson.C6901m;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.C6911a;
import com.google.gson.stream.C6914c;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
/* compiled from: Streams.java */
/* renamed from: com.google.gson.internal.k */
/* loaded from: classes2.dex */
public final class C6887k {
    /* renamed from: a */
    public static AbstractC6900l m20562a(C6911a c6911a) throws JsonParseException {
        boolean z;
        try {
            try {
                c6911a.mo20525C0();
                z = false;
            } catch (EOFException e) {
                e = e;
                z = true;
            }
            try {
                return TypeAdapters.f16441X.mo20528b(c6911a);
            } catch (EOFException e2) {
                e = e2;
                if (z) {
                    return C6901m.f16551a;
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
    public static void m20561b(AbstractC6900l abstractC6900l, C6914c c6914c) throws IOException {
        TypeAdapters.f16441X.mo20527d(c6914c, abstractC6900l);
    }

    /* renamed from: c */
    public static Writer m20560c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C6888a(appendable);
    }

    /* compiled from: Streams.java */
    /* renamed from: com.google.gson.internal.k$a */
    /* loaded from: classes2.dex */
    private static final class C6888a extends Writer {

        /* renamed from: c */
        private final Appendable f16539c;

        /* renamed from: d */
        private final C6889a f16540d = new C6889a();

        /* compiled from: Streams.java */
        /* renamed from: com.google.gson.internal.k$a$a */
        /* loaded from: classes2.dex */
        static class C6889a implements CharSequence {

            /* renamed from: c */
            char[] f16541c;

            C6889a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i) {
                return this.f16541c[i];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f16541c.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i, int i2) {
                return new String(this.f16541c, i, i2 - i);
            }
        }

        C6888a(Appendable appendable) {
            this.f16539c = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) throws IOException {
            C6889a c6889a = this.f16540d;
            c6889a.f16541c = cArr;
            this.f16539c.append(c6889a, i, i2 + i);
        }

        @Override // java.io.Writer
        public void write(int i) throws IOException {
            this.f16539c.append((char) i);
        }
    }
}
