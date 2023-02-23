package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p272h.p286c.p287a.p288a.C8236b;
import p272h.p286c.p287a.p288a.p289i.InterfaceC8340h;
/* compiled from: CCTDestination.java */
/* renamed from: com.google.android.datatransport.cct.c */
/* loaded from: classes2.dex */
public final class C2583c implements InterfaceC8340h {

    /* renamed from: c */
    static final String f7215c = C2587e.m32567a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: d */
    static final String f7216d = C2587e.m32567a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");

    /* renamed from: e */
    private static final String f7217e = C2587e.m32567a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");

    /* renamed from: f */
    private static final Set<C8236b> f7218f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C8236b.m16444b("proto"), C8236b.m16444b("json"))));

    /* renamed from: g */
    public static final C2583c f7219g = new C2583c(f7215c, null);

    /* renamed from: h */
    public static final C2583c f7220h = new C2583c(f7216d, f7217e);

    /* renamed from: a */
    private final String f7221a;

    /* renamed from: b */
    private final String f7222b;

    public C2583c(String str, String str2) {
        this.f7221a = str;
        this.f7222b = str2;
    }

    /* renamed from: d */
    public static C2583c m32582d(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C2583c(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override // p272h.p286c.p287a.p288a.p289i.InterfaceC8340h
    /* renamed from: a */
    public Set<C8236b> mo16288a() {
        return f7218f;
    }

    @Override // p272h.p286c.p287a.p288a.p289i.InterfaceC8339g
    /* renamed from: b */
    public String mo16289b() {
        return "cct";
    }

    /* renamed from: c */
    public byte[] m32583c() {
        if (this.f7222b == null && this.f7221a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f7221a;
        objArr[2] = "\\";
        String str = this.f7222b;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: e */
    public String m32581e() {
        return this.f7222b;
    }

    /* renamed from: f */
    public String m32580f() {
        return this.f7221a;
    }

    @Override // p272h.p286c.p287a.p288a.p289i.InterfaceC8339g
    public byte[] getExtras() {
        return m32583c();
    }
}
