package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.InterfaceC6771n;
import io.intercom.android.sdk.views.holder.AttributeType;
/* compiled from: FirebaseRemoteConfigValueImpl.java */
/* renamed from: com.google.firebase.remoteconfig.internal.r */
/* loaded from: classes2.dex */
public class C6767r implements InterfaceC6771n {

    /* renamed from: a */
    private final String f16292a;

    /* renamed from: b */
    private final int f16293b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6767r(String str, int i) {
        this.f16292a = str;
        this.f16293b = i;
    }

    /* renamed from: a */
    private String m20803a() {
        return mo20796p().trim();
    }

    /* renamed from: b */
    private void m20802b() {
        if (this.f16292a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    @Override // com.google.firebase.remoteconfig.InterfaceC6771n
    /* renamed from: m */
    public int mo20799m() {
        return this.f16293b;
    }

    @Override // com.google.firebase.remoteconfig.InterfaceC6771n
    /* renamed from: n */
    public long mo20798n() {
        if (this.f16293b == 0) {
            return 0L;
        }
        String m20803a = m20803a();
        try {
            return Long.valueOf(m20803a).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", m20803a, "long"), e);
        }
    }

    @Override // com.google.firebase.remoteconfig.InterfaceC6771n
    /* renamed from: o */
    public double mo20797o() {
        if (this.f16293b == 0) {
            return 0.0d;
        }
        String m20803a = m20803a();
        try {
            return Double.valueOf(m20803a).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", m20803a, "double"), e);
        }
    }

    @Override // com.google.firebase.remoteconfig.InterfaceC6771n
    /* renamed from: p */
    public String mo20796p() {
        if (this.f16293b == 0) {
            return "";
        }
        m20802b();
        return this.f16292a;
    }

    @Override // com.google.firebase.remoteconfig.InterfaceC6771n
    /* renamed from: q */
    public boolean mo20795q() throws IllegalArgumentException {
        if (this.f16293b == 0) {
            return false;
        }
        String m20803a = m20803a();
        if (C6759m.f16272e.matcher(m20803a).matches()) {
            return true;
        }
        if (C6759m.f16273f.matcher(m20803a).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", m20803a, AttributeType.BOOLEAN));
    }
}
