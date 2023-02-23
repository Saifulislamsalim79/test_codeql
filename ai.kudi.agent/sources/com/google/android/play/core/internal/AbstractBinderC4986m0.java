package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: com.google.android.play.core.internal.m0 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4986m0 extends BinderC4970e0 implements InterfaceC4988n0 {
    /* renamed from: n */
    public static InterfaceC4988n0 m25918n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return queryLocalInterface instanceof InterfaceC4988n0 ? (InterfaceC4988n0) queryLocalInterface : new C4984l0(iBinder);
    }
}
