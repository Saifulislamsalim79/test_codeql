package ai.kudi.agent.product.other_bills.p018ui;

import ai.kudi.agent.bills.data.BillsData;
import ai.kudi.agent.collections.databinding.FragmentBillPaymentCustomerBinding;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.product.other_bills.presenter.BillPaymentStepTwoPresenter;
import ai.kudi.agent.product.other_bills.views.BillPaymentStepTwoView;
import ai.kudi.agent.product.p019ui.ProductActivity;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import dagger.android.p197e.C7429a;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: BillPaymentCustomerDetailsFragment.kt */
@Metadata(m10422d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001-B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001bH\u0096\u0001J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J$\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\t\u0010(\u001a\u00020\u0005H\u0096\u0001J\b\u0010)\u001a\u00020\u0017H\u0016J\u0010\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020,H\u0016R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006."}, m10421d2 = {"Lai/kudi/agent/product/other_bills/ui/BillPaymentCustomerDetailsFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/product/other_bills/views/BillPaymentStepTwoView;", "Lai/kudi/agent/product/other_bills/presenter/BillPaymentStepTwoPresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/collections/databinding/FragmentBillPaymentCustomerBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/collections/databinding/FragmentBillPaymentCustomerBinding;", BillPaymentCustomerDetailsFragment.BILLER_PARAM, "Lai/kudi/agent/bills/data/BillsData;", "getCableData", "()Lai/kudi/agent/bills/data/BillsData;", "setCableData", "(Lai/kudi/agent/bills/data/BillsData;)V", "stepTwoPresenter", "getStepTwoPresenter", "()Lai/kudi/agent/product/other_bills/presenter/BillPaymentStepTwoPresenter;", "setStepTwoPresenter", "(Lai/kudi/agent/product/other_bills/presenter/BillPaymentStepTwoPresenter;)V", "createPresenter", "hideLoader", "", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "requireBinding", "showLoader", "showPhoneNumberError", MetricTracker.Object.MESSAGE, "", "Companion", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.product.other_bills.ui.BillPaymentCustomerDetailsFragment */
/* loaded from: classes.dex */
public final class BillPaymentCustomerDetailsFragment extends AbstractC9412c<BillPaymentStepTwoView, BillPaymentStepTwoPresenter> implements BillPaymentStepTwoView, BaseViewBinder<FragmentBillPaymentCustomerBinding> {
    public static final String BILLER_PARAM = "cableData";
    public static final Companion Companion;
    private final /* synthetic */ BaseViewBinderImpl<FragmentBillPaymentCustomerBinding> $$delegate_0;
    public BillsData cableData;
    public BillPaymentStepTwoPresenter stepTwoPresenter;

    /* compiled from: BillPaymentCustomerDetailsFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/product/other_bills/ui/BillPaymentCustomerDetailsFragment$Companion;", "", "()V", "BILLER_PARAM", "", "newInstance", "Lai/kudi/agent/product/other_bills/ui/BillPaymentCustomerDetailsFragment;", BillPaymentCustomerDetailsFragment.BILLER_PARAM, "Lai/kudi/agent/bills/data/BillsData;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.product.other_bills.ui.BillPaymentCustomerDetailsFragment$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final BillPaymentCustomerDetailsFragment newInstance(BillsData billsData) {
            Log_OC.getArray(billsData, BillPaymentCustomerDetailsFragment.BILLER_PARAM);
            BillPaymentCustomerDetailsFragment r4 = new BillPaymentCustomerDetailsFragment();
            Bundle r5 = new Bundle();
            r5.putParcelable(BillPaymentCustomerDetailsFragment.BILLER_PARAM, billsData);
            BillPaymentCustomerDetailsFragment r6 = r4;
            r6.setArguments(r5);
            return r4;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BillPaymentCustomerDetailsFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-4$lambda-2  reason: not valid java name */
    public static final void m40202onViewCreated$lambda4$lambda2(BillPaymentCustomerDetailsFragment billPaymentCustomerDetailsFragment, View view) {
        Log_OC.getArray(billPaymentCustomerDetailsFragment, "this$0");
        BillPaymentCustomerDetailsFragment r6 = billPaymentCustomerDetailsFragment;
        FragmentActivity $r0 = r6.getActivity();
        if ($r0 == null) {
            NullPointerException r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.product.ui.ProductActivity");
            throw r5;
        }
        ProductActivity $r3 = (ProductActivity) $r0;
        $r3.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-4$lambda-3  reason: not valid java name */
    public static final void m40203onViewCreated$lambda4$lambda3(BillPaymentCustomerDetailsFragment billPaymentCustomerDetailsFragment, FragmentBillPaymentCustomerBinding fragmentBillPaymentCustomerBinding, View view) {
        Log_OC.getArray(billPaymentCustomerDetailsFragment, "this$0");
        Log_OC.getArray(fragmentBillPaymentCustomerBinding, "$this_apply");
        BillPaymentCustomerDetailsFragment r7 = billPaymentCustomerDetailsFragment;
        ContextExtKt.hideKeyboard(r7);
        BillsData $r3 = billPaymentCustomerDetailsFragment.getCableData();
        KudiInputField $r4 = fragmentBillPaymentCustomerBinding.fullNameView;
        String $r5 = $r4.getText();
        $r3.setCustomerName($r5);
        BillsData $r32 = billPaymentCustomerDetailsFragment.getCableData();
        KudiInputField $r42 = fragmentBillPaymentCustomerBinding.phoneNoView;
        String $r52 = $r42.getText();
        $r32.setCustomerPhoneNo($r52);
        BillPaymentStepTwoPresenter $r6 = billPaymentCustomerDetailsFragment.getStepTwoPresenter();
        BillsData $r33 = billPaymentCustomerDetailsFragment.getCableData();
        $r6.performFeesLookup($r33);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public BillPaymentStepTwoPresenter createPresenter() {
        BillPaymentStepTwoPresenter $r1 = getStepTwoPresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public /* bridge */ /* synthetic */ InterfaceC9413d createPresenter() {
        InterfaceC9413d $r1 = createPresenter();
        InterfaceC9413d r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentBillPaymentCustomerBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentBillPaymentCustomerBinding $r3 = (FragmentBillPaymentCustomerBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentBillPaymentCustomerBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BillsData getCableData() {
        BillsData $r1 = this.cableData;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError(BILLER_PARAM);
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BillPaymentStepTwoPresenter getStepTwoPresenter() {
        BillPaymentStepTwoPresenter $r1 = this.stepTwoPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("stepTwoPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.other_bills.views.BillPaymentStepTwoView
    public void hideLoader() {
        FragmentBillPaymentCustomerBinding $r1 = requireBinding();
        KudiButton $r2 = $r1.continueButton;
        $r2.m38033e();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentBillPaymentCustomerBinding fragmentBillPaymentCustomerBinding, Fragment fragment) {
        Log_OC.getArray(fragmentBillPaymentCustomerBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentBillPaymentCustomerBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentBillPaymentCustomerBinding $r4 = (FragmentBillPaymentCustomerBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        BillPaymentCustomerDetailsFragment r2 = this;
        C7429a.m18752b(r2);
        BillPaymentCustomerDetailsFragment r22 = this;
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentBillPaymentCustomerBinding $r4 = FragmentBillPaymentCustomerBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        BillPaymentCustomerDetailsFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r32, android.os.Bundle r33) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.product.other_bills.p018ui.BillPaymentCustomerDetailsFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentBillPaymentCustomerBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentBillPaymentCustomerBinding $r3 = (FragmentBillPaymentCustomerBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentBillPaymentCustomerBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setCableData(BillsData billsData) {
        Log_OC.getArray(billsData, "<set-?>");
        this.cableData = billsData;
    }

    public final void setStepTwoPresenter(BillPaymentStepTwoPresenter billPaymentStepTwoPresenter) {
        Log_OC.getArray(billPaymentStepTwoPresenter, "<set-?>");
        this.stepTwoPresenter = billPaymentStepTwoPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.other_bills.views.BillPaymentStepTwoView
    public void showLoader() {
        FragmentBillPaymentCustomerBinding $r1 = requireBinding();
        KudiButton $r2 = $r1.continueButton;
        $r2.m38032f();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.other_bills.views.BillPaymentStepTwoView
    public void showPhoneNumberError(String str) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        FragmentBillPaymentCustomerBinding $r2 = requireBinding();
        KudiInputField $r3 = $r2.phoneNoView;
        $r3.setError(str);
    }
}
