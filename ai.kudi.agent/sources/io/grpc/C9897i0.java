package io.grpc;

import com.google.common.p109io.BaseEncoding;
import io.grpc.C10049s0;
import java.nio.charset.Charset;
/* compiled from: InternalMetadata.java */
/* renamed from: io.grpc.i0 */
/* loaded from: classes2.dex */
public final class C9897i0 {

    /* renamed from: a */
    public static final Charset f23241a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final BaseEncoding f23242b = C10049s0.f23787d;

    /* compiled from: InternalMetadata.java */
    /* renamed from: io.grpc.i0$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC9898a<T> extends C10049s0.InterfaceC10058i<T> {
    }

    /* renamed from: a */
    public static int m13745a(C10049s0 c10049s0) {
        return c10049s0.m13210g();
    }

    /* renamed from: b */
    public static <T> C10049s0.AbstractC10055f<T> m13744b(String str, InterfaceC9898a<T> interfaceC9898a) {
        boolean z = false;
        if (str != null && !str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return C10049s0.AbstractC10055f.m13183g(str, z, interfaceC9898a);
    }

    /* renamed from: c */
    public static C10049s0 m13743c(byte[]... bArr) {
        return new C10049s0(bArr);
    }

    /* renamed from: d */
    public static byte[][] m13742d(C10049s0 c10049s0) {
        return c10049s0.m13202o();
    }
}
