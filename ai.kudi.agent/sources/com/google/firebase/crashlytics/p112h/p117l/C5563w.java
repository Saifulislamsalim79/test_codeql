package com.google.firebase.crashlytics.p112h.p117l;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_StaticSessionData.java */
/* renamed from: com.google.firebase.crashlytics.h.l.w */
/* loaded from: classes2.dex */
public final class C5563w extends AbstractC5496c0 {

    /* renamed from: a */
    private final AbstractC5496c0.AbstractC5497a f13718a;

    /* renamed from: b */
    private final AbstractC5496c0.AbstractC5499c f13719b;

    /* renamed from: c */
    private final AbstractC5496c0.AbstractC5498b f13720c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5563w(AbstractC5496c0.AbstractC5497a abstractC5497a, AbstractC5496c0.AbstractC5499c abstractC5499c, AbstractC5496c0.AbstractC5498b abstractC5498b) {
        if (abstractC5497a != null) {
            this.f13718a = abstractC5497a;
            if (abstractC5499c != null) {
                this.f13719b = abstractC5499c;
                if (abstractC5498b != null) {
                    this.f13720c = abstractC5498b;
                    return;
                }
                throw new NullPointerException("Null deviceData");
            }
            throw new NullPointerException("Null osData");
        }
        throw new NullPointerException("Null appData");
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0
    /* renamed from: a */
    public AbstractC5496c0.AbstractC5497a mo24478a() {
        return this.f13718a;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0
    /* renamed from: c */
    public AbstractC5496c0.AbstractC5498b mo24477c() {
        return this.f13720c;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0
    /* renamed from: d */
    public AbstractC5496c0.AbstractC5499c mo24476d() {
        return this.f13719b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5496c0) {
            AbstractC5496c0 abstractC5496c0 = (AbstractC5496c0) obj;
            return this.f13718a.equals(abstractC5496c0.mo24478a()) && this.f13719b.equals(abstractC5496c0.mo24476d()) && this.f13720c.equals(abstractC5496c0.mo24477c());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f13718a.hashCode() ^ 1000003) * 1000003) ^ this.f13719b.hashCode()) * 1000003) ^ this.f13720c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f13718a + ", osData=" + this.f13719b + ", deviceData=" + this.f13720c + "}";
    }
}
