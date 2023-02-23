package org.org.org.org.org.asm;

import android.app.Activity;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.org.asm.commons.JSONObject;
/* renamed from: org.org.org.org.org.asm.a */
/* loaded from: classes.dex */
public final class C14630a extends JSONObject {

    /* renamed from: c */
    public final /* synthetic */ C14637i f32490c;

    public C14630a(C14637i c14637i) {
        this.f32490c = c14637i;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.commons.JSONObject
    public void close() {
        C14637i $r1 = this.f32490c;
        $r1.close();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.commons.JSONObject
    public void close(Activity activity) {
        Log_OC.getArray(activity, "activity");
        C14637i $r2 = this.f32490c;
        $r2.m956a();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.commons.JSONObject
    public void close(Throwable th) {
        Log_OC.getArray(th, "cause");
        C14637i $r2 = this.f32490c;
        $r2.close();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.commons.JSONObject
    public void read(Activity activity) {
        Log_OC.getArray(activity, "activity");
        C14637i $r2 = this.f32490c;
        $r2.m956a();
    }
}
