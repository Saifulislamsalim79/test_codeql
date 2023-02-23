package ai.kudi.agent.product.other_bills.p018ui;

import ai.kudi.agent.bills.data.Biller;
import ai.kudi.agent.bills.data.BillerKt;
import ai.kudi.agent.bills.data.BillsData;
import ai.kudi.agent.bills.data.Product;
import ai.kudi.agent.collections.databinding.FragmentBillPaymentStepOneBinding;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.EditTextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.product.other_bills.presenter.BillPaymentStepOnePresenter;
import ai.kudi.agent.product.other_bills.views.BillPaymentStepOneView;
import ai.kudi.agent.product.p019ui.ProductActivity;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.dip.library.edittext.KudiInputField;
import ai.kudi.dip.library.p043h.DialogC0809i;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.PreferenceActivity;
import com.trello.rxlifecycle2.p190e.p191a.p192a.C7390a;
import dagger.android.p197e.C7429a;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.Object;
/* compiled from: BillPaymentStepOneFragment.kt */
@Metadata(m10422d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 L2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001LB\u0005¢\u0006\u0002\u0010\u0006J\b\u0010(\u001a\u00020\u0003H\u0016J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\"H\u0002J\u0010\u0010,\u001a\u00020*2\u0006\u0010+\u001a\u00020\"H\u0002J\u0010\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020\u001dH\u0003J\u0010\u0010/\u001a\u00020*2\u0006\u00100\u001a\u00020\u001fH\u0016J\u0019\u00101\u001a\u0002022\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u00103\u001a\u000204H\u0096\u0001J\u0010\u00105\u001a\u00020*2\u0006\u00106\u001a\u000207H\u0016J&\u00108\u001a\u0004\u0018\u0001022\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u001a\u0010?\u001a\u00020*2\u0006\u0010@\u001a\u0002022\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u0018\u0010A\u001a\u00020*2\u0006\u0010B\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020\u001dH\u0002J\t\u0010D\u001a\u00020\u0005H\u0096\u0001J\u001e\u0010\u0011\u001a\u00020*2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0016J\u0010\u0010E\u001a\u00020*2\u0006\u00100\u001a\u00020\u001fH\u0016J\u0010\u0010F\u001a\u00020*2\u0006\u0010G\u001a\u00020\u001dH\u0016J\u001a\u0010H\u001a\u00020*2\u0006\u0010I\u001a\u00020\u001d2\b\u0010J\u001a\u0004\u0018\u00010\u001dH\u0016J\u0016\u0010K\u001a\u00020*2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010#\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006M"}, m10421d2 = {"Lai/kudi/agent/product/other_bills/ui/BillPaymentStepOneFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/product/other_bills/views/BillPaymentStepOneView;", "Lai/kudi/agent/product/other_bills/presenter/BillPaymentStepOnePresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/collections/databinding/FragmentBillPaymentStepOneBinding;", "()V", TransactionField.AMOUNT, "", "getAmount", "()I", "setAmount", "(I)V", BillPaymentStepOneFragment.BILLER_PARAM, "Lai/kudi/agent/bills/data/Biller;", "getBiller", "()Lai/kudi/agent/bills/data/Biller;", "setBiller", "(Lai/kudi/agent/bills/data/Biller;)V", "billsData", "Lai/kudi/agent/bills/data/BillsData;", "getBillsData", "()Lai/kudi/agent/bills/data/BillsData;", "setBillsData", "(Lai/kudi/agent/bills/data/BillsData;)V", "binding", "getBinding", "()Lai/kudi/agent/collections/databinding/FragmentBillPaymentStepOneBinding;", "lastSelectedStatus", "", "lookUpDone", "", "products", "", "Lai/kudi/agent/bills/data/Product;", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/product/other_bills/presenter/BillPaymentStepOnePresenter;", "setThisPresenter", "(Lai/kudi/agent/product/other_bills/presenter/BillPaymentStepOnePresenter;)V", "createPresenter", "handleBillersWithNoTypes", "", "product", "handleElectricityBiller", "handleNameLookUp", "fieldName", "hideLoading", "isMainLoader", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "performLookup", "customerID", "productId", "requireBinding", "showLoading", "showLookUpFailed", "errorMessage", "showLookUpResult", "name", "address", "showProducts", "Companion", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.product.other_bills.ui.BillPaymentStepOneFragment */
/* loaded from: classes.dex */
public final class BillPaymentStepOneFragment extends AbstractC9412c<BillPaymentStepOneView, BillPaymentStepOnePresenter> implements BillPaymentStepOneView, BaseViewBinder<FragmentBillPaymentStepOneBinding> {
    public static final String BILLER_PARAM = "biller";
    public static final Companion Companion;
    public static final String EMAIL = "email";
    private final /* synthetic */ BaseViewBinderImpl<FragmentBillPaymentStepOneBinding> $$delegate_0;
    private int amount;
    public Biller biller;
    private BillsData billsData;
    private String lastSelectedStatus;
    private boolean lookUpDone;
    private List<Product> products;
    public BillPaymentStepOnePresenter thisPresenter;

    /* compiled from: BillPaymentStepOneFragment.kt */
    @Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/product/other_bills/ui/BillPaymentStepOneFragment$Companion;", "", "()V", "BILLER_PARAM", "", "EMAIL", "newInstance", "Lai/kudi/agent/product/other_bills/ui/BillPaymentStepOneFragment;", BillPaymentCustomerDetailsFragment.BILLER_PARAM, "Lai/kudi/agent/bills/data/BillsData;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.product.other_bills.ui.BillPaymentStepOneFragment$Companion */
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
        public final BillPaymentStepOneFragment newInstance(BillsData billsData) {
            Log_OC.getArray(billsData, BillPaymentCustomerDetailsFragment.BILLER_PARAM);
            BillPaymentStepOneFragment r4 = new BillPaymentStepOneFragment();
            Bundle r5 = new Bundle();
            r5.putParcelable(BillPaymentStepOneFragment.BILLER_PARAM, billsData);
            BillPaymentStepOneFragment r6 = r4;
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
    public BillPaymentStepOneFragment() {
        List $r1;
        BaseViewBinderImpl $r2 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r2;
        this.lastSelectedStatus = "";
        $r1 = C13726r.m3891e();
        this.products = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleBillersWithNoTypes(Product product) {
        FragmentBillPaymentStepOneBinding $r2 = requireBinding();
        View $r3 = $r2.selectPlanView;
        Log_OC.loadImage($r3, "selectPlanView");
        View r8 = $r3;
        ViewExtKt.hide$default(r8, false, 1, null);
        View $r4 = $r2.continueToNextPage;
        Log_OC.loadImage($r4, "continueToNextPage");
        View r82 = $r4;
        ViewExtKt.show(r82);
        BillsData $r5 = getBillsData();
        if ($r5 != null) {
            Integer $r6 = product.getAmount();
            int $i0 = $r6 != null ? $r6.intValue() : 0;
            $r5.setAmount($i0);
        }
        BillsData $r52 = getBillsData();
        if ($r52 != null) {
            String $r7 = product.getId();
            $r52.setId($r7);
        }
        BillsData $r53 = getBillsData();
        if ($r53 == null) {
            return;
        }
        String $r72 = product.getType();
        $r53.setType($r72);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleElectricityBiller(Product product) {
        BillPaymentStepOneFragment r7 = this;
        FragmentActivity $r3 = r7.requireActivity();
        Log_OC.loadImage($r3, "requireActivity()");
        BillPaymentStepOneFragment$handleElectricityBiller$1 r5 = new BillPaymentStepOneFragment$handleElectricityBiller$1(product, this);
        Dialog r6 = new DialogC0809i($r3, r5);
        Dialog r8 = r6;
        r8.show();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleNameLookUp(final String str) {
        FragmentBillPaymentStepOneBinding $r2 = requireBinding();
        KudiInputField $r3 = $r2.smartCardNo;
        EditText $r4 = $r3.getEditText();
        AbstractC11688p $r5 = EditTextExtKt.getTextChanges($r4);
        BillPaymentStepOneFragment r10 = this;
        PreferenceActivity $r6 = r10.getViewLifecycleOwner();
        Log_OC.loadImage($r6, "viewLifecycleOwner");
        AbstractC11688p $r52 = C7390a.a($r5, $r6);
        Object object = new Object() { // from class: ai.kudi.agent.product.other_bills.ui.Contact
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                BillPaymentStepOneFragment $r1 = BillPaymentStepOneFragment.this;
                String $r22 = str;
                CharSequence $r42 = (CharSequence) obj;
                BillPaymentStepOneFragment.m40204handleNameLookUp$lambda6($r1, $r22, $r42);
            }
        };
        Function $r8 = Function.LEN;
        $r52.e0(object, $r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: handleNameLookUp$lambda-6  reason: not valid java name */
    public static final void m40204handleNameLookUp$lambda6(BillPaymentStepOneFragment billPaymentStepOneFragment, String str, CharSequence charSequence) {
        Log_OC.getArray(billPaymentStepOneFragment, "this$0");
        Log_OC.getArray(str, "$fieldName");
        boolean $z0 = Log_OC.append(str, BillerKt.NAMEPROMPT_NA);
        boolean $z02 = $z0;
        billPaymentStepOneFragment.lookUpDone = $z02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleNameLookUp$lambda-7  reason: not valid java name */
    public static final void m40205handleNameLookUp$lambda7(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-0  reason: not valid java name */
    public static final void m40206onViewCreated$lambda5$lambda0(FragmentBillPaymentStepOneBinding fragmentBillPaymentStepOneBinding) {
        Log_OC.getArray(fragmentBillPaymentStepOneBinding, "$this_apply");
        KudiInputField $r2 = fragmentBillPaymentStepOneBinding.smartCardNo;
        EditText $r0 = $r2.getEditText();
        $r0.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-2  reason: not valid java name */
    public static final void m40207onViewCreated$lambda5$lambda2(String str, FragmentBillPaymentStepOneBinding fragmentBillPaymentStepOneBinding, BillPaymentStepOneFragment billPaymentStepOneFragment, View view) {
        boolean $z0;
        Log_OC.getArray(fragmentBillPaymentStepOneBinding, "$this_apply");
        Log_OC.getArray(billPaymentStepOneFragment, "this$0");
        boolean $z02 = Log_OC.append(str, BillerKt.NAMEPROMPT_NA);
        if (!$z02) {
            KudiInputField $r4 = fragmentBillPaymentStepOneBinding.smartCardNo;
            $z0 = C13276s.m5440u($r4.getText());
            if ($z0) {
                KudiInputField $r42 = fragmentBillPaymentStepOneBinding.smartCardNo;
                $r42.setError("This field cannot be empty");
                return;
            }
        }
        BillsData $r5 = billPaymentStepOneFragment.getBillsData();
        if ($r5 != null) {
            KudiInputField $r43 = fragmentBillPaymentStepOneBinding.smartCardNo;
            $r5.setCustomerBillerId($r43.getText());
        }
        if ($r5 != null) {
            KudiInputField $r44 = fragmentBillPaymentStepOneBinding.selectPlanView;
            $r5.setPlan($r44.getText());
        }
        if ($r5 != null) {
            AppCompatTextView $r6 = fragmentBillPaymentStepOneBinding.customerNameView;
            CharSequence $r7 = $r6.getText();
            $r5.setAccountName($r7.toString());
        }
        BillsData $r52 = billPaymentStepOneFragment.getBillsData();
        String $r8 = $r52 == null ? null : $r52.getCustomerBillerId();
        if ($r8 == null) {
            $r8 = "";
        }
        BillsData $r53 = billPaymentStepOneFragment.getBillsData();
        String $r1 = $r53 != null ? $r53.getId() : null;
        String $r9 = $r1 != null ? $r1 : "";
        billPaymentStepOneFragment.performLookup($r8, $r9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-4$lambda-3  reason: not valid java name */
    public static final void m40208onViewCreated$lambda5$lambda4$lambda3(BillPaymentStepOneFragment billPaymentStepOneFragment, View view) {
        Log_OC.getArray(billPaymentStepOneFragment, "this$0");
        BillPaymentStepOneFragment r4 = billPaymentStepOneFragment;
        FragmentActivity $r1 = r4.getActivity();
        if ($r1 != null) {
            ContextExtKt.hideKeyboard($r1);
        }
        List $r3 = billPaymentStepOneFragment.products;
        billPaymentStepOneFragment.showProducts($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void performLookup(String str, String str2) {
        if (!this.lookUpDone) {
            BillPaymentStepOnePresenter $r3 = getThisPresenter();
            $r3.performLookup(str, str2);
            return;
        }
        BillPaymentStepOneFragment r9 = this;
        FragmentActivity $r4 = r9.getActivity();
        if ($r4 != null) {
            ContextExtKt.hideKeyboard($r4);
        }
        BillsData $r5 = this.billsData;
        boolean $z0 = false;
        if ($r5 != null) {
            int $i0 = $r5.getAmount();
            if ($i0 == 0) {
                $z0 = true;
            }
        }
        if ($z0) {
            BillPaymentStepOneFragment r92 = this;
            FragmentActivity $r42 = r92.getActivity();
            if ($r42 == null) {
                NullPointerException r8 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.product.ui.ProductActivity");
                throw r8;
            }
            ProductActivity $r6 = (ProductActivity) $r42;
            BillsData $r52 = this.billsData;
            Log_OC.append($r52);
            $r6.toAmountView($r52);
            return;
        }
        BillPaymentStepOneFragment r93 = this;
        FragmentActivity $r43 = r93.getActivity();
        if ($r43 == null) {
            NullPointerException r82 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.product.ui.ProductActivity");
            throw r82;
        }
        ProductActivity $r62 = (ProductActivity) $r43;
        BillsData $r53 = this.billsData;
        Log_OC.append($r53);
        $r62.toStepTwoView($r53);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showProducts(List list) {
        int $i0 = list.size();
        if ($i0 == 1) {
            Object $r2 = C13722p.m3954R(list);
            Product $r3 = (Product) $r2;
            handleElectricityBiller($r3);
            return;
        }
        BillPaymentStepOneFragment r9 = this;
        FragmentActivity $r5 = r9.requireActivity();
        Log_OC.loadImage($r5, "requireActivity()");
        BillPaymentStepOneFragment$showProducts$1 r7 = new BillPaymentStepOneFragment$showProducts$1(list, this);
        Dialog r8 = new DialogC0809i($r5, r7);
        Dialog r10 = r8;
        r10.show();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public BillPaymentStepOnePresenter createPresenter() {
        BillPaymentStepOnePresenter $r1 = getThisPresenter();
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
    public final int getAmount() {
        int i0 = this.amount;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Biller getBiller() {
        Biller $r1 = this.biller;
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
    public final BillsData getBillsData() {
        BillsData r1 = this.billsData;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentBillPaymentStepOneBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentBillPaymentStepOneBinding $r3 = (FragmentBillPaymentStepOneBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentBillPaymentStepOneBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BillPaymentStepOnePresenter getThisPresenter() {
        BillPaymentStepOnePresenter $r1 = this.thisPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("thisPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.other_bills.views.BillPaymentStepOneView
    public void hideLoading(boolean z) {
        if (!z) {
            FragmentBillPaymentStepOneBinding $r4 = requireBinding();
            ProgressBar $r5 = $r4.customerNameloader;
            Log_OC.loadImage($r5, "requireBinding().customerNameloader");
            ViewExtKt.hide$default($r5, false, 1, null);
            return;
        }
        BillPaymentStepOneFragment r7 = this;
        FragmentActivity $r1 = r7.getActivity();
        if ($r1 == null) {
            NullPointerException r6 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.product.ui.ProductActivity");
            throw r6;
        }
        ProductActivity $r2 = (ProductActivity) $r1;
        $r2.hideLoader();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentBillPaymentStepOneBinding fragmentBillPaymentStepOneBinding, Fragment fragment) {
        Log_OC.getArray(fragmentBillPaymentStepOneBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentBillPaymentStepOneBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentBillPaymentStepOneBinding $r4 = (FragmentBillPaymentStepOneBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        BillPaymentStepOneFragment r2 = this;
        C7429a.m18752b(r2);
        BillPaymentStepOneFragment r22 = this;
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentBillPaymentStepOneBinding $r4 = FragmentBillPaymentStepOneBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        BillPaymentStepOneFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BillsData $r4;
        Biller $r7;
        Biller $r72;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        BillPaymentStepOneFragment r23 = this;
        Bundle $r2 = r23.getArguments();
        if ($r2 == null) {
            $r4 = null;
        } else {
            Parcelable $r5 = $r2.getParcelable(BILLER_PARAM);
            $r4 = (BillsData) $r5;
        }
        this.billsData = $r4;
        final String $r6 = ($r4 == null || ($r7 = $r4.getBiller()) == null) ? null : $r7.getNamePrompt();
        BillsData $r42 = this.billsData;
        String $r8 = ($r42 == null || ($r72 = $r42.getBiller()) == null) ? null : $r72.getPromptType();
        final FragmentBillPaymentStepOneBinding $r9 = requireBinding();
        KudiInputField $r10 = $r9.smartCardNo;
        Log_OC.append($r6);
        $r10.setHint($r6);
        boolean $z0 = Log_OC.append($r8, "email");
        if ($z0) {
            KudiInputField $r102 = $r9.smartCardNo;
            $r102.getInputEditText().setInputType(32);
            KudiInputField $r103 = $r9.smartCardNo;
            $r103.setMaxLength(100);
        }
        boolean $z02 = Log_OC.append($r6, BillerKt.NAMEPROMPT_NA);
        if ($z02) {
            View $r104 = $r9.smartCardNo;
            Log_OC.loadImage($r104, "smartCardNo");
            View $r1 = $r104;
            ViewExtKt.hide$default($r1, false, 1, null);
            View $r12 = $r9.customerNameView;
            Log_OC.loadImage($r12, "customerNameView");
            View $r13 = $r12;
            ViewExtKt.hide$default($r13, false, 1, null);
            this.lookUpDone = true;
        }
        Handler r19 = new Handler();
        r19.postDelayed(new Runnable() { // from class: ai.kudi.agent.product.other_bills.ui.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                FragmentBillPaymentStepOneBinding $r14 = FragmentBillPaymentStepOneBinding.this;
                BillPaymentStepOneFragment.m40206onViewCreated$lambda5$lambda0($r14);
            }
        }, 200L);
        BillsData $r43 = getBillsData();
        Biller $r3 = $r43 != null ? $r43.getBiller() : null;
        Log_OC.append($r3);
        setBiller($r3);
        BillPaymentStepOnePresenter $r15 = getThisPresenter();
        $r15.fetchProductsForBiller(getBiller());
        ViewGroup $r16 = $r9.continueToNextPage;
        ViewGroup r24 = $r16;
        r24.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.product.other_bills.ui.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String $r22 = $r6;
                FragmentBillPaymentStepOneBinding $r32 = $r9;
                BillPaymentStepOneFragment $r44 = this;
                BillPaymentStepOneFragment.m40207onViewCreated$lambda5$lambda2($r22, $r32, $r44, view2);
            }
        });
        KudiInputField $r105 = $r9.selectPlanView;
        EditText $r11 = $r105.getEditText();
        $r11.setFocusable(false);
        $r11.setClickable(true);
        $r11.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.product.other_bills.ui.SearchResultsFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BillPaymentStepOneFragment $r22 = BillPaymentStepOneFragment.this;
                BillPaymentStepOneFragment.m40208onViewCreated$lambda5$lambda4$lambda3($r22, view2);
            }
        });
        handleNameLookUp($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentBillPaymentStepOneBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentBillPaymentStepOneBinding $r3 = (FragmentBillPaymentStepOneBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentBillPaymentStepOneBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setAmount(int i) {
        this.amount = i;
    }

    public final void setBiller(Biller biller) {
        Log_OC.getArray(biller, "<set-?>");
        this.biller = biller;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.other_bills.views.BillPaymentStepOneView
    public void setBiller(Biller biller, List list) {
        Log_OC.getArray(biller, BILLER_PARAM);
        Log_OC.getArray(list, "products");
        setBiller(biller);
        this.products = list;
        FragmentBillPaymentStepOneBinding $r3 = requireBinding();
        String $r4 = biller.getHeader();
        Locale $r5 = Locale.ENGLISH;
        Log_OC.loadImage($r5, "ENGLISH");
        if ($r4 == null) {
            NullPointerException $r11 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
            throw $r11;
        }
        String $r42 = $r4.toLowerCase($r5);
        Log_OC.loadImage($r42, "(this as java.lang.String).toLowerCase(locale)");
        boolean $z0 = Log_OC.append($r42, "electricity");
        if ($z0) {
            KudiInputField $r6 = $r3.selectPlanView;
            $r6.setHint("Select Meter Type");
        } else {
            KudiInputField $r62 = $r3.selectPlanView;
            $r62.setHint("Select Plan");
        }
        int $i0 = list.size();
        if ($i0 == 1) {
            Object $r7 = list.get(0);
            Product $r8 = (Product) $r7;
            List $r9 = $r8.getTypes();
            Object $r72 = $r9.get(0);
            CharSequence $r10 = (CharSequence) $r72;
            int $i02 = $r10.length();
            boolean $z02 = $i02 == 0;
            if ($z02) {
                Object $r73 = list.get(0);
                Product $r82 = (Product) $r73;
                handleBillersWithNoTypes($r82);
            }
        }
    }

    public final void setBillsData(BillsData billsData) {
        this.billsData = billsData;
    }

    public final void setThisPresenter(BillPaymentStepOnePresenter billPaymentStepOnePresenter) {
        Log_OC.getArray(billPaymentStepOnePresenter, "<set-?>");
        this.thisPresenter = billPaymentStepOnePresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.other_bills.views.BillPaymentStepOneView
    public void showLoading(boolean z) {
        if (!z) {
            FragmentBillPaymentStepOneBinding $r4 = requireBinding();
            ProgressBar $r5 = $r4.customerNameloader;
            Log_OC.loadImage($r5, "requireBinding().customerNameloader");
            ViewExtKt.show($r5);
            return;
        }
        BillPaymentStepOneFragment r7 = this;
        FragmentActivity $r1 = r7.getActivity();
        if ($r1 == null) {
            NullPointerException r6 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.product.ui.ProductActivity");
            throw r6;
        }
        ProductActivity $r2 = (ProductActivity) $r1;
        $r2.showLoader();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.other_bills.views.BillPaymentStepOneView
    public void showLookUpFailed(String str) {
        Log_OC.getArray(str, "errorMessage");
        BillPaymentStepOneFragment r3 = this;
        FragmentActivity $r2 = r3.getActivity();
        if ($r2 != null) {
            ContextExtKt.toast$default($r2, str, 0, 2, (Object) null);
        }
        this.lookUpDone = false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    @Override // ai.kudi.agent.product.other_bills.views.BillPaymentStepOneView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void showLookUpResult(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r0 = "name"
            kotlin.p483e0.p485d.Log_OC.getArray(r12, r0)
            ai.kudi.agent.collections.databinding.FragmentBillPaymentStepOneBinding r1 = r11.requireBinding()
            androidx.appcompat.widget.AppCompatTextView r2 = r1.customerNameView
            r4 = r2
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3 = r4
            r3.setText(r12)
            if (r13 == 0) goto L1d
            boolean r5 = kotlin.p549l0.C13265j.m5470u(r13)
            if (r5 == 0) goto L1b
            goto L1d
        L1b:
            r5 = 0
            goto L1e
        L1d:
            r5 = 1
        L1e:
            if (r5 != 0) goto L51
            androidx.appcompat.widget.AppCompatTextView r2 = r1.customerAddressView
            java.lang.String r0 = "customerAddressView"
            kotlin.p483e0.p485d.Log_OC.loadImage(r2, r0)
            r7 = r2
            android.view.View r7 = (android.view.View) r7
            r6 = r7
            ai.kudi.agent.core.util.ViewExtKt.show(r6)
            androidx.appcompat.widget.AppCompatTextView r2 = r1.customerAddressView
            r8 = r2
            android.widget.TextView r8 = (android.widget.TextView) r8
            r3 = r8
            r3.setText(r13)
            boolean r5 = ai.kudi.agent.core.util.StringExtKt.isNigerianPhoneNumber(r13)
            if (r5 == 0) goto L47
            ai.kudi.agent.bills.data.BillsData r9 = r11.getBillsData()
            if (r9 != 0) goto L44
            goto L47
        L44:
            r9.setCustomerPhoneNo(r13)
        L47:
            ai.kudi.agent.bills.data.BillsData r9 = r11.getBillsData()
            if (r9 != 0) goto L4e
            goto L51
        L4e:
            r9.setCustomerName(r12)
        L51:
            r10 = 1
            r11.lookUpDone = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.product.other_bills.p018ui.BillPaymentStepOneFragment.showLookUpResult(java.lang.String, java.lang.String):void");
    }
}
