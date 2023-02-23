package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.firebase.auth.AbstractC5258l;
import com.google.firebase.auth.C5271s;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.r */
/* loaded from: classes2.dex */
public final class C5245r extends AbstractC2916a {
    public static final Parcelable.Creator<C5245r> CREATOR = new C5246s();

    /* renamed from: c */
    private final List<C5271s> f13049c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5245r(List<C5271s> list) {
        this.f13049c = list == null ? new ArrayList<>() : list;
    }

    /* renamed from: f */
    public final List<AbstractC5258l> m25282f() {
        ArrayList arrayList = new ArrayList();
        for (C5271s c5271s : this.f13049c) {
            arrayList.add(c5271s);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31648r(parcel, 1, this.f13049c, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
