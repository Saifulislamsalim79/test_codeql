package com.google.firebase.database.p138t;

import com.google.firebase.database.p138t.InterfaceC5900d;
import java.io.PrintWriter;
import java.io.StringWriter;
/* compiled from: LogWrapper.java */
/* renamed from: com.google.firebase.database.t.c */
/* loaded from: classes2.dex */
public class C5899c {

    /* renamed from: a */
    private final InterfaceC5900d f14487a;

    /* renamed from: b */
    private final String f14488b;

    /* renamed from: c */
    private final String f14489c;

    public C5899c(InterfaceC5900d interfaceC5900d, String str) {
        this(interfaceC5900d, str, null);
    }

    /* renamed from: d */
    private static String m23364d(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: g */
    private long m23361g() {
        return System.currentTimeMillis();
    }

    /* renamed from: h */
    private String m23360h(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        if (this.f14489c == null) {
            return str;
        }
        return this.f14489c + " - " + str;
    }

    /* renamed from: a */
    public void m23367a(String str, Throwable th, Object... objArr) {
        if (m23362f()) {
            String m23360h = m23360h(str, objArr);
            if (th != null) {
                m23360h = m23360h + "\n" + m23364d(th);
            }
            this.f14487a.mo23357a(InterfaceC5900d.EnumC5901a.DEBUG, this.f14488b, m23360h, m23361g());
        }
    }

    /* renamed from: b */
    public void m23366b(String str, Object... objArr) {
        m23367a(str, null, objArr);
    }

    /* renamed from: c */
    public void m23365c(String str, Throwable th) {
        this.f14487a.mo23357a(InterfaceC5900d.EnumC5901a.ERROR, this.f14488b, m23360h(str, new Object[0]) + "\n" + m23364d(th), m23361g());
    }

    /* renamed from: e */
    public void m23363e(String str) {
        this.f14487a.mo23357a(InterfaceC5900d.EnumC5901a.INFO, this.f14488b, m23360h(str, new Object[0]), m23361g());
    }

    /* renamed from: f */
    public boolean m23362f() {
        return this.f14487a.mo23356b().ordinal() <= InterfaceC5900d.EnumC5901a.DEBUG.ordinal();
    }

    /* renamed from: i */
    public void m23359i(String str) {
        m23358j(str, null);
    }

    /* renamed from: j */
    public void m23358j(String str, Throwable th) {
        String m23360h = m23360h(str, new Object[0]);
        if (th != null) {
            m23360h = m23360h + "\n" + m23364d(th);
        }
        this.f14487a.mo23357a(InterfaceC5900d.EnumC5901a.WARN, this.f14488b, m23360h, m23361g());
    }

    public C5899c(InterfaceC5900d interfaceC5900d, String str, String str2) {
        this.f14487a = interfaceC5900d;
        this.f14488b = str;
        this.f14489c = str2;
    }
}
