package org.org.org.org.app.asm;

import com.bugsnag.android.Bugsnag;
import com.bugsnag.android.OnErrorCallback;
import com.smartlook.sdk.smartlook.integration.model.BugsnagIntegration;
import kotlin.C13218k;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.app.adapters.EnumC14573f;
/* renamed from: org.org.org.org.app.asm.f */
/* loaded from: classes.dex */
public final class C14576f extends AbstractC14577h {

    /* renamed from: i */
    public OnErrorCallback f32291i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14576f(BugsnagIntegration bugsnagIntegration) {
        super(bugsnagIntegration);
        Log_OC.getArray(bugsnagIntegration, "bugsnagIntegration");
        C14574b $r2 = C14574b.f32289a;
        C13218k.m5625b($r2);
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
    /* renamed from: c */
    public EnumC14573f mo1192c() {
        OnErrorCallback $r1 = this.f32291i;
        if ($r1 != null) {
            Bugsnag.removeOnError($r1);
        }
        Item $r2 = new Item(this);
        this.f32291i = $r2;
        Bugsnag.addOnError($r2);
        EnumC14573f r3 = EnumC14573f.f32287h;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.app.asm.AbstractC14577h
    /* renamed from: e */
    public void mo1189e() {
        OnErrorCallback $r1 = this.f32291i;
        if ($r1 != null) {
            Bugsnag.removeOnError($r1);
        }
    }
}
