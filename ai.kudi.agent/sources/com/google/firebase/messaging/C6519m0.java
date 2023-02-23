package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.firebase.messaging.C6479b;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.m0 */
/* loaded from: classes2.dex */
public final class C6519m0 extends AbstractC2916a {
    public static final Parcelable.Creator<C6519m0> CREATOR = new C6521n0();

    /* renamed from: c */
    Bundle f15744c;

    /* renamed from: d */
    private Map<String, String> f15745d;

    public C6519m0(Bundle bundle) {
        this.f15744c = bundle;
    }

    /* renamed from: f */
    public Map<String, String> m21728f() {
        if (this.f15745d == null) {
            this.f15745d = C6479b.C6480a.m21880a(this.f15744c);
        }
        return this.f15745d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C6521n0.m21720c(this, parcel, i);
    }
}
