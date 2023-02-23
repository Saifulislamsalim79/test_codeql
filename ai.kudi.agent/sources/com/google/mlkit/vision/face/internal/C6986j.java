package com.google.mlkit.vision.face.internal;

import com.google.mlkit.common.p186b.C6939i;
import java.util.concurrent.atomic.AtomicReference;
import p272h.p286c.p287a.p300b.p307d.p317j.C8847ba;
import p272h.p286c.p287a.p300b.p307d.p317j.C8984kc;
import p272h.p286c.p287a.p300b.p307d.p317j.C9011m9;
import p272h.p286c.p287a.p300b.p307d.p317j.C9040o8;
import p272h.p286c.p287a.p300b.p307d.p317j.C9044oc;
import p272h.p286c.p287a.p300b.p307d.p317j.C9129u8;
import p272h.p286c.p287a.p300b.p307d.p317j.EnumC8951i9;
import p272h.p286c.p287a.p300b.p307d.p317j.EnumC8981k9;
import p272h.p286c.p287a.p300b.p307d.p317j.EnumC8996l9;
import p272h.p286c.p287a.p300b.p307d.p317j.EnumC9055p8;
import p272h.p286c.p287a.p300b.p307d.p317j.EnumC9070q8;
import p272h.p286c.p287a.p300b.p307d.p317j.EnumC9084r8;
import p272h.p286c.p287a.p300b.p307d.p317j.EnumC9099s8;
import p272h.p286c.p287a.p300b.p307d.p317j.InterfaceC8954ic;
import p272h.p286c.p360e.p361a.p363b.C9401e;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: com.google.mlkit.vision.face.internal.j */
/* loaded from: classes2.dex */
public final class C6986j {

    /* renamed from: a */
    static final AtomicReference f16731a = new AtomicReference();

    /* renamed from: a */
    public static C9129u8 m20389a(C9401e c9401e) {
        EnumC9084r8 enumC9084r8;
        EnumC9055p8 enumC9055p8;
        EnumC9099s8 enumC9099s8;
        EnumC9070q8 enumC9070q8;
        C9040o8 c9040o8 = new C9040o8();
        int m14829d = c9401e.m14829d();
        if (m14829d == 1) {
            enumC9084r8 = EnumC9084r8.NO_LANDMARKS;
        } else if (m14829d != 2) {
            enumC9084r8 = EnumC9084r8.UNKNOWN_LANDMARKS;
        } else {
            enumC9084r8 = EnumC9084r8.ALL_LANDMARKS;
        }
        c9040o8.m15605d(enumC9084r8);
        int m14831b = c9401e.m14831b();
        if (m14831b == 1) {
            enumC9055p8 = EnumC9055p8.NO_CLASSIFICATIONS;
        } else if (m14831b != 2) {
            enumC9055p8 = EnumC9055p8.UNKNOWN_CLASSIFICATIONS;
        } else {
            enumC9055p8 = EnumC9055p8.ALL_CLASSIFICATIONS;
        }
        c9040o8.m15608a(enumC9055p8);
        int m14828e = c9401e.m14828e();
        if (m14828e == 1) {
            enumC9099s8 = EnumC9099s8.FAST;
        } else if (m14828e != 2) {
            enumC9099s8 = EnumC9099s8.UNKNOWN_PERFORMANCE;
        } else {
            enumC9099s8 = EnumC9099s8.ACCURATE;
        }
        c9040o8.m15603f(enumC9099s8);
        int m14830c = c9401e.m14830c();
        if (m14830c == 1) {
            enumC9070q8 = EnumC9070q8.NO_CONTOURS;
        } else if (m14830c != 2) {
            enumC9070q8 = EnumC9070q8.UNKNOWN_CONTOURS;
        } else {
            enumC9070q8 = EnumC9070q8.ALL_CONTOURS;
        }
        c9040o8.m15607b(enumC9070q8);
        c9040o8.m15606c(Boolean.valueOf(c9401e.m14826g()));
        c9040o8.m15604e(Float.valueOf(c9401e.m14832a()));
        return c9040o8.m15598k();
    }

    /* renamed from: b */
    public static String m20388b() {
        return true != m20386d() ? "play-services-mlkit-face-detection" : "face-detection";
    }

    /* renamed from: c */
    public static void m20387c(C8984kc c8984kc, final boolean z, final EnumC8981k9 enumC8981k9) {
        c8984kc.m15678b(new InterfaceC8954ic() { // from class: com.google.mlkit.vision.face.internal.i
            @Override // p272h.p286c.p287a.p300b.p307d.p317j.InterfaceC8954ic
            public final C9044oc zza() {
                boolean z2 = z;
                EnumC8981k9 enumC8981k92 = enumC8981k9;
                C9011m9 c9011m9 = new C9011m9();
                c9011m9.m15632e(z2 ? EnumC8951i9.TYPE_THICK : EnumC8951i9.TYPE_THIN);
                C8847ba c8847ba = new C8847ba();
                c8847ba.m15808b(enumC8981k92);
                c9011m9.m15629h(c8847ba.m15807c());
                return C9044oc.m15586d(c9011m9);
            }
        }, EnumC8996l9.ON_DEVICE_FACE_LOAD);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m20386d() {
        if (f16731a.get() != null) {
            return ((Boolean) f16731a.get()).booleanValue();
        }
        boolean m20404b = C6977a.m20404b(C6939i.m20446c().m20447b());
        f16731a.set(Boolean.valueOf(m20404b));
        return m20404b;
    }
}
