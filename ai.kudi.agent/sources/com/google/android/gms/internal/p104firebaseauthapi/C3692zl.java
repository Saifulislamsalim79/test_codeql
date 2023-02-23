package com.google.android.gms.internal.p104firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zl */
/* loaded from: classes2.dex */
public final class C3692zl extends AbstractC2916a {
    public static final Parcelable.Creator<C3692zl> CREATOR = new C3032am();

    /* renamed from: c */
    private final List<C3640xl> f9158c;

    public C3692zl() {
        this.f9158c = new ArrayList();
    }

    /* renamed from: f */
    public static C3692zl m29884f(C3692zl c3692zl) {
        s.j(c3692zl);
        List<C3640xl> list = c3692zl.f9158c;
        C3692zl c3692zl2 = new C3692zl();
        if (list != null && !list.isEmpty()) {
            c3692zl2.f9158c.addAll(list);
        }
        return c3692zl2;
    }

    /* renamed from: h */
    public final List<C3640xl> m29883h() {
        return this.f9158c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31648r(parcel, 2, this.f9158c, false);
        C2917b.m31664b(parcel, m31665a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3692zl(List<C3640xl> list) {
        List<C3640xl> unmodifiableList;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.f9158c = unmodifiableList;
    }
}
