package com.github.kittinunf.fuel.core;

import java.nio.charset.Charset;
import kotlin.TypeCastException;
import kotlin.p549l0.C13254d;
import kotlin.p549l0.C13262h;
import kotlin.p549l0.C13277t;
import kotlin.p549l0.InterfaceC13257f;
/* compiled from: BodyRepresentation.kt */
/* renamed from: com.github.kittinunf.fuel.core.b */
/* loaded from: classes2.dex */
public final class C2425b {

    /* renamed from: a */
    private static final C13262h f6970a = new C13262h("^(?:text/.*|application/(?:csv|javascript|json|typescript|xml|x-yaml|x-www-form-urlencoded|vnd\\.coffeescript)|.*\\+(?:xml|json))(;(?: |)charset=.+)*$");

    /* renamed from: a */
    public static final String m32896a(InterfaceC2423a interfaceC2423a, String str) {
        String str2;
        String m5433B0;
        kotlin.e0.d.l.g(interfaceC2423a, "$this$representationOfBytes");
        if (str == null || str.length() == 0) {
            str = "(unknown)";
        }
        if (f6970a.m5522e(str)) {
            Charset charset = C13254d.f29413a;
            InterfaceC13257f m5524c = C13262h.m5524c(f6970a, str, 0, 2, null);
            if (m5524c != null) {
                String str3 = m5524c.mo5533b().get(1);
                if (str3.length() > 0) {
                    m5433B0 = C13277t.m5433B0(str3, '=', null, 2, null);
                    if (m5433B0 != null) {
                        String upperCase = m5433B0.toUpperCase();
                        kotlin.e0.d.l.c(upperCase, "(this as java.lang.String).toUpperCase()");
                        charset = Charset.forName(upperCase);
                        kotlin.e0.d.l.c(charset, "Charset.forName(charsetName)");
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                return new String(interfaceC2423a.mo32746e(), charset);
            }
            kotlin.e0.d.l.o();
            throw null;
        }
        Long mo32743h = interfaceC2423a.mo32743h();
        long longValue = mo32743h != null ? mo32743h.longValue() : -1L;
        if (true == (longValue == 0)) {
            return "(empty)";
        }
        if (true == (longValue < 0)) {
            str2 = "unknown number of bytes";
        } else {
            str2 = longValue + " bytes";
        }
        return '(' + str2 + " of " + str + ')';
    }
}
