package org.org.org.org.app.asm;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.app.adapters.EnumC14573f;
import org.org.org.org.app.tools.C14582h;
/* renamed from: org.org.org.org.app.asm.d */
/* loaded from: classes.dex */
public final class C14575d extends AbstractC14577h {

    /* renamed from: b */
    public final C14582h f32290b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14575d(C14582h c14582h) {
        super(c14582h);
        Log_OC.getArray(c14582h, "firebaseAnalyticsIntegration");
        this.f32290b = c14582h;
    }

    @Override // org.org.org.org.app.asm.AbstractC14577h
    /* renamed from: b */
    public boolean mo1190b() {
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.app.asm.AbstractC14577h
    /* renamed from: e */
    public void mo1189e() {
        C14582h $r2 = this.f32290b;
        FirebaseAnalytics $r1 = $r2.m1170a();
        $r1.m25448c("Smartlook visitor dashboard URL", "");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.app.asm.AbstractC14577h
    /* renamed from: f */
    public EnumC14573f mo1188f(String str) {
        Log_OC.getArray(str, "visitorURL");
        C14582h $r3 = this.f32290b;
        FirebaseAnalytics $r1 = $r3.m1170a();
        $r1.m25448c("Smartlook visitor dashboard URL", str);
        EnumC14573f r4 = EnumC14573f.f32287h;
        return r4;
    }
}
