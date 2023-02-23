package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.internal.p104firebaseauthapi.C3140em;
import com.google.firebase.C5988g;
import com.google.firebase.auth.AbstractC5203f;
import com.google.firebase.auth.AbstractC5256k;
import com.google.firebase.auth.AbstractC5258l;
import com.google.firebase.auth.C5206g0;
import com.google.firebase.auth.C5271s;
import com.google.firebase.auth.InterfaceC5205g;
import com.google.firebase.auth.InterfaceC5274v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.o0 */
/* loaded from: classes2.dex */
public final class C5240o0 extends AbstractC5203f {
    public static final Parcelable.Creator<C5240o0> CREATOR = new C5242p0();

    /* renamed from: A */
    private C5244q0 f13034A;

    /* renamed from: B */
    private boolean f13035B;

    /* renamed from: C */
    private C5206g0 f13036C;

    /* renamed from: D */
    private C5245r f13037D;

    /* renamed from: c */
    private C3140em f13038c;

    /* renamed from: d */
    private C5234l0 f13039d;

    /* renamed from: e */
    private final String f13040e;

    /* renamed from: f */
    private String f13041f;

    /* renamed from: w */
    private List<C5234l0> f13042w;

    /* renamed from: x */
    private List<String> f13043x;

    /* renamed from: y */
    private String f13044y;

    /* renamed from: z */
    private Boolean f13045z;

    public C5240o0(C5988g c5988g, List<? extends InterfaceC5274v> list) {
        com.google.android.gms.common.internal.s.j(c5988g);
        this.f13040e = c5988g.m23090l();
        this.f13041f = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f13044y = "2";
        mo25312E(list);
    }

    /* renamed from: B0 */
    public final void m25313B0(boolean z) {
        this.f13035B = z;
    }

