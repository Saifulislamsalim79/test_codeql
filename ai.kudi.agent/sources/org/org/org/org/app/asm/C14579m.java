package org.org.org.org.app.asm;

import com.amplitude.api.AmplitudeClient;
import com.amplitude.api.Identify;
import com.smartlook.sdk.smartlook.integration.model.AmplitudeIntegration;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.app.adapters.EnumC14573f;
/* renamed from: org.org.org.org.app.asm.m */
/* loaded from: classes.dex */
public final class C14579m extends AbstractC14577h {

    /* renamed from: w */
    public final AmplitudeIntegration f32293w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14579m(AmplitudeIntegration amplitudeIntegration) {
        super(amplitudeIntegration);
        Log_OC.getArray(amplitudeIntegration, "amplitudeIntegration");
        this.f32293w = amplitudeIntegration;
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
        Identify $r1 = new Identify();
        Identify $r12 = $r1.unset("Smartlook visitor dashboard URL");
        AmplitudeIntegration $r2 = this.f32293w;
        AmplitudeClient $r3 = $r2.getInstance();
        $r3.identify($r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.app.asm.AbstractC14577h
    /* renamed from: f */
    public EnumC14573f mo1188f(String str) {
        Log_OC.getArray(str, "visitorURL");
        Identify $r2 = new Identify();
        Identify $r22 = $r2.set("Smartlook visitor dashboard URL", str);
        AmplitudeIntegration $r3 = this.f32293w;
        AmplitudeClient $r4 = $r3.getInstance();
        $r4.identify($r22);
        EnumC14573f r5 = EnumC14573f.f32287h;
        return r5;
    }
}
