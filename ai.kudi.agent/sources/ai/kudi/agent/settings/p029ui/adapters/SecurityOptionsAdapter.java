package ai.kudi.agent.settings.p029ui.adapters;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.databinding.SecurityItemsLayoutBinding;
import ai.kudi.agent.settings.data.SecurityOption;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13736w;
import kotlin.p557z.C13742z;
/* compiled from: SecurityOptionsAdapter.kt */
@Metadata(m10422d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016J\u0006\u0010\u001d\u001a\u00020\fR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m10421d2 = {"Lai/kudi/agent/settings/ui/adapters/SecurityOptionsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/settings/ui/adapters/SecurityOptionsViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "items", "", "Lai/kudi/agent/settings/data/SecurityOption;", "onClickListener", "Lkotlin/Function1;", "", "", "getOnClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnClickListener", "(Lkotlin/jvm/functions/Function1;)V", "resetSavingsPin", "securityOptionSecondaryPhone", "securityOptionTrustedDevices", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeSecondaryPhoneNumberAndTrustedDevices", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.adapters.SecurityOptionsAdapter */
/* loaded from: classes.dex */
public final class SecurityOptionsAdapter extends RecyclerView.AbstractC1623h<SecurityOptionsViewHolder> {
    private final List<SecurityOption> items;
    private InterfaceC11767l<? super String, C13666w> onClickListener;
    private final SecurityOption resetSavingsPin;
    private final SecurityOption securityOptionSecondaryPhone;
    private final SecurityOption securityOptionTrustedDevices;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SecurityOptionsAdapter(Context context) {
        List $r5;
        Log_OC.getArray(context, "context");
        String $r3 = context.getString(C0001R.string.set_secondary_phone_number);
        Log_OC.loadImage($r3, "context.getString(R.string.set_secondary_phone_number)");
        SecurityOption $r2 = new SecurityOption($r3, C0001R.C0002drawable.ic_padlock);
        this.securityOptionSecondaryPhone = $r2;
        String $r32 = context.getString(C0001R.string.trusted_devices_text);
        Log_OC.loadImage($r32, "context.getString(R.string.trusted_devices_text)");
        SecurityOption $r22 = new SecurityOption($r32, C0001R.C0002drawable.ic_phone_outline);
        this.securityOptionTrustedDevices = $r22;
        String $r33 = context.getString(C0001R.string.reset_savings_pin);
        Log_OC.loadImage($r33, "context.getString(R.string.reset_savings_pin)");
        SecurityOption $r23 = new SecurityOption($r33, C0001R.C0002drawable.ic_padlock);
        this.resetSavingsPin = $r23;
        String $r34 = context.getString(C0001R.string.reset_pin);
        Log_OC.loadImage($r34, "context.getString(R.string.reset_pin)");
        SecurityOption $r24 = new SecurityOption($r34, C0001R.C0002drawable.ic_padlock);
        SecurityOption $r25 = this.resetSavingsPin;
        SecurityOption $r26 = this.securityOptionSecondaryPhone;
        SecurityOption $r27 = this.securityOptionTrustedDevices;
        SecurityOption[] $r4 = {$r24, $r25, $r26, $r27};
        $r5 = C13726r.m3888h($r4);
        this.items = $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    public static final void m40911onBindViewHolder$lambda0(SecurityOptionsAdapter securityOptionsAdapter, SecurityOption securityOption, View view) {
        Log_OC.getArray(securityOptionsAdapter, "this$0");
        Log_OC.getArray(securityOption, "$securityOption");
        InterfaceC11767l $r3 = securityOptionsAdapter.getOnClickListener();
        if ($r3 == null) {
            return;
        }
        String $r4 = securityOption.getTitle();
        $r3.invoke($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.items;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getOnClickListener() {
        InterfaceC11767l r1 = this.onClickListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(SecurityOptionsViewHolder securityOptionsViewHolder, int i) {
        Log_OC.getArray(securityOptionsViewHolder, "holder");
        List $r2 = this.items;
        Object $r3 = $r2.get(i);
        final SecurityOption $r4 = (SecurityOption) $r3;
        securityOptionsViewHolder.setData($r4);
        SecurityItemsLayoutBinding $r5 = securityOptionsViewHolder.getBinding();
        ViewGroup $r6 = $r5.getRoot();
        ViewGroup r9 = $r6;
        r9.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.ui.adapters.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SecurityOptionsAdapter $r22 = SecurityOptionsAdapter.this;
                SecurityOption $r32 = $r4;
                SecurityOptionsAdapter.m40911onBindViewHolder$lambda0($r22, $r32, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(SecurityOptionsViewHolder securityOptionsViewHolder, int i) {
        SecurityOptionsViewHolder $r2 = securityOptionsViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public SecurityOptionsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        SecurityItemsLayoutBinding $r5 = SecurityItemsLayoutBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(\n                LayoutInflater.from(parent.context),\n                parent, false\n            )");
        SecurityOptionsViewHolder $r2 = new SecurityOptionsViewHolder($r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ SecurityOptionsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        SecurityOptionsViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void removeSecondaryPhoneNumberAndTrustedDevices() {
        List $r2;
        List $r22 = this.items;
        $r2 = C13742z.m3823D0($r22);
        C0551xc9482f70 $r1 = new C0551xc9482f70(this);
        C13736w.m3846z($r2, $r1);
    }

    public final void setOnClickListener(InterfaceC11767l interfaceC11767l) {
        this.onClickListener = interfaceC11767l;
    }
}
