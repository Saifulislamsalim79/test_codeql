package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.s */
/* loaded from: classes2.dex */
public final class C4355s extends AbstractC2916a implements Iterable<String> {
    public static final Parcelable.Creator<C4355s> CREATOR = new C4367t();

    /* renamed from: c */
    private final Bundle f10656c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4355s(Bundle bundle) {
        this.f10656c = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public final String m27980E(String str) {
        return this.f10656c.getString(str);
    }

    /* renamed from: f */
    public final int m27979f() {
        return this.f10656c.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new C4343r(this);
    }

    /* renamed from: k */
    public final Bundle m27977k() {
        return new Bundle(this.f10656c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final Double m27976l(String str) {
        return Double.valueOf(this.f10656c.getDouble("value"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final Long m27975s(String str) {
        return Long.valueOf(this.f10656c.getLong("value"));
    }

    public final String toString() {
        return this.f10656c.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final Object m27974u(String str) {
        return this.f10656c.get(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31661e(parcel, 2, m27977k(), false);
        C2917b.m31664b(parcel, m31665a);
    }
}
