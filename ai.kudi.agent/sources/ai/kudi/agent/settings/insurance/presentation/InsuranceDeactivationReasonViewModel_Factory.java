package ai.kudi.agent.settings.insurance.presentation;

import ai.kudi.agent.core.util.ResourceDelegate;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class InsuranceDeactivationReasonViewModel_Factory implements InterfaceC9468d<InsuranceDeactivationReasonViewModel> {
    private final InterfaceC11700a<ResourceDelegate> resourceProvider;

    public InsuranceDeactivationReasonViewModel_Factory(InterfaceC11700a interfaceC11700a) {
        this.resourceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InsuranceDeactivationReasonViewModel_Factory create(InterfaceC11700a interfaceC11700a) {
        InsuranceDeactivationReasonViewModel_Factory $r1 = new InsuranceDeactivationReasonViewModel_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InsuranceDeactivationReasonViewModel newInstance(ResourceDelegate resourceDelegate) {
        InsuranceDeactivationReasonViewModel $r1 = new InsuranceDeactivationReasonViewModel(resourceDelegate);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public InsuranceDeactivationReasonViewModel multiply() {
        InterfaceC11700a $r1 = this.resourceProvider;
        Object $r2 = $r1.get();
        ResourceDelegate $r3 = (ResourceDelegate) $r2;
        InsuranceDeactivationReasonViewModel $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40783multiply() {
        InsuranceDeactivationReasonViewModel $r1 = multiply();
        return $r1;
    }
}
