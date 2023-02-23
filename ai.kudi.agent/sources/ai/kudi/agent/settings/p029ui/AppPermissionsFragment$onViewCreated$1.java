package ai.kudi.agent.settings.p029ui;

import ai.kudi.agent.core.util.AndroidOsPermissionUtilKt;
import ai.kudi.agent.settings.data.Permission;
import android.view.View;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: AppPermissionsFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m10421d2 = {"<anonymous>", "", "permission", "Lai/kudi/agent/settings/data/Permission;", "<anonymous parameter 1>", "Landroid/view/View;", "isChecked", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.AppPermissionsFragment$onViewCreated$1 */
/* loaded from: classes.dex */
final class AppPermissionsFragment$onViewCreated$1 extends AbstractC11802m implements InterfaceC11772q<Permission, View, Boolean, C13666w> {
    final /* synthetic */ AppPermissionsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppPermissionsFragment$onViewCreated$1(AppPermissionsFragment appPermissionsFragment) {
        super(3);
        this.this$0 = appPermissionsFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11772q
    public /* bridge */ /* synthetic */ C13666w invoke(Permission permission, View view, Boolean bool) {
        Permission $r4 = permission;
        View $r5 = view;
        Boolean $r6 = bool;
        boolean $z0 = $r6.booleanValue();
        invoke($r4, $r5, $z0);
        C13666w r7 = C13666w.f30112a;
        return r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(Permission permission, View view, boolean z) {
        Log_OC.getArray(permission, "permission");
        Log_OC.getArray(view, "$noName_1");
        if (z) {
            AppPermissionsFragment $r4 = this.this$0;
            String $r1 = permission.getManifestName();
            String[] $r5 = {$r1};
            AndroidOsPermissionUtilKt.requestPermission($r4, 100, $r5);
        }
    }
}