    @Override // com.google.firebase.auth.AbstractC5203f
    /* renamed from: E */
    public final AbstractC5203f mo25312E(List<? extends InterfaceC5274v> list) {
        com.google.android.gms.common.internal.s.j(list);
        this.f13042w = new ArrayList(list.size());
        this.f13043x = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            InterfaceC5274v interfaceC5274v = list.get(i);
            if (interfaceC5274v.mo25234d().equals("firebase")) {
                this.f13039d = (C5234l0) interfaceC5274v;
            } else {
                this.f13043x.add(interfaceC5274v.mo25234d());
            }
            this.f13042w.add((C5234l0) interfaceC5274v);
        }
        if (this.f13039d == null) {
            this.f13039d = this.f13042w.get(0);
        }
        return this;
    }

    /* renamed from: G0 */
    public final void m25311G0(C5244q0 c5244q0) {
        this.f13034A = c5244q0;
    }

    /* renamed from: I0 */
    public final boolean m25310I0() {
        return this.f13035B;
    }

    @Override // com.google.firebase.auth.InterfaceC5274v
    /* renamed from: d */
    public final String mo25234d() {
        return this.f13039d.mo25234d();
    }

    @Override // com.google.firebase.auth.AbstractC5203f
    /* renamed from: d0 */
    public final C3140em mo25309d0() {
        return this.f13038c;
    }

    @Override // com.google.firebase.auth.AbstractC5203f
    /* renamed from: e0 */
    public final String mo25308e0() {
        return this.f13038c.m31173l();
    }

    @Override // com.google.firebase.auth.AbstractC5203f
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ AbstractC5256k mo25307f() {
        return new C5217d(this);
    }

    @Override // com.google.firebase.auth.AbstractC5203f
    /* renamed from: h */
    public final List<? extends InterfaceC5274v> mo25306h() {
        return this.f13042w;
    }

    @Override // com.google.firebase.auth.AbstractC5203f
    /* renamed from: h0 */
    public final String mo25305h0() {
        return this.f13038c.m31179E();
    }

    @Override // com.google.firebase.auth.AbstractC5203f
    /* renamed from: j0 */
    public final List<String> mo25304j0() {
        return this.f13043x;
    }

    @Override // com.google.firebase.auth.AbstractC5203f
    /* renamed from: k */
    public final String mo25303k() {
        Map map;
        C3140em c3140em = this.f13038c;
        if (c3140em == null || c3140em.m31173l() == null || (map = (Map) C5239o.m25314a(this.f13038c.m31173l()).m25361a().get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // com.google.firebase.auth.AbstractC5203f
    /* renamed from: l */
    public final String mo25302l() {
        return this.f13039d.m25317f();
    }

    @Override // com.google.firebase.auth.AbstractC5203f
    /* renamed from: l0 */
    public final void mo25301l0(C3140em c3140em) {
        com.google.android.gms.common.internal.s.j(c3140em);
        this.f13038c = c3140em;
    }

    @Override // com.google.firebase.auth.AbstractC5203f
    /* renamed from: m0 */
    public final void mo25300m0(List<AbstractC5258l> list) {
        Parcelable.Creator<C5245r> creator = C5245r.CREATOR;
        C5245r c5245r = null;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC5258l abstractC5258l : list) {
                if (abstractC5258l instanceof C5271s) {
                    arrayList.add((C5271s) abstractC5258l);
                }
            }
            c5245r = new C5245r(arrayList);
        }
        this.f13037D = c5245r;
    }

    /* renamed from: n0 */
    public final InterfaceC5205g m25299n0() {
        return this.f13034A;
    }

    /* renamed from: p0 */
    public final C5988g m25298p0() {
        return C5988g.m23091k(this.f13040e);
    }

    /* renamed from: q0 */
    public final C5206g0 m25297q0() {
        return this.f13036C;
    }

    /* renamed from: r0 */
    public final C5240o0 m25296r0(String str) {
        this.f13044y = str;
        return this;
    }

    @Override // com.google.firebase.auth.AbstractC5203f
    /* renamed from: s */
    public final boolean mo25295s() {
        Boolean bool = this.f13045z;
        if (bool == null || bool.booleanValue()) {
            C3140em c3140em = this.f13038c;
            String m25360b = c3140em != null ? C5239o.m25314a(c3140em.m31173l()).m25360b() : "";
            boolean z = false;
            if (this.f13042w.size() <= 1 && (m25360b == null || !m25360b.equals("custom"))) {
                z = true;
            }
            this.f13045z = Boolean.valueOf(z);
        }
        return this.f13045z.booleanValue();
    }

    /* renamed from: s0 */
    public final C5240o0 m25294s0() {
        this.f13045z = Boolean.FALSE;
        return this;
    }

    /* renamed from: t0 */
    public final List<AbstractC5258l> m25293t0() {
        C5245r c5245r = this.f13037D;
        if (c5245r != null) {
            return c5245r.m25282f();
        }
        return new ArrayList();
    }

    @Override // com.google.firebase.auth.AbstractC5203f
    /* renamed from: u */
    public final /* bridge */ /* synthetic */ AbstractC5203f mo25292u() {
        m25294s0();
        return this;
    }

    /* renamed from: v0 */
    public final List<C5234l0> m25291v0() {
        return this.f13042w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31652n(parcel, 1, this.f13038c, i, false);
        C2917b.m31652n(parcel, 2, this.f13039d, i, false);
        C2917b.m31651o(parcel, 3, this.f13040e, false);
        C2917b.m31651o(parcel, 4, this.f13041f, false);
        C2917b.m31648r(parcel, 5, this.f13042w, false);
        C2917b.m31650p(parcel, 6, this.f13043x, false);
        C2917b.m31651o(parcel, 7, this.f13044y, false);
        C2917b.m31662d(parcel, 8, Boolean.valueOf(mo25295s()), false);
        C2917b.m31652n(parcel, 9, this.f13034A, i, false);
        C2917b.m31663c(parcel, 10, this.f13035B);
        C2917b.m31652n(parcel, 11, this.f13036C, i, false);
        C2917b.m31652n(parcel, 12, this.f13037D, i, false);
        C2917b.m31664b(parcel, m31665a);
    }

    /* renamed from: y0 */
    public final void m25290y0(C5206g0 c5206g0) {
        this.f13036C = c5206g0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5240o0(C3140em c3140em, C5234l0 c5234l0, String str, String str2, List<C5234l0> list, List<String> list2, String str3, Boolean bool, C5244q0 c5244q0, boolean z, C5206g0 c5206g0, C5245r c5245r) {
        this.f13038c = c3140em;
        this.f13039d = c5234l0;
        this.f13040e = str;
        this.f13041f = str2;
        this.f13042w = list;
        this.f13043x = list2;
        this.f13044y = str3;
        this.f13045z = bool;
        this.f13034A = c5244q0;
        this.f13035B = z;
        this.f13036C = c5206g0;
        this.f13037D = c5245r;
    }
}
