package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.s0 */
/* loaded from: classes2.dex */
public final class C3489s0 implements Map.Entry, Comparable<C3489s0> {

    /* renamed from: c */
    private final Comparable f8929c;

    /* renamed from: d */
    private Object f8930d;

    /* renamed from: e */
    final /* synthetic */ C3567v0 f8931e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3489s0(C3567v0 c3567v0, Comparable comparable, Object obj) {
        this.f8931e = c3567v0;
        this.f8929c = comparable;
        this.f8930d = obj;
    }

    /* renamed from: b */
    private static final boolean m30295b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public final Comparable m30296a() {
        return this.f8929c;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C3489s0 c3489s0) {
        return this.f8929c.compareTo(c3489s0.f8929c);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return m30295b(this.f8929c, entry.getKey()) && m30295b(this.f8930d, entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f8929c;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f8930d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f8929c;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f8930d;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f8931e.m30147p();
        Object obj2 = this.f8930d;
        this.f8930d = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8929c);
        String valueOf2 = String.valueOf(this.f8930d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
