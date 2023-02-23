package io.grpc.p385i1.p386r;
/* compiled from: TlsVersion.java */
/* renamed from: io.grpc.i1.r.h */
/* loaded from: classes2.dex */
public enum EnumC9960h {
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: c */
    final String f23605c;

    EnumC9960h(String str) {
        this.f23605c = str;
    }

    /* renamed from: a */
    public static EnumC9960h m13472a(String str) {
        if ("TLSv1.2".equals(str)) {
            return TLS_1_2;
        }
        if ("TLSv1.1".equals(str)) {
            return TLS_1_1;
        }
        if ("TLSv1".equals(str)) {
            return TLS_1_0;
        }
        if ("SSLv3".equals(str)) {
            return SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: " + str);
    }
}
