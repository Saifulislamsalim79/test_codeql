package ai.kudi.agent.wallettopup.adapters;

import ai.kudi.agent.core.util.RandomUtilKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.LayoutKtaItemBinding;
import ai.kudi.agent.wallettopup.data.MonnifyDetails;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: KtaAccoutsAdapter.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/wallettopup/adapters/KtaAccountViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lai/kudi/agent/databinding/LayoutKtaItemBinding;", "(Lai/kudi/agent/databinding/LayoutKtaItemBinding;)V", "bind", "", "accountData", "Lai/kudi/agent/wallettopup/data/MonnifyDetails$AccountData;", "hideView", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KtaAccountViewHolder extends RecyclerView.AbstractC1620e0 {
    private final LayoutKtaItemBinding binding;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public KtaAccountViewHolder(ai.kudi.agent.databinding.LayoutKtaItemBinding r5) {
        /*
            r4 = this;
            java.lang.String r0 = "binding"
            kotlin.p483e0.p485d.Log_OC.getArray(r5, r0)
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.getRoot()
            r3 = r1
            android.view.View r3 = (android.view.View) r3
            r2 = r3
            r4.<init>(r2)
            r4.binding = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.wallettopup.adapters.KtaAccountViewHolder.<init>(ai.kudi.agent.databinding.LayoutKtaItemBinding):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: bind$lambda-0  reason: not valid java name */
    public static final void m41745bind$lambda0(KtaAccountViewHolder ktaAccountViewHolder, MonnifyDetails.AccountData accountData, View view) {
        Log_OC.getArray(ktaAccountViewHolder, "this$0");
        Log_OC.getArray(accountData, "$accountData");
        LayoutKtaItemBinding $r3 = ktaAccountViewHolder.binding;
        ViewGroup $r4 = $r3.getRoot();
        ViewGroup r7 = $r4;
        Context $r5 = r7.getContext();
        Log_OC.loadImage($r5, "binding.root.context");
        String $r6 = accountData.getAccountNumber();
        RandomUtilKt.copyToClipboard$default($r5, $r6, null, null, 12, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void bind(final MonnifyDetails.AccountData accountData) {
        Log_OC.getArray(accountData, "accountData");
        LayoutKtaItemBinding $r2 = this.binding;
        TextView $r3 = $r2.ktaAccountNameView;
        String $r4 = accountData.getAccountName();
        $r3.setText($r4);
        LayoutKtaItemBinding $r22 = this.binding;
        TextView $r32 = $r22.ktaAccountNoView;
        String $r42 = accountData.getAccountNumber();
        $r32.setText($r42);
        LayoutKtaItemBinding $r23 = this.binding;
        TextView $r33 = $r23.ktaBankView;
        String $r43 = accountData.getBankName();
        $r33.setText($r43);
        LayoutKtaItemBinding $r24 = this.binding;
        TextView $r34 = $r24.ktaCopyView;
        $r34.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.wallettopup.adapters.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KtaAccountViewHolder $r25 = KtaAccountViewHolder.this;
                MonnifyDetails.AccountData $r35 = accountData;
                KtaAccountViewHolder.m41745bind$lambda0($r25, $r35, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void hideView() {
        LayoutKtaItemBinding $r1 = this.binding;
        View $r2 = $r1.ktaItemDivider;
        Log_OC.loadImage($r2, "binding.ktaItemDivider");
        ViewExtKt.hide$default($r2, false, 1, null);
    }
}
