package io.intercom.com.bumptech.glide;

import io.intercom.com.bumptech.glide.AbstractC10491j;
import io.intercom.com.bumptech.glide.p412p.p414l.C10876c;
import io.intercom.com.bumptech.glide.p412p.p414l.InterfaceC10880e;
import io.intercom.com.bumptech.glide.p416r.C10892h;
/* compiled from: TransitionOptions.java */
/* renamed from: io.intercom.com.bumptech.glide.j */
/* loaded from: classes3.dex */
public abstract class AbstractC10491j<CHILD extends AbstractC10491j<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: c */
    private InterfaceC10880e<? super TranscodeType> f24007c = C10876c.m12049c();

    /* renamed from: c */
    private CHILD m12968c() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final InterfaceC10880e<? super TranscodeType> m12969b() {
        return this.f24007c;
    }

    /* renamed from: d */
    public final CHILD m12967d(InterfaceC10880e<? super TranscodeType> interfaceC10880e) {
        C10892h.m12014d(interfaceC10880e);
        this.f24007c = interfaceC10880e;
        m12968c();
        return this;
    }
}
