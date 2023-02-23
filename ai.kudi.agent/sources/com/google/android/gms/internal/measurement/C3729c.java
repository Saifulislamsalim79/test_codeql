package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.c */
/* loaded from: classes2.dex */
public final class C3729c {

    /* renamed from: a */
    private C3713b f9210a;

    /* renamed from: b */
    private C3713b f9211b;

    /* renamed from: c */
    private final List<C3713b> f9212c;

    public C3729c() {
        this.f9210a = new C3713b("", 0L, null);
        this.f9211b = new C3713b("", 0L, null);
        this.f9212c = new ArrayList();
    }

    /* renamed from: a */
    public final C3713b m29736a() {
        return this.f9210a;
    }

    /* renamed from: b */
    public final C3713b m29735b() {
        return this.f9211b;
    }

    /* renamed from: c */
    public final List<C3713b> m29734c() {
        return this.f9212c;
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C3729c c3729c = new C3729c(this.f9210a.clone());
        for (C3713b c3713b : this.f9212c) {
            c3729c.f9212c.add(c3713b.clone());
        }
        return c3729c;
    }

    /* renamed from: d */
    public final void m29733d(C3713b c3713b) {
        this.f9210a = c3713b;
        this.f9211b = c3713b.clone();
        this.f9212c.clear();
    }

    /* renamed from: e */
    public final void m29732e(String str, long j, Map<String, Object> map) {
        this.f9212c.add(new C3713b(str, j, map));
    }

    /* renamed from: f */
    public final void m29731f(C3713b c3713b) {
        this.f9211b = c3713b;
    }

    public C3729c(C3713b c3713b) {
        this.f9210a = c3713b;
        this.f9211b = c3713b.clone();
        this.f9212c = new ArrayList();
    }
}
