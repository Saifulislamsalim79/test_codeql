package com.google.protobuf;

import com.google.protobuf.InterfaceC7100r0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: Internal.java */
/* renamed from: com.google.protobuf.a0 */
/* loaded from: classes2.dex */
public final class C6997a0 {

    /* renamed from: a */
    static final Charset f16756a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f16757b;

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.a0$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC6998a extends InterfaceC7006i<Boolean> {
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.a0$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC6999b extends InterfaceC7006i<Double> {
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.a0$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC7000c {
        /* renamed from: d */
        int mo20225d();
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.a0$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC7001d<T extends InterfaceC7000c> {
        /* renamed from: a */
        T m20224a(int i);
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.a0$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC7002e {
        /* renamed from: a */
        boolean mo20223a(int i);
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.a0$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC7003f extends InterfaceC7006i<Float> {
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.a0$g */
    /* loaded from: classes2.dex */
    public interface InterfaceC7004g extends InterfaceC7006i<Integer> {
        /* renamed from: C */
        void mo19336C(int i);

        int getInt(int i);

        @Override // com.google.protobuf.C6997a0.InterfaceC7006i
        /* renamed from: j */
        InterfaceC7006i<Integer> mo19330j(int i);
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.a0$h */
    /* loaded from: classes2.dex */
    public interface InterfaceC7005h extends InterfaceC7006i<Long> {
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.a0$i */
    /* loaded from: classes2.dex */
    public interface InterfaceC7006i<E> extends List<E>, RandomAccess {
        /* renamed from: c0 */
        boolean mo20222c0();

        /* renamed from: j */
        InterfaceC7006i<E> mo19330j(int i);

        /* renamed from: y */
        void mo20220y();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f16757b = bArr;
        ByteBuffer.wrap(bArr);
        AbstractC7052j.m20063j(f16757b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> T m20235a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <T> T m20234b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static int m20233c(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: d */
    public static int m20232d(byte[] bArr) {
        return m20231e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    static int m20231e(byte[] bArr, int i, int i2) {
        int m20227i = m20227i(i2, bArr, i, i2);
        if (m20227i == 0) {
            return 1;
        }
        return m20227i;
    }

    /* renamed from: f */
    public static int m20230f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: g */
    public static boolean m20229g(byte[] bArr) {
        return C7110s1.m19612s(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static Object m20228h(Object obj, Object obj2) {
        InterfaceC7100r0.InterfaceC7101a mo19353b = ((InterfaceC7100r0) obj).mo19353b();
        mo19353b.mo19707w0((InterfaceC7100r0) obj2);
        return mo19353b.mo19366C0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m20227i(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: j */
    public static String m20226j(byte[] bArr) {
        return new String(bArr, f16756a);
    }
}
