package p272h.p286c.p287a.p300b.p301a.p302a;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.C2838h;
/* renamed from: h.c.a.b.a.a.c */
/* loaded from: classes2.dex */
public final class C8387c {

    /* renamed from: a */
    private SharedPreferences f20073a;

    public C8387c(Context context) {
        try {
            Context m31835d = C2838h.m31835d(context);
            this.f20073a = m31835d == null ? null : m31835d.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.f20073a = null;
        }
    }

    /* renamed from: a */
    public final boolean m16146a(String str, boolean z) {
        try {
            if (this.f20073a == null) {
                return false;
            }
            return this.f20073a.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final float m16145b(String str, float f) {
        try {
            if (this.f20073a == null) {
                return 0.0f;
            }
            return this.f20073a.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final String m16144c(String str, String str2) {
        try {
            return this.f20073a == null ? str2 : this.f20073a.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }
}
