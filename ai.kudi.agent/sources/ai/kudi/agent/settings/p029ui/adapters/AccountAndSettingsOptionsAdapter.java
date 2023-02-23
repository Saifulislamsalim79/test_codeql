package ai.kudi.agent.settings.p029ui.adapters;

import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.SettingsOptionsItemBinding;
import ai.kudi.agent.settings.data.SettingsOption;
import ai.kudi.agent.settings.p029ui.adapters.AccountAndSettingsOptionsAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: AccountAndSettingsOptionsAdapter.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\u00072\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J\u0014\u0010\u001a\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001cR&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m10421d2 = {"Lai/kudi/agent/settings/ui/adapters/AccountAndSettingsOptionsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/settings/ui/adapters/AccountAndSettingsOptionsAdapter$AccountAndSettingsOptionsViewHolder;", "()V", "onItemClickListener", "Lkotlin/Function1;", "Lai/kudi/agent/settings/data/SettingsOption;", "", "getOnItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "onUpdateAppClicked", "getOnUpdateAppClicked", "setOnUpdateAppClicked", "settingsList", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", TransactionBreakDownItemType.DATA, "", "AccountAndSettingsOptionsViewHolder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.adapters.AccountAndSettingsOptionsAdapter */
/* loaded from: classes.dex */
public final class AccountAndSettingsOptionsAdapter extends RecyclerView.AbstractC1623h<AccountAndSettingsOptionsViewHolder> {
    private InterfaceC11767l<? super SettingsOption, C13666w> onItemClickListener;
    private InterfaceC11767l<? super SettingsOption, C13666w> onUpdateAppClicked;
    private List<SettingsOption> settingsList;

    /* compiled from: AccountAndSettingsOptionsAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/settings/ui/adapters/AccountAndSettingsOptionsAdapter$AccountAndSettingsOptionsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lai/kudi/agent/databinding/SettingsOptionsItemBinding;", "(Lai/kudi/agent/settings/ui/adapters/AccountAndSettingsOptionsAdapter;Lai/kudi/agent/databinding/SettingsOptionsItemBinding;)V", "bind", "", "settingsOption", "Lai/kudi/agent/settings/data/SettingsOption;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.ui.adapters.AccountAndSettingsOptionsAdapter$AccountAndSettingsOptionsViewHolder */
    /* loaded from: classes.dex */
    public final class AccountAndSettingsOptionsViewHolder extends RecyclerView.AbstractC1620e0 {
        private final SettingsOptionsItemBinding binding;
        final /* synthetic */ AccountAndSettingsOptionsAdapter this$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public AccountAndSettingsOptionsViewHolder(ai.kudi.agent.settings.p029ui.adapters.AccountAndSettingsOptionsAdapter r5, ai.kudi.agent.databinding.SettingsOptionsItemBinding r6) {
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
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.p029ui.adapters.AccountAndSettingsOptionsAdapter.AccountAndSettingsOptionsViewHolder.<init>(ai.kudi.agent.settings.ui.adapters.AccountAndSettingsOptionsAdapter, ai.kudi.agent.databinding.SettingsOptionsItemBinding):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: bind$lambda-0  reason: not valid java name */
        public static final void m40907bind$lambda0(AccountAndSettingsOptionsAdapter accountAndSettingsOptionsAdapter, SettingsOption settingsOption, View view) {
            Log_OC.getArray(accountAndSettingsOptionsAdapter, "this$0");
            Log_OC.getArray(settingsOption, "$settingsOption");
            InterfaceC11767l $r1 = accountAndSettingsOptionsAdapter.getOnUpdateAppClicked();
            $r1.invoke(settingsOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: bind$lambda-1  reason: not valid java name */
        public static final void m40908bind$lambda1(AccountAndSettingsOptionsAdapter accountAndSettingsOptionsAdapter, SettingsOption settingsOption, View view) {
            Log_OC.getArray(accountAndSettingsOptionsAdapter, "this$0");
            Log_OC.getArray(settingsOption, "$settingsOption");
            InterfaceC11767l $r1 = accountAndSettingsOptionsAdapter.getOnItemClickListener();
            $r1.invoke(settingsOption);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void bind(final SettingsOption settingsOption) {
            Log_OC.getArray(settingsOption, "settingsOption");
            SettingsOptionsItemBinding $r2 = this.binding;
            TextView $r3 = $r2.settingsName;
            ViewGroup $r4 = $r2.getRoot();
            ViewGroup r16 = $r4;
            Resources $r6 = r16.getContext().getResources();
            Log_OC.loadImage($r6, "binding.root.context.resources");
            CharSequence $r7 = settingsOption.title($r6);
            TextView r17 = $r3;
            r17.setText($r7);
            SettingsOptionsItemBinding $r22 = this.binding;
            ImageView $r8 = $r22.settingsIcon;
            ViewGroup $r42 = $r22.getRoot();
            ViewGroup r162 = $r42;
            Context $r5 = r162.getContext();
            Log_OC.loadImage($r5, "binding.root.context");
            Drawable $r9 = settingsOption.icon($r5);
            $r8.setImageDrawable($r9);
            boolean $z0 = settingsOption instanceof SettingsOption.AppUpdate;
            if ($z0) {
                View $r10 = this.binding.updateAppTextView;
                Log_OC.loadImage($r10, "binding.updateAppTextView");
                View r18 = $r10;
                ViewExtKt.show(r18);
                ImageView $r82 = this.binding.imageView13;
                Log_OC.loadImage($r82, "binding.imageView13");
                ViewExtKt.hide$default($r82, false, 1, null);
                TextView $r102 = this.binding.updateAppTextView;
                final AccountAndSettingsOptionsAdapter $r11 = this.this$0;
                TextView r172 = $r102;
                r172.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.ui.adapters.Main
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AccountAndSettingsOptionsAdapter $r23 = AccountAndSettingsOptionsAdapter.this;
                        SettingsOption $r32 = settingsOption;
                        AccountAndSettingsOptionsAdapter.AccountAndSettingsOptionsViewHolder.m40907bind$lambda0($r23, $r32, view);
                    }
                });
            } else {
                View $r103 = this.binding.updateAppTextView;
                Log_OC.loadImage($r103, "binding.updateAppTextView");
                View r182 = $r103;
                ViewExtKt.hide$default(r182, false, 1, null);
            }
            ViewGroup $r43 = this.binding.getRoot();
            final AccountAndSettingsOptionsAdapter $r112 = this.this$0;
            ViewGroup r163 = $r43;
            r163.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.ui.adapters.d
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AccountAndSettingsOptionsAdapter $r23 = AccountAndSettingsOptionsAdapter.this;
                    SettingsOption $r32 = settingsOption;
                    AccountAndSettingsOptionsAdapter.AccountAndSettingsOptionsViewHolder.m40908bind$lambda1($r23, $r32, view);
                }
            });
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AccountAndSettingsOptionsAdapter() {
        ArrayList $r1 = new ArrayList();
        this.settingsList = $r1;
        AccountAndSettingsOptionsAdapter$onItemClickListener$1 $r2 = AccountAndSettingsOptionsAdapter$onItemClickListener$1.INSTANCE;
        this.onItemClickListener = $r2;
        AccountAndSettingsOptionsAdapter$onUpdateAppClicked$1 $r3 = AccountAndSettingsOptionsAdapter$onUpdateAppClicked$1.INSTANCE;
        this.onUpdateAppClicked = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.settingsList;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getOnItemClickListener() {
        InterfaceC11767l r1 = this.onItemClickListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getOnUpdateAppClicked() {
        InterfaceC11767l r1 = this.onUpdateAppClicked;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(AccountAndSettingsOptionsViewHolder accountAndSettingsOptionsViewHolder, int i) {
        Log_OC.getArray(accountAndSettingsOptionsViewHolder, "holder");
        List $r3 = this.settingsList;
        Object $r2 = $r3.get(i);
        SettingsOption $r4 = (SettingsOption) $r2;
        accountAndSettingsOptionsViewHolder.bind($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(AccountAndSettingsOptionsViewHolder accountAndSettingsOptionsViewHolder, int i) {
        AccountAndSettingsOptionsViewHolder $r2 = accountAndSettingsOptionsViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public AccountAndSettingsOptionsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        SettingsOptionsItemBinding $r5 = SettingsOptionsItemBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(LayoutInflater.from(parent.context), parent, false)");
        AccountAndSettingsOptionsViewHolder $r2 = new AccountAndSettingsOptionsViewHolder(this, $r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ AccountAndSettingsOptionsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        AccountAndSettingsOptionsViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setData(List list) {
        Log_OC.getArray(list, TransactionBreakDownItemType.DATA);
        List $r2 = this.settingsList;
        $r2.clear();
        List $r22 = this.settingsList;
        $r22.addAll(list);
        notifyDataSetChanged();
    }

    public final void setOnItemClickListener(InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(interfaceC11767l, "<set-?>");
        this.onItemClickListener = interfaceC11767l;
    }

    public final void setOnUpdateAppClicked(InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(interfaceC11767l, "<set-?>");
        this.onUpdateAppClicked = interfaceC11767l;
    }
}
