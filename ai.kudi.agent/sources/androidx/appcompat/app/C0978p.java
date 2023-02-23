package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.C1343c;
import java.util.Calendar;
/* compiled from: TwilightManager.java */
/* renamed from: androidx.appcompat.app.p */
/* loaded from: classes2.dex */
class C0978p {

    /* renamed from: d */
    private static C0978p f2697d;

    /* renamed from: a */
    private final Context f2698a;

    /* renamed from: b */
    private final LocationManager f2699b;

    /* renamed from: c */
    private final C0979a f2700c = new C0979a();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TwilightManager.java */
    /* renamed from: androidx.appcompat.app.p$a */
    /* loaded from: classes2.dex */
    public static class C0979a {

        /* renamed from: a */
        boolean f2701a;

        /* renamed from: b */
        long f2702b;

        /* renamed from: c */
        long f2703c;

        /* renamed from: d */
        long f2704d;

        /* renamed from: e */
        long f2705e;

        /* renamed from: f */
        long f2706f;

        C0979a() {
        }
    }

    C0978p(Context context, LocationManager locationManager) {
        this.f2698a = context;
        this.f2699b = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0978p m37639a(Context context) {
        if (f2697d == null) {
            Context applicationContext = context.getApplicationContext();
            f2697d = new C0978p(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f2697d;
    }

    /* renamed from: b */
    private Location m37638b() {
        Location m37637c = C1343c.m36297b(this.f2698a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m37637c("network") : null;
        Location m37637c2 = C1343c.m36297b(this.f2698a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? m37637c("gps") : null;
        return (m37637c2 == null || m37637c == null) ? m37637c2 != null ? m37637c2 : m37637c : m37637c2.getTime() > m37637c.getTime() ? m37637c2 : m37637c;
    }

    /* renamed from: c */
    private Location m37637c(String str) {
        try {
            if (this.f2699b.isProviderEnabled(str)) {
                return this.f2699b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: e */
    private boolean m37635e() {
        return this.f2700c.f2706f > System.currentTimeMillis();
    }

    /* renamed from: f */
    private void m37634f(Location location) {
        long j;
        C0979a c0979a = this.f2700c;
        long currentTimeMillis = System.currentTimeMillis();
        C0977o m37640b = C0977o.m37640b();
        m37640b.m37641a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = m37640b.f2694a;
        m37640b.m37641a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = m37640b.f2696c == 1;
        long j3 = m37640b.f2695b;
        long j4 = m37640b.f2694a;
        boolean z2 = z;
        m37640b.m37641a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = m37640b.f2695b;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        c0979a.f2701a = z2;
        c0979a.f2702b = j2;
        c0979a.f2703c = j3;
        c0979a.f2704d = j4;
        c0979a.f2705e = j5;
        c0979a.f2706f = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m37636d() {
        C0979a c0979a = this.f2700c;
        if (m37635e()) {
            return c0979a.f2701a;
        }
        Location m37638b = m37638b();
        if (m37638b != null) {
            m37634f(m37638b);
            return c0979a.f2701a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
