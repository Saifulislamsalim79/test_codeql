package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.r */
/* loaded from: classes2.dex */
public final class C3963r implements q {

    /* renamed from: c */
    private final String f9639c;

    /* renamed from: d */
    private final ArrayList<q> f9640d;

    public C3963r(String str, List<q> list) {
        this.f9639c = str;
        ArrayList<q> arrayList = new ArrayList<>();
        this.f9640d = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: a */
    public final String m29069a() {
        return this.f9639c;
    }

    /* renamed from: b */
    public final Double m29068b() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    /* renamed from: c */
    public final ArrayList<q> m29067c() {
        return this.f9640d;
    }

    /* renamed from: d */
    public final q m29066d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3963r) {
            C3963r c3963r = (C3963r) obj;
            String str = this.f9639c;
            if (str == null ? c3963r.f9639c == null : str.equals(c3963r.f9639c)) {
                return this.f9640d.equals(c3963r.f9640d);
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public final Boolean m29065f() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    /* renamed from: h */
    public final String m29064h() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final int hashCode() {
        String str = this.f9639c;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f9640d.hashCode();
    }

    /* renamed from: l */
    public final Iterator<q> m29063l() {
        return null;
    }

    /* renamed from: s */
    public final q m29062s(String str, C3968r4 c3968r4, List<q> list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
