package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import p272h.p286c.p287a.p300b.p307d.p312e.BinderC8424b;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.dynamic.a */
/* loaded from: classes2.dex */
public interface InterfaceC2987a extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* renamed from: com.google.android.gms.dynamic.a$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC2988a extends BinderC8424b implements InterfaceC2987a {
        public AbstractBinderC2988a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: n */
        public static InterfaceC2987a m31496n(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof InterfaceC2987a ? (InterfaceC2987a) queryLocalInterface : new C2990c(iBinder);
        }
    }
}
