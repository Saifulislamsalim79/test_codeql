package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC3894m8;
import com.google.android.gms.internal.measurement.C3847j8;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.j8 */
/* loaded from: classes2.dex */
public class C3847j8<MessageType extends AbstractC3894m8<MessageType, BuilderType>, BuilderType extends C3847j8<MessageType, BuilderType>> extends AbstractC4098z6<MessageType, BuilderType> {

    /* renamed from: c */
    private final MessageType f9434c;

    /* renamed from: d */
    protected MessageType f9435d;

    /* renamed from: e */
    protected boolean f9436e = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public C3847j8(MessageType messagetype) {
        this.f9434c = messagetype;
        this.f9435d = (MessageType) messagetype.mo28554v(4, null, null);
    }

    /* renamed from: j */
    private static final void m29457j(MessageType messagetype, MessageType messagetype2) {
        C4053w9.m28691a().m28690b(messagetype.getClass()).mo28529e(messagetype, messagetype2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3942p9
    /* renamed from: e */
    public final /* synthetic */ InterfaceC3927o9 mo29102e() {
        return this.f9434c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.AbstractC4098z6
    /* renamed from: g */
    protected final /* synthetic */ AbstractC4098z6 mo28542g(AbstractC3704a7 abstractC3704a7) {
        m29452p((AbstractC3894m8) abstractC3704a7);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4098z6
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ AbstractC4098z6 mo28541h(byte[] bArr, int i, int i2) throws zzkh {
        m29451q(bArr, 0, i2, C4099z7.m28538a());
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4098z6
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC4098z6 mo28540i(byte[] bArr, int i, int i2, C4099z7 c4099z7) throws zzkh {
        m29451q(bArr, 0, i2, c4099z7);
        return this;
    }

    /* renamed from: k */
    public final MessageType m29456k() {
        MessageType mo29328Z = mo29328Z();
        boolean z = true;
        byte byteValue = ((Byte) mo29328Z.mo28554v(1, null, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z = false;
            } else {
                boolean mo28528f = C4053w9.m28691a().m28690b(mo29328Z.getClass()).mo28528f(mo29328Z);
                mo29328Z.mo28554v(2, true != mo28528f ? null : mo29328Z, null);
                z = mo28528f;
            }
        }
        if (z) {
            return mo29328Z;
        }
        throw new zzma(mo29328Z);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3911n9
    /* renamed from: l */
    public MessageType mo29328Z() {
        if (this.f9436e) {
            return this.f9435d;
        }
        MessageType messagetype = this.f9435d;
        C4053w9.m28691a().m28690b(messagetype.getClass()).mo28531c(messagetype);
        this.f9436e = true;
        return this.f9435d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public void m29454n() {
        MessageType messagetype = (MessageType) this.f9435d.mo28554v(4, null, null);
        m29457j(messagetype, this.f9435d);
        this.f9435d = messagetype;
    }

    /* renamed from: o */
    public final BuilderType clone() {
        BuilderType buildertype = (BuilderType) this.f9434c.mo28554v(5, null, null);
        buildertype.m29452p(mo29328Z());
        return buildertype;
    }

    /* renamed from: p */
    public final BuilderType m29452p(MessageType messagetype) {
        if (this.f9436e) {
            m29454n();
            this.f9436e = false;
        }
        m29457j(this.f9435d, messagetype);
        return this;
    }

    /* renamed from: q */
    public final BuilderType m29451q(byte[] bArr, int i, int i2, C4099z7 c4099z7) throws zzkh {
        if (this.f9436e) {
            m29454n();
            this.f9436e = false;
        }
        try {
            C4053w9.m28691a().m28690b(this.f9435d.getClass()).mo28527g(this.f9435d, bArr, 0, i2, new C3753d7(c4099z7));
            return this;
        } catch (zzkh e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzkh.m28514f();
        }
    }
}
