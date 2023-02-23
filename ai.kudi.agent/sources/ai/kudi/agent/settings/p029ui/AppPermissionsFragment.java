package ai.kudi.agent.settings.p029ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.AndroidOsPermissionUtilKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentAppPermissionsBinding;
import ai.kudi.agent.settings.data.Permission;
import ai.kudi.agent.settings.p029ui.adapters.AppPermissionAdapter;
import ai.kudi.agent.settings.tablet.SettingsActivityExtKt;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C1723k;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
/* compiled from: AppPermissionsFragment.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0001H\u0096\u0001J$\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\t\u0010\u0017\u001a\u00020\u0003H\u0096\u0001R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/settings/ui/AppPermissionsFragment;", "Landroidx/fragment/app/Fragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentAppPermissionsBinding;", "()V", "appPermissionsAdapter", "Lai/kudi/agent/settings/ui/adapters/AppPermissionAdapter;", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentAppPermissionsBinding;", "initBinding", "Landroid/view/View;", "fragment", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "requireBinding", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.AppPermissionsFragment */
/* loaded from: classes.dex */
public final class AppPermissionsFragment extends Fragment implements BaseViewBinder<FragmentAppPermissionsBinding> {
    private final /* synthetic */ BaseViewBinderImpl<FragmentAppPermissionsBinding> $$delegate_0;
    private AppPermissionAdapter appPermissionsAdapter;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AppPermissionsFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentAppPermissionsBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentAppPermissionsBinding $r3 = (FragmentAppPermissionsBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentAppPermissionsBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentAppPermissionsBinding fragmentAppPermissionsBinding, Fragment fragment) {
        Log_OC.getArray(fragmentAppPermissionsBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentAppPermissionsBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentAppPermissionsBinding $r4 = (FragmentAppPermissionsBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentAppPermissionsBinding $r4 = FragmentAppPermissionsBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        List $r8;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        String $r3 = getString(C0001R.string.app_permissions);
        Log_OC.loadImage($r3, "getString(R.string.app_permissions)");
        SettingsActivityExtKt.setSettingsTitle(this, $r3);
        this.appPermissionsAdapter = new AppPermissionAdapter();
        Context $r7 = requireContext();
        Log_OC.loadImage($r7, "requireContext()");
        boolean $z0 = AndroidOsPermissionUtilKt.hasPermission($r7, "android.permission.CAMERA");
        Permission $r6 = new Permission(C0001R.string.camera_or_media, $z0, "android.permission.CAMERA");
        Context $r72 = requireContext();
        Log_OC.loadImage($r72, "requireContext()");
        boolean $z02 = AndroidOsPermissionUtilKt.hasPermission($r72, "android.permission.ACCESS_FINE_LOCATION");
        Permission $r62 = new Permission(C0001R.string.location, $z02, "android.permission.ACCESS_FINE_LOCATION");
        Context $r73 = requireContext();
        Log_OC.loadImage($r73, "requireContext()");
        boolean $z03 = AndroidOsPermissionUtilKt.hasPermission($r73, "android.permission.CALL_PHONE");
        Permission $r63 = new Permission(C0001R.string.phone_calls, $z03, "android.permission.CALL_PHONE");
        Permission[] $r5 = {$r6, $r62, $r63};
        $r8 = C13726r.m3888h($r5);
        AppPermissionAdapter $r4 = this.appPermissionsAdapter;
        if ($r4 != null) {
            $r4.setData($r8);
        }
        FragmentAppPermissionsBinding $r9 = requireBinding();
        RecyclerView $r10 = $r9.appPermissionsRecyclerView;
        C1723k $r11 = new C1723k(requireContext(), 1);
        $r10.m35294h($r11);
        FragmentAppPermissionsBinding $r92 = requireBinding();
        RecyclerView $r102 = $r92.appPermissionsRecyclerView;
        $r102.setHasFixedSize(true);
        FragmentAppPermissionsBinding $r93 = requireBinding();
        RecyclerView $r103 = $r93.appPermissionsRecyclerView;
        $r103.setAdapter(this.appPermissionsAdapter);
        AppPermissionAdapter $r42 = this.appPermissionsAdapter;
        if ($r42 == null) {
            return;
        }
        AppPermissionsFragment$onViewCreated$1 $r12 = new AppPermissionsFragment$onViewCreated$1(this);
        $r42.setOnItemSwitched($r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentAppPermissionsBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentAppPermissionsBinding $r3 = (FragmentAppPermissionsBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentAppPermissionsBinding $r1 = requireBinding();
        return $r1;
    }
}
