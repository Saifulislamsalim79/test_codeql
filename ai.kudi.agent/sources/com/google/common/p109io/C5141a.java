package com.google.common.p109io;

import com.google.common.base.C5051n;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Queue;
import p272h.p286c.p348b.p349a.C9358a;
/* compiled from: ByteStreams.java */
/* renamed from: com.google.common.io.a */
/* loaded from: classes2.dex */
public final class C5141a {

    /* compiled from: ByteStreams.java */
    /* renamed from: com.google.common.io.a$a */
    /* loaded from: classes2.dex */
    class C5142a extends OutputStream {
        C5142a() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            C5051n.m25780n(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            C5051n.m25780n(bArr);
        }
    }

    static {
        new C5142a();
    }

    /* renamed from: a */
    private static byte[] m25528a(Queue<byte[]> queue, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] remove = queue.remove();
            int min = Math.min(i2, remove.length);
            System.arraycopy(remove, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }

    /* renamed from: b */
    public static long m25527b(InputStream inputStream, OutputStream outputStream) throws IOException {
        C5051n.m25780n(inputStream);
        C5051n.m25780n(outputStream);
        byte[] m25526c = m25526c();
        long j = 0;
        while (true) {
            int read = inputStream.read(m25526c);
            if (read == -1) {
                return j;
            }
            outputStream.write(m25526c, 0, read);
            j += read;
        }
    }

    /* renamed from: c */
    static byte[] m25526c() {
        return new byte[8192];
    }

    /* renamed from: d */
    public static byte[] m25525d(InputStream inputStream) throws IOException {
        C5051n.m25780n(inputStream);
        return m25524e(inputStream, new ArrayDeque(20), 0);
    }

    /* renamed from: e */
    private static byte[] m25524e(InputStream inputStream, Queue<byte[]> queue, int i) throws IOException {
        int i2 = 8192;
        while (i < 2147483639) {
            int min = Math.min(i2, 2147483639 - i);
            byte[] bArr = new byte[min];
            queue.add(bArr);
            int i3 = 0;
            while (i3 < min) {
                int read = inputStream.read(bArr, i3, min - i3);
                if (read == -1) {
                    return m25528a(queue, i);
                }
                i3 += read;
                i += read;
            }
            i2 = C9358a.m14964e(i2, 2);
        }
        if (inputStream.read() == -1) {
            return m25528a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
