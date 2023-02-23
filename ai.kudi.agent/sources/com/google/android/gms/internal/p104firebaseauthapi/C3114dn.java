package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.common.util.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.dn */
/* loaded from: classes2.dex */
public final class C3114dn extends AbstractC2916a {
    public static final Parcelable.Creator<C3114dn> CREATOR = new C3141en();

    /* renamed from: c */
    public final int f8406c;

    /* renamed from: d */
    private List<String> f8407d;

    public C3114dn() {
        this(null);
    }

    /* renamed from: f */
    public static C3114dn m31230f(C3114dn c3114dn) {
        return new C3114dn(c3114dn.f8407d);
    }

    /* renamed from: h */
    public final List<String> m31229h() {
        return this.f8407d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, this.f8406c);
        C2917b.m31650p(parcel, 2, this.f8407d, false);
        C2917b.m31664b(parcel, m31665a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3114dn(int i, List<String> list) {
        this.f8406c = i;
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                list.set(i2, n.a(list.get(i2)));
            }
            this.f8407d = Collections.unmodifiableList(list);
            return;
        }
        this.f8407d = Collections.emptyList();
    }

    public C3114dn(List<String> list) {
        this.f8406c = 1;
        this.f8407d = new ArrayList();
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f8407d.addAll(list);
    }
}
