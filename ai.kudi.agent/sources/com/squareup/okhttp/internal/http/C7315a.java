package com.squareup.okhttp.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import p272h.p380h.p381a.EnumC9458d;
/* compiled from: StatusLine.java */
/* renamed from: com.squareup.okhttp.internal.http.a */
/* loaded from: classes2.dex */
public final class C7315a {

    /* renamed from: a */
    public final EnumC9458d f17289a;

    /* renamed from: b */
    public final int f17290b;

    /* renamed from: c */
    public final String f17291c;

    public C7315a(EnumC9458d enumC9458d, int i, String str) {
        this.f17289a = enumC9458d;
        this.f17290b = i;
        this.f17291c = str;
    }

    /* renamed from: a */
    public static C7315a m19009a(String str) throws IOException {
        EnumC9458d enumC9458d;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    enumC9458d = EnumC9458d.HTTP_1_0;
                } else if (charAt == 1) {
                    enumC9458d = EnumC9458d.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            enumC9458d = EnumC9458d.HTTP_1_0;
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
                return new C7315a(enumC9458d, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }
        throw new ProtocolException("Unexpected status line: " + str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17289a == EnumC9458d.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f17290b);
        if (this.f17291c != null) {
            sb.append(' ');
            sb.append(this.f17291c);
        }
        return sb.toString();
    }
}
