package io.grpc.p384h1;

import com.google.common.base.C5042j;
import io.grpc.AbstractC10040q0;
import io.grpc.AbstractC10042r0;
/* compiled from: AbstractManagedChannelImplBuilder.java */
/* renamed from: io.grpc.h1.b */
/* loaded from: classes2.dex */
public abstract class AbstractC9541b<T extends AbstractC10042r0<T>> extends AbstractC10042r0<T> {
    @Override // io.grpc.AbstractC10042r0
    /* renamed from: a */
    public AbstractC10040q0 mo13240a() {
        return mo13728c().mo13240a();
    }

    /* renamed from: c */
    protected abstract AbstractC10042r0<?> mo13728c();

    public String toString() {
        C5042j.C5044b m25812c = C5042j.m25812c(this);
        m25812c.m25808d("delegate", mo13728c());
        return m25812c.toString();
    }
}
