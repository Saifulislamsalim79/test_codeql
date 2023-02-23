package org.org.org.org.android.util.function;

import android.content.Context;
import android.view.OrientationEventListener;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.android.util.menu.C14572i;
import org.org.org.org.android.util.menu.EnumC14571f;
/* loaded from: classes.dex */
public abstract class Log extends OrientationEventListener {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Log(Context context) {
        super(context);
        Log_OC.getArray(context, "context");
    }

    /* renamed from: d */
    public abstract void mo1236d(EnumC14571f enumC14571f);

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i) {
        if (i < 0) {
            return;
        }
        C14572i $r1 = EnumC14571f.f32274l;
        EnumC14571f $r2 = $r1.m1199a(i);
        mo1236d($r2);
    }
}
