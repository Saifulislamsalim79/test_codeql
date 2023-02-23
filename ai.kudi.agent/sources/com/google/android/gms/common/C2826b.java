package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2906q;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import io.intercom.android.sdk.metrics.MetricTracker;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.b */
/* loaded from: classes2.dex */
public final class C2826b extends AbstractC2916a {

    /* renamed from: c */
    final int f7893c;

    /* renamed from: d */
    private final int f7894d;

    /* renamed from: e */
    private final PendingIntent f7895e;

    /* renamed from: f */
    private final String f7896f;

    /* renamed from: w */
    public static final C2826b f7892w = new C2826b(0);
    public static final Parcelable.Creator<C2826b> CREATOR = new C2958q();

    public C2826b(int i) {
        this(i, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2826b(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f7893c = i;
        this.f7894d = i2;
        this.f7895e = pendingIntent;
        this.f7896f = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static String m31878u(int i) {
        if (i != 99) {
            if (i != 1500) {
                switch (i) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                StringBuilder sb = new StringBuilder(31);
                                sb.append("UNKNOWN_ERROR_CODE(");
                                sb.append(i);
                                sb.append(")");
                                return sb.toString();
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2826b) {
            C2826b c2826b = (C2826b) obj;
            return this.f7894d == c2826b.f7894d && C2906q.m31701a(this.f7895e, c2826b.f7895e) && C2906q.m31701a(this.f7896f, c2826b.f7896f);
        }
        return false;
    }

    /* renamed from: f */
    public int m31883f() {
        return this.f7894d;
    }

    /* renamed from: h */
    public String m31882h() {
        return this.f7896f;
    }

    public int hashCode() {
        return C2906q.m31700b(Integer.valueOf(this.f7894d), this.f7895e, this.f7896f);
    }

    /* renamed from: k */
    public PendingIntent m31881k() {
        return this.f7895e;
    }

    /* renamed from: l */
    public boolean m31880l() {
        return (this.f7894d == 0 || this.f7895e == null) ? false : true;
    }

    /* renamed from: s */
    public boolean m31879s() {
        return this.f7894d == 0;
    }

    public String toString() {
        C2906q.C2907a m31699c = C2906q.m31699c(this);
        m31699c.m31698a("statusCode", m31878u(this.f7894d));
        m31699c.m31698a("resolution", this.f7895e);
        m31699c.m31698a(MetricTracker.Object.MESSAGE, this.f7896f);
        return m31699c.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31656j(parcel, 1, this.f7893c);
        C2917b.m31656j(parcel, 2, m31883f());
        C2917b.m31652n(parcel, 3, m31881k(), i, false);
        C2917b.m31651o(parcel, 4, m31882h(), false);
        C2917b.m31664b(parcel, m31665a);
    }

    public C2826b(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public C2826b(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}
