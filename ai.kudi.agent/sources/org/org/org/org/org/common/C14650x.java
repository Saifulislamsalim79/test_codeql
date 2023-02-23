package org.org.org.org.org.common;

import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.org.data.p601xy.C14699a;
import org.org.org.org.org.data.p601xy.C14701f;
import org.org.org.org.org.data.p601xy.InterfaceC14702h;
/* renamed from: org.org.org.org.org.common.x */
/* loaded from: classes.dex */
public final class C14650x implements InterfaceC14702h {

    /* renamed from: a */
    public final /* synthetic */ Buffer f32582a;

    public C14650x(Buffer buffer) {
        this.f32582a = buffer;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.data.p601xy.InterfaceC14702h
    /* renamed from: a */
    public void mo704a(C14699a c14699a) {
        Log_OC.getArray(c14699a, "sessionUrlPattern");
        Buffer $r3 = this.f32582a;
        String $r1 = Buffer.m946a($r3, c14699a, false, 2, null);
        if ($r1 != null) {
            Buffer $r32 = this.f32582a;
            $r32.m944d($r1);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.data.p601xy.InterfaceC14702h
    /* renamed from: a */
    public void mo703a(C14701f c14701f) {
        Log_OC.getArray(c14701f, "visitorUrlPattern");
        Buffer $r3 = this.f32582a;
        String $r1 = $r3.add(c14701f);
        if ($r1 != null) {
            Buffer $r32 = this.f32582a;
            $r32.write($r1);
        }
    }
}
