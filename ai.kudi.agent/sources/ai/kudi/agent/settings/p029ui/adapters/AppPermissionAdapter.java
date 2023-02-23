package ai.kudi.agent.settings.p029ui.adapters;

import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.AppPermissionsItemBinding;
import ai.kudi.agent.settings.data.Permission;
import ai.kudi.agent.settings.p029ui.adapters.AppPermissionAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: AppPermissionAdapter.kt */
@Metadata(m10422d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u000b2\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u0014\u0010\u0019\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R4\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m10421d2 = {"Lai/kudi/agent/settings/ui/adapters/AppPermissionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/settings/ui/adapters/AppPermissionAdapter$AppPermissionViewHolder;", "()V", AttributeType.LIST, "", "Lai/kudi/agent/settings/data/Permission;", "onItemSwitched", "Lkotlin/Function3;", "Landroid/view/View;", "", "", "getOnItemSwitched", "()Lkotlin/jvm/functions/Function3;", "setOnItemSwitched", "(Lkotlin/jvm/functions/Function3;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "", "AppPermissionViewHolder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.adapters.AppPermissionAdapter */
/* loaded from: classes.dex */
public final class AppPermissionAdapter extends RecyclerView.AbstractC1623h<AppPermissionViewHolder> {
    private List<Permission> list;
    private InterfaceC11772q<? super Permission, ? super View, ? super Boolean, C13666w> onItemSwitched;

    /* compiled from: AppPermissionAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/settings/ui/adapters/AppPermissionAdapter$AppPermissionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lai/kudi/agent/databinding/AppPermissionsItemBinding;", "(Lai/kudi/agent/settings/ui/adapters/AppPermissionAdapter;Lai/kudi/agent/databinding/AppPermissionsItemBinding;)V", "bind", "", "permission", "Lai/kudi/agent/settings/data/Permission;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.ui.adapters.AppPermissionAdapter$AppPermissionViewHolder */
    /* loaded from: classes.dex */
    public final class AppPermissionViewHolder extends RecyclerView.AbstractC1620e0 {
        private final AppPermissionsItemBinding binding;
        final /* synthetic */ AppPermissionAdapter this$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public AppPermissionViewHolder(ai.kudi.agent.settings.p029ui.adapters.AppPermissionAdapter r5, ai.kudi.agent.databinding.AppPermissionsItemBinding r6) {
            /*
                r4 = this;
                java.lang.String r0 = "this$0"
                kotlin.p483e0.p485d.Log_OC.getArray(r5, r0)
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r6, r0)
                r4.this$0 = r5
                androidx.constraintlayout.widget.ConstraintLayout r1 = r6.getRoot()
                r3 = r1
                android.view.View r3 = (android.view.View) r3
                r2 = r3
                r4.<init>(r2)
                r4.binding = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.p029ui.adapters.AppPermissionAdapter.AppPermissionViewHolder.<init>(ai.kudi.agent.settings.ui.adapters.AppPermissionAdapter, ai.kudi.agent.databinding.AppPermissionsItemBinding):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: bind$lambda-0  reason: not valid java name */
        public static final void m40909bind$lambda0(AppPermissionAdapter appPermissionAdapter, Permission permission, AppPermissionViewHolder appPermissionViewHolder, CompoundButton compoundButton, boolean z) {
            Log_OC.getArray(appPermissionAdapter, "this$0");
            Log_OC.getArray(permission, "$permission");
            Log_OC.getArray(appPermissionViewHolder, "this$1");
            InterfaceC11772q $r4 = appPermissionAdapter.getOnItemSwitched();
            if ($r4 != null) {
                Log_OC.loadImage(compoundButton, "buttonView");
                Boolean $r5 = Boolean.valueOf(z);
                $r4.invoke(permission, compoundButton, $r5);
            }
            AppPermissionsItemBinding $r6 = appPermissionViewHolder.binding;
            View $r7 = $r6.permissionSwitch;
            Log_OC.loadImage($r7, "binding.permissionSwitch");
            View r8 = $r7;
            ViewExtKt.hide$default(r8, false, 1, null);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void bind(final Permission permission) {
            Log_OC.getArray(permission, "permission");
            boolean $z0 = permission.isGranted();
            if ($z0) {
                View $r3 = this.binding.permissionSwitch;
                Log_OC.loadImage($r3, "binding.permissionSwitch");
                View r11 = $r3;
                ViewExtKt.hide$default(r11, false, 1, null);
            }
            SwitchCompat $r32 = this.binding.permissionSwitch;
            boolean $z02 = permission.isGranted();
            $r32.setChecked($z02);
            AppPermissionsItemBinding $r2 = this.binding;
            TextView $r4 = $r2.permissionText;
            ConstraintLayout $r5 = $r2.getRoot();
            Context $r6 = $r5.getContext();
            int $i0 = permission.getPermission();
            CharSequence $r7 = $r6.getString($i0);
            TextView r13 = $r4;
            r13.setText($r7);
            CompoundButton $r33 = this.binding.permissionSwitch;
            final AppPermissionAdapter $r8 = this.this$0;
            CompoundButton r14 = $r33;
            r14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ai.kudi.agent.settings.ui.adapters.a
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    AppPermissionAdapter $r22 = AppPermissionAdapter.this;
                    Permission $r34 = permission;
                    AppPermissionAdapter.AppPermissionViewHolder $r42 = this;
                    AppPermissionAdapter.AppPermissionViewHolder.m40909bind$lambda0($r22, $r34, $r42, compoundButton, z);
                }
            });
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AppPermissionAdapter() {
        ArrayList $r1 = new ArrayList();
        this.list = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.list;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11772q getOnItemSwitched() {
        InterfaceC11772q r1 = this.onItemSwitched;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(AppPermissionViewHolder appPermissionViewHolder, int i) {
        Log_OC.getArray(appPermissionViewHolder, "holder");
        List $r3 = this.list;
        Object $r2 = $r3.get(i);
        Permission $r4 = (Permission) $r2;
        appPermissionViewHolder.bind($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(AppPermissionViewHolder appPermissionViewHolder, int i) {
        AppPermissionViewHolder $r2 = appPermissionViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public AppPermissionViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        AppPermissionsItemBinding $r5 = AppPermissionsItemBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(\n                LayoutInflater.from(parent.context),\n                parent,\n                false\n            )");
        AppPermissionViewHolder $r2 = new AppPermissionViewHolder(this, $r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ AppPermissionViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        AppPermissionViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setData(List list) {
        Log_OC.getArray(list, AttributeType.LIST);
        List $r2 = this.list;
        $r2.clear();
        List $r22 = this.list;
        $r22.addAll(list);
        notifyDataSetChanged();
    }

    public final void setOnItemSwitched(InterfaceC11772q interfaceC11772q) {
        this.onItemSwitched = interfaceC11772q;
    }
}
