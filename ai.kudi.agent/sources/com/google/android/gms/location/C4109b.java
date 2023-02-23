package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.AbstractC2743d;
import com.google.android.gms.common.api.C2730a;
import com.google.android.gms.common.api.InterfaceC2748h;
import com.google.android.gms.common.api.internal.AbstractC2761d;
import p272h.p286c.p287a.p300b.p307d.p314g.C8473o;
import p272h.p286c.p287a.p300b.p307d.p314g.C8481w;
/* renamed from: com.google.android.gms.location.b */
/* loaded from: classes2.dex */
public class C4109b {

    /* renamed from: a */
    private static final C2730a.C2740g<C8473o> f9898a = new C2730a.C2740g<>();

    /* renamed from: b */
    private static final C2730a.AbstractC2731a<C8473o, C2730a.InterfaceC2734d.C2737c> f9899b;

    /* renamed from: c */
    public static final C2730a<C2730a.InterfaceC2734d.C2737c> f9900c;
    @Deprecated

    /* renamed from: d */
    public static final InterfaceC4120g f9901d;

    /* renamed from: com.google.android.gms.location.b$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4110a<R extends InterfaceC2748h> extends AbstractC2761d<R, C8473o> {
        public AbstractC4110a(AbstractC2743d abstractC2743d) {
            super(C4109b.f9900c, abstractC2743d);
        }
    }

    static {
        C4125l c4125l = new C4125l();
        f9899b = c4125l;
        f9900c = new C2730a<>("LocationServices.API", c4125l, f9898a);
        f9901d = new C8481w();
    }

    /* renamed from: a */
    public static C4107a m28503a(Activity activity) {
        return new C4107a(activity);
    }

    /* renamed from: b */
    public static C4107a m28502b(Context context) {
        return new C4107a(context);
    }

    /* renamed from: c */
    public static C4121h m28501c(Activity activity) {
        return new C4121h(activity);
    }
}
