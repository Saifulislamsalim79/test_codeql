package ai.kudi.agent.product.p019ui;

import ai.kudi.agent.bills.data.BillsData;
import ai.kudi.agent.collections.R$color;
import ai.kudi.agent.collections.R$drawable;
import ai.kudi.agent.collections.R$string;
import ai.kudi.agent.collections.databinding.FragmentProductSummaryBinding;
import ai.kudi.agent.common_screens.success_screen.fragment.SuccessScreenDialogFragment;
import ai.kudi.agent.common_screens.success_screen.labs.SuccessScreenCustomOption;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.CustomDialog;
import ai.kudi.agent.core.util.FragmentExtensionKt;
import ai.kudi.agent.core.util.LocationUtil;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.product.airtime_data.data.AirtimePurchase;
import ai.kudi.agent.product.airtime_data.data.DataPurchase;
import ai.kudi.agent.product.airtime_data.data.Networks;
import ai.kudi.agent.product.airtime_data.data.Plan;
import ai.kudi.agent.product.airtime_data.data.ProductPurchase;
import ai.kudi.agent.product.airtime_data.p017ui.AirtimeAmountFragment;
import ai.kudi.agent.product.airtime_data.p017ui.AirtimeTopUpFragment;
import ai.kudi.agent.product.presenter.ProductSummaryPresenter;
import ai.kudi.agent.product.view.ProductSummaryView;
import ai.kudi.agent.transactions.TransactionStatus;
import ai.kudi.agent.transactions.TransactionStatusType;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.transactionstatus.summary.adapter.SummaryAdapter;
import ai.kudi.agent.transactionstatus.summary.model.SummaryModel;
import ai.kudi.dip.library.button.KudiButton;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import androidx.recyclerview.widget.C1723k;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.location.C4107a;
import com.google.android.gms.location.C4109b;
import dagger.android.p197e.C7429a;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.C13287o;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.C11780a0;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: ProductSummaryFragment.kt */
@Metadata(m10422d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 I2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001IB\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002J\"\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\b\u0010 \u001a\u00020\u001aH\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%H\u0002J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010'\u001a\u00020(H\u0002J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010'\u001a\u00020*H\u0002JT\u0010+\u001a\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001c0,2\u0006\u0010-\u001a\u00020.2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001e2\b\u0010/\u001a\u0004\u0018\u00010\u0017H\u0002JT\u00100\u001a\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001c0,2\u0006\u0010-\u001a\u00020.2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001e2\b\u0010/\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u00101\u001a\u00020\u001aH\u0016J\u0019\u00102\u001a\u0002032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u00104\u001a\u000205H\u0096\u0001J,\u00106\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010/\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\u001c\u00107\u001a\u00020\u001a2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u00108\u001a\u00020\u0017H\u0002J\u0012\u00109\u001a\u00020\u001a2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u0010\u0010<\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020>H\u0016J$\u0010?\u001a\u0002032\u0006\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010C2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010D\u001a\u00020\u001aH\u0016J\b\u0010E\u001a\u00020\u001aH\u0002J\t\u0010F\u001a\u00020\u0005H\u0096\u0001J\u0012\u0010G\u001a\u00020\u001a2\b\u0010/\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010H\u001a\u00020\u001aH\u0016R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, m10421d2 = {"Lai/kudi/agent/product/ui/ProductSummaryFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/product/view/ProductSummaryView;", "Lai/kudi/agent/product/presenter/ProductSummaryPresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/collections/databinding/FragmentProductSummaryBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/collections/databinding/FragmentProductSummaryBinding;", "locationTracker", "Lai/kudi/agent/core/util/LocationUtil;", "productPurchase", "Lai/kudi/agent/product/airtime_data/data/ProductPurchase;", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/product/presenter/ProductSummaryPresenter;", "setThisPresenter", "(Lai/kudi/agent/product/presenter/ProductSummaryPresenter;)V", "transactionType", "Lai/kudi/agent/transactions/TransactionStatusType;", "createPresenter", "decideActionButtonText", "", "transactionReference", "displayFeedBack", "", "successScreenCustomOption", "Lai/kudi/agent/common_screens/success_screen/dto/SuccessScreenCustomOption;", "action", "Lkotlin/Function0;", "displayLocationAwareness", "displayLocationNotification", "getBillPurchaseSummary", "Ljava/util/ArrayList;", "Lai/kudi/agent/transactionstatus/summary/model/SummaryModel;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/bills/data/BillsData;", "getDataPurchaseSummary", "payload", "Lai/kudi/agent/product/airtime_data/data/DataPurchase;", "getPurchaseSummary", "Lai/kudi/agent/product/airtime_data/data/AirtimePurchase;", "handleAirtimeAndData", "Lkotlin/Pair;", TransactionField.STATUS, "Lai/kudi/agent/transactions/TransactionStatus;", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "handleOtherTransactionTypes", "hideLoading", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "navigateToTransactionStatusPage", "onActionButtonClicked", "extraMode", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "pinConfirmationDialog", "requestLocation", "requireBinding", "showError", "showLoading", "Companion", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.product.ui.ProductSummaryFragment */
/* loaded from: classes.dex */
public final class ProductSummaryFragment extends AbstractC9412c<ProductSummaryView, ProductSummaryPresenter> implements ProductSummaryView, BaseViewBinder<FragmentProductSummaryBinding> {
    public static final String AIRTIME_SUMMARY_ARGS = "AIRTIME_SUMMARY_ARGS";
    public static final Companion Companion;
    public static final String EXTRA_REFERENCE = "transaction_details_extra_reference";
    private final /* synthetic */ BaseViewBinderImpl<FragmentProductSummaryBinding> $$delegate_0;
    private LocationUtil locationTracker;
    private ProductPurchase productPurchase;
    public ProductSummaryPresenter thisPresenter;
    private TransactionStatusType transactionType;

    /* compiled from: ProductSummaryFragment.kt */
    @Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/product/ui/ProductSummaryFragment$Companion;", "", "()V", ProductSummaryFragment.AIRTIME_SUMMARY_ARGS, "", "EXTRA_REFERENCE", "newInstance", "Lai/kudi/agent/product/ui/ProductSummaryFragment;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/product/airtime_data/data/ProductPurchase;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.product.ui.ProductSummaryFragment$Companion */
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
        public final ProductSummaryFragment newInstance(ProductPurchase productPurchase) {
            ProductSummaryFragment r5 = new ProductSummaryFragment();
            Bundle r6 = new Bundle();
            r6.putParcelable(ProductSummaryFragment.AIRTIME_SUMMARY_ARGS, productPurchase);
            C13666w c13666w = C13666w.f30112a;
            ProductSummaryFragment r7 = r5;
            r7.setArguments(r6);
            return r5;
        }
    }

    /* compiled from: ProductSummaryFragment.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.product.ui.ProductSummaryFragment$WhenMappings */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            TransactionStatusType[] $r0 = TransactionStatusType.values();
            int $i0 = $r0.length;
            int[] $r1 = new int[$i0];
            TransactionStatusType $r2 = TransactionStatusType.AIRTIME_AND_DATA;
            int $i02 = $r2.ordinal();
            $r1[$i02] = 1;
            $EnumSwitchMapping$0 = $r1;
            TransactionStatus[] $r3 = TransactionStatus.values();
            int $i03 = $r3.length;
            int[] $r12 = new int[$i03];
            TransactionStatus $r4 = TransactionStatus.SUCCESSFUL;
            int $i04 = $r4.ordinal();
            $r12[$i04] = 1;
            TransactionStatus $r42 = TransactionStatus.FAILED;
            int $i05 = $r42.ordinal();
            $r12[$i05] = 2;
            TransactionStatus $r43 = TransactionStatus.PENDING;
            int $i06 = $r43.ordinal();
            $r12[$i06] = 3;
            $EnumSwitchMapping$1 = $r12;
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
    public ProductSummaryFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
        TransactionStatusType $r2 = TransactionStatusType.AIRTIME_AND_DATA;
        this.transactionType = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String decideActionButtonText(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto Lb
            boolean r0 = kotlin.p549l0.C13265j.m5470u(r6)
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            if (r0 == 0) goto L11
            int r1 = ai.kudi.agent.collections.R$string.send_more
            goto L13
        L11:
            int r1 = ai.kudi.agent.collections.R$string.view_transaction
        L13:
            r3 = r5
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            r2 = r3
            java.lang.String r6 = r2.getString(r1)
            java.lang.String r4 = "if (transactionReference.isNullOrBlank()) getString(R.string.send_more) else getString(R.string.view_transaction)"
            kotlin.p483e0.p485d.Log_OC.loadImage(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.product.p019ui.ProductSummaryFragment.decideActionButtonText(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void displayFeedBack(SuccessScreenCustomOption successScreenCustomOption, InterfaceC11756a interfaceC11756a) {
        if (successScreenCustomOption == null) {
            return;
        }
        SuccessScreenDialogFragment.Companion $r3 = SuccessScreenDialogFragment.Companion;
        SuccessScreenDialogFragment $r4 = $r3.newInstance(successScreenCustomOption, interfaceC11756a);
        ProductSummaryFragment r6 = this;
        FragmentManager $r5 = r6.getChildFragmentManager();
        Log_OC.loadImage($r5, "childFragmentManager");
        ProductSummaryFragment r62 = this;
        FragmentExtensionKt.showDialogWhenResumed($r4, $r5, SuccessScreenDialogFragment.PAGE_KEY, r62);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void displayLocationAwareness() {
        ProductSummaryFragment$displayLocationAwareness$cancelCallback$1 r6 = new ProductSummaryFragment$displayLocationAwareness$cancelCallback$1(this);
        ProductSummaryFragment$displayLocationAwareness$okCallback$1 r7 = new ProductSummaryFragment$displayLocationAwareness$okCallback$1(this);
        int $i0 = R$string.location_notification;
        ProductSummaryFragment r8 = this;
        String $r3 = r8.getString($i0);
        Log_OC.loadImage($r3, "getString(R.string.location_notification)");
        CustomDialog.Companion $r4 = CustomDialog.Companion;
        ProductSummaryFragment r82 = this;
        FragmentActivity $r5 = r82.requireActivity();
        Log_OC.loadImage($r5, "requireActivity()");
        $r4.show("BOLT Transaction", $r3, "Ok", "Cancel", r7, r6, $r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void displayLocationNotification() {
        ProductSummaryFragment r6 = this;
        if (r6.getActivity() == null) {
            return;
        }
        ProductSummaryFragment r62 = this;
        FragmentActivity $r1 = r62.requireActivity();
        Log_OC.loadImage($r1, "requireActivity()");
        LocationUtil r5 = new LocationUtil($r1);
        this.locationTracker = r5;
        Log_OC.append(r5);
        boolean $z0 = r5.isGpsOn();
        if ($z0) {
            InterfaceC9413d $r3 = this.presenter;
            ProductSummaryPresenter $r4 = (ProductSummaryPresenter) $r3;
            $r4.logUserEvent("ProductSummaryFragment: Location is enabled");
            return;
        }
        LocationUtil $r2 = this.locationTracker;
        if ($r2 == null) {
            return;
        }
        $r2.onGpsWithoutSetting();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008c, code lost:
        if (r18 == 0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.ArrayList getBillPurchaseSummary(ai.kudi.agent.bills.data.BillsData r32) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.product.p019ui.ProductSummaryFragment.getBillPurchaseSummary(ai.kudi.agent.bills.data.BillsData):java.util.ArrayList");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final ArrayList getDataPurchaseSummary(DataPurchase dataPurchase) {
        ArrayList $r10;
        StringBuilder r11 = new StringBuilder();
        String $r5 = dataPurchase.getPhoneNumber();
        r11.append($r5);
        r11.append(" | ");
        Networks $r6 = dataPurchase.getNetwork();
        Log_OC.append($r6);
        String $r52 = $r6.getName();
        r11.append($r52);
        r11.append(" | ");
        Plan $r7 = dataPurchase.getPlan();
        String $r53 = $r7.getName();
        r11.append($r53);
        String $r54 = r11.toString();
        AirtimeTopUpFragment.Companion $r8 = AirtimeTopUpFragment.Companion;
        AirtimeTopUpFragment $r9 = $r8.getInstance(AirtimeTopUpFragment.ARGS_MODE_DATA, dataPurchase);
        SummaryModel r12 = new SummaryModel("Top-Up Details", $r54, true, $r9);
        StringBuilder r112 = new StringBuilder();
        int $i0 = R$string.naira_symbol;
        ProductSummaryFragment r13 = this;
        String $r55 = r13.getString($i0);
        r112.append($r55);
        r112.append(' ');
        String $r56 = dataPurchase.getServiceFee();
        r112.append($r56);
        String $r57 = r112.toString();
        SummaryModel r122 = new SummaryModel("Nomba Charge", $r57, false, null, 12, null);
        SummaryModel[] $r2 = {r12, r122};
        $r10 = C13726r.m3893c($r2);
        return $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final ArrayList getPurchaseSummary(AirtimePurchase airtimePurchase) {
        ArrayList $r11;
        StringBuilder r12 = new StringBuilder();
        String $r5 = airtimePurchase.getPhoneNumber();
        r12.append($r5);
        r12.append(" | ");
        Networks $r6 = airtimePurchase.getNetwork();
        Log_OC.append($r6);
        String $r52 = $r6.getName();
        r12.append($r52);
        r12.append(" | ");
        String $r53 = airtimePurchase.getPurchaseType();
        r12.append($r53);
        r12.append(' ');
        String $r54 = r12.toString();
        AirtimeTopUpFragment.Companion $r7 = AirtimeTopUpFragment.Companion;
        AirtimeTopUpFragment $r8 = $r7.getInstance(AirtimeTopUpFragment.ARGS_MODE_AIRTIME, airtimePurchase);
        SummaryModel r13 = new SummaryModel("Top-Up Details", $r54, true, $r8);
        StringBuilder r122 = new StringBuilder();
        int $i0 = R$string.naira_symbol;
        String $r55 = getString($i0);
        r122.append($r55);
        r122.append(' ');
        int $i02 = airtimePurchase.getAmount();
        String $r56 = String.valueOf($i02);
        r122.append(StringExtKt.getFormatToCurrency($r56));
        String $r57 = r122.toString();
        AirtimeAmountFragment.Companion $r9 = AirtimeAmountFragment.Companion;
        Fragment $r10 = $r9.getInstance(airtimePurchase);
        Fragment r14 = $r10;
        SummaryModel r132 = new SummaryModel("Top-Up Amount", $r57, true, r14);
        StringBuilder r123 = new StringBuilder();
        int $i03 = R$string.naira_symbol;
        ProductSummaryFragment r142 = this;
        String $r58 = r142.getString($i03);
        r123.append($r58);
        r123.append(' ');
        String $r59 = airtimePurchase.getServiceFee();
        r123.append($r59);
        String $r510 = r123.toString();
        SummaryModel r133 = new SummaryModel("Nomba Charge", $r510, false, null, 12, null);
        SummaryModel[] $r2 = {r13, r132, r133};
        $r11 = C13726r.m3893c($r2);
        return $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final C13287o handleAirtimeAndData(TransactionStatus transactionStatus, SuccessScreenCustomOption successScreenCustomOption, String $r3, InterfaceC11756a interfaceC11756a, String $r5) {
        Object $r7;
        int[] $r6 = WhenMappings.$EnumSwitchMapping$1;
        int $i0 = $r6[transactionStatus.ordinal()];
        if ($i0 != 1) {
            if ($i0 == 2) {
                ProductSummaryFragment r13 = this;
                String $r32 = r13.getString(R$string.top_up_failed);
                if ($r5 == null) {
                    ProductSummaryFragment r132 = this;
                    $r5 = r132.getString(R$string.something_went_wrong);
                    Log_OC.loadImage($r5, "getString(R.string.something_went_wrong)");
                }
                int $i02 = R$drawable.ic_pending_topup;
                int $i1 = R$color.red;
                successScreenCustomOption = r10;
                Log_OC.loadImage($r32, "getString(R.string.top_up_failed)");
                SuccessScreenCustomOption r10 = new SuccessScreenCustomOption($r32, $r5, null, false, true, false, $i1, $i1, 0, 0, $i02, 0, false, 6956, null);
            } else if ($i0 == 3) {
                String $r33 = getString(R$string.top_up_pending);
                if ($r5 == null) {
                    $r5 = "";
                }
                int $i03 = R$drawable.ic_wallet_pending;
                successScreenCustomOption = r10;
                Log_OC.loadImage($r33, "getString(R.string.top_up_pending)");
                SuccessScreenCustomOption r102 = new SuccessScreenCustomOption($r33, $r5, null, false, true, false, 0, 0, 0, 0, $i03, 0, false, 7148, null);
            }
            $r7 = interfaceC11756a;
        } else {
            ProductSummaryFragment r133 = this;
            String $r52 = r133.getString(R$string.top_up_successful);
            int $i04 = R$drawable.ic_successful_transaction_status;
            String $r8 = decideActionButtonText($r3);
            Log_OC.loadImage($r52, "getString(\n                        R.string.top_up_successful\n                    )");
            SuccessScreenCustomOption r103 = new SuccessScreenCustomOption($r52, "", $r8, false, false, false, 0, 0, 0, 0, $i04, 0, false, 7160, null);
            $r7 = r11;
            Object r11 = new ProductSummaryFragment$handleAirtimeAndData$1(this, $r3);
            successScreenCustomOption = r103;
        }
        C13287o r12 = new C13287o($r7, successScreenCustomOption);
        return r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final C13287o handleOtherTransactionTypes(TransactionStatus transactionStatus, SuccessScreenCustomOption successScreenCustomOption, String $r3, InterfaceC11756a interfaceC11756a, String $r5) {
        Object $r7;
        SuccessScreenCustomOption r10;
        int[] $r6 = WhenMappings.$EnumSwitchMapping$1;
        int $i0 = $r6[transactionStatus.ordinal()];
        if ($i0 != 1) {
            if ($i0 == 2) {
                ProductSummaryFragment r13 = this;
                String $r32 = r13.getString(R$string.transaction_failed);
                if ($r5 == null) {
                    ProductSummaryFragment r132 = this;
                    $r5 = r132.getString(R$string.something_went_wrong);
                    Log_OC.loadImage($r5, "getString(R.string.something_went_wrong)");
                }
                int $i02 = R$drawable.ic_failed_transaction_status;
                int $i1 = R$color.red;
                successScreenCustomOption = r10;
                Log_OC.loadImage($r32, "getString(\n                        R.string.transaction_failed,\n                    )");
                SuccessScreenCustomOption r102 = new SuccessScreenCustomOption($r32, $r5, null, false, true, false, $i1, $i1, 0, 0, $i02, 0, false, 6956, null);
            } else if ($i0 == 3) {
                successScreenCustomOption = r10;
                String $r33 = getString(R$string.transaction_pending);
                Log_OC.loadImage($r33, "getString(\n                        R.string.transaction_pending\n                    )");
                if ($r5 == null) {
                    $r5 = "";
                }
                r10 = new SuccessScreenCustomOption($r33, $r5, null, false, true, false, 0, 0, 0, 0, R$drawable.ic_wallet_pending, 0, false, 7148, null);
            }
            $r7 = interfaceC11756a;
        } else {
            ProductSummaryFragment r133 = this;
            String $r52 = r133.getString(R$string.text_transaction_successful);
            int $i03 = R$drawable.ic_successful_transaction_status;
            String $r8 = decideActionButtonText($r3);
            Log_OC.loadImage($r52, "getString(\n                        R.string.text_transaction_successful\n                    )");
            SuccessScreenCustomOption r103 = new SuccessScreenCustomOption($r52, null, $r8, false, false, false, 0, 0, 0, 0, $i03, 0, false, 7162, null);
            $r7 = r11;
            Object r11 = new ProductSummaryFragment$handleOtherTransactionTypes$1(this, $r3);
            successScreenCustomOption = r103;
        }
        C13287o r12 = new C13287o($r7, successScreenCustomOption);
        return r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final ProductSummaryFragment newInstance(ProductPurchase productPurchase) {
        Companion $r0 = Companion;
        ProductSummaryFragment $r1 = $r0.newInstance(productPurchase);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onActionButtonClicked(java.lang.String r23, java.lang.String r24) {
        /*
            r22 = this;
            if (r23 == 0) goto Ld
            r0 = r23
            boolean r6 = kotlin.p549l0.C13265j.m5470u(r0)
            if (r6 == 0) goto Lb
            goto Ld
        Lb:
            r6 = 0
            goto Le
        Ld:
            r6 = 1
        Le:
            if (r6 == 0) goto L2b
            ai.kudi.agent.product.ui.ProductSummaryFragment$onActionButtonClicked$1 r7 = new ai.kudi.agent.product.ui.ProductSummaryFragment$onActionButtonClicked$1
            r0 = r24
            r7.<init>(r0)
            r9 = r22
            androidx.fragment.app.Fragment r9 = (androidx.fragment.app.Fragment) r9
            r8 = r9
            r10 = 0
            java.lang.Class<ai.kudi.agent.product.ui.ProductActivity> r11 = ai.kudi.agent.product.p019ui.ProductActivity.class
            r12 = 1
            r13 = 0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r7
            r4 = r12
            r5 = r13
            ai.kudi.agent.core.util.ContextExtKt.launchActivity$default(r0, r1, r2, r3, r4, r5)
            goto L60
        L2b:
            java.lang.String r15 = "ai.kudi.agent.transactions.ui.TransactionDetailsActivity"
            java.lang.Class r14 = java.lang.Class.forName(r15)     // Catch: java.lang.ClassNotFoundException -> L55
            java.lang.String r15 = "intentClass"
            kotlin.p483e0.p485d.Log_OC.loadImage(r14, r15)     // Catch: java.lang.ClassNotFoundException -> L55
            ai.kudi.agent.product.ui.ProductSummaryFragment$onActionButtonClicked$2 r16 = new ai.kudi.agent.product.ui.ProductSummaryFragment$onActionButtonClicked$2
            r17 = r16
            r0 = r16
            r1 = r23
            r0.<init>(r1)     // Catch: java.lang.ClassNotFoundException -> L55
            r18 = r22
            androidx.fragment.app.Fragment r18 = (androidx.fragment.app.Fragment) r18
            r8 = r18
            r10 = 0
            r12 = 1
            r13 = 0
            r0 = r8
            r1 = r10
            r2 = r14
            r3 = r17
            r4 = r12
            r5 = r13
            ai.kudi.agent.core.util.ContextExtKt.launchActivity$default(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.ClassNotFoundException -> L55
            goto L60
        L55:
            r19 = move-exception
            r0 = r19
            r0.printStackTrace()
            r0 = r19
            ai.kudi.agent.core.crashreport.CrashlyticsReport.logException(r0)
        L60:
            r20 = r22
            androidx.fragment.app.Fragment r20 = (androidx.fragment.app.Fragment) r20
            r8 = r20
            androidx.fragment.app.FragmentActivity r21 = r8.requireActivity()
            r0 = r21
            r0.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.product.p019ui.ProductSummaryFragment.onActionButtonClicked(java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void onActionButtonClicked$default(ProductSummaryFragment productSummaryFragment, String str, String $r3, int i, Object obj) {
        int $i0 = i & 2;
        if ($i0 != 0) {
            $r3 = "";
        }
        productSummaryFragment.onActionButtonClicked(str, $r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onActivityCreated$lambda-2$lambda-0  reason: not valid java name */
    public static final void m40234onActivityCreated$lambda2$lambda0(FragmentProductSummaryBinding fragmentProductSummaryBinding, ProductSummaryFragment productSummaryFragment, View view) {
        Log_OC.getArray(fragmentProductSummaryBinding, "$this_apply");
        Log_OC.getArray(productSummaryFragment, "this$0");
        TextView $r4 = fragmentProductSummaryBinding.textErrorMessage;
        Log_OC.loadImage($r4, "textErrorMessage");
        ViewExtKt.hide$default($r4, false, 1, null);
        ProductSummaryPresenter $r1 = productSummaryFragment.getThisPresenter();
        $r1.showAuthDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: pinConfirmationDialog$lambda-5  reason: not valid java name */
    public static final void m40235pinConfirmationDialog$lambda5(ProductSummaryFragment productSummaryFragment, String str, Bundle bundle) {
        Log_OC.getArray(productSummaryFragment, "this$0");
        Log_OC.getArray(str, "$noName_0");
        Log_OC.getArray(bundle, "$noName_1");
        LocationUtil $r4 = productSummaryFragment.locationTracker;
        if ($r4 == null) {
            return;
        }
        ProductSummaryFragment r8 = productSummaryFragment;
        FragmentActivity $r5 = r8.requireActivity();
        C4107a $r6 = C4109b.m28503a($r5);
        Log_OC.loadImage($r6, "getFusedLocationProviderClient(requireActivity())");
        ProductSummaryFragment$pinConfirmationDialog$1$1 r7 = new ProductSummaryFragment$pinConfirmationDialog$1$1(productSummaryFragment);
        LocationUtil.getLastLocation$default($r4, $r6, 0, r7, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void requestLocation() {
        ProductSummaryFragment r3 = this;
        FragmentActivity $r1 = r3.requireActivity();
        SharedPreferences $r2 = $r1.getSharedPreferences(LocationUtil.LOCATION_PREFERENCE, 0);
        boolean $z0 = $r2.getBoolean(LocationUtil.IS_LOCATION_ALLOWED_PREFERENCE_TRANSFER, false);
        if ($z0) {
            displayLocationNotification();
        } else {
            displayLocationAwareness();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public ProductSummaryPresenter createPresenter() {
        ProductSummaryPresenter $r1 = getThisPresenter();
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
    public FragmentProductSummaryBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentProductSummaryBinding $r3 = (FragmentProductSummaryBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentProductSummaryBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ProductSummaryPresenter getThisPresenter() {
        ProductSummaryPresenter $r1 = this.thisPresenter;
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
    @Override // ai.kudi.agent.product.view.ProductSummaryView
    public void hideLoading() {
        FragmentProductSummaryBinding $r1 = requireBinding();
        KudiButton $r2 = $r1.createVoucherButton;
        $r2.m38033e();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentProductSummaryBinding fragmentProductSummaryBinding, Fragment fragment) {
        Log_OC.getArray(fragmentProductSummaryBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentProductSummaryBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentProductSummaryBinding $r4 = (FragmentProductSummaryBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.view.ProductSummaryView
    public void navigateToTransactionStatusPage(TransactionStatus transactionStatus, TransactionStatusType transactionStatusType, String str, String str2) {
        InterfaceC11756a $r8;
        SuccessScreenCustomOption $r9;
        Log_OC.getArray(transactionStatus, TransactionField.STATUS);
        Log_OC.getArray(transactionStatusType, "transactionType");
        int[] $r5 = WhenMappings.$EnumSwitchMapping$0;
        int $i0 = transactionStatusType.ordinal();
        if ($r5[$i0] == 1) {
            C13287o $r6 = handleAirtimeAndData(transactionStatus, null, str2, null, str);
            Object $r7 = $r6.m5364c();
            $r8 = (InterfaceC11756a) $r7;
            Object $r72 = $r6.m5363d();
            $r9 = (SuccessScreenCustomOption) $r72;
        } else {
            C13287o $r62 = handleOtherTransactionTypes(transactionStatus, null, str2, null, str);
            Object $r73 = $r62.m5364c();
            $r8 = (InterfaceC11756a) $r73;
            Object $r74 = $r62.m5363d();
            $r9 = (SuccessScreenCustomOption) $r74;
        }
        displayFeedBack($r9, $r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        List m3891e;
        ProductPurchase $r9;
        super.onActivityCreated(bundle);
        final FragmentProductSummaryBinding $r2 = requireBinding();
        ViewGroup $r3 = $r2.createVoucherButton;
        ViewGroup r34 = $r3;
        r34.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.product.ui.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FragmentProductSummaryBinding $r22 = FragmentProductSummaryBinding.this;
                ProductSummaryFragment $r32 = this;
                ProductSummaryFragment.m40234onActivityCreated$lambda2$lambda0($r22, $r32, view);
            }
        });
        SummaryAdapter r30 = new SummaryAdapter();
        RecyclerView $r6 = $r2.summaryRecyclerView;
        $r6.setAdapter(r30);
        m3891e = C13726r.m3891e();
        ProductSummaryFragment r35 = this;
        Bundle $r1 = r35.getArguments();
        if ($r1 != null) {
            ProductSummaryFragment r352 = this;
            Bundle $r12 = r352.requireArguments();
            boolean $z0 = $r12.containsKey(AIRTIME_SUMMARY_ARGS);
            if ($z0) {
                ProductSummaryFragment r353 = this;
                Bundle $r13 = r353.getArguments();
                if ($r13 == null) {
                    $r9 = null;
                } else {
                    Parcelable $r10 = $r13.getParcelable(AIRTIME_SUMMARY_ARGS);
                    $r9 = (ProductPurchase) $r10;
                }
                if ($r9 == null) {
                    NullPointerException r31 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.product.airtime_data.data.ProductPurchase");
                    throw r31;
                }
                this.productPurchase = $r9;
            }
        }
        ProductPurchase $r92 = this.productPurchase;
        if ($r92 == null) {
            Log_OC.LogError("productPurchase");
            NullPointerException $r11 = new NullPointerException("Null throw statement replaced by Soot");
            throw $r11;
        }
        boolean $z02 = $r92 instanceof AirtimePurchase;
        if (!$z02) {
            boolean $z03 = $r92 instanceof DataPurchase;
            if (!$z03) {
                boolean $z04 = $r92 instanceof BillsData;
                if ($z04) {
                    if ($r92 == null) {
                        Log_OC.LogError("productPurchase");
                        NullPointerException $r112 = new NullPointerException("Null throw statement replaced by Soot");
                        throw $r112;
                    }
                    BillsData $r23 = (BillsData) $r92;
                    TransactionStatusType $r132 = TransactionStatusType.OTHER_BILLS;
                    this.transactionType = $r132;
                    int $i0 = $r23.getAmount();
                    KudiButton $r32 = $r2.createVoucherButton;
                    C11780a0 $r14 = C11780a0.f26475a;
                    int $i1 = R$string.send_voucher;
                    ProductSummaryFragment r354 = this;
                    String $r15 = r354.getString($i1);
                    Log_OC.loadImage($r15, "getString(R.string.send_voucher)");
                    Locale $r17 = Locale.US;
                    NumberFormat $r18 = NumberFormat.getNumberInstance($r17);
                    Integer $r19 = Integer.valueOf($i0);
                    String $r20 = $r18.format($r19);
                    Object[] $r16 = {$r20};
                    String $r152 = String.format($r15, Arrays.copyOf($r16, 1));
                    Log_OC.loadImage($r152, "java.lang.String.format(format, *args)");
                    $r32.setText($r152);
                    m3891e = getBillPurchaseSummary($r23);
                }
            } else if ($r92 == null) {
                Log_OC.LogError("productPurchase");
                NullPointerException $r113 = new NullPointerException("Null throw statement replaced by Soot");
                throw $r113;
            } else {
                DataPurchase $r22 = (DataPurchase) $r92;
                TransactionStatusType $r133 = TransactionStatusType.AIRTIME_AND_DATA;
                this.transactionType = $r133;
                int $i02 = $r22.getRequestAmount();
                KudiButton $r33 = $r2.createVoucherButton;
                C11780a0 $r142 = C11780a0.f26475a;
                int $i12 = R$string.send_voucher;
                ProductSummaryFragment r355 = this;
                String $r153 = r355.getString($i12);
                Log_OC.loadImage($r153, "getString(R.string.send_voucher)");
                Locale $r172 = Locale.US;
                NumberFormat $r182 = NumberFormat.getNumberInstance($r172);
                Integer $r192 = Integer.valueOf($i02);
                String $r202 = $r182.format($r192);
                Object[] $r162 = {$r202};
                String $r154 = String.format($r153, Arrays.copyOf($r162, 1));
                Log_OC.loadImage($r154, "java.lang.String.format(format, *args)");
                $r33.setText($r154);
                m3891e = getDataPurchaseSummary($r22);
            }
        } else if ($r92 == null) {
            Log_OC.LogError("productPurchase");
            NullPointerException $r114 = new NullPointerException("Null throw statement replaced by Soot");
            throw $r114;
        } else {
            AirtimePurchase $r122 = (AirtimePurchase) $r92;
            TransactionStatusType $r134 = TransactionStatusType.AIRTIME_AND_DATA;
            this.transactionType = $r134;
            int $i03 = $r122.getAmount();
            KudiButton $r34 = $r2.createVoucherButton;
            C11780a0 c11780a0 = C11780a0.f26475a;
            int $i13 = R$string.send_voucher;
            ProductSummaryFragment r356 = this;
            String $r155 = r356.getString($i13);
            Log_OC.loadImage($r155, "getString(R.string.send_voucher)");
            Locale $r173 = Locale.US;
            NumberFormat $r183 = NumberFormat.getNumberInstance($r173);
            Integer $r193 = Integer.valueOf($i03);
            String $r203 = $r183.format($r193);
            Object[] $r163 = {$r203};
            String $r156 = String.format($r155, Arrays.copyOf($r163, 1));
            Log_OC.loadImage($r156, "java.lang.String.format(format, *args)");
            $r34.setText($r156);
            m3891e = getPurchaseSummary($r122);
        }
        requestLocation();
        List $r7 = m3891e;
        r30.setSummaryList($r7);
        r30.notifyDataSetChanged();
        ProductSummaryFragment r357 = this;
        Context $r25 = r357.getContext();
        C1723k r32 = new C1723k($r25, 1);
        ProductSummaryFragment r358 = this;
        FragmentActivity $r26 = r358.requireActivity();
        Context $r252 = $r26.getApplicationContext();
        int $i04 = R$drawable.transactions_divider;
        Drawable $r27 = C1335a.m36322f($r252, $i04);
        Log_OC.append($r27);
        r32.m34703f($r27);
        RecyclerView $r62 = $r2.summaryRecyclerView;
        $r62.m35294h(r32);
        ProductSummaryFragment$onActivityCreated$1$3 r33 = new ProductSummaryFragment$onActivityCreated$1$3(this);
        r30.setOnClickListener(r33);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        ProductSummaryFragment r2 = this;
        C7429a.m18752b(r2);
        ProductSummaryFragment r22 = this;
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentProductSummaryBinding $r4 = FragmentProductSummaryBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        ProductSummaryFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.view.ProductSummaryView
    public void pinConfirmationDialog() {
        ProductSummaryFragment r7 = this;
        FragmentManager $r2 = r7.getChildFragmentManager();
        ProductSummaryFragment r72 = this;
        PreferenceActivity $r3 = r72.getViewLifecycleOwner();
        $r2.p1(KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY, $r3, new InterfaceC1523w() { // from class: ai.kudi.agent.product.ui.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: b */
            public final void m38601b(String str, Bundle bundle) {
                ProductSummaryFragment $r32 = ProductSummaryFragment.this;
                ProductSummaryFragment.m40235pinConfirmationDialog$lambda5($r32, str, bundle);
            }
        });
        KudiPin.Companion $r1 = KudiPin.Companion;
        KudiPin $r5 = KudiPin.Companion.newInstance$default($r1, null, null, false, 7, null);
        ProductSummaryFragment r73 = this;
        FragmentManager $r22 = r73.getChildFragmentManager();
        Chapter r8 = (Chapter) $r5;
        r8.show($r22, ".AuthDialog.Dialog");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentProductSummaryBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentProductSummaryBinding $r3 = (FragmentProductSummaryBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentProductSummaryBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setThisPresenter(ProductSummaryPresenter productSummaryPresenter) {
        Log_OC.getArray(productSummaryPresenter, "<set-?>");
        this.thisPresenter = productSummaryPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.view.ProductSummaryView
    public void showError(String str) {
        FragmentProductSummaryBinding $r2 = requireBinding();
        ProductSummaryFragment r5 = this;
        FragmentActivity $r3 = r5.getActivity();
        if ($r3 != null) {
            ContextExtKt.toast$default($r3, str, 0, 2, (Object) null);
        }
        TextView $r4 = $r2.textErrorMessage;
        Log_OC.loadImage($r4, "textErrorMessage");
        ViewExtKt.show($r4);
        $r2.textErrorMessage.setText(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.view.ProductSummaryView
    public void showLoading() {
        FragmentProductSummaryBinding $r1 = requireBinding();
        KudiButton $r2 = $r1.createVoucherButton;
        $r2.m38032f();
    }
}
