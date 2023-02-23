package p272h.p286c.p287a.p300b.p307d.p314g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2863d;
import com.google.android.gms.common.internal.C2906q;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.location.C4133t;
import java.util.Collections;
import java.util.List;
/* renamed from: h.c.a.b.d.g.b0 */
/* loaded from: classes2.dex */
public final class C8457b0 extends AbstractC2916a {

    /* renamed from: c */
    private C4133t f20158c;

    /* renamed from: d */
    private List<C2863d> f20159d;

    /* renamed from: e */
    private String f20160e;

    /* renamed from: f */
    static final List<C2863d> f20156f = Collections.emptyList();

    /* renamed from: w */
    static final C4133t f20157w = new C4133t();
    public static final Parcelable.Creator<C8457b0> CREATOR = new C8459c0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8457b0(C4133t c4133t, List<C2863d> list, String str) {
        this.f20158c = c4133t;
        this.f20159d = list;
        this.f20160e = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8457b0) {
            C8457b0 c8457b0 = (C8457b0) obj;
            return C2906q.m31701a(this.f20158c, c8457b0.f20158c) && C2906q.m31701a(this.f20159d, c8457b0.f20159d) && C2906q.m31701a(this.f20160e, c8457b0.f20160e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20158c.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31652n(parcel, 1, this.f20158c, i, false);
        C2917b.m31648r(parcel, 2, this.f20159d, false);
        C2917b.m31651o(parcel, 3, this.f20160e, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
