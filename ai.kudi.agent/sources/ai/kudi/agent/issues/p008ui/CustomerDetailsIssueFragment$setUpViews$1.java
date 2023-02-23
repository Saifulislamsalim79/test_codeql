package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.banks.p001ui.BanksFragment;
import ai.kudi.agent.core.domain.room_entities.Bank;
import ai.kudi.agent.feature_issue_resolution.databinding.CustomerDetailsIssueFragmentBinding;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CustomerDetailsIssueFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Landroid/view/View;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.CustomerDetailsIssueFragment$setUpViews$1 */
/* loaded from: classes.dex */
public final class CustomerDetailsIssueFragment$setUpViews$1 extends AbstractC11802m implements InterfaceC11767l<View, C13666w> {
    final /* synthetic */ CustomerDetailsIssueFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CustomerDetailsIssueFragment.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/core/domain/room_entities/Bank;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.CustomerDetailsIssueFragment$setUpViews$1$1 */
    /* loaded from: classes.dex */
    public static final class C02631 extends AbstractC11802m implements InterfaceC11767l<Bank, C13666w> {
        final /* synthetic */ BanksFragment $bankFragment;
        final /* synthetic */ CustomerDetailsIssueFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02631(BanksFragment banksFragment, CustomerDetailsIssueFragment customerDetailsIssueFragment) {
            super(1);
            this.$bankFragment = banksFragment;
            this.this$0 = customerDetailsIssueFragment;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(Bank bank) {
            Bank $r2 = bank;
            invoke2($r2);
            C13666w r3 = C13666w.f30112a;
            return r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Bank bank) {
            Log_OC.getArray(bank, "it");
            BanksFragment $r2 = this.$bankFragment;
            $r2.dismiss();
            CustomerDetailsIssueFragment $r3 = this.this$0;
            $r3.selectedBank = bank;
            CustomerDetailsIssueFragment $r32 = this.this$0;
            InterfaceC8209a $r4 = $r32.requireBinding();
            CustomerDetailsIssueFragmentBinding $r5 = (CustomerDetailsIssueFragmentBinding) $r4;
            KudiInputField $r6 = $r5.customerBankView;
            String $r7 = bank.getName();
            $r6.setText($r7);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerDetailsIssueFragment$setUpViews$1(CustomerDetailsIssueFragment customerDetailsIssueFragment) {
        super(1);
        this.this$0 = customerDetailsIssueFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(View view) {
        View $r2 = view;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View view) {
        Log_OC.getArray(view, "it");
        BanksFragment.Companion $r2 = BanksFragment.Companion;
        CustomerDetailsIssueFragment $r3 = this.this$0;
        Bank $r4 = $r3.selectedBank;
        String $r5 = $r4 == null ? null : $r4.getBankCode();
        BanksFragment $r6 = $r2.newInstance($r5);
        CustomerDetailsIssueFragment $r32 = this.this$0;
        C02631 $r7 = new C02631($r6, $r32);
        $r6.setOnBankSelectedListener($r7);
        CustomerDetailsIssueFragment $r33 = this.this$0;
        FragmentManager $r8 = $r33.getChildFragmentManager();
        String $r52 = BanksFragment.class.getCanonicalName();
        $r6.show($r8, $r52);
    }
}
