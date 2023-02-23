package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: com.google.android.play.core.internal.h0 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4976h0 extends BinderC4970e0 implements InterfaceC4978i0 {
    /* renamed from: n */
    public static InterfaceC4978i0 m25941n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return queryLocalInterface instanceof InterfaceC4978i0 ? (InterfaceC4978i0) queryLocalInterface : new C4974g0(iBinder);
    }
}
