package org.org.org.org.app.asm;

import com.google.firebase.crashlytics.C5325g;
import com.smartlook.sdk.smartlook.integration.model.FirebaseCrashlyticsIntegration;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.app.adapters.EnumC14573f;
/* loaded from: classes.dex */
public final class ByteVector extends AbstractC14577h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteVector(FirebaseCrashlyticsIntegration firebaseCrashlyticsIntegration) {
        super(firebaseCrashlyticsIntegration);
        Log_OC.getArray(firebaseCrashlyticsIntegration, "firebaseCrashlyticsIntegration");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.app.asm.AbstractC14577h
    /* renamed from: a */
    public EnumC14573f mo1193a(String str) {
        if (str == null) {
            EnumC14573f r3 = EnumC14573f.f32286f;
            return r3;
        }
        C5325g $r1 = C5325g.m25123a();
        $r1.m25119e("Smartlook session dashboard URL", str);
        EnumC14573f r32 = EnumC14573f.f32287h;
        return r32;
    }

    @Override // org.org.org.org.app.asm.AbstractC14577h
    /* renamed from: b */
    public boolean mo1190b() {
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.app.asm.AbstractC14577h
    /* renamed from: e */
    public void mo1189e() {
        C5325g $r1 = C5325g.m25123a();
        $r1.m25119e("Smartlook session dashboard URL", "");
    }
}
