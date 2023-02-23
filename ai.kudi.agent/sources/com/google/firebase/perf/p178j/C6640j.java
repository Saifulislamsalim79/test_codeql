package com.google.firebase.perf.p178j;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
/* compiled from: URLWrapper.java */
/* renamed from: com.google.firebase.perf.j.j */
/* loaded from: classes2.dex */
public class C6640j {

    /* renamed from: a */
    private final URL f16016a;

    public C6640j(URL url) {
        this.f16016a = url;
    }

    /* renamed from: a */
    public URLConnection m21394a() throws IOException {
        return this.f16016a.openConnection();
    }

    public String toString() {
        return this.f16016a.toString();
    }
}
