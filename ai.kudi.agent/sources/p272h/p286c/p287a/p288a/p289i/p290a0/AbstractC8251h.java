package p272h.p286c.p287a.p288a.p289i.p290a0;

import android.content.Context;
import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2666s;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C2660o;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C2665r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC2675x;
import p272h.p286c.p287a.p288a.p289i.p290a0.p291j.InterfaceC8272i0;
import p272h.p286c.p287a.p288a.p289i.p292b0.InterfaceC8318a;
/* compiled from: SchedulingModule.java */
/* renamed from: h.c.a.a.i.a0.h */
/* loaded from: classes2.dex */
public abstract class AbstractC8251h {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC2675x m16426a(Context context, InterfaceC8272i0 interfaceC8272i0, AbstractC2666s abstractC2666s, InterfaceC8318a interfaceC8318a) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C2665r(context, interfaceC8272i0, abstractC2666s);
        }
        return new C2660o(context, interfaceC8272i0, interfaceC8318a, abstractC2666s);
    }
}
