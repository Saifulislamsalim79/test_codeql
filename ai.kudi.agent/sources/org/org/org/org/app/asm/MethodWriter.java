package org.org.org.org.app.asm;

import com.mixpanel.android.mpmetrics.MixpanelAPI;
import com.smartlook.sdk.smartlook.integration.model.MixpanelIntegration;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.app.adapters.EnumC14573f;
/* loaded from: classes.dex */
public final class MethodWriter extends AbstractC14577h {

    /* renamed from: w */
    public final MixpanelIntegration f32288w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MethodWriter(MixpanelIntegration mixpanelIntegration) {
        super(mixpanelIntegration);
        Log_OC.getArray(mixpanelIntegration, "mixpanelIntegration");
        this.f32288w = mixpanelIntegration;
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
        MixpanelIntegration $r1 = this.f32288w;
        MixpanelAPI $r2 = $r1.getInstance();
        MixpanelAPI.People $r3 = $r2.getPeople();
        $r3.unset("Smartlook visitor dashboard URL");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.app.asm.AbstractC14577h
    /* renamed from: f */
    public EnumC14573f mo1188f(String str) {
        Log_OC.getArray(str, "visitorURL");
        MixpanelIntegration $r2 = this.f32288w;
        MixpanelAPI $r3 = $r2.getInstance();
        MixpanelAPI.People $r4 = $r3.getPeople();
        Log_OC.loadImage($r4, "mixpanelIntegration.instance.people");
        boolean $z0 = $r4.isIdentified();
        if (!$z0) {
            EnumC14573f r5 = EnumC14573f.f32286f;
            return r5;
        }
        MixpanelIntegration $r22 = this.f32288w;
        MixpanelAPI $r32 = $r22.getInstance();
        $r32.getPeople().set("Smartlook visitor dashboard URL", str);
        EnumC14573f r52 = EnumC14573f.f32287h;
        return r52;
    }
}
