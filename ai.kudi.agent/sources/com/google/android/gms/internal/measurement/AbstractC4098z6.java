package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC3704a7;
import com.google.android.gms.internal.measurement.AbstractC4098z6;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.z6 */
/* loaded from: classes2.dex */
public abstract class AbstractC4098z6<MessageType extends AbstractC3704a7<MessageType, BuilderType>, BuilderType extends AbstractC4098z6<MessageType, BuilderType>> implements InterfaceC3911n9 {
    @Override // com.google.android.gms.internal.measurement.InterfaceC3911n9
    /* renamed from: L0 */
    public final /* synthetic */ InterfaceC3911n9 mo28544L0(byte[] bArr) throws zzkh {
        mo28541h(bArr, 0, bArr.length);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3911n9
    /* renamed from: Q0 */
    public final /* synthetic */ InterfaceC3911n9 mo28543Q0(byte[] bArr, C4099z7 c4099z7) throws zzkh {
        mo28540i(bArr, 0, bArr.length, c4099z7);
        return this;
    }

    /* renamed from: g */
    protected abstract BuilderType mo28542g(MessageType messagetype);

    /* renamed from: h */
    public abstract BuilderType mo28541h(byte[] bArr, int i, int i2) throws zzkh;

    /* renamed from: i */
    public abstract BuilderType mo28540i(byte[] bArr, int i, int i2, C4099z7 c4099z7) throws zzkh;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.InterfaceC3911n9
    /* renamed from: k0 */
    public final /* bridge */ /* synthetic */ InterfaceC3911n9 mo28539k0(InterfaceC3927o9 interfaceC3927o9) {
        if (mo29102e().getClass().isInstance(interfaceC3927o9)) {
            mo28542g((AbstractC3704a7) interfaceC3927o9);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
