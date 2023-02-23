package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import p272h.p286c.p287a.p288a.p289i.p292b0.InterfaceC8318a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_CreationContext.java */
/* renamed from: com.google.android.datatransport.runtime.backends.c */
/* loaded from: classes2.dex */
public final class C2632c extends AbstractC2639h {

    /* renamed from: a */
    private final Context f7399a;

    /* renamed from: b */
    private final InterfaceC8318a f7400b;

    /* renamed from: c */
    private final InterfaceC8318a f7401c;

    /* renamed from: d */
    private final String f7402d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2632c(Context context, InterfaceC8318a interfaceC8318a, InterfaceC8318a interfaceC8318a2, String str) {
        if (context != null) {
            this.f7399a = context;
            if (interfaceC8318a != null) {
                this.f7400b = interfaceC8318a;
                if (interfaceC8318a2 != null) {
                    this.f7401c = interfaceC8318a2;
                    if (str != null) {
                        this.f7402d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC2639h
    /* renamed from: b */
    public Context mo32463b() {
        return this.f7399a;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC2639h
    /* renamed from: c */
    public String mo32462c() {
        return this.f7402d;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC2639h
    /* renamed from: d */
    public InterfaceC8318a mo32461d() {
        return this.f7401c;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC2639h
    /* renamed from: e */
    public InterfaceC8318a mo32460e() {
        return this.f7400b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2639h) {
            AbstractC2639h abstractC2639h = (AbstractC2639h) obj;
            return this.f7399a.equals(abstractC2639h.mo32463b()) && this.f7400b.equals(abstractC2639h.mo32460e()) && this.f7401c.equals(abstractC2639h.mo32461d()) && this.f7402d.equals(abstractC2639h.mo32462c());
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f7399a.hashCode() ^ 1000003) * 1000003) ^ this.f7400b.hashCode()) * 1000003) ^ this.f7401c.hashCode()) * 1000003) ^ this.f7402d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f7399a + ", wallClock=" + this.f7400b + ", monotonicClock=" + this.f7401c + ", backendName=" + this.f7402d + "}";
    }
}
