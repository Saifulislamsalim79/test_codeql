package ai.kudi.agent.product.airtime_data.p017ui;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.collections.databinding.FragmentAirtimeTopUpBinding;
import ai.kudi.agent.core.mvp.MvpFragment;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.product.airtime_data.data.AirtimePurchase;
import ai.kudi.agent.product.airtime_data.data.DataPurchase;
import ai.kudi.agent.product.airtime_data.data.Networks;
import ai.kudi.agent.product.airtime_data.data.Plan;
import ai.kudi.agent.product.airtime_data.data.ProductPurchase;
import ai.kudi.agent.product.airtime_data.presenter.AirtimeAndDataPresenter;
import ai.kudi.agent.product.airtime_data.views.AirtimeAndDataView;
import ai.kudi.agent.product.airtime_data.views.AirtimeView;
import ai.kudi.agent.wallettopup.WalletTopUpActivity;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import ai.kudi.dip.library.p043h.DialogC0809i;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import dagger.android.p197e.C7429a;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.C11810u;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: AirtimeTopUpFragment.kt */
@Metadata(m10422d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 O2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0001OB\u0005¢\u0006\u0002\u0010\u0007J\b\u0010+\u001a\u00020\u0003H\u0016J\b\u0010,\u001a\u00020-H\u0016J\u0019\u0010.\u001a\u00020/2\u0006\u0010\b\u001a\u00020\u00062\u0006\u00100\u001a\u000201H\u0096\u0001J \u00102\u001a\u00020-2\b\b\u0002\u00103\u001a\u00020\u00142\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00140\u001fH\u0002J\u0010\u00105\u001a\u00020-2\u0006\u00106\u001a\u000207H\u0016J$\u00108\u001a\u00020/2\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u001a\u0010?\u001a\u00020-2\u0006\u0010@\u001a\u00020/2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\t\u0010A\u001a\u00020\u0006H\u0096\u0001J\u0010\u0010B\u001a\u00020-2\u0006\u0010C\u001a\u00020\u0014H\u0016J\u0010\u0010D\u001a\u00020-2\u0006\u0010E\u001a\u00020\u000eH\u0016J\u0010\u0010F\u001a\u00020-2\u0006\u0010G\u001a\u00020\u0014H\u0016J\u0010\u0010H\u001a\u00020-2\u0006\u0010G\u001a\u00020\u0014H\u0016J\u0010\u0010I\u001a\u00020-2\u0006\u0010G\u001a\u00020\u0014H\u0016J\u0010\u0010J\u001a\u00020-2\u0006\u0010G\u001a\u00020\u0014H\u0016J\b\u0010K\u001a\u00020-H\u0016J\u0016\u0010L\u001a\u00020-2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u001fH\u0016J\u0016\u0010M\u001a\u00020-2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00110\u001fH\u0016R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006P"}, m10421d2 = {"Lai/kudi/agent/product/airtime_data/ui/AirtimeTopUpFragment;", "Lai/kudi/agent/core/mvp/MvpFragment;", "Lai/kudi/agent/product/airtime_data/views/AirtimeAndDataView;", "Lai/kudi/agent/product/airtime_data/presenter/AirtimeAndDataPresenter;", "Lai/kudi/agent/product/airtime_data/views/AirtimeView;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/collections/databinding/FragmentAirtimeTopUpBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/collections/databinding/FragmentAirtimeTopUpBinding;", "bottomSheetDialog", "Lai/kudi/dip/library/bottomSheets/FilterBottomSheet;", "currentWalletBalance", "", "dataPlans", "", "Lai/kudi/agent/product/airtime_data/data/Plan;", "lastSelectedDataPlan", "lastSelectedDataString", "", "lastSelectedNetwork", "Lai/kudi/agent/product/airtime_data/data/Networks;", "getLastSelectedNetwork", "()Lai/kudi/agent/product/airtime_data/data/Networks;", "setLastSelectedNetwork", "(Lai/kudi/agent/product/airtime_data/data/Networks;)V", "lastSelectedNetworkPosition", "", "lastSelectedNetworkString", AirtimeTopUpFragment.TYPE_OF_DATA_NETWORK, "", "smartLookAnalytics", "Lai/kudi/agent/analytics/SmartLookAnalytics;", "getSmartLookAnalytics", "()Lai/kudi/agent/analytics/SmartLookAnalytics;", "setSmartLookAnalytics", "(Lai/kudi/agent/analytics/SmartLookAnalytics;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/product/airtime_data/presenter/AirtimeAndDataPresenter;", "setThisPresenter", "(Lai/kudi/agent/product/airtime_data/presenter/AirtimeAndDataPresenter;)V", "createPresenter", "hideLoader", "", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "initBottomSheet", "typeOfData", "items", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "requireBinding", "setPhoneNumber", "phoneNumber", "setWalletBalance", "balance", "showAmountError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "showInvalidDataPlan", "showInvalidNetworkSelection", "showInvalidPhoneNumber", "showLoader", "showNetworks", "showPlans", "plans", "Companion", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.product.airtime_data.ui.AirtimeTopUpFragment */
/* loaded from: classes.dex */
public final class AirtimeTopUpFragment extends MvpFragment<AirtimeAndDataView, AirtimeAndDataPresenter> implements AirtimeView, BaseViewBinder<FragmentAirtimeTopUpBinding> {
    public static final String ARGS_AIRTIME_PAYLOAD = "args_airtime_payload";
    public static final String ARGS_MODE = "args_mode";
    public static final String ARGS_MODE_AIRTIME = "args_mode_airtime";
    public static final String ARGS_MODE_DATA = "args_mode_data";
    public static final Companion Companion;
    public static final String TYPE_OF_DATA_NETWORK = "networks";
    public static final String TYPE_OF_DATA_PLAN = "data_plans";
    private final /* synthetic */ BaseViewBinderImpl<FragmentAirtimeTopUpBinding> $$delegate_0;
    private DialogC0809i bottomSheetDialog;
    private double currentWalletBalance;
    private final List<Plan> dataPlans;
    private Plan lastSelectedDataPlan;
    private String lastSelectedDataString;
    public Networks lastSelectedNetwork;
    private int lastSelectedNetworkPosition;
    private String lastSelectedNetworkString;
    private List<Networks> networks;
    public SmartLookAnalytics smartLookAnalytics;
    public AirtimeAndDataPresenter thisPresenter;

    /* compiled from: AirtimeTopUpFragment.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/product/airtime_data/ui/AirtimeTopUpFragment$Companion;", "", "()V", "ARGS_AIRTIME_PAYLOAD", "", "ARGS_MODE", "ARGS_MODE_AIRTIME", "ARGS_MODE_DATA", "TYPE_OF_DATA_NETWORK", "TYPE_OF_DATA_PLAN", "getInstance", "Lai/kudi/agent/product/airtime_data/ui/AirtimeTopUpFragment;", WalletTopUpActivity.EXTRA_MODE, "payload", "Lai/kudi/agent/product/airtime_data/data/ProductPurchase;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.product.airtime_data.ui.AirtimeTopUpFragment$Companion */
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
        public static /* synthetic */ AirtimeTopUpFragment getInstance$default(Companion companion, String $r4, ProductPurchase productPurchase, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                $r4 = AirtimeTopUpFragment.ARGS_MODE_AIRTIME;
            }
            AirtimeTopUpFragment $r2 = companion.getInstance($r4, productPurchase);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final AirtimeTopUpFragment getInstance(String str, ProductPurchase productPurchase) {
            Log_OC.getArray(str, WalletTopUpActivity.EXTRA_MODE);
            AirtimeTopUpFragment r6 = new AirtimeTopUpFragment();
            Bundle r7 = new Bundle();
            r7.putString(AirtimeTopUpFragment.ARGS_MODE, str);
            r7.putParcelable("args_airtime_payload", productPurchase);
            C13666w c13666w = C13666w.f30112a;
            AirtimeTopUpFragment r8 = r6;
            r8.setArguments(r7);
            return r6;
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
    public AirtimeTopUpFragment() {
        List $r1;
        BaseViewBinderImpl $r2 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r2;
        this.lastSelectedNetworkPosition = -1;
        $r1 = C13726r.m3891e();
        this.networks = $r1;
        ArrayList $r3 = new ArrayList();
        this.dataPlans = $r3;
        this.lastSelectedNetworkString = "";
        this.lastSelectedDataString = "";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void initBottomSheet(String str, List list) {
        C11810u r9 = new C11810u();
        r9.f26497c = true;
        FragmentAirtimeTopUpBinding $r6 = requireBinding();
        AirtimeTopUpFragment r12 = this;
        Context $r7 = r12.requireContext();
        Log_OC.loadImage($r7, "requireContext()");
        AirtimeTopUpFragment$initBottomSheet$1 r10 = new AirtimeTopUpFragment$initBottomSheet$1(list, str, this, r9, $r6);
        DialogC0809i r11 = new DialogC0809i($r7, r10);
        this.bottomSheetDialog = r11;
        boolean $z0 = r9.f26497c;
        if ($z0) {
            if (r11 != null) {
                DialogC0809i r13 = r11;
                r13.show();
                return;
            }
            Log_OC.LogError("bottomSheetDialog");
            NullPointerException r8 = new NullPointerException("Null throw statement replaced by Soot");
            throw r8;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void initBottomSheet$default(AirtimeTopUpFragment airtimeTopUpFragment, String $r3, List list, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r3 = TYPE_OF_DATA_NETWORK;
        }
        airtimeTopUpFragment.initBottomSheet($r3, list);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:13:0x001a */
    /* renamed from: onViewCreated$lambda-1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m40172onViewCreated$lambda1(ai.kudi.agent.product.airtime_data.p017ui.AirtimeTopUpFragment r13, android.view.View r14) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.p483e0.p485d.Log_OC.getArray(r13, r0)
            java.util.List<ai.kudi.agent.product.airtime_data.data.Networks> r1 = r13.networks
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r3 = kotlin.p557z.C13722p.m3921o(r1, r4)
            r2.<init>(r3)
            java.util.Iterator r5 = r1.iterator()
        L16:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L2c
            java.lang.Object r7 = r5.next()
            r9 = r7
            ai.kudi.agent.product.airtime_data.data.Networks r9 = (ai.kudi.agent.product.airtime_data.data.Networks) r9
            r8 = r9
            java.lang.String r10 = r8.getName()
            r2.add(r10)
            goto L16
        L2c:
            java.util.List r1 = kotlin.p557z.C13722p.m3970D0(r2)
            r11 = 0
            r4 = 1
            r12 = 0
            initBottomSheet$default(r13, r11, r1, r4, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.product.airtime_data.p017ui.AirtimeTopUpFragment.m40172onViewCreated$lambda1(ai.kudi.agent.product.airtime_data.ui.AirtimeTopUpFragment, android.view.View):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:13:0x001a */
    /* renamed from: onViewCreated$lambda-7$lambda-5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m40173onViewCreated$lambda7$lambda5(ai.kudi.agent.product.airtime_data.p017ui.AirtimeTopUpFragment r12, android.view.View r13) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.p483e0.p485d.Log_OC.getArray(r12, r0)
            java.util.List<ai.kudi.agent.product.airtime_data.data.Plan> r1 = r12.dataPlans
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r3 = kotlin.p557z.C13722p.m3921o(r1, r4)
            r2.<init>(r3)
            java.util.Iterator r5 = r1.iterator()
        L16:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L44
            java.lang.Object r7 = r5.next()
            r9 = r7
            ai.kudi.agent.product.airtime_data.data.Plan r9 = (ai.kudi.agent.product.airtime_data.data.Plan) r9
            r8 = r9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r8.getName()
            r10.append(r11)
            java.lang.String r0 = " - "
            r10.append(r0)
            int r3 = r8.getAmount()
            r10.append(r3)
            java.lang.String r11 = r10.toString()
            r2.add(r11)
            goto L16
        L44:
            java.lang.String r0 = "data_plans"
            r12.initBottomSheet(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.product.airtime_data.p017ui.AirtimeTopUpFragment.m40173onViewCreated$lambda7$lambda5(ai.kudi.agent.product.airtime_data.ui.AirtimeTopUpFragment, android.view.View):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-7$lambda-6 */
    public static final void m40174onViewCreated$lambda7$lambda6(FragmentAirtimeTopUpBinding fragmentAirtimeTopUpBinding, AirtimeTopUpFragment airtimeTopUpFragment, C11812w c11812w, View view) {
        Networks $r9;
        Log_OC.getArray(fragmentAirtimeTopUpBinding, "$binding");
        Log_OC.getArray(airtimeTopUpFragment, "this$0");
        Log_OC.getArray(c11812w, "$mode");
        KudiInputField $r5 = fragmentAirtimeTopUpBinding.kifRecipientPhoneNumber;
        String $r6 = $r5.getText();
        int $i0 = airtimeTopUpFragment.lastSelectedNetworkPosition;
        if ($i0 != -1) {
            List $r7 = airtimeTopUpFragment.networks;
            Object $r8 = $r7.get($i0);
            $r9 = (Networks) $r8;
        } else {
            $r9 = null;
        }
        Networks $r1 = $r9;
        Object $r82 = c11812w.f26499c;
        String str = (String) $r82;
        boolean $z0 = Log_OC.append(str, ARGS_MODE_AIRTIME);
        if ($z0) {
            AirtimeAndDataPresenter $r11 = airtimeTopUpFragment.getThisPresenter();
            double $d0 = airtimeTopUpFragment.currentWalletBalance;
            $r11.navigateToEnterAmount($r6, $r9, "VTU", $d0);
            return;
        }
        boolean $z02 = Log_OC.append(str, ARGS_MODE_DATA);
        if ($z02) {
            int $i02 = airtimeTopUpFragment.lastSelectedNetworkPosition;
            if ($i02 != -1) {
                List $r72 = airtimeTopUpFragment.networks;
                Object $r83 = $r72.get($i02);
                Networks networks = (Networks) $r83;
            }
            AirtimeAndDataPresenter $r112 = airtimeTopUpFragment.getThisPresenter();
            Plan $r12 = airtimeTopUpFragment.lastSelectedDataPlan;
            double $d02 = airtimeTopUpFragment.currentWalletBalance;
            $r112.navigateToSummaryPage($r6, $r1, $r12, $d02);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public AirtimeAndDataPresenter createPresenter() {
        AirtimeAndDataPresenter $r1 = getThisPresenter();
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
    public FragmentAirtimeTopUpBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentAirtimeTopUpBinding $r3 = (FragmentAirtimeTopUpBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentAirtimeTopUpBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Networks getLastSelectedNetwork() {
        Networks $r1 = this.lastSelectedNetwork;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("lastSelectedNetwork");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SmartLookAnalytics getSmartLookAnalytics() {
        SmartLookAnalytics $r1 = this.smartLookAnalytics;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("smartLookAnalytics");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AirtimeAndDataPresenter getThisPresenter() {
        AirtimeAndDataPresenter $r1 = this.thisPresenter;
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
    @Override // ai.kudi.agent.product.airtime_data.views.AirtimeAndDataView
    public void hideLoader() {
        FragmentAirtimeTopUpBinding $r1 = requireBinding();
        KudiButton $r2 = $r1.buttonContinue;
        $r2.m38033e();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentAirtimeTopUpBinding fragmentAirtimeTopUpBinding, Fragment fragment) {
        Log_OC.getArray(fragmentAirtimeTopUpBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentAirtimeTopUpBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentAirtimeTopUpBinding $r4 = (FragmentAirtimeTopUpBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        AirtimeTopUpFragment r2 = this;
        C7429a.m18752b(r2);
        AirtimeTopUpFragment r22 = this;
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentAirtimeTopUpBinding $r4 = FragmentAirtimeTopUpBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater,\n                container,\n                false\n            )");
        AirtimeTopUpFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        T t;
        ProductPurchase $r10;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        AirtimeAndDataPresenter $r3 = getThisPresenter();
        $r3.start();
        TextView $r5 = requireBinding().spinnerNetwork;
        $r5.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.product.airtime_data.ui.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AirtimeTopUpFragment $r2 = AirtimeTopUpFragment.this;
                AirtimeTopUpFragment.m40172onViewCreated$lambda1($r2, view2);
            }
        });
        final C11812w r22 = new C11812w();
        AirtimeTopUpFragment r25 = this;
        Bundle $r2 = r25.getArguments();
        if ($r2 == null) {
            t = 0;
        } else {
            String $r8 = $r2.getString(ARGS_MODE);
            t = $r8;
        }
        r22.f26499c = t;
        SmartLookAnalytics $r9 = getSmartLookAnalytics();
        $r9.logAirtimeDataTopup();
        final FragmentAirtimeTopUpBinding $r4 = requireBinding();
        AirtimeTopUpFragment r252 = this;
        Bundle $r22 = r252.getArguments();
        if ($r22 == null) {
            $r10 = null;
        } else {
            Parcelable $r11 = $r22.getParcelable("args_airtime_payload");
            $r10 = (ProductPurchase) $r11;
        }
        boolean $z0 = $r10 instanceof AirtimePurchase;
        if ($z0) {
            r22.f26499c = ARGS_MODE_AIRTIME;
            AirtimePurchase $r12 = (AirtimePurchase) $r10;
            KudiInputField $r13 = $r4.kifRecipientPhoneNumber;
            String $r82 = $r12.getPhoneNumber();
            $r13.setText($r82);
            TextView $r52 = $r4.spinnerNetwork;
            Networks $r14 = $r12.getNetwork();
            String $r83 = $r14 == null ? null : $r14.getName();
            $r52.setText($r83);
            Networks $r142 = $r12.getNetwork();
            Log_OC.append($r142);
            setLastSelectedNetwork($r142);
        } else {
            boolean $z02 = $r10 instanceof DataPurchase;
            if ($z02) {
                r22.f26499c = ARGS_MODE_DATA;
                DataPurchase $r15 = (DataPurchase) $r10;
                KudiInputField $r132 = $r4.kifRecipientPhoneNumber;
                String $r84 = $r15.getPhoneNumber();
                $r132.setText($r84);
                TextView $r53 = $r4.spinnerNetwork;
                Networks $r143 = $r15.getNetwork();
                String $r85 = $r143 == null ? null : $r143.getName();
                $r53.setText($r85);
                Networks $r144 = $r15.getNetwork();
                Log_OC.append($r144);
                setLastSelectedNetwork($r144);
                TextView $r54 = $r4.spinnerDataPlan;
                Plan $r16 = $r15.getPlan();
                String $r86 = $r16.getName();
                $r54.setText($r86);
                Plan $r162 = $r15.getPlan();
                this.lastSelectedDataPlan = $r162;
            }
        }
        Object $r17 = r22.f26499c;
        String $r87 = (String) $r17;
        boolean $z03 = Log_OC.append($r87, ARGS_MODE_AIRTIME);
        if ($z03) {
            TextView $r55 = $r4.spinnerDataPlan;
            Log_OC.loadImage($r55, "binding.spinnerDataPlan");
            ViewExtKt.hide$default($r55, false, 1, null);
        } else {
            boolean $z04 = Log_OC.append($r87, ARGS_MODE_DATA);
            if ($z04) {
                TextView $r56 = $r4.spinnerDataPlan;
                Log_OC.loadImage($r56, "binding.spinnerDataPlan");
                ViewExtKt.show($r56);
                TextView $r57 = $r4.spinnerDataPlan;
                $r57.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.product.airtime_data.ui.d
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        AirtimeTopUpFragment $r23 = AirtimeTopUpFragment.this;
                        AirtimeTopUpFragment.m40173onViewCreated$lambda7$lambda5($r23, view2);
                    }
                });
            }
        }
        ViewGroup $r19 = $r4.buttonContinue;
        ViewGroup r26 = $r19;
        r26.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.product.airtime_data.ui.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FragmentAirtimeTopUpBinding $r23 = FragmentAirtimeTopUpBinding.this;
                AirtimeTopUpFragment $r32 = this;
                C11812w $r42 = r22;
                AirtimeTopUpFragment.m40174onViewCreated$lambda7$lambda6($r23, $r32, $r42, view2);
            }
        });
        AirtimeAndDataPresenter $r32 = getThisPresenter();
        $r32.fetchAirtimeNetworks();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentAirtimeTopUpBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentAirtimeTopUpBinding $r3 = (FragmentAirtimeTopUpBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentAirtimeTopUpBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setLastSelectedNetwork(Networks networks) {
        Log_OC.getArray(networks, "<set-?>");
        this.lastSelectedNetwork = networks;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.airtime_data.views.AirtimeView
    public void setPhoneNumber(String str) {
        Log_OC.getArray(str, "phoneNumber");
        FragmentAirtimeTopUpBinding $r2 = requireBinding();
        KudiInputField $r3 = $r2.kifRecipientPhoneNumber;
        $r3.setText(str);
    }

    public final void setSmartLookAnalytics(SmartLookAnalytics smartLookAnalytics) {
        Log_OC.getArray(smartLookAnalytics, "<set-?>");
        this.smartLookAnalytics = smartLookAnalytics;
    }

    public final void setThisPresenter(AirtimeAndDataPresenter airtimeAndDataPresenter) {
        Log_OC.getArray(airtimeAndDataPresenter, "<set-?>");
        this.thisPresenter = airtimeAndDataPresenter;
    }

    @Override // ai.kudi.agent.product.airtime_data.views.AirtimeView
    public void setWalletBalance(double d) {
        this.currentWalletBalance = d;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.airtime_data.views.AirtimeAndDataView
    public void showAmountError(String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        AirtimeTopUpFragment r3 = this;
        Context $r2 = r3.requireContext();
        Log_OC.loadImage($r2, "requireContext()");
        ContextExtKt.toast$default($r2, str, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.airtime_data.views.AirtimeView
    public void showInvalidDataPlan(String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        AirtimeTopUpFragment r3 = this;
        FragmentActivity $r2 = r3.getActivity();
        if ($r2 == null) {
            return;
        }
        String $r1 = String.valueOf(str);
        ContextExtKt.toast$default($r2, $r1, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.airtime_data.views.AirtimeView
    public void showInvalidNetworkSelection(String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        FragmentAirtimeTopUpBinding $r3 = requireBinding();
        TextView $r2 = $r3.textNetworkError;
        Log_OC.loadImage($r2, "textNetworkError");
        ViewExtKt.show($r2);
        $r3.textNetworkError.setText(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.airtime_data.views.AirtimeView
    public void showInvalidPhoneNumber(String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        FragmentAirtimeTopUpBinding $r2 = requireBinding();
        KudiInputField $r3 = $r2.kifRecipientPhoneNumber;
        $r3.setError(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.airtime_data.views.AirtimeAndDataView
    public void showLoader() {
        FragmentAirtimeTopUpBinding $r1 = requireBinding();
        KudiButton $r2 = $r1.buttonContinue;
        $r2.m38032f();
    }

    @Override // ai.kudi.agent.product.airtime_data.views.AirtimeView
    public void showNetworks(List list) {
        Log_OC.getArray(list, TYPE_OF_DATA_NETWORK);
        this.networks = list;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:20:0x0026 */
    @Override // ai.kudi.agent.product.airtime_data.views.AirtimeView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void showPlans(java.util.List r15) {
        /*
            r14 = this;
            java.lang.String r0 = "plans"
            kotlin.p483e0.p485d.Log_OC.getArray(r15, r0)
            java.util.List<ai.kudi.agent.product.airtime_data.data.Plan> r1 = r14.dataPlans
            r1.clear()
            java.util.List<ai.kudi.agent.product.airtime_data.data.Plan> r1 = r14.dataPlans
            r1.addAll(r15)
            ai.kudi.dip.library.h.i r2 = r14.bottomSheetDialog
            if (r2 == 0) goto L54
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r4 = kotlin.p557z.C13722p.m3921o(r15, r5)
            r3.<init>(r4)
            java.util.Iterator r6 = r15.iterator()
        L22:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L50
            java.lang.Object r8 = r6.next()
            r10 = r8
            ai.kudi.agent.product.airtime_data.data.Plan r10 = (ai.kudi.agent.product.airtime_data.data.Plan) r10
            r9 = r10
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r9.getName()
            r11.append(r12)
            java.lang.String r0 = " - "
            r11.append(r0)
            int r4 = r9.getAmount()
            r11.append(r4)
            java.lang.String r12 = r11.toString()
            r3.add(r12)
            goto L22
        L50:
            r2.m37966d(r3)
            return
        L54:
            java.lang.String r0 = "bottomSheetDialog"
            kotlin.p483e0.p485d.Log_OC.LogError(r0)
            goto L5a
        L5a:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r0 = "Null throw statement replaced by Soot"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.product.airtime_data.p017ui.AirtimeTopUpFragment.showPlans(java.util.List):void");
    }
}
