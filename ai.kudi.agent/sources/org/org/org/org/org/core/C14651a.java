package org.org.org.org.org.core;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.org.asm.commons.JSONObject;
/* renamed from: org.org.org.org.org.core.a */
/* loaded from: classes.dex */
public final class C14651a extends JSONObject {
    public final /* synthetic */ Buffer buf;

    public C14651a(Buffer buffer) {
        this.buf = buffer;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.commons.JSONObject
    public void close(FragmentManager fragmentManager, Fragment fragment) {
        Log_OC.getArray(fragmentManager, "fm");
        Log_OC.getArray(fragment, "f");
        Buffer $r4 = this.buf;
        AtomicInteger $r1 = $r4.f32587s;
        $r1.set(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.commons.JSONObject
    public void read(Activity activity) {
        Log_OC.getArray(activity, "activity");
        Buffer $r3 = this.buf;
        AtomicInteger $r1 = $r3.f32587s;
        $r1.set(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.commons.JSONObject
    public void run(Activity activity) {
        Log_OC.getArray(activity, "activity");
        Buffer $r3 = this.buf;
        AtomicInteger $r1 = $r3.f32587s;
        $r1.set(1);
    }
}
