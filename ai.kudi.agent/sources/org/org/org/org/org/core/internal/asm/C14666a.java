package org.org.org.org.org.core.internal.asm;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.org.asm.commons.JSONObject;
/* renamed from: org.org.org.org.org.core.internal.asm.a */
/* loaded from: classes.dex */
public final class C14666a extends JSONObject {

    /* renamed from: b */
    public final /* synthetic */ C14671f f32649b;

    public C14666a(C14671f c14671f) {
        this.f32649b = c14671f;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.commons.JSONObject
    public void close(FragmentManager fragmentManager, Fragment fragment) {
        Log_OC.getArray(fragmentManager, "fm");
        Log_OC.getArray(fragment, "f");
        C14671f $r3 = this.f32649b;
        $r3.f32663f = false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.commons.JSONObject
    public void read(Activity activity) {
        Log_OC.getArray(activity, "activity");
        C14671f $r2 = this.f32649b;
        $r2.f32663f = false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.commons.JSONObject
    public void run(Activity activity) {
        Log_OC.getArray(activity, "activity");
        C14671f $r2 = this.f32649b;
        $r2.f32663f = false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.commons.JSONObject
    public void setTitle(FragmentManager fragmentManager, Fragment fragment) {
        Log_OC.getArray(fragmentManager, "fm");
        Log_OC.getArray(fragment, "f");
        C14671f $r3 = this.f32649b;
        $r3.f32663f = true;
    }
}
