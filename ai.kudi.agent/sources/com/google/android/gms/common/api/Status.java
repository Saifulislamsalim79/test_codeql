package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2826b;
import com.google.android.gms.common.internal.C2906q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes2.dex */
public final class Status extends AbstractC2916a implements InterfaceC2748h, ReflectedParcelable {

    /* renamed from: c */
    final int f7695c;

    /* renamed from: d */
    private final int f7696d;

    /* renamed from: e */
    private final String f7697e;

    /* renamed from: f */
    private final PendingIntent f7698f;

    /* renamed from: w */
    private final C2826b f7699w;

    /* renamed from: x */
    public static final Status f7692x = new Status(0);

    /* renamed from: y */
    public static final Status f7693y = new Status(14);

    /* renamed from: z */
    public static final Status f7694z = new Status(15);

    /* renamed from: A */
    public static final Status f7691A = new Status(16);
    public static final Parcelable.Creator<Status> CREATOR = new C2825m();

    public Status(int i) {
        this(i, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Status(int i, int i2, String str, PendingIntent pendingIntent, C2826b c2826b) {
        this.f7695c = i;
        this.f7696d = i2;
        this.f7697e = str;
        this.f7698f = pendingIntent;
        this.f7699w = c2826b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            return this.f7695c == status.f7695c && this.f7696d == status.f7696d && C2906q.m31701a(this.f7697e, status.f7697e) && C2906q.m31701a(this.f7698f, status.f7698f) && C2906q.m31701a(this.f7699w, status.f7699w);
        }
        return false;
    }

    /* renamed from: f */
    public C2826b m32098f() {
        return this.f7699w;
    }

    @Override // com.google.android.gms.common.api.InterfaceC2748h
    public Status getStatus() {
        return this;
    }

    /* renamed from: h */
    public int m32097h() {
        return this.f7696d;
    }

    public int hashCode() {
        return C2906q.m31700b(Integer.valueOf(this.f7695c), Integer.valueOf(this.f7696d), this.f7697e, this.f7698f, this.f7699w);
    }

    /* renamed from: k */
    public String m32096k() {
        return this.f7697e;
    }

    /* renamed from: l */
    public boolean m32095l() {
        return this.f7698f != null;
    }

    /* renamed from: s */
    public boolean m32094s() {
        return this.f7696d <= 0;
    }

    public String toString() {
        C2906q.C2907a m31699c = C2906q.m31699c(this);
        m31699c.m31698a("statusCode", zza());
        m31699c.m31698a("resolution", this.f7698f);
        return m31699c.toString();
    }

    /* renamed from: u */
    public void m32093u(Activity activity, int i) throws IntentSender.SendIntentException {
        if (m32095l()) {
            PendingIntent pendingIntent = this.f7698f;
            s.j(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, m32097h());
        C2917b.m31651o(parcel, 2, m32096k(), false);
        C2917b.m31652n(parcel, 3, this.f7698f, i, false);
        C2917b.m31652n(parcel, 4, m32098f(), i, false);
        C2917b.m31656j(parcel, 1000, this.f7695c);
        C2917b.m31664b(parcel, m31665a);
    }

    public final String zza() {
        String str = this.f7697e;
        return str != null ? str : C2741b.m32087a(this.f7696d);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this(i, i2, str, pendingIntent, null);
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    public Status(C2826b c2826b, String str) {
        this(c2826b, str, 17);
    }

    @Deprecated
    public Status(C2826b c2826b, String str, int i) {
        this(1, i, str, c2826b.m31881k(), c2826b);
    }
}
