package io.grpc.p385i1.p386r;

import java.io.IOException;
/* compiled from: Protocol.java */
/* renamed from: io.grpc.i1.r.g */
/* loaded from: classes2.dex */
public enum EnumC9959g {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    

    /* renamed from: c */
    private final String f23599c;

    EnumC9959g(String str) {
        this.f23599c = str;
    }

    /* renamed from: a */
    public static EnumC9959g m13473a(String str) throws IOException {
        EnumC9959g enumC9959g = SPDY_3;
        EnumC9959g enumC9959g2 = HTTP_2;
        EnumC9959g enumC9959g3 = HTTP_1_1;
        EnumC9959g enumC9959g4 = HTTP_1_0;
        if (str.equals(enumC9959g4.f23599c)) {
            return enumC9959g4;
        }
        if (str.equals(enumC9959g3.f23599c)) {
            return enumC9959g3;
        }
        if (str.equals(enumC9959g2.f23599c)) {
            return enumC9959g2;
        }
        if (str.equals(enumC9959g.f23599c)) {
            return enumC9959g;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f23599c;
    }
}
