package ai.kudi.agent.issues.p008ui.viewModels;

import ai.kudi.agent.core.usecases.CheckPermission;
import ai.kudi.agent.issues.navigators.IssueTypeNavigator;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.viewModels.DelayedKTAViewModel_Factory */
/* loaded from: classes.dex */
public final class DelayedKTAViewModel_Factory implements InterfaceC9468d<DelayedKTAViewModel> {
    private final InterfaceC11700a<CheckPermission> hasStoragePermissionProvider;
    private final InterfaceC11700a<IssueTypeNavigator> issueTypeNavigatorProvider;

    public DelayedKTAViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.hasStoragePermissionProvider = interfaceC11700a;
        this.issueTypeNavigatorProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static DelayedKTAViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        DelayedKTAViewModel_Factory $r2 = new DelayedKTAViewModel_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static DelayedKTAViewModel newInstance(CheckPermission checkPermission, IssueTypeNavigator issueTypeNavigator) {
        DelayedKTAViewModel $r2 = new DelayedKTAViewModel(checkPermission, issueTypeNavigator);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public DelayedKTAViewModel multiply() {
        InterfaceC11700a $r1 = this.hasStoragePermissionProvider;
        Object $r2 = $r1.get();
        CheckPermission $r3 = (CheckPermission) $r2;
        InterfaceC11700a $r12 = this.issueTypeNavigatorProvider;
        Object $r22 = $r12.get();
        IssueTypeNavigator $r4 = (IssueTypeNavigator) $r22;
        DelayedKTAViewModel $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39530multiply() {
        DelayedKTAViewModel $r1 = multiply();
        return $r1;
    }
}
