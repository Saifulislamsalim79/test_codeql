package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.C4046w2;
import com.google.android.gms.measurement.internal.InterfaceC4256j7;
import com.google.android.gms.tasks.C4469m;
import com.google.firebase.installations.C6429g;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-measurement-api@@20.0.0 */
/* loaded from: classes2.dex */
public final class FirebaseAnalytics {

    /* renamed from: b */
    private static volatile FirebaseAnalytics f12892b;

    /* renamed from: a */
    private final C4046w2 f12893a;

    public FirebaseAnalytics(C4046w2 c4046w2) {
        s.j(c4046w2);
        this.f12893a = c4046w2;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f12892b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f12892b == null) {
                    f12892b = new FirebaseAnalytics(C4046w2.m28705t(context, null, null, null, null));
                }
            }
        }
        return f12892b;
    }

    @Keep
    public static InterfaceC4256j7 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C4046w2 m28705t = C4046w2.m28705t(context, null, null, null, bundle);
        if (m28705t == null) {
            return null;
        }
        return new C5182b(m28705t);
    }

    /* renamed from: a */
    public void m25450a(String str, Bundle bundle) {
        this.f12893a.m28726H(str, bundle);
    }

    /* renamed from: b */
    public void m25449b(String str) {
        this.f12893a.m28719f(str);
    }

    /* renamed from: c */
    public void m25448c(String str, String str2) {
        this.f12893a.m28718g(null, str, str2, false);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) C4469m.m27769b(C6429g.m22065l().mo22049h(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f12893a.m28721d(activity, str, str2);
    }
}
