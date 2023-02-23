package com.google.firebase.database.p129r;

import java.net.URI;
/* compiled from: HostInfo.java */
/* renamed from: com.google.firebase.database.r.l */
/* loaded from: classes2.dex */
public class C5688l {

    /* renamed from: a */
    private final String f13971a;

    /* renamed from: b */
    private final String f13972b;

    /* renamed from: c */
    private final boolean f13973c;

    public C5688l(String str, String str2, boolean z) {
        this.f13971a = str;
        this.f13972b = str2;
        this.f13973c = z;
    }

    /* renamed from: a */
    public static URI m24163a(String str, boolean z, String str2, String str3) {
        String str4 = (z ? "wss" : "ws") + "://" + str + "/.ws?ns=" + str2 + "&v=5";
        if (str3 != null) {
            str4 = str4 + "&ls=" + str3;
        }
        return URI.create(str4);
    }

    /* renamed from: b */
    public String m24162b() {
        return this.f13971a;
    }

    /* renamed from: c */
    public String m24161c() {
        return this.f13972b;
    }

    /* renamed from: d */
    public boolean m24160d() {
        return this.f13973c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("http");
        sb.append(this.f13973c ? "s" : "");
        sb.append("://");
        sb.append(this.f13971a);
        return sb.toString();
    }
}
