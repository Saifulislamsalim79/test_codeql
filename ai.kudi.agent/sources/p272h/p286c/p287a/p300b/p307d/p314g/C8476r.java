package p272h.p286c.p287a.p300b.p307d.p314g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2863d;
import com.google.android.gms.common.internal.C2906q;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
/* renamed from: h.c.a.b.d.g.r */
/* loaded from: classes2.dex */
public final class C8476r extends AbstractC2916a {

    /* renamed from: c */
    private LocationRequest f20177c;

    /* renamed from: d */
    private List<C2863d> f20178d;

    /* renamed from: e */
    private String f20179e;

    /* renamed from: f */
    private boolean f20180f;

    /* renamed from: w */
    private boolean f20181w;

    /* renamed from: x */
    private boolean f20182x;

    /* renamed from: y */
    private String f20183y;

    /* renamed from: z */
    static final List<C2863d> f20176z = Collections.emptyList();
    public static final Parcelable.Creator<C8476r> CREATOR = new C8477s();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8476r(LocationRequest locationRequest, List<C2863d> list, String str, boolean z, boolean z2, boolean z3, String str2) {
        this.f20177c = locationRequest;
        this.f20178d = list;
        this.f20179e = str;
        this.f20180f = z;
        this.f20181w = z2;
        this.f20182x = z3;
        this.f20183y = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8476r) {
            C8476r c8476r = (C8476r) obj;
            return C2906q.m31701a(this.f20177c, c8476r.f20177c) && C2906q.m31701a(this.f20178d, c8476r.f20178d) && C2906q.m31701a(this.f20179e, c8476r.f20179e) && this.f20180f == c8476r.f20180f && this.f20181w == c8476r.f20181w && this.f20182x == c8476r.f20182x && C2906q.m31701a(this.f20183y, c8476r.f20183y);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20177c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20177c);
        if (this.f20179e != null) {
            sb.append(" tag=");
            sb.append(this.f20179e);
        }
        if (this.f20183y != null) {
            sb.append(" moduleId=");
            sb.append(this.f20183y);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f20180f);
        sb.append(" clients=");
        sb.append(this.f20178d);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f20181w);
        if (this.f20182x) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31652n(parcel, 1, this.f20177c, i, false);
        C2917b.m31648r(parcel, 5, this.f20178d, false);
        C2917b.m31651o(parcel, 6, this.f20179e, false);
        C2917b.m31663c(parcel, 7, this.f20180f);
        C2917b.m31663c(parcel, 8, this.f20181w);
        C2917b.m31663c(parcel, 9, this.f20182x);
        C2917b.m31651o(parcel, 10, this.f20183y, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
