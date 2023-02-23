package ai.kudi.agent.settings.p029ui.adapters;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.domain.room_entities.KycLevelsModel;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.KycViewBinding;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
/* compiled from: AboutKycAdapter.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/settings/ui/adapters/AboutKycAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/settings/ui/adapters/AboutKycAdapter$AboutKycViewHolder;", "kycList", "", "Lai/kudi/agent/core/domain/room_entities/KycLevelsModel;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "AboutKycViewHolder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.adapters.AboutKycAdapter */
/* loaded from: classes.dex */
public final class AboutKycAdapter extends RecyclerView.AbstractC1623h<AboutKycViewHolder> {
    private final List<KycLevelsModel> kycList;

    /* compiled from: AboutKycAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/settings/ui/adapters/AboutKycAdapter$AboutKycViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lai/kudi/agent/databinding/KycViewBinding;", "(Lai/kudi/agent/settings/ui/adapters/AboutKycAdapter;Lai/kudi/agent/databinding/KycViewBinding;)V", "bind", "", "kycLevelsModel", "Lai/kudi/agent/core/domain/room_entities/KycLevelsModel;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.ui.adapters.AboutKycAdapter$AboutKycViewHolder */
    /* loaded from: classes.dex */
    public final class AboutKycViewHolder extends RecyclerView.AbstractC1620e0 {
        private final KycViewBinding binding;
        final /* synthetic */ AboutKycAdapter this$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public AboutKycViewHolder(ai.kudi.agent.settings.p029ui.adapters.AboutKycAdapter r5, ai.kudi.agent.databinding.KycViewBinding r6) {
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
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.p029ui.adapters.AboutKycAdapter.AboutKycViewHolder.<init>(ai.kudi.agent.settings.ui.adapters.AboutKycAdapter, ai.kudi.agent.databinding.KycViewBinding):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void bind(KycLevelsModel kycLevelsModel) {
            String $r7;
            Log_OC.getArray(kycLevelsModel, "kycLevelsModel");
            ViewGroup $r3 = this.binding.getRoot();
            ViewGroup r12 = $r3;
            Context $r4 = r12.getContext();
            KycViewBinding $r2 = this.binding;
            View $r5 = $r2.view5;
            Log_OC.loadImage($r5, "view5");
            ViewExtKt.hide($r5, true);
            TextView $r6 = $r2.kycLevelTextView;
            String $r72 = kycLevelsModel.getKycLevel();
            $r7 = C13276s.m5451A($r72, "_", " ", false, 4, null);
            $r6.setText($r7);
            TextView $r62 = $r2.walletTopUpLimitView;
            Object[] $r8 = new Object[1];
            String $r9 = kycLevelsModel.getMonthlyWalletTopUpLimit();
            String $r10 = $r9 == null ? null : StringExtKt.formatAmount($r9);
            if ($r10 == null) {
                $r10 = "";
            }
            $r8[0] = $r10;
            $r62.setText($r4.getString(C0001R.string.kyc_wallet_top_up_limit, $r8));
            TextView $r63 = $r2.transferLimitView;
            Object[] $r82 = new Object[1];
            BigDecimal $r11 = kycLevelsModel.getMonthlyTransferLimit();
            String $r102 = $r11 == null ? null : StringExtKt.formatAmount($r11);
            if ($r102 == null) {
                $r102 = "";
            }
            $r82[0] = $r102;
            $r63.setText($r4.getString(C0001R.string.kyc_monthly_transfer_limit, $r82));
            TextView $r64 = $r2.transferWidthrawalLimit;
            Object[] $r83 = new Object[1];
            BigDecimal $r112 = kycLevelsModel.getMonthlyWithdrawalLimit();
            String $r73 = $r112 != null ? StringExtKt.formatAmount($r112) : null;
            $r83[0] = $r73 != null ? $r73 : "";
            String $r74 = $r4.getString(C0001R.string.kyc_monthly_withdrawal_limit, $r83);
            $r64.setText($r74);
            TextView $r65 = $r2.cashoutView;
            String $r75 = $r4.getString(C0001R.string.kyc_cashout_text);
            $r65.setText($r75);
        }
    }

    public AboutKycAdapter(List list) {
        Log_OC.getArray(list, "kycList");
        this.kycList = list;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.kycList;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(AboutKycViewHolder aboutKycViewHolder, int i) {
        Log_OC.getArray(aboutKycViewHolder, "holder");
        List $r3 = this.kycList;
        Object $r2 = $r3.get(i);
        KycLevelsModel $r4 = (KycLevelsModel) $r2;
        aboutKycViewHolder.bind($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(AboutKycViewHolder aboutKycViewHolder, int i) {
        AboutKycViewHolder $r2 = aboutKycViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public AboutKycViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        KycViewBinding $r5 = KycViewBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(\n                LayoutInflater.from(parent.context),\n                parent,\n                false\n            )");
        AboutKycViewHolder $r2 = new AboutKycViewHolder(this, $r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ AboutKycViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        AboutKycViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }
}
