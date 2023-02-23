package kotlin.p493j0.p494o.p495c.p497p0.p523i;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
/* compiled from: ExternalOverridabilityCondition.java */
/* renamed from: kotlin.j0.o.c.p0.i.e */
/* loaded from: classes3.dex */
public interface InterfaceC12674e {

    /* compiled from: ExternalOverridabilityCondition.java */
    /* renamed from: kotlin.j0.o.c.p0.i.e$a */
    /* loaded from: classes3.dex */
    public enum EnumC12675a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    /* compiled from: ExternalOverridabilityCondition.java */
    /* renamed from: kotlin.j0.o.c.p0.i.e$b */
    /* loaded from: classes3.dex */
    public enum EnumC12676b {
        OVERRIDABLE,
        CONFLICT,
        INCOMPATIBLE,
        UNKNOWN
    }

    /* renamed from: a */
    EnumC12675a mo7008a();

    /* renamed from: b */
    EnumC12676b mo7007b(InterfaceC13293a interfaceC13293a, InterfaceC13293a interfaceC13293a2, InterfaceC13312e interfaceC13312e);
}
