package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2666s;
import java.util.Map;
import p272h.p286c.p287a.p288a.EnumC8238d;
import p272h.p286c.p287a.p288a.p289i.p292b0.InterfaceC8318a;
/* compiled from: AutoValue_SchedulerConfig.java */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.p */
/* loaded from: classes2.dex */
final class C2661p extends AbstractC2666s {

    /* renamed from: a */
    private final InterfaceC8318a f7455a;

    /* renamed from: b */
    private final Map<EnumC8238d, AbstractC2666s.AbstractC2668b> f7456b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2661p(InterfaceC8318a interfaceC8318a, Map<EnumC8238d, AbstractC2666s.AbstractC2668b> map) {
        if (interfaceC8318a != null) {
            this.f7455a = interfaceC8318a;
            if (map != null) {
                this.f7456b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2666s
    /* renamed from: e */
    InterfaceC8318a mo32436e() {
        return this.f7455a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2666s) {
            AbstractC2666s abstractC2666s = (AbstractC2666s) obj;
            return this.f7455a.equals(abstractC2666s.mo32436e()) && this.f7456b.equals(abstractC2666s.mo32433h());
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2666s
    /* renamed from: h */
    Map<EnumC8238d, AbstractC2666s.AbstractC2668b> mo32433h() {
        return this.f7456b;
    }

    public int hashCode() {
        return ((this.f7455a.hashCode() ^ 1000003) * 1000003) ^ this.f7456b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f7455a + ", values=" + this.f7456b + "}";
    }
}
