package com.google.firebase.database.p129r.p130s;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: StringListReader.java */
/* renamed from: com.google.firebase.database.r.s.b */
/* loaded from: classes2.dex */
public class C5724b extends Reader {

    /* renamed from: c */
    private List<String> f14091c;

    /* renamed from: d */
    private boolean f14092d = false;

    /* renamed from: e */
    private int f14093e;

    /* renamed from: w */
    private int f14095w = this.f14093e;

    /* renamed from: f */
    private int f14094f;

    /* renamed from: x */
    private int f14096x = this.f14094f;

    /* renamed from: y */
    private boolean f14097y = false;

    public C5724b() {
        this.f14091c = null;
        this.f14091c = new ArrayList();
    }

    /* renamed from: F */
    private String m24010F() {
        if (this.f14094f < this.f14091c.size()) {
            return this.f14091c.get(this.f14094f);
        }
        return null;
    }

    /* renamed from: I */
    private int m24009I() {
        String m24010F = m24010F();
        if (m24010F == null) {
            return 0;
        }
        return m24010F.length() - this.f14093e;
    }

    /* renamed from: g */
    private long m24006g(long j) {
        long j2 = 0;
        while (this.f14094f < this.f14091c.size() && j2 < j) {
            long j3 = j - j2;
            long m24009I = m24009I();
            if (j3 < m24009I) {
                this.f14093e = (int) (this.f14093e + j3);
                j2 += j3;
            } else {
                j2 += m24009I;
                this.f14093e = 0;
                this.f14094f++;
            }
        }
        return j2;
    }

    /* renamed from: m */
    private void m24005m() throws IOException {
        if (!this.f14092d) {
            if (!this.f14097y) {
                throw new IOException("Reader needs to be frozen before read operations can be called");
            }
            return;
        }
        throw new IOException("Stream already closed");
    }

    /* renamed from: J */
    public void m24008J() {
        if (!this.f14097y) {
            this.f14097y = true;
            return;
        }
        throw new IllegalStateException("Trying to freeze frozen StringListReader");
    }

    /* renamed from: c */
    public void m24007c(String str) {
        if (!this.f14097y) {
            if (str.length() > 0) {
                this.f14091c.add(str);
                return;
            }
            return;
        }
        throw new IllegalStateException("Trying to add string after reading");
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m24005m();
        this.f14092d = true;
    }

    @Override // java.io.Reader
    public void mark(int i) throws IOException {
        m24005m();
        this.f14095w = this.f14093e;
        this.f14096x = this.f14094f;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) throws IOException {
        m24005m();
        int remaining = charBuffer.remaining();
        String m24010F = m24010F();
        int i = 0;
        while (remaining > 0 && m24010F != null) {
            int min = Math.min(m24010F.length() - this.f14093e, remaining);
            int i2 = this.f14093e;
            charBuffer.put(this.f14091c.get(this.f14094f), i2, i2 + min);
            remaining -= min;
            i += min;
            m24006g(min);
            m24010F = m24010F();
        }
        if (i > 0 || m24010F != null) {
            return i;
        }
        return -1;
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        m24005m();
        return true;
    }

    @Override // java.io.Reader
    public void reset() throws IOException {
        this.f14093e = this.f14095w;
        this.f14094f = this.f14096x;
    }

    @Override // java.io.Reader
    public long skip(long j) throws IOException {
        m24005m();
        return m24006g(j);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f14091c) {
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        m24005m();
        String m24010F = m24010F();
        if (m24010F == null) {
            return -1;
        }
        char charAt = m24010F.charAt(this.f14093e);
        m24006g(1L);
        return charAt;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        m24005m();
        String m24010F = m24010F();
        int i3 = 0;
        while (m24010F != null && i3 < i2) {
            int min = Math.min(m24009I(), i2 - i3);
            int i4 = this.f14093e;
            m24010F.getChars(i4, i4 + min, cArr, i + i3);
            i3 += min;
            m24006g(min);
            m24010F = m24010F();
        }
        if (i3 > 0 || m24010F != null) {
            return i3;
        }
        return -1;
    }
}
