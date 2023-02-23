package p565l.p566g0.p568f;

import java.io.IOException;
import java.net.ProtocolException;
import p565l.EnumC14242y;
/* compiled from: StatusLine.java */
/* renamed from: l.g0.f.k */
/* loaded from: classes3.dex */
public final class C14178k {

    /* renamed from: a */
    public final EnumC14242y f31009a;

    /* renamed from: b */
    public final int f31010b;

    /* renamed from: c */
    public final String f31011c;

    public C14178k(EnumC14242y enumC14242y, int i, String str) {
        this.f31009a = enumC14242y;
        this.f31010b = i;
        this.f31011c = str;
    }

    /* renamed from: a */
    public static C14178k m2692a(String str) throws IOException {
        EnumC14242y enumC14242y;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    enumC14242y = EnumC14242y.HTTP_1_0;
                } else if (charAt == 1) {
                    enumC14242y = EnumC14242y.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            enumC14242y = EnumC14242y.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                return new C14178k(enumC14242y, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }
        throw new ProtocolException("Unexpected status line: " + str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31009a == EnumC14242y.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f31010b);
        if (this.f31011c != null) {
            sb.append(' ');
            sb.append(this.f31011c);
        }
        return sb.toString();
    }
}
