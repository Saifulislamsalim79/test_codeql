package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.dialogs.DatePickerFragment;
import ai.kudi.agent.feature_issue_resolution.databinding.CustomerDetailsIssueFragmentBinding;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import java.io.Serializable;
import java.util.Date;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: CustomerDetailsIssueFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Landroid/view/View;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.CustomerDetailsIssueFragment$setUpViews$7 */
/* loaded from: classes.dex */
final class CustomerDetailsIssueFragment$setUpViews$7 extends AbstractC11802m implements InterfaceC11767l<View, C13666w> {
    final /* synthetic */ CustomerDetailsIssueFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerDetailsIssueFragment$setUpViews$7(CustomerDetailsIssueFragment customerDetailsIssueFragment) {
        super(1);
        this.this$0 = customerDetailsIssueFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m39468invoke$lambda0(CustomerDetailsIssueFragment customerDetailsIssueFragment, String str, Bundle bundle) {
        Log_OC.getArray(customerDetailsIssueFragment, "this$0");
        Log_OC.getArray(str, "requestKey");
        Log_OC.getArray(bundle, "result");
        boolean $z0 = Log_OC.append(str, DatePickerFragment.DATE_SET_KEY);
        if ($z0) {
            Serializable $r3 = bundle.getSerializable(DatePickerFragment.DATE_KEY);
            if ($r3 == null) {
                NullPointerException $r8 = new NullPointerException("null cannot be cast to non-null type java.util.Date");
                throw $r8;
            }
            Date $r4 = (Date) $r3;
            String $r1 = DateExtKt.convertDateToGivenFormat$default($r4, null, 2, null);
            InterfaceC8209a $r5 = customerDetailsIssueFragment.requireBinding();
            CustomerDetailsIssueFragmentBinding $r6 = (CustomerDetailsIssueFragmentBinding) $r5;
            KudiInputField $r7 = $r6.dateOfTransactionView;
            $r7.setText($r1);
        }
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
        CustomerDetailsIssueFragment $r2 = this.this$0;
        ContextExtKt.hideKeyboard($r2);
        DatePickerFragment.Companion $r3 = DatePickerFragment.Companion;
        DatePickerFragment $r4 = DatePickerFragment.Companion.newInstance$default($r3, true, null, false, 6, null);
        CustomerDetailsIssueFragment $r22 = this.this$0;
        FragmentManager $r5 = $r22.getChildFragmentManager();
        CustomerDetailsIssueFragment $r23 = this.this$0;
        PreferenceActivity $r6 = $r23.getViewLifecycleOwner();
        final CustomerDetailsIssueFragment $r24 = this.this$0;
        $r5.p1(DatePickerFragment.DATE_SET_KEY, $r6, new InterfaceC1523w() { // from class: ai.kudi.agent.issues.ui.FieldWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.fragment.app.InterfaceC1523w
            /* renamed from: a */
            public final void mo35611a(String str, Bundle bundle) {
                CustomerDetailsIssueFragment $r32 = CustomerDetailsIssueFragment.this;
                CustomerDetailsIssueFragment$setUpViews$7.m39468invoke$lambda0($r32, str, bundle);
            }
        });
        CustomerDetailsIssueFragment $r25 = this.this$0;
        FragmentManager $r52 = $r25.getChildFragmentManager();
        $r4.show($r52, DatePickerFragment.year);
    }
}
