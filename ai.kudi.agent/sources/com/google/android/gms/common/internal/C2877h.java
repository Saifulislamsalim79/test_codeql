package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2830d;
import com.google.android.gms.common.C2834f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.InterfaceC2889l;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.h */
/* loaded from: classes2.dex */
public class C2877h extends AbstractC2916a {
    public static final Parcelable.Creator<C2877h> CREATOR = new C2913r1();

    /* renamed from: A */
    C2830d[] f7992A;

    /* renamed from: B */
    C2830d[] f7993B;

    /* renamed from: C */
    boolean f7994C;

    /* renamed from: D */
    int f7995D;

    /* renamed from: E */
    boolean f7996E;

    /* renamed from: F */
    private String f7997F;

    /* renamed from: c */
    final int f7998c;

    /* renamed from: d */
    final int f7999d;

    /* renamed from: e */
    int f8000e;

    /* renamed from: f */
    String f8001f;

    /* renamed from: w */
    IBinder f8002w;

    /* renamed from: x */
    Scope[] f8003x;

    /* renamed from: y */
    Bundle f8004y;

    /* renamed from: z */
    Account f8005z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2877h(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C2830d[] c2830dArr, C2830d[] c2830dArr2, boolean z, int i4, boolean z2, String str2) {
        this.f7998c = i;
        this.f7999d = i2;
        this.f8000e = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f8001f = "com.google.android.gms";
        } else {
            this.f8001f = str;
        }
        if (i < 2) {
            this.f8005z = iBinder != null ? BinderC2842a.m31819o(InterfaceC2889l.AbstractBinderC2890a.m31708n(iBinder)) : null;
        } else {
            this.f8002w = iBinder;
            this.f8005z = account;
        }
        this.f8003x = scopeArr;
        this.f8004y = bundle;
        this.f7992A = c2830dArr;
        this.f7993B = c2830dArr2;
        this.f7994C = z;
        this.f7995D = i4;
        this.f7996E = z2;
        this.f7997F = str2;
    }

    /* renamed from: f */
    public Bundle m31734f() {
        return this.f8004y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C2913r1.m31694a(this, parcel, i);
    }

    public final String zza() {
        return this.f7997F;
    }

    public C2877h(int i, String str) {
        this.f7998c = 6;
        this.f8000e = C2834f.f7916a;
        this.f7999d = i;
        this.f7994C = true;
        this.f7997F = str;
    }
}
