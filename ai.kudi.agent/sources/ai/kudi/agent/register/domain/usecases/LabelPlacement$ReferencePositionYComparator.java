package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.register.domain.wiki.BvnVerificationResponse;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class LabelPlacement$ReferencePositionYComparator implements InterfaceC11291f {
    public static final /* synthetic */ LabelPlacement$ReferencePositionYComparator INSTANCE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        LabelPlacement$ReferencePositionYComparator $r0 = new LabelPlacement$ReferencePositionYComparator();
        INSTANCE = $r0;
    }

    private /* synthetic */ LabelPlacement$ReferencePositionYComparator() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        BvnVerificationResponse $r1 = (BvnVerificationResponse) obj;
        return Log_OC.getArray($r1, "it");
    }
}
