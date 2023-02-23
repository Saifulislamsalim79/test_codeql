package org.org.org.org.app.asm;

import com.heapanalytics.android.Heap;
import com.smartlook.sdk.smartlook.integration.model.HeapIntegration;
import java.util.Map;
import kotlin.C13287o;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13725q0;
import org.org.org.org.app.adapters.EnumC14573f;
/* renamed from: org.org.org.org.app.asm.i */
/* loaded from: classes.dex */
public final class C14578i extends AbstractC14577h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14578i(HeapIntegration heapIntegration) {
        super(heapIntegration);
        Log_OC.getArray(heapIntegration, "heapIntegration");
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
        Map $r1;
        C13287o $r2 = new C13287o("Smartlook visitor dashboard URL", "");
        $r1 = C13725q0.m3897g($r2);
        Heap.addUserProperties($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.app.asm.AbstractC14577h
    /* renamed from: f */
    public EnumC14573f mo1188f(String str) {
        Map $r1;
        Log_OC.getArray(str, "visitorURL");
        C13287o $r3 = new C13287o("Smartlook visitor dashboard URL", str);
        $r1 = C13725q0.m3897g($r3);
        Heap.addUserProperties($r1);
        EnumC14573f r4 = EnumC14573f.f32287h;
        return r4;
    }
}
