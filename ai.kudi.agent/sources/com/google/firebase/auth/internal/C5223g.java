package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.firebase.auth.AbstractC5258l;
import com.google.firebase.auth.AbstractC5262n;
import com.google.firebase.auth.C5271s;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.g */
/* loaded from: classes2.dex */
public final class C5223g extends AbstractC5262n {
    public static final Parcelable.Creator<C5223g> CREATOR = new C5225h();

    /* renamed from: c */
    private String f13000c;

    /* renamed from: d */
    private String f13001d;

    /* renamed from: e */
    private List<C5271s> f13002e;

    private C5223g() {
    }

    /* renamed from: f */
    public static C5223g m25327f(List<AbstractC5258l> list, String str) {
        com.google.android.gms.common.internal.s.j(list);
        com.google.android.gms.common.internal.s.f(str);
        C5223g c5223g = new C5223g();
        c5223g.f13002e = new ArrayList();
        for (AbstractC5258l abstractC5258l : list) {
            if (abstractC5258l instanceof C5271s) {
                c5223g.f13002e.add((C5271s) abstractC5258l);
            }
        }
        c5223g.f13001d = str;
        return c5223g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31651o(parcel, 1, this.f13000c, false);
        C2917b.m31651o(parcel, 2, this.f13001d, false);
        C2917b.m31648r(parcel, 3, this.f13002e, false);
        C2917b.m31664b(parcel, m31665a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5223g(String str, String str2, List<C5271s> list) {
        this.f13000c = str;
        this.f13001d = str2;
        this.f13002e = list;
    }
}
