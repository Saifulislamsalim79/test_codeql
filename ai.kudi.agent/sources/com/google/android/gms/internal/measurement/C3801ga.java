package com.google.android.gms.internal.measurement;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.ga */
/* loaded from: classes2.dex */
public final class C3801ga implements Map.Entry, Comparable<C3801ga> {

    /* renamed from: c */
    private final Comparable f9372c;

    /* renamed from: d */
    private Object f9373d;

    /* renamed from: e */
    final /* synthetic */ C3849ja f9374e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3801ga(C3849ja c3849ja, Comparable comparable, Object obj) {
        this.f9374e = c3849ja;
        this.f9372c = comparable;
        this.f9373d = obj;
    }

    /* renamed from: b */
    private static final boolean m29582b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public final Comparable m29583a() {
        return this.f9372c;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C3801ga c3801ga) {
        return this.f9372c.compareTo(c3801ga.f9372c);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return m29582b(this.f9372c, entry.getKey()) && m29582b(this.f9373d, entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f9372c;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f9373d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f9372c;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f9373d;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f9374e.m29435p();
        Object obj2 = this.f9373d;
        this.f9373d = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9372c);
        String valueOf2 = String.valueOf(this.f9373d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
