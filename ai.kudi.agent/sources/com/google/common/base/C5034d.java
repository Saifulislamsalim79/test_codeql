package com.google.common.base;

import java.nio.charset.Charset;
/* compiled from: Charsets.java */
/* renamed from: com.google.common.base.d */
/* loaded from: classes2.dex */
public final class C5034d {

    /* renamed from: a */
    public static final Charset f12685a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f12686b;

    static {
        Charset.forName("ISO-8859-1");
        f12686b = Charset.forName("UTF-8");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("UTF-16");
    }
}
