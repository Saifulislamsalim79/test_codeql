package p565l;

import java.io.IOException;
/* compiled from: Protocol.java */
/* renamed from: l.y */
/* loaded from: classes3.dex */
public enum EnumC14242y {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: c */
    private final String f31254c;

    EnumC14242y(String str) {
        this.f31254c = str;
    }

    /* renamed from: a */
    public static EnumC14242y m2418a(String str) throws IOException {
        EnumC14242y enumC14242y = QUIC;
        EnumC14242y enumC14242y2 = SPDY_3;
        EnumC14242y enumC14242y3 = HTTP_2;
        EnumC14242y enumC14242y4 = H2_PRIOR_KNOWLEDGE;
        EnumC14242y enumC14242y5 = HTTP_1_1;
        EnumC14242y enumC14242y6 = HTTP_1_0;
        if (str.equals(enumC14242y6.f31254c)) {
            return enumC14242y6;
        }
        if (str.equals(enumC14242y5.f31254c)) {
            return enumC14242y5;
        }
        if (str.equals(enumC14242y4.f31254c)) {
            return enumC14242y4;
        }
        if (str.equals(enumC14242y3.f31254c)) {
            return enumC14242y3;
        }
        if (str.equals(enumC14242y2.f31254c)) {
            return enumC14242y2;
        }
        if (str.equals(enumC14242y.f31254c)) {
            return enumC14242y;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f31254c;
    }
}
