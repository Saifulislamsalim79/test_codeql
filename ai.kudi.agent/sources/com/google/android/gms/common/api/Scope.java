package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes2.dex */
public final class Scope extends AbstractC2916a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C2824l();

    /* renamed from: c */
    final int f7689c;

    /* renamed from: d */
    private final String f7690d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Scope(int i, String str) {
        s.g(str, "scopeUri must not be null or empty");
        this.f7689c = i;
        this.f7690d = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f7690d.equals(((Scope) obj).f7690d);
        }
        return false;
    }

    /* renamed from: f */
    public String m32099f() {
        return this.f7690d;
    }

    public int hashCode() {
        return this.f7690d.hashCode();
    }

    public String toString() {
        return this.f7690d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, this.f7689c);
        C2917b.m31651o(parcel, 2, m32099f(), false);
        C2917b.m31664b(parcel, m31665a);
    }

    public Scope(String str) {
        this(1, str);
    }
}
